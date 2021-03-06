/*
 * Copyright 2013 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire;

import com.squareup.javapoet.JavaFile;
import java.io.File;

final class ConsoleWireLogger implements WireLogger {
  private final boolean isQuiet;

  public ConsoleWireLogger(boolean quiet) {
    this.isQuiet = quiet;
  }

  public void info(String message) {
    if (!isQuiet) {
      System.out.println(message);
    }
  }

  public void artifact(File outputDirectory, JavaFile javaFile) {
    if (isQuiet) {
      System.out.printf("%s.%s%n",
          javaFile.packageName, javaFile.typeSpec.name);
    } else {
      System.out.printf("Writing %s.%s to %s%n",
          javaFile.packageName, javaFile.typeSpec.name, outputDirectory);
    }
  }
}

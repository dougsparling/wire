// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/foreign.proto at 23:1
package com.squareup.wire.protos.foreign;

import com.squareup.wire.ProtoEnum;
import java.lang.Override;

public enum ForeignEnum implements ProtoEnum {
  BAV(0),

  BAX(1);

  private final int value;

  ForeignEnum(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}

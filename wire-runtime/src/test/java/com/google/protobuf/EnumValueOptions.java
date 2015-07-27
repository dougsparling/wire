// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 389:1
package com.google.protobuf;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.lang.Object;
import java.lang.Override;
import java.util.Collections;
import java.util.List;

public final class EnumValueOptions extends ExtendableMessage<EnumValueOptions> {
  private static final long serialVersionUID = 0L;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @ProtoField(
      tag = 999,
      label = Message.Label.REPEATED,
      messageType = UninterpretedOption.class
  )
  public final List<UninterpretedOption> uninterpreted_option;

  public EnumValueOptions(List<UninterpretedOption> uninterpreted_option) {
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  private EnumValueOptions(Builder builder) {
    this(builder.uninterpreted_option);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof EnumValueOptions)) return false;
    EnumValueOptions o = (EnumValueOptions) other;
    if (!extensionsEqual(o)) return false;
    return equals(uninterpreted_option, o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (uninterpreted_option != null ? uninterpreted_option.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends ExtendableMessage.ExtendableBuilder<EnumValueOptions, Builder> {
    public List<UninterpretedOption> uninterpreted_option = Collections.emptyList();

    public Builder() {
      super(Builder.class);
    }

    public Builder(EnumValueOptions message) {
      super(Builder.class, message);
      if (message == null) return;
      this.uninterpreted_option = copyOf(message.uninterpreted_option);
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      this.uninterpreted_option = canonicalizeList(uninterpreted_option);
      return this;
    }

    @Override
    public EnumValueOptions build() {
      return new EnumValueOptions(this);
    }
  }
}

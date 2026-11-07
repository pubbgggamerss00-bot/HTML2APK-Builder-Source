package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Any;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile h1<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Any value_;

    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((Option) this.instance).clearName();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Option) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public String getName() {
            return ((Option) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public j getNameBytes() {
            return ((Option) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public Any getValue() {
            return ((Option) this.instance).getValue();
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((Option) this.instance).hasValue();
        }

        public Builder mergeValue(Any any) {
            copyOnWrite();
            ((Option) this.instance).mergeValue(any);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Option) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Option) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setValue(Any any) {
            copyOnWrite();
            ((Option) this.instance).setValue(any);
            return this;
        }

        private Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        public Builder setValue(Any.Builder builder) {
            copyOnWrite();
            ((Option) this.instance).setValue(builder.build());
            return this;
        }
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.value_ = any;
        } else {
            this.value_ = Any.newBuilder(this.value_).mergeFrom((Any.Builder) any).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.name_ = jVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(Any any) {
        any.getClass();
        this.value_ = any;
        this.bitField0_ |= 1;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
        h1 aVar;
        switch (dVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new Option();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Option> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Option.class) {
                    try {
                        aVar = PARSER;
                        if (aVar == null) {
                            aVar = new GeneratedMessageLite.a();
                            PARSER = aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return aVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Option option) {
        return DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Option parseFrom(j jVar) throws e0 {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Option parseFrom(j jVar, t tVar) throws e0 {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Option parseFrom(byte[] bArr) throws e0 {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Option parseFrom(k kVar) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Option parseFrom(k kVar, t tVar) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

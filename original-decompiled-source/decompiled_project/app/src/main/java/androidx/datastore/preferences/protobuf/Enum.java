package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.EnumValue;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h1<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private d0.j<EnumValue> enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String edition_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            copyOnWrite();
            ((Enum) this.instance).addAllEnumvalue(iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Enum) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(enumValue);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(option);
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((Enum) this.instance).clearEdition();
            return this;
        }

        public Builder clearEnumvalue() {
            copyOnWrite();
            ((Enum) this.instance).clearEnumvalue();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Enum) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Enum) this.instance).clearOptions();
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Enum) this.instance).clearSourceContext();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Enum) this.instance).clearSyntax();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public String getEdition() {
            return ((Enum) this.instance).getEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public j getEditionBytes() {
            return ((Enum) this.instance).getEditionBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int i10) {
            return ((Enum) this.instance).getEnumvalue(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((Enum) this.instance).getEnumvalueCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List<EnumValue> getEnumvalueList() {
            return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public String getName() {
            return ((Enum) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public j getNameBytes() {
            return ((Enum) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Option getOptions(int i10) {
            return ((Enum) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((Enum) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            return ((Enum) this.instance).getSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public t1 getSyntax() {
            return ((Enum) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((Enum) this.instance).getSyntaxValue();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((Enum) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Enum) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public Builder removeEnumvalue(int i10) {
            copyOnWrite();
            ((Enum) this.instance).removeEnumvalue(i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Enum) this.instance).removeOptions(i10);
            return this;
        }

        public Builder setEdition(String str) {
            copyOnWrite();
            ((Enum) this.instance).setEdition(str);
            return this;
        }

        public Builder setEditionBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Enum) this.instance).setEditionBytes(jVar);
            return this;
        }

        public Builder setEnumvalue(int i10, EnumValue enumValue) {
            copyOnWrite();
            ((Enum) this.instance).setEnumvalue(i10, enumValue);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Enum) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Enum) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Enum) this.instance).setOptions(i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Enum) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public Builder setSyntax(t1 t1Var) {
            copyOnWrite();
            ((Enum) this.instance).setSyntax(t1Var);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            ((Enum) this.instance).setSyntaxValue(i10);
            return this;
        }

        private Builder() {
            super(Enum.DEFAULT_INSTANCE);
        }

        public Builder addEnumvalue(int i10, EnumValue enumValue) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(i10, enumValue);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(i10, option);
            return this;
        }

        public Builder setEnumvalue(int i10, EnumValue.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).setEnumvalue(i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).setOptions(i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).setSourceContext(builder.build());
            return this;
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addEnumvalue(int i10, EnumValue.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(i10, builder.build());
            return this;
        }
    }

    static {
        Enum r02 = new Enum();
        DEFAULT_INSTANCE = r02;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, r02);
    }

    private Enum() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        AbstractMessageLite.addAll(iterable, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumvalue() {
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureEnumvalueIsMutable() {
        d0.j<EnumValue> jVar = this.enumvalue_;
        if (jVar.isModifiable()) {
            return;
        }
        this.enumvalue_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureOptionsIsMutable() {
        d0.j<Option> jVar = this.options_;
        if (jVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            this.sourceContext_ = sourceContext;
        } else {
            this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom((SourceContext.Builder) sourceContext).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumvalue(int i10) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(String str) {
        str.getClass();
        this.edition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.edition_ = jVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumvalue(int i10, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i10, enumValue);
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
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(t1 t1Var) {
        this.syntax_ = t1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i10) {
        this.syntax_ = i10;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            case 3:
                return new Enum();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Enum> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Enum.class) {
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

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public String getEdition() {
        return this.edition_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public j getEditionBytes() {
        return j.d(this.edition_);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int i10) {
        return this.enumvalue_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i10) {
        return this.enumvalue_.get(i10);
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public t1 getSyntax() {
        t1 t1VarA = t1.a(this.syntax_);
        return t1VarA == null ? t1.UNRECOGNIZED : t1VarA;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Enum r12) {
        return DEFAULT_INSTANCE.createBuilder(r12);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Enum parseFrom(j jVar) throws e0 {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(int i10, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i10, enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Enum parseFrom(j jVar, t tVar) throws e0 {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Enum parseFrom(byte[] bArr) throws e0 {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Enum parseFrom(k kVar) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Enum parseFrom(k kVar, t tVar) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

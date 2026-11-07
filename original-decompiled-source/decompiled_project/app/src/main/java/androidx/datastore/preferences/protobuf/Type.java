package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Field;
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
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile h1<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private d0.j<Field> fields_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String edition_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        public Builder addAllFields(Iterable<? extends Field> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllFields(iterable);
            return this;
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllOneofs(iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addFields(Field field) {
            copyOnWrite();
            ((Type) this.instance).addFields(field);
            return this;
        }

        public Builder addOneofs(String str) {
            copyOnWrite();
            ((Type) this.instance).addOneofs(str);
            return this;
        }

        public Builder addOneofsBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Type) this.instance).addOneofsBytes(jVar);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Type) this.instance).addOptions(option);
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((Type) this.instance).clearEdition();
            return this;
        }

        public Builder clearFields() {
            copyOnWrite();
            ((Type) this.instance).clearFields();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Type) this.instance).clearName();
            return this;
        }

        public Builder clearOneofs() {
            copyOnWrite();
            ((Type) this.instance).clearOneofs();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Type) this.instance).clearOptions();
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Type) this.instance).clearSourceContext();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Type) this.instance).clearSyntax();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getEdition() {
            return ((Type) this.instance).getEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public j getEditionBytes() {
            return ((Type) this.instance).getEditionBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Field getFields(int i10) {
            return ((Type) this.instance).getFields(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type) this.instance).getFieldsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getName() {
            return ((Type) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public j getNameBytes() {
            return ((Type) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getOneofs(int i10) {
            return ((Type) this.instance).getOneofs(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public j getOneofsBytes(int i10) {
            return ((Type) this.instance).getOneofsBytes(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type) this.instance).getOneofsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Option getOptions(int i10) {
            return ((Type) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type) this.instance).getSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public t1 getSyntax() {
            return ((Type) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type) this.instance).getSyntaxValue();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Type) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public Builder removeFields(int i10) {
            copyOnWrite();
            ((Type) this.instance).removeFields(i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Type) this.instance).removeOptions(i10);
            return this;
        }

        public Builder setEdition(String str) {
            copyOnWrite();
            ((Type) this.instance).setEdition(str);
            return this;
        }

        public Builder setEditionBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Type) this.instance).setEditionBytes(jVar);
            return this;
        }

        public Builder setFields(int i10, Field field) {
            copyOnWrite();
            ((Type) this.instance).setFields(i10, field);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Type) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Type) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOneofs(int i10, String str) {
            copyOnWrite();
            ((Type) this.instance).setOneofs(i10, str);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Type) this.instance).setOptions(i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public Builder setSyntax(t1 t1Var) {
            copyOnWrite();
            ((Type) this.instance).setSyntax(t1Var);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            ((Type) this.instance).setSyntaxValue(i10);
            return this;
        }

        private Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        public Builder addFields(int i10, Field field) {
            copyOnWrite();
            ((Type) this.instance).addFields(i10, field);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Type) this.instance).addOptions(i10, option);
            return this;
        }

        public Builder setFields(int i10, Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setFields(i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setOptions(i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(builder.build());
            return this;
        }

        public Builder addFields(Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addFields(builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addFields(int i10, Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addFields(i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addOptions(i10, builder.build());
            return this;
        }
    }

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        AbstractMessageLite.addAll(iterable, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        ensureOneofsIsMutable();
        this.oneofs_.add(jVar.n());
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
    public void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureFieldsIsMutable() {
        d0.j<Field> jVar = this.fields_;
        if (jVar.isModifiable()) {
            return;
        }
        this.fields_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureOneofsIsMutable() {
        d0.j<String> jVar = this.oneofs_;
        if (jVar.isModifiable()) {
            return;
        }
        this.oneofs_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureOptionsIsMutable() {
        d0.j<Option> jVar = this.options_;
        if (jVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Type getDefaultInstance() {
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

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i10) {
        ensureFieldsIsMutable();
        this.fields_.remove(i10);
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
    public void setFields(int i10, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i10, field);
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
    public void setOneofs(int i10, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i10, str);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            case 3:
                return new Type();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Type> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Type.class) {
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

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getEdition() {
        return this.edition_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public j getEditionBytes() {
        return j.d(this.edition_);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Field getFields(int i10) {
        return this.fields_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int i10) {
        return this.fields_.get(i10);
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getOneofs(int i10) {
        return this.oneofs_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public j getOneofsBytes(int i10) {
        return j.d(this.oneofs_.get(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public t1 getSyntax() {
        t1 t1VarA = t1.a(this.syntax_);
        return t1VarA == null ? t1.UNRECOGNIZED : t1VarA;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Type type) {
        return DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Type parseFrom(j jVar) throws e0 {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i10, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i10, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Type parseFrom(j jVar, t tVar) throws e0 {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Type parseFrom(byte[] bArr) throws e0 {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Type parseFrom(k kVar) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Type parseFrom(k kVar, t tVar) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

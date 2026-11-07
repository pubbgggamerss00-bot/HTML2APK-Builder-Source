package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Method;
import androidx.datastore.preferences.protobuf.Mixin;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Api extends GeneratedMessageLite<Api, Builder> implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile h1<Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private d0.j<Method> methods_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String version_ = "";
    private d0.j<Mixin> mixins_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
        public Builder addAllMethods(Iterable<? extends Method> iterable) {
            copyOnWrite();
            ((Api) this.instance).addAllMethods(iterable);
            return this;
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
            copyOnWrite();
            ((Api) this.instance).addAllMixins(iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Api) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addMethods(Method method) {
            copyOnWrite();
            ((Api) this.instance).addMethods(method);
            return this;
        }

        public Builder addMixins(Mixin mixin) {
            copyOnWrite();
            ((Api) this.instance).addMixins(mixin);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Api) this.instance).addOptions(option);
            return this;
        }

        public Builder clearMethods() {
            copyOnWrite();
            ((Api) this.instance).clearMethods();
            return this;
        }

        public Builder clearMixins() {
            copyOnWrite();
            ((Api) this.instance).clearMixins();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Api) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Api) this.instance).clearOptions();
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Api) this.instance).clearSourceContext();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Api) this.instance).clearSyntax();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((Api) this.instance).clearVersion();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Method getMethods(int i10) {
            return ((Api) this.instance).getMethods(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((Api) this.instance).getMethodsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Mixin getMixins(int i10) {
            return ((Api) this.instance).getMixins(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((Api) this.instance).getMixinsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
            return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getName() {
            return ((Api) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public j getNameBytes() {
            return ((Api) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Option getOptions(int i10) {
            return ((Api) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((Api) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            return ((Api) this.instance).getSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public t1 getSyntax() {
            return ((Api) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((Api) this.instance).getSyntaxValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getVersion() {
            return ((Api) this.instance).getVersion();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public j getVersionBytes() {
            return ((Api) this.instance).getVersionBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((Api) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Api) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public Builder removeMethods(int i10) {
            copyOnWrite();
            ((Api) this.instance).removeMethods(i10);
            return this;
        }

        public Builder removeMixins(int i10) {
            copyOnWrite();
            ((Api) this.instance).removeMixins(i10);
            return this;
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Api) this.instance).removeOptions(i10);
            return this;
        }

        public Builder setMethods(int i10, Method method) {
            copyOnWrite();
            ((Api) this.instance).setMethods(i10, method);
            return this;
        }

        public Builder setMixins(int i10, Mixin mixin) {
            copyOnWrite();
            ((Api) this.instance).setMixins(i10, mixin);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Api) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Api) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Api) this.instance).setOptions(i10, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Api) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public Builder setSyntax(t1 t1Var) {
            copyOnWrite();
            ((Api) this.instance).setSyntax(t1Var);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            ((Api) this.instance).setSyntaxValue(i10);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            ((Api) this.instance).setVersion(str);
            return this;
        }

        public Builder setVersionBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Api) this.instance).setVersionBytes(jVar);
            return this;
        }

        private Builder() {
            super(Api.DEFAULT_INSTANCE);
        }

        public Builder addMethods(int i10, Method method) {
            copyOnWrite();
            ((Api) this.instance).addMethods(i10, method);
            return this;
        }

        public Builder addMixins(int i10, Mixin mixin) {
            copyOnWrite();
            ((Api) this.instance).addMixins(i10, mixin);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Api) this.instance).addOptions(i10, option);
            return this;
        }

        public Builder setMethods(int i10, Method.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).setMethods(i10, builder.build());
            return this;
        }

        public Builder setMixins(int i10, Mixin.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).setMixins(i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).setOptions(i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).setSourceContext(builder.build());
            return this;
        }

        public Builder addMethods(Method.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).addMethods(builder.build());
            return this;
        }

        public Builder addMixins(Mixin.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).addMixins(builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addMethods(int i10, Method.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).addMethods(i10, builder.build());
            return this;
        }

        public Builder addMixins(int i10, Mixin.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).addMixins(i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Api) this.instance).addOptions(i10, builder.build());
            return this;
        }
    }

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        GeneratedMessageLite.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        AbstractMessageLite.addAll(iterable, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        AbstractMessageLite.addAll(iterable, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = GeneratedMessageLite.emptyProtobufList();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        d0.j<Method> jVar = this.methods_;
        if (jVar.isModifiable()) {
            return;
        }
        this.methods_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureMixinsIsMutable() {
        d0.j<Mixin> jVar = this.mixins_;
        if (jVar.isModifiable()) {
            return;
        }
        this.mixins_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureOptionsIsMutable() {
        d0.j<Option> jVar = this.options_;
        if (jVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Api getDefaultInstance() {
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

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethods(int i10) {
        ensureMethodsIsMutable();
        this.methods_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMixins(int i10) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethods(int i10, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i10, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int i10, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i10, mixin);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.version_ = jVar.n();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new Object[]{"bitField0_", "name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 3:
                return new Api();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Api> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Api.class) {
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

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Method getMethods(int i10) {
        return this.methods_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public MethodOrBuilder getMethodsOrBuilder(int i10) {
        return this.methods_.get(i10);
    }

    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Mixin getMixins(int i10) {
        return this.mixins_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public MixinOrBuilder getMixinsOrBuilder(int i10) {
        return this.mixins_.get(i10);
    }

    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public t1 getSyntax() {
        t1 t1VarA = t1.a(this.syntax_);
        return t1VarA == null ? t1.UNRECOGNIZED : t1VarA;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public j getVersionBytes() {
        return j.d(this.version_);
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Api api) {
        return DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Api parseFrom(j jVar) throws e0 {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int i10, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i10, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int i10, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i10, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Api parseFrom(j jVar, t tVar) throws e0 {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Api parseFrom(byte[] bArr) throws e0 {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Api parseFrom(k kVar) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Api parseFrom(k kVar, t tVar) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

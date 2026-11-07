package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Method extends GeneratedMessageLite<Method, Builder> implements MethodOrBuilder {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile h1<Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private d0.j<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Method, Builder> implements MethodOrBuilder {
        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Method) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Method) this.instance).addOptions(option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Method) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Method) this.instance).clearOptions();
            return this;
        }

        public Builder clearRequestStreaming() {
            copyOnWrite();
            ((Method) this.instance).clearRequestStreaming();
            return this;
        }

        public Builder clearRequestTypeUrl() {
            copyOnWrite();
            ((Method) this.instance).clearRequestTypeUrl();
            return this;
        }

        public Builder clearResponseStreaming() {
            copyOnWrite();
            ((Method) this.instance).clearResponseStreaming();
            return this;
        }

        public Builder clearResponseTypeUrl() {
            copyOnWrite();
            ((Method) this.instance).clearResponseTypeUrl();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Method) this.instance).clearSyntax();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getName() {
            return ((Method) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public j getNameBytes() {
            return ((Method) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Option getOptions(int i10) {
            return ((Method) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getOptionsCount() {
            return ((Method) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
            return ((Method) this.instance).getRequestStreaming();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getRequestTypeUrl() {
            return ((Method) this.instance).getRequestTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public j getRequestTypeUrlBytes() {
            return ((Method) this.instance).getRequestTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
            return ((Method) this.instance).getResponseStreaming();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getResponseTypeUrl() {
            return ((Method) this.instance).getResponseTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public j getResponseTypeUrlBytes() {
            return ((Method) this.instance).getResponseTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public t1 getSyntax() {
            return ((Method) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
            return ((Method) this.instance).getSyntaxValue();
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Method) this.instance).removeOptions(i10);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Method) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Method) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Method) this.instance).setOptions(i10, option);
            return this;
        }

        public Builder setRequestStreaming(boolean z10) {
            copyOnWrite();
            ((Method) this.instance).setRequestStreaming(z10);
            return this;
        }

        public Builder setRequestTypeUrl(String str) {
            copyOnWrite();
            ((Method) this.instance).setRequestTypeUrl(str);
            return this;
        }

        public Builder setRequestTypeUrlBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Method) this.instance).setRequestTypeUrlBytes(jVar);
            return this;
        }

        public Builder setResponseStreaming(boolean z10) {
            copyOnWrite();
            ((Method) this.instance).setResponseStreaming(z10);
            return this;
        }

        public Builder setResponseTypeUrl(String str) {
            copyOnWrite();
            ((Method) this.instance).setResponseTypeUrl(str);
            return this;
        }

        public Builder setResponseTypeUrlBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Method) this.instance).setResponseTypeUrlBytes(jVar);
            return this;
        }

        public Builder setSyntax(t1 t1Var) {
            copyOnWrite();
            ((Method) this.instance).setSyntax(t1Var);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            ((Method) this.instance).setSyntaxValue(i10);
            return this;
        }

        private Builder() {
            super(Method.DEFAULT_INSTANCE);
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Method) this.instance).addOptions(i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Method) this.instance).setOptions(i10, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Method) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Method) this.instance).addOptions(i10, builder.build());
            return this;
        }
    }

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }

    private Method() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
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
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        d0.j<Option> jVar = this.options_;
        if (jVar.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
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
    public void setRequestStreaming(boolean z10) {
        this.requestStreaming_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.requestTypeUrl_ = jVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean z10) {
        this.responseStreaming_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.responseTypeUrl_ = jVar.n();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 3:
                return new Method();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Method> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Method.class) {
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

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public j getRequestTypeUrlBytes() {
        return j.d(this.requestTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public j getResponseTypeUrlBytes() {
        return j.d(this.responseTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public t1 getSyntax() {
        t1 t1VarA = t1.a(this.syntax_);
        return t1VarA == null ? t1.UNRECOGNIZED : t1VarA;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static Builder newBuilder(Method method) {
        return DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Method parseFrom(j jVar) throws e0 {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Method parseFrom(j jVar, t tVar) throws e0 {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Method parseFrom(byte[] bArr) throws e0 {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Method parseFrom(k kVar) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Method parseFrom(k kVar, t tVar) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

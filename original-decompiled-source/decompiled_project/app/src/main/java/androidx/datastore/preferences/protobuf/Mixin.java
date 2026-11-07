package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Mixin extends GeneratedMessageLite<Mixin, Builder> implements MixinOrBuilder {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile h1<Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Mixin, Builder> implements MixinOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((Mixin) this.instance).clearName();
            return this;
        }

        public Builder clearRoot() {
            copyOnWrite();
            ((Mixin) this.instance).clearRoot();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getName() {
            return ((Mixin) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public j getNameBytes() {
            return ((Mixin) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getRoot() {
            return ((Mixin) this.instance).getRoot();
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public j getRootBytes() {
            return ((Mixin) this.instance).getRootBytes();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Mixin) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Mixin) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setRoot(String str) {
            copyOnWrite();
            ((Mixin) this.instance).setRoot(str);
            return this;
        }

        public Builder setRootBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((Mixin) this.instance).setRootBytes(jVar);
            return this;
        }

        private Builder() {
            super(Mixin.DEFAULT_INSTANCE);
        }
    }

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        GeneratedMessageLite.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mixin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Mixin> parser() {
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
    public void setRoot(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        this.root_ = jVar.n();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 3:
                return new Mixin();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Mixin> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Mixin.class) {
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

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getRoot() {
        return this.root_;
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public j getRootBytes() {
        return j.d(this.root_);
    }

    public static Builder newBuilder(Mixin mixin) {
        return DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Mixin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Mixin parseFrom(j jVar) throws e0 {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Mixin parseFrom(j jVar, t tVar) throws e0 {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Mixin parseFrom(byte[] bArr) throws e0 {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Mixin parseFrom(InputStream inputStream) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Mixin parseFrom(k kVar) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Mixin parseFrom(k kVar, t tVar) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

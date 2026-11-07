package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile h1<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private d0.j<String> paths_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        public Builder addAllPaths(Iterable<String> iterable) {
            copyOnWrite();
            ((FieldMask) this.instance).addAllPaths(iterable);
            return this;
        }

        public Builder addPaths(String str) {
            copyOnWrite();
            ((FieldMask) this.instance).addPaths(str);
            return this;
        }

        public Builder addPathsBytes(j jVar) throws IllegalArgumentException {
            copyOnWrite();
            ((FieldMask) this.instance).addPathsBytes(jVar);
            return this;
        }

        public Builder clearPaths() {
            copyOnWrite();
            ((FieldMask) this.instance).clearPaths();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public String getPaths(int i10) {
            return ((FieldMask) this.instance).getPaths(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public j getPathsBytes(int i10) {
            return ((FieldMask) this.instance).getPathsBytes(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((FieldMask) this.instance).getPathsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
        }

        public Builder setPaths(int i10, String str) {
            copyOnWrite();
            ((FieldMask) this.instance).setPaths(i10, str);
            return this;
        }

        private Builder() {
            super(FieldMask.DEFAULT_INSTANCE);
        }
    }

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        AbstractMessageLite.addAll(iterable, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(j jVar) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(jVar);
        ensurePathsIsMutable();
        this.paths_.add(jVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        d0.j<String> jVar = this.paths_;
        if (jVar.isModifiable()) {
            return;
        }
        this.paths_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int i10, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i10, str);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new FieldMask();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<FieldMask> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (FieldMask.class) {
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

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public String getPaths(int i10) {
        return this.paths_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public j getPathsBytes(int i10) {
        return j.d(this.paths_.get(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public List<String> getPathsList() {
        return this.paths_;
    }

    public static Builder newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static FieldMask parseFrom(j jVar) throws e0 {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static FieldMask parseFrom(j jVar, t tVar) throws e0 {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static FieldMask parseFrom(byte[] bArr) throws e0 {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, t tVar) throws e0 {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static FieldMask parseFrom(k kVar) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static FieldMask parseFrom(k kVar, t tVar) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

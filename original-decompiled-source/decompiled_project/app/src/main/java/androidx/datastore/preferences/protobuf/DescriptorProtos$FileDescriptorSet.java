package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProto;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorSet extends GeneratedMessageLite<DescriptorProtos$FileDescriptorSet, Builder> implements DescriptorProtos$FileDescriptorSetOrBuilder {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static volatile h1<DescriptorProtos$FileDescriptorSet> PARSER;
    private byte memoizedIsInitialized = 2;
    private d0.j<DescriptorProtos$FileDescriptorProto> file_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FileDescriptorSet, Builder> implements DescriptorProtos$FileDescriptorSetOrBuilder {
        public Builder addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addAllFile(iterable);
            return this;
        }

        public Builder addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public Builder clearFile() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).clearFile();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public DescriptorProtos$FileDescriptorProto getFile(int i10) {
            return ((DescriptorProtos$FileDescriptorSet) this.instance).getFile(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public int getFileCount() {
            return ((DescriptorProtos$FileDescriptorSet) this.instance).getFileCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public List<DescriptorProtos$FileDescriptorProto> getFileList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorSet) this.instance).getFileList());
        }

        public Builder removeFile(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).removeFile(i10);
            return this;
        }

        public Builder setFile(int i10, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).setFile(i10, descriptorProtos$FileDescriptorProto);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FileDescriptorSet.DEFAULT_INSTANCE);
        }

        public Builder addFile(int i10, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(i10, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public Builder setFile(int i10, DescriptorProtos$FileDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).setFile(i10, builder.build());
            return this;
        }

        public Builder addFile(DescriptorProtos$FileDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(builder.build());
            return this;
        }

        public Builder addFile(int i10, DescriptorProtos$FileDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorSet;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorSet.class, descriptorProtos$FileDescriptorSet);
    }

    private DescriptorProtos$FileDescriptorSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
        ensureFileIsMutable();
        AbstractMessageLite.addAll(iterable, this.file_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(descriptorProtos$FileDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        this.file_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFileIsMutable() {
        d0.j<DescriptorProtos$FileDescriptorProto> jVar = this.file_;
        if (jVar.isModifiable()) {
            return;
        }
        this.file_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FileDescriptorSet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFile(int i10) {
        ensureFileIsMutable();
        this.file_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(int i10, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.set(i10, descriptorProtos$FileDescriptorProto);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
        h1 aVar;
        switch (dVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", DescriptorProtos$FileDescriptorProto.class});
            case 3:
                return new DescriptorProtos$FileDescriptorSet();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FileDescriptorSet> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FileDescriptorSet.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
    public DescriptorProtos$FileDescriptorProto getFile(int i10) {
        return this.file_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    public DescriptorProtos$FileDescriptorProtoOrBuilder getFileOrBuilder(int i10) {
        return this.file_.get(i10);
    }

    public List<? extends DescriptorProtos$FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
        return this.file_;
    }

    public static Builder newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFile(int i10, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(i10, descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

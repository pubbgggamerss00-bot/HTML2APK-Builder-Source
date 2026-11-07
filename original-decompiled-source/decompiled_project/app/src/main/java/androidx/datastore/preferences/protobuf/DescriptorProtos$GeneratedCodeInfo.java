package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends GeneratedMessageLite<DescriptorProtos$GeneratedCodeInfo, Builder> implements DescriptorProtos$GeneratedCodeInfoOrBuilder {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static volatile h1<DescriptorProtos$GeneratedCodeInfo> PARSER;
    private d0.j<Annotation> annotation_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Annotation extends GeneratedMessageLite<Annotation, Builder> implements AnnotationOrBuilder {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static volatile h1<Annotation> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SEMANTIC_FIELD_NUMBER = 5;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private int begin_;
        private int bitField0_;
        private int end_;
        private int semantic_;
        private int pathMemoizedSerializedSize = -1;
        private d0.g path_ = GeneratedMessageLite.emptyIntList();
        private String sourceFile_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            public Builder addAllPath(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Annotation) this.instance).addAllPath(iterable);
                return this;
            }

            public Builder addPath(int i10) {
                copyOnWrite();
                ((Annotation) this.instance).addPath(i10);
                return this;
            }

            public Builder clearBegin() {
                copyOnWrite();
                ((Annotation) this.instance).clearBegin();
                return this;
            }

            public Builder clearEnd() {
                copyOnWrite();
                ((Annotation) this.instance).clearEnd();
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((Annotation) this.instance).clearPath();
                return this;
            }

            public Builder clearSemantic() {
                copyOnWrite();
                ((Annotation) this.instance).clearSemantic();
                return this;
            }

            public Builder clearSourceFile() {
                copyOnWrite();
                ((Annotation) this.instance).clearSourceFile();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getBegin() {
                return ((Annotation) this.instance).getBegin();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getEnd() {
                return ((Annotation) this.instance).getEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getPath(int i10) {
                return ((Annotation) this.instance).getPath(i10);
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getPathCount() {
                return ((Annotation) this.instance).getPathCount();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public List<Integer> getPathList() {
                return Collections.unmodifiableList(((Annotation) this.instance).getPathList());
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public a getSemantic() {
                return ((Annotation) this.instance).getSemantic();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public String getSourceFile() {
                return ((Annotation) this.instance).getSourceFile();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public j getSourceFileBytes() {
                return ((Annotation) this.instance).getSourceFileBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasBegin() {
                return ((Annotation) this.instance).hasBegin();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasEnd() {
                return ((Annotation) this.instance).hasEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSemantic() {
                return ((Annotation) this.instance).hasSemantic();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSourceFile() {
                return ((Annotation) this.instance).hasSourceFile();
            }

            public Builder setBegin(int i10) {
                copyOnWrite();
                ((Annotation) this.instance).setBegin(i10);
                return this;
            }

            public Builder setEnd(int i10) {
                copyOnWrite();
                ((Annotation) this.instance).setEnd(i10);
                return this;
            }

            public Builder setPath(int i10, int i11) {
                copyOnWrite();
                ((Annotation) this.instance).setPath(i10, i11);
                return this;
            }

            public Builder setSemantic(a aVar) {
                copyOnWrite();
                ((Annotation) this.instance).setSemantic(aVar);
                return this;
            }

            public Builder setSourceFile(String str) {
                copyOnWrite();
                ((Annotation) this.instance).setSourceFile(str);
                return this;
            }

            public Builder setSourceFileBytes(j jVar) {
                copyOnWrite();
                ((Annotation) this.instance).setSourceFileBytes(jVar);
                return this;
            }

            private Builder() {
                super(Annotation.DEFAULT_INSTANCE);
            }
        }

        public enum a implements d0.c {
            NONE(0),
            SET(1),
            ALIAS(2);


            /* renamed from: a, reason: collision with root package name */
            public final int f1879a;

            /* renamed from: androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$a$a, reason: collision with other inner class name */
            public static final class C0024a implements d0.e {

                /* renamed from: a, reason: collision with root package name */
                public static final C0024a f1880a = new C0024a();

                @Override // androidx.datastore.preferences.protobuf.d0.e
                public final boolean isInRange(int i10) {
                    return a.a(i10) != null;
                }
            }

            a(int i10) {
                this.f1879a = i10;
            }

            public static a a(int i10) {
                if (i10 == 0) {
                    return NONE;
                }
                if (i10 == 1) {
                    return SET;
                }
                if (i10 != 2) {
                    return null;
                }
                return ALIAS;
            }

            @Override // androidx.datastore.preferences.protobuf.d0.c
            public final int getNumber() {
                return this.f1879a;
            }
        }

        static {
            Annotation annotation = new Annotation();
            DEFAULT_INSTANCE = annotation;
            GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
        }

        private Annotation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractMessageLite.addAll(iterable, this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i10) {
            ensurePathIsMutable();
            ((c0) this.path_).addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBegin() {
            this.bitField0_ &= -3;
            this.begin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -5;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSemantic() {
            this.bitField0_ &= -9;
            this.semantic_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceFile() {
            this.bitField0_ &= -2;
            this.sourceFile_ = getDefaultInstance().getSourceFile();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensurePathIsMutable() {
            d0.g gVar = this.path_;
            if (((b) gVar).f1952a) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static Annotation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<Annotation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBegin(int i10) {
            this.bitField0_ |= 2;
            this.begin_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 4;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i10, int i11) {
            ensurePathIsMutable();
            ((c0) this.path_).setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSemantic(a aVar) {
            this.semantic_ = aVar.f1879a;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFile(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.sourceFile_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFileBytes(j jVar) {
            this.sourceFile_ = jVar.n();
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", a.C0024a.f1880a});
                case 3:
                    return new Annotation();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<Annotation> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (Annotation.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getBegin() {
            return this.begin_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getPath(int i10) {
            return ((c0) this.path_).getInt(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getPathCount() {
            return ((c0) this.path_).size();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public a getSemantic() {
            a aVarA = a.a(this.semantic_);
            return aVarA == null ? a.NONE : aVarA;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public String getSourceFile() {
            return this.sourceFile_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public j getSourceFileBytes() {
            return j.d(this.sourceFile_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasSemantic() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Annotation annotation) {
            return DEFAULT_INSTANCE.createBuilder(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static Annotation parseFrom(j jVar) throws e0 {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Annotation parseFrom(j jVar, t tVar) throws e0 {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static Annotation parseFrom(byte[] bArr) throws e0 {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Annotation parseFrom(byte[] bArr, t tVar) throws e0 {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static Annotation parseFrom(InputStream inputStream) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static Annotation parseFrom(k kVar) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Annotation parseFrom(k kVar, t tVar) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface AnnotationOrBuilder extends w0 {
        int getBegin();

        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        int getPath(int i10);

        int getPathCount();

        List<Integer> getPathList();

        Annotation.a getSemantic();

        String getSourceFile();

        j getSourceFileBytes();

        boolean hasBegin();

        boolean hasEnd();

        boolean hasSemantic();

        boolean hasSourceFile();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$GeneratedCodeInfo, Builder> implements DescriptorProtos$GeneratedCodeInfoOrBuilder {
        public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAllAnnotation(iterable);
            return this;
        }

        public Builder addAnnotation(Annotation annotation) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(annotation);
            return this;
        }

        public Builder clearAnnotation() {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).clearAnnotation();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public Annotation getAnnotation(int i10) {
            return ((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotation(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public int getAnnotationCount() {
            return ((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotationCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public List<Annotation> getAnnotationList() {
            return Collections.unmodifiableList(((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotationList());
        }

        public Builder removeAnnotation(int i10) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).removeAnnotation(i10);
            return this;
        }

        public Builder setAnnotation(int i10, Annotation annotation) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).setAnnotation(i10, annotation);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$GeneratedCodeInfo.DEFAULT_INSTANCE);
        }

        public Builder addAnnotation(int i10, Annotation annotation) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(i10, annotation);
            return this;
        }

        public Builder setAnnotation(int i10, Annotation.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).setAnnotation(i10, builder.build());
            return this;
        }

        public Builder addAnnotation(Annotation.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(builder.build());
            return this;
        }

        public Builder addAnnotation(int i10, Annotation.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$GeneratedCodeInfo.class, descriptorProtos$GeneratedCodeInfo);
    }

    private DescriptorProtos$GeneratedCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
        ensureAnnotationIsMutable();
        AbstractMessageLite.addAll(iterable, this.annotation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(annotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnotation() {
        this.annotation_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAnnotationIsMutable() {
        d0.j<Annotation> jVar = this.annotation_;
        if (jVar.isModifiable()) {
            return;
        }
        this.annotation_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$GeneratedCodeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnnotation(int i10) {
        ensureAnnotationIsMutable();
        this.annotation_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnotation(int i10, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.set(i10, annotation);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
            case 3:
                return new DescriptorProtos$GeneratedCodeInfo();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$GeneratedCodeInfo> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$GeneratedCodeInfo.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
    public Annotation getAnnotation(int i10) {
        return this.annotation_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public AnnotationOrBuilder getAnnotationOrBuilder(int i10) {
        return this.annotation_.get(i10);
    }

    public List<? extends AnnotationOrBuilder> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    public static Builder newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(int i10, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(i10, annotation);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessageLite<DescriptorProtos$SourceCodeInfo, Builder> implements DescriptorProtos$SourceCodeInfoOrBuilder {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile h1<DescriptorProtos$SourceCodeInfo> PARSER;
    private d0.j<Location> location_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$SourceCodeInfo, Builder> implements DescriptorProtos$SourceCodeInfoOrBuilder {
        public Builder addAllLocation(Iterable<? extends Location> iterable) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addAllLocation(iterable);
            return this;
        }

        public Builder addLocation(Location location) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(location);
            return this;
        }

        public Builder clearLocation() {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).clearLocation();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public Location getLocation(int i10) {
            return ((DescriptorProtos$SourceCodeInfo) this.instance).getLocation(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public int getLocationCount() {
            return ((DescriptorProtos$SourceCodeInfo) this.instance).getLocationCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public List<Location> getLocationList() {
            return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo) this.instance).getLocationList());
        }

        public Builder removeLocation(int i10) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).removeLocation(i10);
            return this;
        }

        public Builder setLocation(int i10, Location location) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).setLocation(i10, location);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$SourceCodeInfo.DEFAULT_INSTANCE);
        }

        public Builder addLocation(int i10, Location location) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(i10, location);
            return this;
        }

        public Builder setLocation(int i10, Location.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).setLocation(i10, builder.build());
            return this;
        }

        public Builder addLocation(Location.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(builder.build());
            return this;
        }

        public Builder addLocation(int i10, Location.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(i10, builder.build());
            return this;
        }
    }

    public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static volatile h1<Location> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int pathMemoizedSerializedSize = -1;
        private int spanMemoizedSerializedSize = -1;
        private d0.g path_ = GeneratedMessageLite.emptyIntList();
        private d0.g span_ = GeneratedMessageLite.emptyIntList();
        private String leadingComments_ = "";
        private String trailingComments_ = "";
        private d0.j<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
            public Builder addAllLeadingDetachedComments(Iterable<String> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllLeadingDetachedComments(iterable);
                return this;
            }

            public Builder addAllPath(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllPath(iterable);
                return this;
            }

            public Builder addAllSpan(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllSpan(iterable);
                return this;
            }

            public Builder addLeadingDetachedComments(String str) {
                copyOnWrite();
                ((Location) this.instance).addLeadingDetachedComments(str);
                return this;
            }

            public Builder addLeadingDetachedCommentsBytes(j jVar) {
                copyOnWrite();
                ((Location) this.instance).addLeadingDetachedCommentsBytes(jVar);
                return this;
            }

            public Builder addPath(int i10) {
                copyOnWrite();
                ((Location) this.instance).addPath(i10);
                return this;
            }

            public Builder addSpan(int i10) {
                copyOnWrite();
                ((Location) this.instance).addSpan(i10);
                return this;
            }

            public Builder clearLeadingComments() {
                copyOnWrite();
                ((Location) this.instance).clearLeadingComments();
                return this;
            }

            public Builder clearLeadingDetachedComments() {
                copyOnWrite();
                ((Location) this.instance).clearLeadingDetachedComments();
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((Location) this.instance).clearPath();
                return this;
            }

            public Builder clearSpan() {
                copyOnWrite();
                ((Location) this.instance).clearSpan();
                return this;
            }

            public Builder clearTrailingComments() {
                copyOnWrite();
                ((Location) this.instance).clearTrailingComments();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public String getLeadingComments() {
                return ((Location) this.instance).getLeadingComments();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public j getLeadingCommentsBytes() {
                return ((Location) this.instance).getLeadingCommentsBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public String getLeadingDetachedComments(int i10) {
                return ((Location) this.instance).getLeadingDetachedComments(i10);
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public j getLeadingDetachedCommentsBytes(int i10) {
                return ((Location) this.instance).getLeadingDetachedCommentsBytes(i10);
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getLeadingDetachedCommentsCount() {
                return ((Location) this.instance).getLeadingDetachedCommentsCount();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public List<String> getLeadingDetachedCommentsList() {
                return Collections.unmodifiableList(((Location) this.instance).getLeadingDetachedCommentsList());
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getPath(int i10) {
                return ((Location) this.instance).getPath(i10);
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getPathCount() {
                return ((Location) this.instance).getPathCount();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public List<Integer> getPathList() {
                return Collections.unmodifiableList(((Location) this.instance).getPathList());
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getSpan(int i10) {
                return ((Location) this.instance).getSpan(i10);
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getSpanCount() {
                return ((Location) this.instance).getSpanCount();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public List<Integer> getSpanList() {
                return Collections.unmodifiableList(((Location) this.instance).getSpanList());
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public String getTrailingComments() {
                return ((Location) this.instance).getTrailingComments();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public j getTrailingCommentsBytes() {
                return ((Location) this.instance).getTrailingCommentsBytes();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public boolean hasLeadingComments() {
                return ((Location) this.instance).hasLeadingComments();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public boolean hasTrailingComments() {
                return ((Location) this.instance).hasTrailingComments();
            }

            public Builder setLeadingComments(String str) {
                copyOnWrite();
                ((Location) this.instance).setLeadingComments(str);
                return this;
            }

            public Builder setLeadingCommentsBytes(j jVar) {
                copyOnWrite();
                ((Location) this.instance).setLeadingCommentsBytes(jVar);
                return this;
            }

            public Builder setLeadingDetachedComments(int i10, String str) {
                copyOnWrite();
                ((Location) this.instance).setLeadingDetachedComments(i10, str);
                return this;
            }

            public Builder setPath(int i10, int i11) {
                copyOnWrite();
                ((Location) this.instance).setPath(i10, i11);
                return this;
            }

            public Builder setSpan(int i10, int i11) {
                copyOnWrite();
                ((Location) this.instance).setSpan(i10, i11);
                return this;
            }

            public Builder setTrailingComments(String str) {
                copyOnWrite();
                ((Location) this.instance).setTrailingComments(str);
                return this;
            }

            public Builder setTrailingCommentsBytes(j jVar) {
                copyOnWrite();
                ((Location) this.instance).setTrailingCommentsBytes(jVar);
                return this;
            }

            private Builder() {
                super(Location.DEFAULT_INSTANCE);
            }
        }

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            GeneratedMessageLite.registerDefaultInstance(Location.class, location);
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeadingDetachedComments(Iterable<String> iterable) {
            ensureLeadingDetachedCommentsIsMutable();
            AbstractMessageLite.addAll(iterable, this.leadingDetachedComments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractMessageLite.addAll(iterable, this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpan(Iterable<? extends Integer> iterable) {
            ensureSpanIsMutable();
            AbstractMessageLite.addAll(iterable, this.span_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedComments(String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedCommentsBytes(j jVar) {
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(jVar.n());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i10) {
            ensurePathIsMutable();
            ((c0) this.path_).addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpan(int i10) {
            ensureSpanIsMutable();
            ((c0) this.span_).addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingComments() {
            this.bitField0_ &= -2;
            this.leadingComments_ = getDefaultInstance().getLeadingComments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingDetachedComments() {
            this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpan() {
            this.span_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrailingComments() {
            this.bitField0_ &= -3;
            this.trailingComments_ = getDefaultInstance().getTrailingComments();
        }

        private void ensureLeadingDetachedCommentsIsMutable() {
            d0.j<String> jVar = this.leadingDetachedComments_;
            if (jVar.isModifiable()) {
                return;
            }
            this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensurePathIsMutable() {
            d0.g gVar = this.path_;
            if (((b) gVar).f1952a) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureSpanIsMutable() {
            d0.g gVar = this.span_;
            if (((b) gVar).f1952a) {
                return;
            }
            this.span_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<Location> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingComments(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.leadingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingCommentsBytes(j jVar) {
            this.leadingComments_ = jVar.n();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingDetachedComments(int i10, String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i10, int i11) {
            ensurePathIsMutable();
            ((c0) this.path_).setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpan(int i10, int i11) {
            ensureSpanIsMutable();
            ((c0) this.span_).setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingComments(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.trailingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingCommentsBytes(j jVar) {
            this.trailingComments_ = jVar.n();
            this.bitField0_ |= 2;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                case 3:
                    return new Location();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<Location> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (Location.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public String getLeadingComments() {
            return this.leadingComments_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public j getLeadingCommentsBytes() {
            return j.d(this.leadingComments_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public String getLeadingDetachedComments(int i10) {
            return this.leadingDetachedComments_.get(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public j getLeadingDetachedCommentsBytes(int i10) {
            return j.d(this.leadingDetachedComments_.get(i10));
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.size();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public List<String> getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getPath(int i10) {
            return ((c0) this.path_).getInt(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getPathCount() {
            return ((c0) this.path_).size();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getSpan(int i10) {
            return ((c0) this.span_).getInt(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getSpanCount() {
            return ((c0) this.span_).size();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public List<Integer> getSpanList() {
            return this.span_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public String getTrailingComments() {
            return this.trailingComments_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public j getTrailingCommentsBytes() {
            return j.d(this.trailingComments_);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(Location location) {
            return DEFAULT_INSTANCE.createBuilder(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static Location parseFrom(j jVar) throws e0 {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Location parseFrom(j jVar, t tVar) throws e0 {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static Location parseFrom(byte[] bArr) throws e0 {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, t tVar) throws e0 {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static Location parseFrom(k kVar) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Location parseFrom(k kVar, t tVar) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface LocationOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getLeadingComments();

        j getLeadingCommentsBytes();

        String getLeadingDetachedComments(int i10);

        j getLeadingDetachedCommentsBytes(int i10);

        int getLeadingDetachedCommentsCount();

        List<String> getLeadingDetachedCommentsList();

        int getPath(int i10);

        int getPathCount();

        List<Integer> getPathList();

        int getSpan(int i10);

        int getSpanCount();

        List<Integer> getSpanList();

        String getTrailingComments();

        j getTrailingCommentsBytes();

        boolean hasLeadingComments();

        boolean hasTrailingComments();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$SourceCodeInfo.class, descriptorProtos$SourceCodeInfo);
    }

    private DescriptorProtos$SourceCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocation(Iterable<? extends Location> iterable) {
        ensureLocationIsMutable();
        AbstractMessageLite.addAll(iterable, this.location_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLocationIsMutable() {
        d0.j<Location> jVar = this.location_;
        if (jVar.isModifiable()) {
            return;
        }
        this.location_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$SourceCodeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocation(int i10) {
        ensureLocationIsMutable();
        this.location_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(int i10, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.set(i10, location);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
            case 3:
                return new DescriptorProtos$SourceCodeInfo();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$SourceCodeInfo> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$SourceCodeInfo.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public Location getLocation(int i10) {
        return this.location_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public List<Location> getLocationList() {
        return this.location_;
    }

    public LocationOrBuilder getLocationOrBuilder(int i10) {
        return this.location_.get(i10);
    }

    public List<? extends LocationOrBuilder> getLocationOrBuilderList() {
        return this.location_;
    }

    public static Builder newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(int i10, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(i10, location);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

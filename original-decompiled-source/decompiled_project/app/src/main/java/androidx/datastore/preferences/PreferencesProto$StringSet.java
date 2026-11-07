package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class PreferencesProto$StringSet extends GeneratedMessageLite<PreferencesProto$StringSet, Builder> implements PreferencesProto$StringSetOrBuilder {
    private static final PreferencesProto$StringSet DEFAULT_INSTANCE;
    private static volatile h1<PreferencesProto$StringSet> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private d0.j<String> strings_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<PreferencesProto$StringSet, Builder> implements PreferencesProto$StringSetOrBuilder {
        public Builder addAllStrings(Iterable<String> iterable) {
            copyOnWrite();
            ((PreferencesProto$StringSet) this.instance).addAllStrings(iterable);
            return this;
        }

        public Builder addStrings(String str) {
            copyOnWrite();
            ((PreferencesProto$StringSet) this.instance).addStrings(str);
            return this;
        }

        public Builder addStringsBytes(j jVar) {
            copyOnWrite();
            ((PreferencesProto$StringSet) this.instance).addStringsBytes(jVar);
            return this;
        }

        public Builder clearStrings() {
            copyOnWrite();
            ((PreferencesProto$StringSet) this.instance).clearStrings();
            return this;
        }

        @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public String getStrings(int i10) {
            return ((PreferencesProto$StringSet) this.instance).getStrings(i10);
        }

        @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public j getStringsBytes(int i10) {
            return ((PreferencesProto$StringSet) this.instance).getStringsBytes(i10);
        }

        @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public int getStringsCount() {
            return ((PreferencesProto$StringSet) this.instance).getStringsCount();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public List<String> getStringsList() {
            return Collections.unmodifiableList(((PreferencesProto$StringSet) this.instance).getStringsList());
        }

        public Builder setStrings(int i10, String str) {
            copyOnWrite();
            ((PreferencesProto$StringSet) this.instance).setStrings(i10, str);
            return this;
        }

        private Builder() {
            super(PreferencesProto$StringSet.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$StringSet preferencesProto$StringSet = new PreferencesProto$StringSet();
        DEFAULT_INSTANCE = preferencesProto$StringSet;
        GeneratedMessageLite.registerDefaultInstance(PreferencesProto$StringSet.class, preferencesProto$StringSet);
    }

    private PreferencesProto$StringSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStrings(Iterable<String> iterable) {
        ensureStringsIsMutable();
        AbstractMessageLite.addAll(iterable, this.strings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrings(String str) {
        str.getClass();
        ensureStringsIsMutable();
        this.strings_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStringsBytes(j jVar) {
        ensureStringsIsMutable();
        this.strings_.add(jVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrings() {
        this.strings_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStringsIsMutable() {
        d0.j<String> jVar = this.strings_;
        if (jVar.isModifiable()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static PreferencesProto$StringSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreferencesProto$StringSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreferencesProto$StringSet parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<PreferencesProto$StringSet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrings(int i10, String str) {
        str.getClass();
        ensureStringsIsMutable();
        this.strings_.set(i10, str);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new PreferencesProto$StringSet();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<PreferencesProto$StringSet> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (PreferencesProto$StringSet.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public String getStrings(int i10) {
        return this.strings_.get(i10);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public j getStringsBytes(int i10) {
        return j.d(this.strings_.get(i10));
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public int getStringsCount() {
        return this.strings_.size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public List<String> getStringsList() {
        return this.strings_;
    }

    public static Builder newBuilder(PreferencesProto$StringSet preferencesProto$StringSet) {
        return DEFAULT_INSTANCE.createBuilder(preferencesProto$StringSet);
    }

    public static PreferencesProto$StringSet parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static PreferencesProto$StringSet parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static PreferencesProto$StringSet parseFrom(j jVar) throws e0 {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static PreferencesProto$StringSet parseFrom(j jVar, t tVar) throws e0 {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static PreferencesProto$StringSet parseFrom(byte[] bArr) throws e0 {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreferencesProto$StringSet parseFrom(byte[] bArr, t tVar) throws e0 {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static PreferencesProto$StringSet parseFrom(InputStream inputStream) throws IOException {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreferencesProto$StringSet parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static PreferencesProto$StringSet parseFrom(k kVar) throws IOException {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static PreferencesProto$StringSet parseFrom(k kVar, t tVar) throws IOException {
        return (PreferencesProto$StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

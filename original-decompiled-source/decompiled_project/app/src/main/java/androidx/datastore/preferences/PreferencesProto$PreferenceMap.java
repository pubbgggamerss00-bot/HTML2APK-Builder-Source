package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.b2;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class PreferencesProto$PreferenceMap extends GeneratedMessageLite<PreferencesProto$PreferenceMap, Builder> implements PreferencesProto$PreferenceMapOrBuilder {
    private static final PreferencesProto$PreferenceMap DEFAULT_INSTANCE;
    private static volatile h1<PreferencesProto$PreferenceMap> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private q0<String, PreferencesProto$Value> preferences_ = q0.f2133b;

    public static final class Builder extends GeneratedMessageLite.Builder<PreferencesProto$PreferenceMap, Builder> implements PreferencesProto$PreferenceMapOrBuilder {
        public Builder clearPreferences() {
            copyOnWrite();
            ((PreferencesProto$PreferenceMap) this.instance).getMutablePreferencesMap().clear();
            return this;
        }

        @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public boolean containsPreferences(String str) {
            str.getClass();
            return ((PreferencesProto$PreferenceMap) this.instance).getPreferencesMap().containsKey(str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        @Deprecated
        public Map<String, PreferencesProto$Value> getPreferences() {
            return getPreferencesMap();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public int getPreferencesCount() {
            return ((PreferencesProto$PreferenceMap) this.instance).getPreferencesMap().size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Map<String, PreferencesProto$Value> getPreferencesMap() {
            return Collections.unmodifiableMap(((PreferencesProto$PreferenceMap) this.instance).getPreferencesMap());
        }

        @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public PreferencesProto$Value getPreferencesOrDefault(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            Map<String, PreferencesProto$Value> preferencesMap = ((PreferencesProto$PreferenceMap) this.instance).getPreferencesMap();
            return preferencesMap.containsKey(str) ? preferencesMap.get(str) : preferencesProto$Value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public PreferencesProto$Value getPreferencesOrThrow(String str) {
            str.getClass();
            Map<String, PreferencesProto$Value> preferencesMap = ((PreferencesProto$PreferenceMap) this.instance).getPreferencesMap();
            if (preferencesMap.containsKey(str)) {
                return preferencesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllPreferences(Map<String, PreferencesProto$Value> map) {
            copyOnWrite();
            ((PreferencesProto$PreferenceMap) this.instance).getMutablePreferencesMap().putAll(map);
            return this;
        }

        public Builder putPreferences(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            copyOnWrite();
            ((PreferencesProto$PreferenceMap) this.instance).getMutablePreferencesMap().put(str, preferencesProto$Value);
            return this;
        }

        public Builder removePreferences(String str) {
            str.getClass();
            copyOnWrite();
            ((PreferencesProto$PreferenceMap) this.instance).getMutablePreferencesMap().remove(str);
            return this;
        }

        private Builder() {
            super(PreferencesProto$PreferenceMap.DEFAULT_INSTANCE);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final p0<String, PreferencesProto$Value> f1757a = new p0<>(b2.a.f1971c, b2.a.f1973e, PreferencesProto$Value.getDefaultInstance());
    }

    static {
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = new PreferencesProto$PreferenceMap();
        DEFAULT_INSTANCE = preferencesProto$PreferenceMap;
        GeneratedMessageLite.registerDefaultInstance(PreferencesProto$PreferenceMap.class, preferencesProto$PreferenceMap);
    }

    private PreferencesProto$PreferenceMap() {
    }

    public static PreferencesProto$PreferenceMap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, PreferencesProto$Value> getMutablePreferencesMap() {
        return internalGetMutablePreferences();
    }

    private q0<String, PreferencesProto$Value> internalGetMutablePreferences() {
        q0<String, PreferencesProto$Value> q0Var = this.preferences_;
        if (!q0Var.f2134a) {
            this.preferences_ = q0Var.f();
        }
        return this.preferences_;
    }

    private q0<String, PreferencesProto$Value> internalGetPreferences() {
        return this.preferences_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreferencesProto$PreferenceMap parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreferencesProto$PreferenceMap parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<PreferencesProto$PreferenceMap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public boolean containsPreferences(String str) {
        str.getClass();
        return internalGetPreferences().containsKey(str);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", a.f1757a});
            case 3:
                return new PreferencesProto$PreferenceMap();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<PreferencesProto$PreferenceMap> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (PreferencesProto$PreferenceMap.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    @Deprecated
    public Map<String, PreferencesProto$Value> getPreferences() {
        return getPreferencesMap();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public int getPreferencesCount() {
        return internalGetPreferences().size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public Map<String, PreferencesProto$Value> getPreferencesMap() {
        return Collections.unmodifiableMap(internalGetPreferences());
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public PreferencesProto$Value getPreferencesOrDefault(String str, PreferencesProto$Value preferencesProto$Value) {
        str.getClass();
        q0<String, PreferencesProto$Value> q0VarInternalGetPreferences = internalGetPreferences();
        return q0VarInternalGetPreferences.containsKey(str) ? q0VarInternalGetPreferences.get(str) : preferencesProto$Value;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public PreferencesProto$Value getPreferencesOrThrow(String str) {
        str.getClass();
        q0<String, PreferencesProto$Value> q0VarInternalGetPreferences = internalGetPreferences();
        if (q0VarInternalGetPreferences.containsKey(str)) {
            return q0VarInternalGetPreferences.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(PreferencesProto$PreferenceMap preferencesProto$PreferenceMap) {
        return DEFAULT_INSTANCE.createBuilder(preferencesProto$PreferenceMap);
    }

    public static PreferencesProto$PreferenceMap parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(j jVar) throws e0 {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(j jVar, t tVar) throws e0 {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(byte[] bArr) throws e0 {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreferencesProto$PreferenceMap parseFrom(byte[] bArr, t tVar) throws e0 {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(InputStream inputStream) throws IOException {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreferencesProto$PreferenceMap parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(k kVar) throws IOException {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static PreferencesProto$PreferenceMap parseFrom(k kVar, t tVar) throws IOException {
        return (PreferencesProto$PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

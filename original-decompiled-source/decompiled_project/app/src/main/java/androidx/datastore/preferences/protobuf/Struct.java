package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.b2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile h1<Struct> PARSER;
    private q0<String, Value> fields_ = q0.f2133b;

    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
        public Builder clearFields() {
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().clear();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(String str) {
            str.getClass();
            return ((Struct) this.instance).getFieldsMap().containsKey(str);
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((Struct) this.instance).getFieldsMap().size();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : value;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFields(Map<String, Value> map) {
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().remove(str);
            return this;
        }

        private Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final p0<String, Value> f1939a = new p0<>(b2.a.f1971c, b2.a.f1973e, Value.getDefaultInstance());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private q0<String, Value> internalGetFields() {
        return this.fields_;
    }

    private q0<String, Value> internalGetMutableFields() {
        q0<String, Value> q0Var = this.fields_;
        if (!q0Var.f2134a) {
            this.fields_ = q0Var.f();
        }
        return this.fields_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.f1939a});
            case 3:
                return new Struct();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<Struct> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (Struct.class) {
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

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        q0<String, Value> q0VarInternalGetFields = internalGetFields();
        return q0VarInternalGetFields.containsKey(str) ? q0VarInternalGetFields.get(str) : value;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        q0<String, Value> q0VarInternalGetFields = internalGetFields();
        if (q0VarInternalGetFields.containsKey(str)) {
            return q0VarInternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static Struct parseFrom(j jVar) throws e0 {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Struct parseFrom(j jVar, t tVar) throws e0 {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static Struct parseFrom(byte[] bArr) throws e0 {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, t tVar) throws e0 {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static Struct parseFrom(k kVar) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static Struct parseFrom(k kVar, t tVar) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}

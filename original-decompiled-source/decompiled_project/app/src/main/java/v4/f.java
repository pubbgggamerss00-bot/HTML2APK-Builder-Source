package v4;

import androidx.datastore.preferences.PreferencesProto$PreferenceMap;
import androidx.datastore.preferences.PreferencesProto$StringSet;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.j;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import p.i0;
import pg.f0;
import pg.l;
import qg.k0;
import qg.x;
import s4.b1;
import s4.m1;
import v4.e;

/* loaded from: classes.dex */
public final class f implements b1<e> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f30616a = new f();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30617a;

        static {
            int[] iArr = new int[PreferencesProto$Value.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f30617a = iArr;
        }
    }

    @Override // s4.b1
    public final b a(FileInputStream fileInputStream) throws IOException {
        byte[] bArr;
        try {
            PreferencesProto$PreferenceMap from = PreferencesProto$PreferenceMap.parseFrom(fileInputStream);
            r.d(from, "{\n                Prefer…From(input)\n            }");
            b bVar = new b(false, 1);
            e.b[] pairs = (e.b[]) Arrays.copyOf(new e.b[0], 0);
            r.e(pairs, "pairs");
            bVar.c();
            if (pairs.length > 0) {
                pairs[0].getClass();
                bVar.f(null, null);
                throw null;
            }
            Map<String, PreferencesProto$Value> preferencesMap = from.getPreferencesMap();
            r.d(preferencesMap, "preferencesProto.preferencesMap");
            for (Map.Entry<String, PreferencesProto$Value> entry : preferencesMap.entrySet()) {
                String name = entry.getKey();
                PreferencesProto$Value value = entry.getValue();
                r.d(name, "name");
                r.d(value, "value");
                PreferencesProto$Value.a valueCase = value.getValueCase();
                switch (valueCase == null ? -1 : a.f30617a[valueCase.ordinal()]) {
                    case -1:
                        throw new s4.c("Value case is null.", null);
                    case 0:
                    default:
                        throw new l();
                    case 1:
                        bVar.f(new e.a<>(name), Boolean.valueOf(value.getBoolean()));
                        break;
                    case 2:
                        bVar.f(new e.a<>(name), Float.valueOf(value.getFloat()));
                        break;
                    case 3:
                        bVar.f(new e.a<>(name), Double.valueOf(value.getDouble()));
                        break;
                    case 4:
                        bVar.f(new e.a<>(name), Integer.valueOf(value.getInteger()));
                        break;
                    case 5:
                        bVar.f(new e.a<>(name), Long.valueOf(value.getLong()));
                        break;
                    case 6:
                        e.a<?> aVar = new e.a<>(name);
                        String string = value.getString();
                        r.d(string, "value.string");
                        bVar.f(aVar, string);
                        break;
                    case 7:
                        e.a<?> aVar2 = new e.a<>(name);
                        List<String> stringsList = value.getStringSet().getStringsList();
                        r.d(stringsList, "value.stringSet.stringsList");
                        bVar.f(aVar2, x.h0(stringsList));
                        break;
                    case 8:
                        e.a<?> aVar3 = new e.a<>(name);
                        j bytes = value.getBytes();
                        int size = bytes.size();
                        if (size == 0) {
                            bArr = d0.f2006b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            bytes.e(size, bArr2);
                            bArr = bArr2;
                        }
                        r.d(bArr, "value.bytes.toByteArray()");
                        bVar.f(aVar3, bArr);
                        break;
                    case 9:
                        throw new s4.c("Value not set.", null);
                }
            }
            return new b(k0.k(bVar.a()), true);
        } catch (e0 e10) {
            throw new s4.c("Unable to parse preferences proto.", e10);
        }
    }

    @Override // s4.b1
    public final f0 b(Object obj, m1 m1Var) throws IOException {
        PreferencesProto$Value preferencesProto$ValueBuild;
        Map<e.a<?>, Object> mapA = ((e) obj).a();
        PreferencesProto$PreferenceMap.Builder builderNewBuilder = PreferencesProto$PreferenceMap.newBuilder();
        for (Map.Entry<e.a<?>, Object> entry : mapA.entrySet()) {
            e.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f30615a;
            if (value instanceof Boolean) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setBoolean(((Boolean) value).booleanValue()).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setFloat(((Number) value).floatValue()).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setDouble(((Number) value).doubleValue()).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setInteger(((Number) value).intValue()).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setLong(((Number) value).longValue()).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setString((String) value).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setStringSet(PreferencesProto$StringSet.newBuilder().addAllStrings((Set) value)).build();
                r.d(preferencesProto$ValueBuild, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException(i0.a(value, "PreferencesSerializer does not support type: "));
                }
                byte[] bArr = (byte[]) value;
                preferencesProto$ValueBuild = PreferencesProto$Value.newBuilder().setBytes(j.c(0, bArr.length, bArr)).build();
                r.d(preferencesProto$ValueBuild, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            builderNewBuilder.putPreferences(str, preferencesProto$ValueBuild);
        }
        builderNewBuilder.build().writeTo(m1Var);
        return f0.f21461a;
    }

    @Override // s4.b1
    public final b getDefaultValue() {
        return new b(true, 1);
    }
}

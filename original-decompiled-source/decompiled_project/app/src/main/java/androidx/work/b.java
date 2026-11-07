package androidx.work;

import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import j2.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import qg.m;
import qg.x;
import t6.f;
import t6.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3129b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3130a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f3131a = new LinkedHashMap();

        public final void a(HashMap values) {
            Object[] objArr;
            r.e(values, "values");
            for (Map.Entry entry : values.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                r.e(key, "key");
                if (value == null) {
                    value = null;
                } else {
                    h hVarA = h0.a(value.getClass());
                    if (hVarA.equals(h0.a(Boolean.TYPE)) ? true : hVarA.equals(h0.a(Byte.TYPE)) ? true : hVarA.equals(h0.a(Integer.TYPE)) ? true : hVarA.equals(h0.a(Long.TYPE)) ? true : hVarA.equals(h0.a(Float.TYPE)) ? true : hVarA.equals(h0.a(Double.TYPE)) ? true : hVarA.equals(h0.a(String.class)) ? true : hVarA.equals(h0.a(Boolean[].class)) ? true : hVarA.equals(h0.a(Byte[].class)) ? true : hVarA.equals(h0.a(Integer[].class)) ? true : hVarA.equals(h0.a(Long[].class)) ? true : hVarA.equals(h0.a(Float[].class)) ? true : hVarA.equals(h0.a(Double[].class)) ? true : hVarA.equals(h0.a(String[].class))) {
                        continue;
                    } else {
                        int i10 = 0;
                        if (hVarA.equals(h0.a(boolean[].class))) {
                            boolean[] zArr = (boolean[]) value;
                            String str = f.f28016a;
                            int length = zArr.length;
                            objArr = new Boolean[length];
                            while (i10 < length) {
                                objArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                        } else if (hVarA.equals(h0.a(byte[].class))) {
                            byte[] bArr = (byte[]) value;
                            String str2 = f.f28016a;
                            int length2 = bArr.length;
                            objArr = new Byte[length2];
                            while (i10 < length2) {
                                objArr[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                        } else if (hVarA.equals(h0.a(int[].class))) {
                            int[] iArr = (int[]) value;
                            String str3 = f.f28016a;
                            int length3 = iArr.length;
                            objArr = new Integer[length3];
                            while (i10 < length3) {
                                objArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                        } else if (hVarA.equals(h0.a(long[].class))) {
                            long[] jArr = (long[]) value;
                            String str4 = f.f28016a;
                            int length4 = jArr.length;
                            objArr = new Long[length4];
                            while (i10 < length4) {
                                objArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                        } else if (hVarA.equals(h0.a(float[].class))) {
                            float[] fArr = (float[]) value;
                            String str5 = f.f28016a;
                            int length5 = fArr.length;
                            objArr = new Float[length5];
                            while (i10 < length5) {
                                objArr[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                        } else {
                            if (!hVarA.equals(h0.a(double[].class))) {
                                throw new IllegalArgumentException("Key " + key + " has invalid type " + hVarA);
                            }
                            double[] dArr = (double[]) value;
                            String str6 = f.f28016a;
                            int length6 = dArr.length;
                            objArr = new Double[length6];
                            while (i10 < length6) {
                                objArr[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                        }
                        value = objArr;
                    }
                }
                this.f3131a.put(key, value);
            }
        }
    }

    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public static final class C0046b {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        public static final Serializable a(DataInputStream dataInputStream, byte b10) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                ?? r02 = new Boolean[i11];
                while (i10 < i11) {
                    r02[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return r02;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                ?? r03 = new Byte[i12];
                while (i10 < i12) {
                    r03[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return r03;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                ?? r04 = new Integer[i13];
                while (i10 < i13) {
                    r04[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return r04;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                ?? r05 = new Long[i14];
                while (i10 < i14) {
                    r05[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return r05;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                ?? r06 = new Float[i15];
                while (i10 < i15) {
                    r06[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return r06;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                ?? r07 = new Double[i16];
                while (i10 < i16) {
                    r07[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return r07;
            }
            if (b10 != 14) {
                throw new IllegalStateException(y.a(b10, "Unsupported type "));
            }
            int i17 = dataInputStream.readInt();
            ?? r12 = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (r.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r12[i10] = utf;
                i10++;
            }
            return r12;
        }

        public static byte[] b(b data) throws IOException {
            r.e(data, "data");
            HashMap map = data.f3130a;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    r.d(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                s.d().c(f.f28016a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        public static final void c(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i10;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + h0.a(obj.getClass()).e());
                }
                Object[] objArr = (Object[]) obj;
                h hVarA = h0.a(objArr.getClass());
                if (hVarA.equals(h0.a(Boolean[].class))) {
                    i10 = 8;
                } else if (hVarA.equals(h0.a(Byte[].class))) {
                    i10 = 9;
                } else if (hVarA.equals(h0.a(Integer[].class))) {
                    i10 = 10;
                } else if (hVarA.equals(h0.a(Long[].class))) {
                    i10 = 11;
                } else if (hVarA.equals(h0.a(Float[].class))) {
                    i10 = 12;
                } else if (hVarA.equals(h0.a(Double[].class))) {
                    i10 = 13;
                } else {
                    if (!hVarA.equals(h0.a(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + h0.a(objArr.getClass()).a());
                    }
                    i10 = 14;
                }
                dataOutputStream.writeByte(i10);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i10 == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i10 == 9) {
                        Byte b10 = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                    } else if (i10 == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i10 == 11) {
                        Long l10 = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                    } else if (i10 == 12) {
                        Float f10 = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : CropImageView.DEFAULT_ASPECT_RATIO);
                    } else if (i10 == 13) {
                        Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                    } else if (i10 == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3132a = new c(1);

        @Override // eh.l
        public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
            Map.Entry<? extends String, ? extends Object> entry2 = entry;
            r.e(entry2, "<name for destructuring parameter 0>");
            String key = entry2.getKey();
            Object value = entry2.getValue();
            StringBuilder sbA = v5.b.a(key, " : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
                r.d(value, "toString(this)");
            }
            sbA.append(value);
            return sbA.toString();
        }
    }

    static {
        b bVar = new b(new LinkedHashMap());
        C0046b.b(bVar);
        f3129b = bVar;
    }

    public b(b other) {
        r.e(other, "other");
        this.f3130a = new HashMap(other.f3130a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b a(byte[] bytes) throws IOException {
        r.e(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return f3129b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b10 = (byte) (-21267);
            int i10 = 0;
            if (bArr[0] == ((byte) 16777132)) {
                boolean z10 = true;
                if (bArr[1] != b10) {
                    z10 = false;
                }
                byteArrayInputStream.reset();
                if (z10) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i11 = objectInputStream.readInt();
                        while (i10 < i11) {
                            String utf = objectInputStream.readUTF();
                            r.d(utf, "readUTF()");
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i10++;
                        }
                        objectInputStream.close();
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short s10 = dataInputStream.readShort();
                        if (s10 != -21521) {
                            throw new IllegalStateException(y.a(s10, "Magic number doesn't match: ").toString());
                        }
                        short s11 = dataInputStream.readShort();
                        if (s11 != 1) {
                            throw new IllegalStateException(y.a(s11, "Unsupported version number: ").toString());
                        }
                        int i12 = dataInputStream.readInt();
                        while (i10 < i12) {
                            Serializable serializableA = C0046b.a(dataInputStream, dataInputStream.readByte());
                            String key = dataInputStream.readUTF();
                            r.d(key, "key");
                            linkedHashMap.put(key, serializableA);
                            i10++;
                        }
                        dataInputStream.close();
                    } finally {
                    }
                }
            }
        } catch (IOException e10) {
            s.d().c(f.f28016a, "Error in Data#fromByteArray: ", e10);
        } catch (ClassNotFoundException e11) {
            s.d().c(f.f28016a, "Error in Data#fromByteArray: ", e11);
        }
        return new b(linkedHashMap);
    }

    public final boolean b(String str) {
        Object obj = this.f3130a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zB;
        if (this != obj) {
            if (obj != null && b.class.equals(obj.getClass())) {
                HashMap map = ((b) obj).f3130a;
                HashMap map2 = this.f3130a;
                Set<String> setKeySet = map2.keySet();
                if (r.a(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zB = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            zB = obj3 instanceof Object[] ? m.b((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3);
                        }
                        if (!zB) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f3130a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        String str = "Data {" + x.I(this.f3130a.entrySet(), null, null, null, c.f3132a, 31) + "}";
        r.d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public b(LinkedHashMap values) {
        r.e(values, "values");
        this.f3130a = new HashMap(values);
    }
}

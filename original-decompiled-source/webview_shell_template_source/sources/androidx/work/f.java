package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1774b = k.e("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final f f1775c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1776a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f1777a = new HashMap();

        public final void a(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap map2 = this.f1777a;
                if (value == null) {
                    map2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        map2.put(str, value);
                    } else {
                        int i6 = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = f.f1774b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i6 < zArr.length) {
                                boolArr[i6] = Boolean.valueOf(zArr[i6]);
                                i6++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = f.f1774b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i6 < bArr.length) {
                                bArr2[i6] = Byte.valueOf(bArr[i6]);
                                i6++;
                            }
                            map2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = f.f1774b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i6 < iArr.length) {
                                numArr[i6] = Integer.valueOf(iArr[i6]);
                                i6++;
                            }
                            map2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = f.f1774b;
                            Long[] lArr = new Long[jArr.length];
                            while (i6 < jArr.length) {
                                lArr[i6] = Long.valueOf(jArr[i6]);
                                i6++;
                            }
                            map2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = f.f1774b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i6 < fArr.length) {
                                fArr2[i6] = Float.valueOf(fArr[i6]);
                                i6++;
                            }
                            map2.put(str, fArr2);
                        } else {
                            if (cls != double[].class) {
                                throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                            }
                            double[] dArr = (double[]) value;
                            String str7 = f.f1774b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i6 < dArr.length) {
                                dArr2[i6] = Double.valueOf(dArr[i6]);
                                i6++;
                            }
                            map2.put(str, dArr2);
                        }
                    }
                }
            }
        }
    }

    static {
        f fVar = new f(new HashMap());
        c(fVar);
        f1775c = fVar;
    }

    public f() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:4|(5:55|5|56|6|(2:8|9))|49|16|53|20|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        android.util.Log.e(r1, "Error in Data#fromByteArray: ", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        android.util.Log.e(r1, "Error in Data#fromByteArray: ", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033 A[EXC_TOP_SPLITTER, PHI: r4
      0x0033: PHI (r4v7 java.io.ObjectInputStream) = (r4v6 java.io.ObjectInputStream), (r4v8 java.io.ObjectInputStream) binds: [B:31:0x0052, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e6;
        String str = f1774b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i6 = objectInputStream.readInt(); i6 > 0; i6--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                } catch (IOException e7) {
                    e6 = e7;
                    Log.e(str, "Error in Data#fromByteArray: ", e6);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new f(map);
                } catch (ClassNotFoundException e8) {
                    e6 = e8;
                    Log.e(str, "Error in Data#fromByteArray: ", e6);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new f(map);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e9) {
                        Log.e(str, "Error in Data#fromByteArray: ", e9);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e10) {
                    Log.e(str, "Error in Data#fromByteArray: ", e10);
                    throw th;
                }
            }
        } catch (IOException e11) {
            e = e11;
            Throwable th3 = e;
            objectInputStream = null;
            e6 = th3;
            Log.e(str, "Error in Data#fromByteArray: ", e6);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new f(map);
        } catch (ClassNotFoundException e12) {
            e = e12;
            Throwable th32 = e;
            objectInputStream = null;
            e6 = th32;
            Log.e(str, "Error in Data#fromByteArray: ", e6);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new f(map);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        objectInputStream.close();
        byteArrayInputStream.close();
        return new f(map);
    }

    public static byte[] c(f fVar) throws Throwable {
        ObjectOutputStream objectOutputStream;
        String str = f1774b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e6) {
            e = e6;
        }
        try {
            objectOutputStream.writeInt(fVar.f1776a.size());
            for (Map.Entry entry : fVar.f1776a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e7) {
                Log.e(str, "Error in Data#toByteArray: ", e7);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e8) {
                Log.e(str, "Error in Data#toByteArray: ", e8);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e9) {
            e = e9;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    Log.e(str, "Error in Data#toByteArray: ", e10);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#toByteArray: ", e12);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e13) {
                Log.e(str, "Error in Data#toByteArray: ", e13);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f1776a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                HashMap map = ((f) obj).f1776a;
                HashMap map2 = this.f1776a;
                Set<String> setKeySet = map2.keySet();
                if (setKeySet.equals(map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1776a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f1776a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public f(f fVar) {
        this.f1776a = new HashMap(fVar.f1776a);
    }

    public f(HashMap map) {
        this.f1776a = new HashMap(map);
    }
}

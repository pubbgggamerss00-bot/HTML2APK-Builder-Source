package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final Class<? extends Object>[] f1339f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1340a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1341b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1342c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1343d;

    /* renamed from: e, reason: collision with root package name */
    public final a.b f1344e;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static y a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new y();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    kotlin.jvm.internal.j.d("key", str);
                    map.put(str, bundle2.get(str));
                }
                return new y(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = parcelableArrayList.get(i6);
                kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlin.String", obj);
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i6));
            }
            return new y(linkedHashMap);
        }
    }

    public y(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1340a = linkedHashMap;
        this.f1341b = new LinkedHashMap();
        this.f1342c = new LinkedHashMap();
        this.f1343d = new LinkedHashMap();
        this.f1344e = new a.b() { // from class: androidx.lifecycle.x
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return y.a(this.f1338a);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle a(y yVar) {
        Map mapSingletonMap;
        LinkedHashMap linkedHashMap = yVar.f1340a;
        LinkedHashMap linkedHashMap2 = yVar.f1341b;
        kotlin.jvm.internal.j.e("<this>", linkedHashMap2);
        int size = linkedHashMap2.size();
        if (size == 0) {
            mapSingletonMap = e5.t.s;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap2);
        } else {
            kotlin.jvm.internal.j.e("<this>", linkedHashMap2);
            Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            kotlin.jvm.internal.j.d("with(...)", mapSingletonMap);
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        while (true) {
            int i6 = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                d5.c[] cVarArr = {new d5.c("keys", arrayList), new d5.c("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i6 < 2) {
                    d5.c cVar = cVarArr[i6];
                    String str2 = (String) cVar.s;
                    B b7 = cVar.f12739t;
                    if (b7 == 0) {
                        bundle.putString(str2, null);
                    } else if (b7 instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) b7).booleanValue());
                    } else if (b7 instanceof Byte) {
                        bundle.putByte(str2, ((Number) b7).byteValue());
                    } else if (b7 instanceof Character) {
                        bundle.putChar(str2, ((Character) b7).charValue());
                    } else if (b7 instanceof Double) {
                        bundle.putDouble(str2, ((Number) b7).doubleValue());
                    } else if (b7 instanceof Float) {
                        bundle.putFloat(str2, ((Number) b7).floatValue());
                    } else if (b7 instanceof Integer) {
                        bundle.putInt(str2, ((Number) b7).intValue());
                    } else if (b7 instanceof Long) {
                        bundle.putLong(str2, ((Number) b7).longValue());
                    } else if (b7 instanceof Short) {
                        bundle.putShort(str2, ((Number) b7).shortValue());
                    } else if (b7 instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) b7);
                    } else if (b7 instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) b7);
                    } else if (b7 instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) b7);
                    } else if (b7 instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) b7);
                    } else if (b7 instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) b7);
                    } else if (b7 instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) b7);
                    } else if (b7 instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) b7);
                    } else if (b7 instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) b7);
                    } else if (b7 instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) b7);
                    } else if (b7 instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) b7);
                    } else if (b7 instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) b7);
                    } else if (b7 instanceof Object[]) {
                        Class<?> componentType = b7.getClass().getComponentType();
                        kotlin.jvm.internal.j.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) b7);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) b7);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) b7);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) b7);
                        }
                    } else if (b7 instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) b7);
                    } else if (b7 instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) b7);
                    } else if (b7 instanceof Size) {
                        bundle.putSize(str2, (Size) b7);
                    } else {
                        if (!(b7 instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + b7.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) b7);
                    }
                    i6++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Bundle bundleA = ((a.b) entry2.getValue()).a();
            kotlin.jvm.internal.j.e("key", str3);
            if (bundleA != null) {
                while (i6 < 29) {
                    Class<? extends Object> cls = f1339f[i6];
                    kotlin.jvm.internal.j.b(cls);
                    if (!cls.isInstance(bundleA)) {
                        i6++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj = yVar.f1342c.get(str3);
            r rVar = obj instanceof r ? (r) obj : null;
            if (rVar != null) {
                rVar.setValue(bundleA);
            } else {
                linkedHashMap.put(str3, bundleA);
            }
            a6.a aVar = (a6.a) yVar.f1343d.get(str3);
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public y() {
        this.f1340a = new LinkedHashMap();
        this.f1341b = new LinkedHashMap();
        this.f1342c = new LinkedHashMap();
        this.f1343d = new LinkedHashMap();
        this.f1344e = new a.b() { // from class: androidx.lifecycle.x
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return y.a(this.f1338a);
            }
        };
    }
}

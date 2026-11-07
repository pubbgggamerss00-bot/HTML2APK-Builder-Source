package v4;

import eh.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.n;
import qg.j0;
import qg.o;
import qg.p;
import qg.x;
import v4.e;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f30607a;

    /* renamed from: b, reason: collision with root package name */
    public final v4.a f30608b;

    public static final class a extends s implements l<Map.Entry<e.a<?>, Object>, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30609a = new a(1);

        @Override // eh.l
        public final CharSequence invoke(Map.Entry<e.a<?>, Object> entry) {
            Map.Entry<e.a<?>, Object> entry2 = entry;
            r.e(entry2, "entry");
            Object value = entry2.getValue();
            return "  " + entry2.getKey().f30615a + " = " + (value instanceof byte[] ? o.y((byte[]) value, ", ", null, 56) : String.valueOf(entry2.getValue()));
        }
    }

    public b() {
        this(false, 3);
    }

    @Override // v4.e
    public final Map<e.a<?>, Object> a() {
        n nVar;
        Set<Map.Entry> setEntrySet = this.f30607a.entrySet();
        int iA = j0.a(p.h(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                r.d(bArrCopyOf, "copyOf(this, size)");
                nVar = new n(key, bArrCopyOf);
            } else {
                nVar = new n(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(nVar.f21469a, nVar.f21470b);
        }
        Map<e.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        r.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.e
    public final <T> T b(e.a<T> key) {
        r.e(key, "key");
        T t3 = (T) this.f30607a.get(key);
        if (!(t3 instanceof byte[])) {
            return t3;
        }
        byte[] bArr = (byte[]) t3;
        T t10 = (T) Arrays.copyOf(bArr, bArr.length);
        r.d(t10, "copyOf(this, size)");
        return t10;
    }

    public final void c() {
        if (this.f30608b.f30606a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(e.a key) {
        r.e(key, "key");
        c();
        this.f30607a.remove(key);
    }

    public final <T> void e(e.a<T> key, T t3) {
        r.e(key, "key");
        f(key, t3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f30607a;
            LinkedHashMap linkedHashMap2 = this.f30607a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                boolean zA = value instanceof byte[] ? (obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2) : r.a(value, obj2);
                                if (!zA) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(e.a<?> key, Object obj) {
        r.e(key, "key");
        c();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f30607a;
        if (z10) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(x.h0((Set) obj));
            r.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            r.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.f30607a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return x.I(this.f30607a.entrySet(), ",\n", "{\n", "\n}", a.f30609a, 24);
    }

    public /* synthetic */ b(boolean z10, int i10) {
        this(new LinkedHashMap(), (i10 & 2) != 0 ? true : z10);
    }

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f30607a = linkedHashMap;
        this.f30608b = new v4.a(z10);
    }
}

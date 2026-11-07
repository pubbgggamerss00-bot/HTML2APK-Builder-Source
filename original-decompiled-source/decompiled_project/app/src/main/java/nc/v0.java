package nc;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v0<K, V> extends s<K, V> {

    /* renamed from: g, reason: collision with root package name */
    public static final v0 f18761g = new v0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient int[] f18762d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f18763e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f18764f;

    public static class a<K, V> extends v<Map.Entry<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        public final transient s<K, V> f18765d;

        /* renamed from: e, reason: collision with root package name */
        public final transient Object[] f18766e;

        /* renamed from: f, reason: collision with root package name */
        public final transient int f18767f;

        /* renamed from: g, reason: collision with root package name */
        public final transient int f18768g;

        /* renamed from: nc.v0$a$a, reason: collision with other inner class name */
        public class C0209a extends r<Map.Entry<K, V>> {
            public C0209a() {
            }

            @Override // nc.p
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i10) {
                a aVar = a.this;
                g8.w.d(i10, aVar.f18768g);
                Object[] objArr = aVar.f18766e;
                int i11 = i10 * 2;
                int i12 = aVar.f18767f;
                return new AbstractMap.SimpleImmutableEntry(objArr[i11 + i12], objArr[i11 + (i12 ^ 1)]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f18768g;
            }
        }

        public a(s<K, V> sVar, Object[] objArr, int i10, int i11) {
            this.f18765d = sVar;
            this.f18766e = objArr;
            this.f18767f = i10;
            this.f18768g = i11;
        }

        @Override // nc.p
        public final int b(Object[] objArr) {
            return a().b(objArr);
        }

        @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f18765d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // nc.p
        public final boolean f() {
            return true;
        }

        @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final e1<Map.Entry<K, V>> iterator() {
            return a().listIterator(0);
        }

        @Override // nc.v
        public final r<Map.Entry<K, V>> m() {
            return new C0209a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18768g;
        }
    }

    public static final class b<K> extends v<K> {

        /* renamed from: d, reason: collision with root package name */
        public final transient s<K, ?> f18770d;

        /* renamed from: e, reason: collision with root package name */
        public final transient c f18771e;

        public b(s sVar, c cVar) {
            this.f18770d = sVar;
            this.f18771e = cVar;
        }

        @Override // nc.v, nc.p
        public final r<K> a() {
            return this.f18771e;
        }

        @Override // nc.p
        public final int b(Object[] objArr) {
            return this.f18771e.b(objArr);
        }

        @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f18770d.get(obj) != null;
        }

        @Override // nc.p
        public final boolean f() {
            return true;
        }

        @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final e1<K> iterator() {
            return this.f18771e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18770d.size();
        }
    }

    public static final class c extends r<Object> {

        /* renamed from: c, reason: collision with root package name */
        public final transient Object[] f18772c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f18773d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f18774e;

        public c(Object[] objArr, int i10, int i11) {
            this.f18772c = objArr;
            this.f18773d = i10;
            this.f18774e = i11;
        }

        @Override // nc.p
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            g8.w.d(i10, this.f18774e);
            return this.f18772c[(i10 * 2) + this.f18773d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18774e;
        }
    }

    public v0(int[] iArr, Object[] objArr, int i10) {
        this.f18762d = iArr;
        this.f18763e = objArr;
        this.f18764f = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] j(Object[] objArr, int i10, int i11, int i12) {
        if (i10 == 1) {
            g.a(objArr[i12], objArr[i12 ^ 1]);
            return null;
        }
        int i13 = i11 - 1;
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i14 = 0;
        while (i14 < i10) {
            int i15 = i14 * 2;
            int i16 = i15 + i12;
            Object obj = objArr[i16];
            Object obj2 = objArr[i15 + (i12 ^ 1)];
            g.a(obj, obj2);
            int iA = n.a(obj.hashCode());
            while (true) {
                int i17 = iA & i13;
                int i18 = iArr[i17];
                if (i18 == -1) {
                    break;
                }
                if (objArr[i18].equals(obj)) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i18] + "=" + objArr[i18 ^ 1]);
                }
                iA = i17 + 1;
            }
        }
        return iArr;
    }

    public static Object k(int[] iArr, Object[] objArr, int i10, int i11, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iA = n.a(obj.hashCode());
        while (true) {
            int i12 = iA & length;
            int i13 = iArr[i12];
            if (i13 == -1) {
                return null;
            }
            if (objArr[i13].equals(obj)) {
                return objArr[i13 ^ 1];
            }
            iA = i12 + 1;
        }
    }

    @Override // nc.s
    public final v<Map.Entry<K, V>> c() {
        return new a(this, this.f18763e, 0, this.f18764f);
    }

    @Override // nc.s
    public final v<K> e() {
        return new b(this, new c(this.f18763e, 0, this.f18764f));
    }

    @Override // nc.s
    public final p<V> f() {
        return new c(this.f18763e, 1, this.f18764f);
    }

    @Override // nc.s, java.util.Map
    public final V get(Object obj) {
        return (V) k(this.f18762d, this.f18763e, this.f18764f, 0, obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18764f;
    }
}

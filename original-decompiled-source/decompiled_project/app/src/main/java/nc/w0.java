package nc;

/* loaded from: classes2.dex */
public final class w0<E> extends v<E> {

    /* renamed from: j, reason: collision with root package name */
    public static final w0<Object> f18781j = new w0<>(new Object[0], 0, null, 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f18782d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f18783e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f18784f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f18785g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f18786h;

    public w0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f18782d = objArr;
        this.f18783e = objArr2;
        this.f18784f = i11;
        this.f18785g = i10;
        this.f18786h = i12;
    }

    @Override // nc.p
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f18782d;
        int i10 = this.f18786h;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // nc.p
    public final Object[] c() {
        return this.f18782d;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr;
        if (obj == null || (objArr = this.f18783e) == null) {
            return false;
        }
        int iA = n.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f18784f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // nc.p
    public final int d() {
        return this.f18786h;
    }

    @Override // nc.p
    public final int e() {
        return 0;
    }

    @Override // nc.p
    public final boolean f() {
        return false;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final e1<E> iterator() {
        return a().listIterator(0);
    }

    @Override // nc.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18785g;
    }

    @Override // nc.v
    public final r<E> m() {
        return r.i(this.f18786h, this.f18782d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18786h;
    }
}

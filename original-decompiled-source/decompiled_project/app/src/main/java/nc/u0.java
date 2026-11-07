package nc;

/* loaded from: classes2.dex */
public final class u0<E> extends r<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f18756e = new u0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f18757c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f18758d;

    public u0(Object[] objArr, int i10) {
        this.f18757c = objArr;
        this.f18758d = i10;
    }

    @Override // nc.r, nc.p
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f18757c;
        int i10 = this.f18758d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // nc.p
    public final Object[] c() {
        return this.f18757c;
    }

    @Override // nc.p
    public final int d() {
        return this.f18758d;
    }

    @Override // nc.p
    public final int e() {
        return 0;
    }

    @Override // nc.p
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i10) {
        g8.w.d(i10, this.f18758d);
        return (E) this.f18757c[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18758d;
    }
}

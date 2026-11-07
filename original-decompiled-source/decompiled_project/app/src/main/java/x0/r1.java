package x0;

/* loaded from: classes.dex */
public final class r1<N> implements d<N> {

    /* renamed from: a, reason: collision with root package name */
    public final d<N> f31907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31908b;

    /* renamed from: c, reason: collision with root package name */
    public int f31909c;

    public r1(d<N> dVar, int i10) {
        this.f31907a = dVar;
        this.f31908b = i10;
    }

    @Override // x0.d
    public final void a(int i10, N n10) {
        this.f31907a.a(i10 + (this.f31909c == 0 ? this.f31908b : 0), n10);
    }

    @Override // x0.d
    public final void b(N n10) {
        this.f31909c++;
        this.f31907a.b(n10);
    }

    @Override // x0.d
    public final void d(int i10, int i11, int i12) {
        int i13 = this.f31909c == 0 ? this.f31908b : 0;
        this.f31907a.d(i10 + i13, i11 + i13, i12);
    }

    @Override // x0.d
    public final void e(int i10, int i11) {
        this.f31907a.e(i10 + (this.f31909c == 0 ? this.f31908b : 0), i11);
    }

    @Override // x0.d
    public final void f() {
        if (!(this.f31909c > 0)) {
            q.c("OffsetApplier up called with no corresponding down");
        }
        this.f31909c--;
        this.f31907a.f();
    }

    @Override // x0.d
    public final void g(int i10, N n10) {
        this.f31907a.g(i10 + (this.f31909c == 0 ? this.f31908b : 0), n10);
    }

    @Override // x0.d
    public final N h() {
        return this.f31907a.h();
    }
}

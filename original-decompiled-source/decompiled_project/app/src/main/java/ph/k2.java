package ph;

/* loaded from: classes2.dex */
public final class k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f21559a;

    /* renamed from: b, reason: collision with root package name */
    public final m f21560b;

    public k2(k1 k1Var, m mVar) {
        this.f21559a = k1Var;
        this.f21560b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21560b.B(this.f21559a, pg.f0.f21461a);
    }
}

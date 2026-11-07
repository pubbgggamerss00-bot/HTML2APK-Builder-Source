package d4;

/* loaded from: classes.dex */
public final class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7355a;

    public /* synthetic */ p(Object obj) {
        this.f7355a = obj;
    }

    @Override // d4.t
    public void a(Object obj) {
        e4.a e10 = (e4.a) obj;
        kotlin.jvm.internal.r.e(e10, "e");
        ph.m mVar = (ph.m) this.f7355a;
        if (mVar.u()) {
            mVar.resumeWith(pg.q.a(e10));
        }
    }

    @Override // d4.t
    public void onResult(Object obj) {
        ph.m mVar = (ph.m) this.f7355a;
        if (mVar.u()) {
            mVar.resumeWith(pg.f0.f21461a);
        }
    }
}

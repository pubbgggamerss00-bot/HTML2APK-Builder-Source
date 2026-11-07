package ph;

/* loaded from: classes2.dex */
public final class c2 extends l2 {

    /* renamed from: d, reason: collision with root package name */
    public final tg.e<pg.f0> f21515d;

    public c2(tg.h hVar, eh.p<? super i0, ? super tg.e<? super pg.f0>, ? extends Object> pVar) {
        super(hVar, false);
        this.f21515d = ah.p.b(pVar, this, this);
    }

    @Override // ph.y1
    public final void Q() throws Throwable {
        try {
            uh.g.a(pg.f0.f21461a, ah.p.c(this.f21515d));
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof v0) {
                th = ((v0) th).f21596a;
            }
            resumeWith(pg.q.a(th));
            throw th;
        }
    }
}

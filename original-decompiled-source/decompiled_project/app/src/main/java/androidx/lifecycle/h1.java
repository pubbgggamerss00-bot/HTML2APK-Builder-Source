package androidx.lifecycle;

import androidx.lifecycle.l;
import s8.x1;

/* loaded from: classes.dex */
public final class h1 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.m f2311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f2312c;

    public h1(l lVar, ph.m mVar, x1 x1Var) {
        l.b bVar = l.b.f2319a;
        this.f2310a = lVar;
        this.f2311b = mVar;
        this.f2312c = x1Var;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        Object objA;
        l.a.C0033a c0033a = l.a.Companion;
        l.b bVar = l.b.f2323e;
        c0033a.getClass();
        l.a aVarB = l.a.C0033a.b(bVar);
        ph.m mVar = this.f2311b;
        l lVar = this.f2310a;
        if (aVar != aVarB) {
            if (aVar == l.a.ON_DESTROY) {
                lVar.c(this);
                mVar.resumeWith(pg.q.a(new p(null)));
                return;
            }
            return;
        }
        lVar.c(this);
        try {
            objA = this.f2312c.invoke();
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        mVar.resumeWith(objA);
    }
}

package ph;

import ph.s1;

/* loaded from: classes2.dex */
public abstract class a<T> extends y1 implements tg.e<T>, i0 {

    /* renamed from: c, reason: collision with root package name */
    public final tg.h f21494c;

    public a(tg.h hVar, boolean z10) {
        super(z10);
        F((s1) hVar.get(s1.a.f21589a));
        this.f21494c = hVar.plus(this);
    }

    @Override // ph.y1
    public final void D(z zVar) {
        kotlinx.coroutines.a.a(zVar, this.f21494c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ph.y1
    public final void P(Object obj) {
        if (!(obj instanceof y)) {
            a0(obj);
            return;
        }
        y yVar = (y) obj;
        Y(y.f21608b.get(yVar) == 1, yVar.f21609a);
    }

    public void Y(boolean z10, Throwable th2) {
    }

    public void a0(T t3) {
    }

    public final void b0(k0 k0Var, a aVar, eh.p pVar) {
        Object objInvoke;
        int iOrdinal = k0Var.ordinal();
        if (iOrdinal == 0) {
            try {
                uh.g.a(pg.f0.f21461a, ah.p.c(ah.p.b(pVar, aVar, this)));
                return;
            } finally {
                th = th;
                if (th instanceof v0) {
                    th = ((v0) th).f21596a;
                }
                resumeWith(pg.q.a(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.r.e(pVar, "<this>");
                ah.p.c(ah.p.b(pVar, aVar, this)).resumeWith(pg.f0.f21461a);
                return;
            }
            if (iOrdinal != 3) {
                throw new pg.l();
            }
            try {
                tg.h hVar = this.f21494c;
                Object objC = uh.b0.c(hVar, null);
                try {
                    if (pVar instanceof vg.a) {
                        kotlin.jvm.internal.m0.b(2, pVar);
                        objInvoke = pVar.invoke(aVar, this);
                    } else {
                        objInvoke = ah.p.f(pVar, aVar, this);
                    }
                    uh.b0.a(hVar, objC);
                    if (objInvoke != ug.a.f29706a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    uh.b0.a(hVar, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // tg.e
    public final tg.h getContext() {
        return this.f21494c;
    }

    @Override // ph.i0
    public final tg.h getCoroutineContext() {
        return this.f21494c;
    }

    @Override // ph.y1
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        Throwable thA = pg.p.a(obj);
        if (thA != null) {
            obj = new y(false, thA);
        }
        Object objJ = J(obj);
        if (objJ == b2.f21499b) {
            return;
        }
        j(objJ);
    }
}

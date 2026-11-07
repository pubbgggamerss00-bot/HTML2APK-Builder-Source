package ph;

import tg.f;

/* loaded from: classes2.dex */
public final class w2<T> extends uh.r<T> {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal<pg.n<tg.h, Object>> f21599e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public w2(tg.e eVar, tg.h hVar) {
        x2 x2Var = x2.f21607a;
        super(eVar, hVar.get(x2Var) == null ? hVar.plus(x2Var) : hVar);
        this.f21599e = new ThreadLocal<>();
        if (eVar.getContext().get(f.a.f28767a) instanceof g0) {
            return;
        }
        Object objC = uh.b0.c(hVar, null);
        uh.b0.a(hVar, objC);
        j0(hVar, objC);
    }

    @Override // uh.r
    public final void c0() {
        i0();
    }

    public final boolean h0() {
        boolean z10 = this.threadLocalIsSet && this.f21599e.get() == null;
        this.f21599e.remove();
        return !z10;
    }

    public final void i0() {
        if (this.threadLocalIsSet) {
            pg.n<tg.h, Object> nVar = this.f21599e.get();
            if (nVar != null) {
                uh.b0.a(nVar.f21469a, nVar.f21470b);
            }
            this.f21599e.remove();
        }
    }

    @Override // uh.r, ph.y1
    public final void j(Object obj) {
        i0();
        Object objG = f1.m.g(obj);
        tg.e<T> eVar = this.f29766d;
        tg.h context = eVar.getContext();
        Object objC = uh.b0.c(context, null);
        w2<?> w2VarC = objC != uh.b0.f29719a ? e0.c(eVar, context, objC) : null;
        try {
            eVar.resumeWith(objG);
            pg.f0 f0Var = pg.f0.f21461a;
            if (w2VarC == null || w2VarC.h0()) {
                uh.b0.a(context, objC);
            }
        } catch (Throwable th2) {
            if (w2VarC == null || w2VarC.h0()) {
                uh.b0.a(context, objC);
            }
            throw th2;
        }
    }

    public final void j0(tg.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f21599e.set(new pg.n<>(hVar, obj));
    }
}

package x0;

import ph.s1;

/* loaded from: classes.dex */
public final class w2 implements ph.i0, u2 {

    /* renamed from: d, reason: collision with root package name */
    public static final f f31954d = new f();

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f31955a;

    /* renamed from: b, reason: collision with root package name */
    public final w2 f31956b = this;

    /* renamed from: c, reason: collision with root package name */
    public volatile tg.h f31957c;

    public w2(tg.h hVar) {
        this.f31955a = hVar;
    }

    public final void a() {
        synchronized (this.f31956b) {
            try {
                tg.h hVar = this.f31957c;
                if (hVar == null) {
                    this.f31957c = f31954d;
                } else {
                    ph.v1.b(hVar, new p0());
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.u2
    public final void b() {
        a();
    }

    @Override // x0.u2
    public final void c() {
        a();
    }

    @Override // x0.u2
    public final void d() {
    }

    @Override // ph.i0
    public final tg.h getCoroutineContext() {
        tg.h hVarPlus;
        tg.h hVar = this.f31957c;
        if (hVar == null || hVar == f31954d) {
            synchronized (this.f31956b) {
                try {
                    hVarPlus = this.f31957c;
                    if (hVarPlus == null) {
                        tg.h hVar2 = this.f31955a;
                        hVarPlus = hVar2.plus(new ph.u1((ph.s1) hVar2.get(s1.a.f21589a))).plus(tg.i.f28768a);
                    } else if (hVarPlus == f31954d) {
                        tg.h hVar3 = this.f31955a;
                        ph.u1 u1Var = new ph.u1((ph.s1) hVar3.get(s1.a.f21589a));
                        u1Var.l(new p0());
                        hVarPlus = hVar3.plus(u1Var).plus(tg.i.f28768a);
                    }
                    this.f31957c = hVarPlus;
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar = hVarPlus;
        }
        kotlin.jvm.internal.r.b(hVar);
        return hVar;
    }
}

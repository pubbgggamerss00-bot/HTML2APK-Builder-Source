package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class h1 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final yh.c f24262a = new yh.c();

    /* renamed from: b, reason: collision with root package name */
    public final s4.a f24263b = new s4.a();

    /* renamed from: c, reason: collision with root package name */
    public final sh.m0 f24264c = new sh.m0(new a(2, null));

    @vg.e(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<sh.g<? super pg.f0>, tg.e<? super pg.f0>, Object> {
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(2, eVar);
        }

        @Override // eh.p
        public final Object invoke(sh.g<? super pg.f0> gVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(gVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
    }

    public h1(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s4.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eh.p pVar, vg.c cVar) throws Throwable {
        g1 g1Var;
        yh.c cVar2;
        Throwable th2;
        boolean z10;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i10 = g1Var.f24245e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                g1Var.f24245e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                g1Var = new g1(this, cVar);
            }
        }
        Object obj = g1Var.f24243c;
        ug.a aVar = ug.a.f29706a;
        int i11 = g1Var.f24245e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = g1Var.f24242b;
            cVar2 = g1Var.f24241a;
            try {
                pg.q.b(obj);
                if (z10) {
                    cVar2.l(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                }
                throw th2;
            }
        }
        pg.q.b(obj);
        yh.c cVar3 = this.f24262a;
        boolean zE = cVar3.e();
        try {
            Boolean boolValueOf = Boolean.valueOf(zE);
            g1Var.f24241a = cVar3;
            g1Var.f24242b = zE;
            g1Var.f24245e = 1;
            Object objInvoke = pVar.invoke(boolValueOf, g1Var);
            if (objInvoke == aVar) {
                return aVar;
            }
            cVar2 = cVar3;
            obj = objInvoke;
            z10 = zE;
            if (z10) {
            }
            return obj;
        } catch (Throwable th4) {
            cVar2 = cVar3;
            th2 = th4;
            z10 = zE;
            if (z10) {
                cVar2.l(null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s4.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(eh.l lVar, vg.c cVar) throws Throwable {
        f1 f1Var;
        yh.c cVar2;
        Throwable th2;
        yh.a aVar;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i10 = f1Var.f24232e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                f1Var.f24232e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                f1Var = new f1(this, cVar);
            }
        }
        Object obj = f1Var.f24230c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = f1Var.f24232e;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                f1Var.f24228a = lVar;
                cVar2 = this.f24262a;
                f1Var.f24229b = cVar2;
                f1Var.f24232e = 1;
                if (cVar2.h(f1Var) != aVar2) {
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (yh.a) f1Var.f24228a;
                try {
                    pg.q.b(obj);
                    aVar.l(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar.l(null);
                    throw th2;
                }
            }
            yh.c cVar3 = f1Var.f24229b;
            eh.l lVar2 = (eh.l) f1Var.f24228a;
            pg.q.b(obj);
            cVar2 = cVar3;
            lVar = lVar2;
            f1Var.f24228a = cVar2;
            f1Var.f24229b = null;
            f1Var.f24232e = 2;
            Object objInvoke = lVar.invoke(f1Var);
            if (objInvoke != aVar2) {
                yh.c cVar4 = cVar2;
                obj = objInvoke;
                aVar = cVar4;
                aVar.l(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th4) {
            yh.c cVar5 = cVar2;
            th2 = th4;
            aVar = cVar5;
            aVar.l(null);
            throw th2;
        }
    }

    @Override // s4.v0
    public final Integer c() {
        return new Integer(this.f24263b.f24194a.incrementAndGet());
    }

    @Override // s4.v0
    public final sh.m0 d() {
        return this.f24264c;
    }

    @Override // s4.v0
    public final Integer getVersion() {
        return new Integer(this.f24263b.f24194a.get());
    }
}

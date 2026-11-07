package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final yh.c f24197a = new yh.c();

    /* renamed from: b, reason: collision with root package name */
    public final ph.v f24198b = ph.w.a();

    public abstract Object a(vg.c cVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [yh.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vg.c cVar) throws Throwable {
        z0 z0Var;
        yh.c cVar2;
        a1 a1Var;
        yh.a aVar;
        Throwable th2;
        a1 a1Var2;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i10 = z0Var.f24441e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                z0Var.f24441e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                z0Var = new z0(this, cVar);
            }
        }
        Object obj = z0Var.f24439c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = z0Var.f24441e;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                if (this.f24198b.isCompleted()) {
                    return pg.f0.f21461a;
                }
                z0Var.f24437a = this;
                cVar2 = this.f24197a;
                z0Var.f24438b = cVar2;
                z0Var.f24441e = 1;
                if (cVar2.h(z0Var) != aVar2) {
                    a1Var = this;
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = z0Var.f24438b;
                a1Var2 = z0Var.f24437a;
                try {
                    pg.q.b(obj);
                    ph.v vVar = a1Var2.f24198b;
                    pg.f0 f0Var = pg.f0.f21461a;
                    vVar.I(f0Var);
                    aVar.l(null);
                    return f0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar.l(null);
                    throw th2;
                }
            }
            ?? r22 = z0Var.f24438b;
            a1Var = z0Var.f24437a;
            pg.q.b(obj);
            cVar2 = r22;
            if (a1Var.f24198b.isCompleted()) {
                pg.f0 f0Var2 = pg.f0.f21461a;
                cVar2.l(null);
                return f0Var2;
            }
            z0Var.f24437a = a1Var;
            z0Var.f24438b = cVar2;
            z0Var.f24441e = 2;
            if (a1Var.a(z0Var) != aVar2) {
                aVar = cVar2;
                a1Var2 = a1Var;
                ph.v vVar2 = a1Var2.f24198b;
                pg.f0 f0Var3 = pg.f0.f21461a;
                vVar2.I(f0Var3);
                aVar.l(null);
                return f0Var3;
            }
            return aVar2;
        } catch (Throwable th4) {
            aVar = cVar2;
            th2 = th4;
            aVar.l(null);
            throw th2;
        }
    }
}

package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.s3 f14912a = new x0.s3(a.f14913a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<d2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14913a = new a(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ d2 invoke() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(t3 t3Var, k0.b bVar, vg.c cVar) {
        v3 v3Var;
        if (cVar instanceof v3) {
            v3Var = (v3) cVar;
            int i10 = v3Var.f14931b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                v3Var.f14931b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                v3Var = new v3(cVar);
            }
        }
        Object obj = v3Var.f14930a;
        ug.a aVar = ug.a.f29706a;
        int i11 = v3Var.f14931b;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        if (!t3Var.B().f1157p) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        i2.v1 v1VarG = i2.k.g(t3Var);
        d2 d2Var = (d2) i2.k.f(t3Var).E.c(f14912a);
        v3Var.f14931b = 1;
        b(v1VarG, d2Var, bVar, v3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(i2.v1 v1Var, d2 d2Var, eh.p pVar, vg.c cVar) {
        w3 w3Var;
        if (cVar instanceof w3) {
            w3Var = (w3) cVar;
            int i10 = w3Var.f14961b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                w3Var.f14961b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                w3Var = new w3(cVar);
            }
        }
        Object obj = w3Var.f14960a;
        ug.a aVar = ug.a.f29706a;
        int i11 = w3Var.f14961b;
        if (i11 != 0) {
            if (i11 == 1) {
                pg.q.b(obj);
                throw new pg.g();
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        if (d2Var == null) {
            w3Var.f14961b = 1;
            v1Var.j(pVar, w3Var);
        } else {
            w3Var.f14961b = 2;
            d2Var.a(v1Var, pVar, w3Var);
        }
    }
}

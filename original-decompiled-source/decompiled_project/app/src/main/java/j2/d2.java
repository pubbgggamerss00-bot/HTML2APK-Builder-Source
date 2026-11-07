package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class d2 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i2.v1 v1Var, eh.p pVar, vg.c cVar) {
        y1 y1Var;
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i10 = y1Var.f14990c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                y1Var.f14990c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                y1Var = new y1(this, cVar);
            }
        }
        Object obj = y1Var.f14988a;
        ug.a aVar = ug.a.f29706a;
        int i11 = y1Var.f14990c;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        c2 c2Var = new c2(pVar, this, null);
        y1Var.f14990c = 1;
        u3.b(v1Var, null, c2Var, y1Var);
    }
}

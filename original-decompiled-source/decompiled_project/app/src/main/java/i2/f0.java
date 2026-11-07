package i2;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f13850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<q2.l> f13851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, kotlin.jvm.internal.g0<q2.l> g0Var) {
        super(0);
        this.f13850a = e0Var;
        this.f13851b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, q2.l] */
    @Override // eh.a
    public final pg.f0 invoke() {
        d1 d1Var = this.f13850a.I;
        if ((d1Var.f13793e.f1147d & 8) != 0) {
            for (d.c cVar = d1Var.f13792d; cVar != null; cVar = cVar.f1148e) {
                if ((cVar.f1146c & 8) != 0) {
                    m mVarB = cVar;
                    ?? bVar = 0;
                    while (mVarB != 0) {
                        if (mVarB instanceof k2) {
                            k2 k2Var = (k2) mVarB;
                            boolean zS0 = k2Var.s0();
                            kotlin.jvm.internal.g0<q2.l> g0Var = this.f13851b;
                            if (zS0) {
                                ?? lVar = new q2.l();
                                g0Var.f16327a = lVar;
                                lVar.f21802d = true;
                            }
                            if (k2Var.w1()) {
                                g0Var.f16327a.f21801c = true;
                            }
                            k2Var.X(g0Var.f16327a);
                        } else if ((mVarB.f1146c & 8) != 0 && (mVarB instanceof m)) {
                            d.c cVar2 = mVarB.f13947r;
                            int i10 = 0;
                            mVarB = mVarB;
                            bVar = bVar;
                            while (cVar2 != null) {
                                if ((cVar2.f1146c & 8) != 0) {
                                    i10++;
                                    bVar = bVar;
                                    if (i10 == 1) {
                                        mVarB = cVar2;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (mVarB != 0) {
                                            bVar.b(mVarB);
                                            mVarB = 0;
                                        }
                                        bVar.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.f1149f;
                                mVarB = mVarB;
                                bVar = bVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVarB = k.b(bVar);
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}

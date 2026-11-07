package h2;

import androidx.compose.ui.d;
import c5.p;
import i2.d1;
import i2.e0;
import i2.k;
import i2.m;

/* loaded from: classes.dex */
public interface f extends h, i2.j {
    default p E0() {
        return b.f12220a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // h2.h
    default <T> T y(c<T> cVar) {
        d1 d1Var;
        if (!B().f1157p) {
            f2.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!B().f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = B().f1148e;
        e0 e0VarF = k.f(this);
        while (e0VarF != null) {
            if ((e0VarF.I.f13793e.f1147d & 32) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f1146c & 32) != 0) {
                        m mVarB = cVar2;
                        ?? bVar = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof f) {
                                f fVar = (f) mVarB;
                                if (fVar.E0().P(cVar)) {
                                    return (T) fVar.E0().U(cVar);
                                }
                            } else if ((mVarB.f1146c & 32) != 0 && (mVarB instanceof m)) {
                                d.c cVar3 = mVarB.f13947r;
                                int i10 = 0;
                                mVarB = mVarB;
                                bVar = bVar;
                                while (cVar3 != null) {
                                    if ((cVar3.f1146c & 32) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            mVarB = cVar3;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB != 0) {
                                                bVar.b(mVarB);
                                                mVarB = 0;
                                            }
                                            bVar.b(cVar3);
                                        }
                                    }
                                    cVar3 = cVar3.f1149f;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVarB = k.b(bVar);
                        }
                    }
                    cVar2 = cVar2.f1148e;
                }
            }
            e0VarF = e0VarF.G();
            cVar2 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
        }
        return cVar.f12221a.invoke();
    }
}

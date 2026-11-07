package i2;

import androidx.compose.ui.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class p2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [T extends i2.o2, i2.j, i2.o2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final <T extends o2> T a(T t3) {
        d1 d1Var;
        d.c cVar = (d.c) t3;
        if (!cVar.f1144a.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = cVar.f1144a.f1148e;
        e0 e0VarF = k.f(t3);
        while (e0VarF != null) {
            if ((e0VarF.I.f13793e.f1147d & PKIFailureInfo.transactionIdInUse) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                        m mVarB = cVar2;
                        ?? bVar = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof o2) {
                                T t10 = (T) mVarB;
                                if (kotlin.jvm.internal.r.a(t3.L(), t10.L()) && t3.getClass() == t10.getClass()) {
                                    return t10;
                                }
                            } else if ((mVarB.f1146c & PKIFailureInfo.transactionIdInUse) != 0 && (mVarB instanceof m)) {
                                d.c cVar3 = mVarB.f13947r;
                                int i10 = 0;
                                mVarB = mVarB;
                                bVar = bVar;
                                while (cVar3 != null) {
                                    if ((cVar3.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T extends i2.o2, i2.j, i2.o2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final <T extends o2> void b(T t3, eh.l<? super T, Boolean> lVar) {
        d1 d1Var;
        d.c cVar = (d.c) t3;
        if (!cVar.f1144a.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = cVar.f1144a.f1148e;
        e0 e0VarF = k.f(t3);
        while (e0VarF != null) {
            if ((e0VarF.I.f13793e.f1147d & PKIFailureInfo.transactionIdInUse) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                        m mVarB = cVar2;
                        ?? bVar = 0;
                        while (mVarB != 0) {
                            boolean zBooleanValue = true;
                            if (mVarB instanceof o2) {
                                o2 o2Var = (o2) mVarB;
                                if (kotlin.jvm.internal.r.a(t3.L(), o2Var.L()) && t3.getClass() == o2Var.getClass()) {
                                    zBooleanValue = lVar.invoke(o2Var).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((mVarB.f1146c & PKIFailureInfo.transactionIdInUse) != 0) && (mVarB instanceof m)) {
                                    d.c cVar3 = mVarB.f13947r;
                                    int i10 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final <T extends o2> void c(T t3, eh.l<? super T, ? extends n2> lVar) {
        if (!t3.B().f1157p) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.b bVar = new z0.b(new d.c[16]);
        d.c cVar = t3.B().f1149f;
        if (cVar == null) {
            k.a(bVar, t3.B());
        } else {
            bVar.b(cVar);
        }
        while (true) {
            int i10 = bVar.f34702c;
            if (i10 == 0) {
                return;
            }
            d.c cVar2 = (d.c) bVar.k(i10 - 1);
            if ((cVar2.f1147d & PKIFailureInfo.transactionIdInUse) != 0) {
                for (d.c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.f1149f) {
                    if ((cVar3.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                        m mVarB = cVar3;
                        ?? bVar2 = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof o2) {
                                o2 o2Var = (o2) mVarB;
                                n2 n2VarInvoke = (kotlin.jvm.internal.r.a(t3.L(), o2Var.L()) && t3.getClass() == o2Var.getClass()) ? lVar.invoke(o2Var) : n2.f13963a;
                                if (n2VarInvoke == n2.f13965c) {
                                    return;
                                }
                                if (n2VarInvoke == n2.f13964b) {
                                    break;
                                }
                            } else if ((mVarB.f1146c & PKIFailureInfo.transactionIdInUse) != 0 && (mVarB instanceof m)) {
                                d.c cVar4 = mVarB.f13947r;
                                int i11 = 0;
                                mVarB = mVarB;
                                bVar2 = bVar2;
                                while (cVar4 != null) {
                                    if ((cVar4.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                                        i11++;
                                        bVar2 = bVar2;
                                        if (i11 == 1) {
                                            mVarB = cVar4;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB != 0) {
                                                bVar2.b(mVarB);
                                                mVarB = 0;
                                            }
                                            bVar2.b(cVar4);
                                        }
                                    }
                                    cVar4 = cVar4.f1149f;
                                    mVarB = mVarB;
                                    bVar2 = bVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVarB = k.b(bVar2);
                        }
                    }
                }
            }
            k.a(bVar, cVar2);
        }
    }
}

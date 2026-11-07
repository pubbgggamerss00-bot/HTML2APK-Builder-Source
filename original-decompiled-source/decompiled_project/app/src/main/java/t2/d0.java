package t2;

import e3.l;
import q1.b1;
import q1.d2;
import q1.e2;
import q1.i2;
import q1.u0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f27793a = f3.u.c(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f27794b = f3.u.c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f27795c = b1.f21653g;

    /* renamed from: d, reason: collision with root package name */
    public static final e3.l f27796d;

    static {
        long j10 = b1.f21648b;
        f27796d = j10 != 16 ? new e3.c(j10) : l.a.f8369a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b0 a(b0 b0Var, long j10, u0 u0Var, float f10, long j11, x2.p pVar, x2.n nVar, x2.o oVar, x2.f fVar, String str, long j12, e3.a aVar, e3.m mVar, a3.c cVar, long j13, e3.i iVar, e2 e2Var, w wVar, s1.f fVar2) {
        e3.a aVar2;
        e2 e2Var2;
        w wVar2;
        s1.f fVar3;
        a3.c cVar2;
        long j14;
        long j15;
        w wVar3;
        x2.o oVar2 = oVar;
        x2.f fVar4 = fVar;
        String str2 = str;
        long j16 = j12;
        f3.v[] vVarArr = f3.t.f8832b;
        long j17 = j11 & 1095216660480L;
        if ((j17 == 0 || f3.t.a(j11, b0Var.f27776b)) && ((u0Var != null || j10 == 16 || b1.d(j10, b0Var.f27775a.j())) && ((nVar == null || nVar.equals(b0Var.f27778d)) && ((pVar == null || pVar.equals(b0Var.f27777c)) && ((fVar4 == null || fVar4 == b0Var.f27780f) && (((j16 & 1095216660480L) == 0 || f3.t.a(j16, b0Var.f27782h)) && ((iVar == null || iVar.equals(b0Var.f27787m)) && kotlin.jvm.internal.r.a(u0Var, b0Var.f27775a.l()) && ((u0Var == null || f10 == b0Var.f27775a.i()) && ((oVar2 == null || oVar2.equals(b0Var.f27779e)) && (str2 == null || str2.equals(b0Var.f27781g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(b0Var.f27783i)) {
                }
                e3.l cVar3 = l.a.f8369a;
                if (u0Var != null) {
                    if (u0Var instanceof i2) {
                        long jA = e3.k.a(f10, ((i2) u0Var).f21711a);
                        if (jA != 16) {
                            cVar3 = new e3.c(jA);
                        }
                    } else {
                        if (!(u0Var instanceof d2)) {
                            throw new pg.l();
                        }
                        cVar3 = new e3.b((d2) u0Var, f10);
                    }
                } else if (j10 != 16) {
                    cVar3 = new e3.c(j10);
                }
                e3.l lVarK = b0Var.f27775a.k(cVar3);
                if (fVar4 == null) {
                    fVar4 = b0Var.f27780f;
                }
                long j18 = j17 == 0 ? b0Var.f27776b : j11;
                x2.p pVar2 = pVar == null ? b0Var.f27777c : pVar;
                x2.n nVar2 = nVar == null ? b0Var.f27778d : nVar;
                if (oVar2 == null) {
                    oVar2 = b0Var.f27779e;
                }
                if (str2 == null) {
                    str2 = b0Var.f27781g;
                }
                if ((j16 & 1095216660480L) == 0) {
                    j16 = b0Var.f27782h;
                }
                if (aVar2 == null) {
                    aVar2 = b0Var.f27783i;
                }
                e3.m mVar2 = mVar == null ? b0Var.f27784j : mVar;
                a3.c cVar4 = cVar == null ? b0Var.f27785k : cVar;
                if (j13 != 16) {
                    cVar2 = cVar4;
                    j14 = j18;
                    j15 = j13;
                } else {
                    cVar2 = cVar4;
                    j14 = j18;
                    j15 = b0Var.f27786l;
                }
                e3.i iVar2 = iVar == null ? b0Var.f27787m : iVar;
                if (e2Var2 == null) {
                    e2Var2 = b0Var.f27788n;
                }
                long j19 = j15;
                wVar3 = b0Var.f27789o;
                if (wVar3 == null) {
                    wVar3 = wVar2;
                }
                if (fVar3 == null) {
                    fVar3 = b0Var.f27790p;
                }
                return new b0(lVarK, j14, pVar2, nVar2, oVar2, fVar4, str2, j16, aVar2, mVar2, cVar2, j19, iVar2, e2Var2, wVar3, fVar3);
            }
            aVar2 = aVar;
            if (mVar == null || mVar.equals(b0Var.f27784j)) {
                if (cVar == null || cVar.equals(b0Var.f27785k)) {
                    if (j13 == 16 || b1.d(j13, b0Var.f27786l)) {
                        e2Var2 = e2Var;
                        if (e2Var2 == null || e2Var2.equals(b0Var.f27788n)) {
                            wVar2 = wVar;
                            if (wVar2 == null || wVar2.equals(b0Var.f27789o)) {
                                fVar3 = fVar2;
                                if (fVar3 == null || fVar3.equals(b0Var.f27790p)) {
                                    return b0Var;
                                }
                            }
                        }
                        fVar3 = fVar2;
                    }
                    wVar2 = wVar;
                    fVar3 = fVar2;
                }
            }
            e3.l cVar32 = l.a.f8369a;
            if (u0Var != null) {
            }
            e3.l lVarK2 = b0Var.f27775a.k(cVar32);
            if (fVar4 == null) {
            }
            if (j17 == 0) {
            }
            if (pVar == null) {
            }
            if (nVar == null) {
            }
            if (oVar2 == null) {
            }
            if (str2 == null) {
            }
            if ((j16 & 1095216660480L) == 0) {
            }
            if (aVar2 == null) {
            }
            if (mVar == null) {
            }
            if (cVar == null) {
            }
            if (j13 != 16) {
            }
            if (iVar == null) {
            }
            if (e2Var2 == null) {
            }
            long j192 = j15;
            wVar3 = b0Var.f27789o;
            if (wVar3 == null) {
            }
            if (fVar3 == null) {
            }
            return new b0(lVarK2, j14, pVar2, nVar2, oVar2, fVar4, str2, j16, aVar2, mVar2, cVar2, j192, iVar2, e2Var2, wVar3, fVar3);
        }
        aVar2 = aVar;
        e2Var2 = e2Var;
        wVar2 = wVar;
        fVar3 = fVar2;
        e3.l cVar322 = l.a.f8369a;
        if (u0Var != null) {
        }
        e3.l lVarK22 = b0Var.f27775a.k(cVar322);
        if (fVar4 == null) {
        }
        if (j17 == 0) {
        }
        if (pVar == null) {
        }
        if (nVar == null) {
        }
        if (oVar2 == null) {
        }
        if (str2 == null) {
        }
        if ((j16 & 1095216660480L) == 0) {
        }
        if (aVar2 == null) {
        }
        if (mVar == null) {
        }
        if (cVar == null) {
        }
        if (j13 != 16) {
        }
        if (iVar == null) {
        }
        if (e2Var2 == null) {
        }
        long j1922 = j15;
        wVar3 = b0Var.f27789o;
        if (wVar3 == null) {
        }
        if (fVar3 == null) {
        }
        return new b0(lVarK22, j14, pVar2, nVar2, oVar2, fVar4, str2, j16, aVar2, mVar2, cVar2, j1922, iVar2, e2Var2, wVar3, fVar3);
    }

    public static final <T> T b(T t3, T t10, float f10) {
        return ((double) f10) < 0.5d ? t3 : t10;
    }

    public static final long c(long j10, long j11, float f10) {
        f3.v[] vVarArr = f3.t.f8832b;
        long j12 = j10 & 1095216660480L;
        if (j12 != 0) {
            long j13 = 1095216660480L & j11;
            if (j13 != 0) {
                if (j12 == 0 || j13 == 0) {
                    f3.l.a("Cannot perform operation for Unspecified type.");
                }
                if (!f3.v.a(f3.t.b(j10), f3.t.b(j11))) {
                    f3.l.a("Cannot perform operation for " + ((Object) f3.v.b(f3.t.b(j10))) + " and " + ((Object) f3.v.b(f3.t.b(j11))));
                }
                return f3.u.e(h3.b.b(f3.t.c(j10), f3.t.c(j11), f10), j12);
            }
        }
        return ((f3.t) b(new f3.t(j10), new f3.t(j11), f10)).f8834a;
    }
}

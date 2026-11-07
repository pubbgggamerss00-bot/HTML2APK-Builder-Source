package i2;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class k {
    public static final void a(z0.b bVar, d.c cVar) {
        z0.b<e0> bVarJ = f(cVar).J();
        int i10 = bVarJ.f34702c - 1;
        e0[] e0VarArr = bVarJ.f34700a;
        if (i10 < e0VarArr.length) {
            while (i10 >= 0) {
                bVar.b(e0VarArr[i10].I.f13793e);
                i10--;
            }
        }
    }

    public static final d.c b(z0.b bVar) {
        int i10;
        if (bVar == null || (i10 = bVar.f34702c) == 0) {
            return null;
        }
        return (d.c) bVar.k(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b0 c(d.c cVar) {
        if ((cVar.f1146c & 2) != 0) {
            if (cVar instanceof b0) {
                return (b0) cVar;
            }
            if (cVar instanceof m) {
                d.c cVar2 = ((m) cVar).f13947r;
                while (cVar2 != 0) {
                    if (cVar2 instanceof b0) {
                        return (b0) cVar2;
                    }
                    cVar2 = (!(cVar2 instanceof m) || (cVar2.f1146c & 2) == 0) ? cVar2.f1149f : ((m) cVar2).f13947r;
                }
            }
        }
        return null;
    }

    public static final g1 d(j jVar, int i10) {
        g1 g1Var = jVar.B().f1151h;
        kotlin.jvm.internal.r.b(g1Var);
        if (g1Var.l1() != jVar || !j1.g(i10)) {
            return g1Var;
        }
        g1 g1Var2 = g1Var.f13877r;
        kotlin.jvm.internal.r.b(g1Var2);
        return g1Var2;
    }

    public static final g1 e(j jVar) {
        if (!jVar.B().f1157p) {
            f2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        g1 g1VarD = d(jVar, 2);
        if (!g1VarD.l1().f1157p) {
            f2.a.b("LayoutCoordinates is not attached.");
        }
        return g1VarD;
    }

    public static final e0 f(j jVar) {
        g1 g1Var = jVar.B().f1151h;
        if (g1Var != null) {
            return g1Var.f13874n;
        }
        throw k1.a.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final v1 g(j jVar) {
        v1 v1Var = f(jVar).f13822p;
        if (v1Var != null) {
            return v1Var;
        }
        throw k1.a.a("This node does not have an owner.");
    }
}

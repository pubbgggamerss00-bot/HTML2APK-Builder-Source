package i2;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public abstract class m extends d.c {

    /* renamed from: q, reason: collision with root package name */
    public final int f13946q = j1.e(this);

    /* renamed from: r, reason: collision with root package name */
    public d.c f13947r;

    @Override // androidx.compose.ui.d.c
    public final void J1() {
        super.J1();
        for (d.c cVar = this.f13947r; cVar != null; cVar = cVar.f1149f) {
            cVar.S1(this.f1151h);
            if (!cVar.f1157p) {
                cVar.J1();
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void K1() {
        for (d.c cVar = this.f13947r; cVar != null; cVar = cVar.f1149f) {
            cVar.K1();
        }
        super.K1();
    }

    @Override // androidx.compose.ui.d.c
    public final void O1() {
        super.O1();
        for (d.c cVar = this.f13947r; cVar != null; cVar = cVar.f1149f) {
            cVar.O1();
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void P1() {
        for (d.c cVar = this.f13947r; cVar != null; cVar = cVar.f1149f) {
            cVar.P1();
        }
        super.P1();
    }

    @Override // androidx.compose.ui.d.c
    public final void Q1() {
        super.Q1();
        for (d.c cVar = this.f13947r; cVar != null; cVar = cVar.f1149f) {
            cVar.Q1();
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void R1(d.c cVar) {
        this.f1144a = cVar;
        for (d.c cVar2 = this.f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
            cVar2.R1(cVar);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void S1(g1 g1Var) {
        this.f1151h = g1Var;
        for (d.c cVar = this.f13947r; cVar != null; cVar = cVar.f1149f) {
            cVar.S1(g1Var);
        }
    }

    public final <T extends j> T T1(T t3) {
        d.c cVarB = t3.B();
        if (cVarB != t3) {
            d.c cVar = t3 instanceof d.c ? (d.c) t3 : null;
            d.c cVar2 = cVar != null ? cVar.f1148e : null;
            if (cVarB != this.f1144a || !kotlin.jvm.internal.r.a(cVar2, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (cVarB.f1157p) {
                f2.a.b("Cannot delegate to an already attached node");
            }
            cVarB.R1(this.f1144a);
            int i10 = this.f1146c;
            int iF = j1.f(cVarB);
            cVarB.f1146c = iF;
            int i11 = this.f1146c;
            int i12 = iF & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof b0)) {
                f2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVarB);
            }
            cVarB.f1149f = this.f13947r;
            this.f13947r = cVarB;
            cVarB.f1148e = this;
            V1(iF | this.f1146c, false);
            if (this.f1157p) {
                if (i12 == 0 || (i10 & 2) != 0) {
                    S1(this.f1151h);
                } else {
                    d1 d1Var = k.f(this).I;
                    this.f1144a.S1(null);
                    d1Var.h();
                }
                cVarB.J1();
                cVarB.P1();
                if (!cVarB.f1157p) {
                    f2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j1.a(cVarB, -1, 1);
            }
        }
        return t3;
    }

    public final void U1(j jVar) {
        d.c cVar = null;
        for (d.c cVar2 = this.f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
            if (cVar2 == jVar) {
                boolean z10 = cVar2.f1157p;
                if (z10) {
                    p.f0<Object> f0Var = j1.f13931a;
                    if (!z10) {
                        f2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    j1.a(cVar2, -1, 2);
                    cVar2.Q1();
                    cVar2.K1();
                }
                cVar2.R1(cVar2);
                cVar2.f1147d = 0;
                if (cVar == null) {
                    this.f13947r = cVar2.f1149f;
                } else {
                    cVar.f1149f = cVar2.f1149f;
                }
                cVar2.f1149f = null;
                cVar2.f1148e = null;
                int i10 = this.f1146c;
                int iF = j1.f(this);
                V1(iF, true);
                if (this.f1157p && (i10 & 2) != 0 && (iF & 2) == 0) {
                    d1 d1Var = k.f(this).I;
                    this.f1144a.S1(null);
                    d1Var.h();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + jVar).toString());
    }

    public final void V1(int i10, boolean z10) {
        d.c cVar;
        int i11 = this.f1146c;
        this.f1146c = i10;
        if (i11 != i10) {
            d.c cVar2 = this.f1144a;
            if (cVar2 == this) {
                this.f1147d = i10;
            }
            if (this.f1157p) {
                d.c cVar3 = this;
                while (cVar3 != null) {
                    i10 |= cVar3.f1146c;
                    cVar3.f1146c = i10;
                    if (cVar3 == cVar2) {
                        break;
                    } else {
                        cVar3 = cVar3.f1148e;
                    }
                }
                if (z10 && cVar3 == cVar2) {
                    i10 = j1.f(cVar2);
                    cVar2.f1146c = i10;
                }
                int i12 = i10 | ((cVar3 == null || (cVar = cVar3.f1149f) == null) ? 0 : cVar.f1147d);
                while (cVar3 != null) {
                    i12 |= cVar3.f1146c;
                    cVar3.f1147d = i12;
                    cVar3 = cVar3.f1148e;
                }
            }
        }
    }
}

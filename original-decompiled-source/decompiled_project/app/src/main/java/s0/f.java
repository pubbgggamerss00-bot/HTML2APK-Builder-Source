package s0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import q1.b1;
import r.z1;
import t.u0;
import t.v0;
import x0.j;
import x0.n1;
import x0.o0;

@pg.d
/* loaded from: classes.dex */
public final class f implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24105a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24106b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f24107c;

    public f() {
        throw null;
    }

    public f(boolean z10, float f10, n1 n1Var) {
        this.f24105a = z10;
        this.f24106b = f10;
        this.f24107c = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.u0
    @pg.d
    public final v0 b(x.l lVar, x0.j jVar) {
        long jB;
        jVar.L(988743187);
        s sVar = (s) jVar.f(t.f24152a);
        n1 n1Var = this.f24107c;
        if (((b1) n1Var.getValue()).f21656a != 16) {
            jVar.L(-303557454);
            jVar.B();
            jB = ((b1) n1Var.getValue()).f21656a;
        } else {
            jVar.L(-303499670);
            jB = sVar.b(jVar);
            jVar.B();
        }
        n1 n1VarK = bg.b.k(new b1(jB), jVar);
        n1 n1VarK2 = bg.b.k(sVar.a(jVar), jVar);
        jVar.L(331259447);
        ViewGroup viewGroupC = ah.l.c((View) jVar.f(AndroidCompositionLocals_androidKt.f1285f));
        boolean zK = ((((0 & 14) ^ 6) > 4 && jVar.K(lVar)) || (0 & 6) == 4) | ((((458752 & 0) ^ 196608) > 131072 && jVar.K(this)) || (0 & 196608) == 131072) | jVar.K(viewGroupC);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            Object bVar = new b(this.f24105a, this.f24106b, n1VarK, n1VarK2, viewGroupC);
            jVar.C(bVar);
            objG = bVar;
        }
        b bVar2 = (b) objG;
        jVar.B();
        boolean zK2 = jVar.K(lVar) | jVar.l(bVar2);
        Object objG2 = jVar.g();
        if (zK2 || objG2 == j.a.f31715a) {
            objG2 = new g(lVar, bVar2, null);
            jVar.C(objG2);
        }
        o0.e(bVar2, lVar, (eh.p) objG2, jVar);
        jVar.B();
        return bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f24105a == fVar.f24105a && f3.h.a(this.f24106b, fVar.f24106b) && kotlin.jvm.internal.r.a(this.f24107c, fVar.f24107c);
    }

    public final int hashCode() {
        return this.f24107c.hashCode() + z1.a(this.f24106b, Boolean.hashCode(this.f24105a) * 31, 31);
    }
}

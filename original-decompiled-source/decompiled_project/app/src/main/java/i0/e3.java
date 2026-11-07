package i0;

import androidx.compose.ui.d;
import j2.p5;
import x0.j;

/* loaded from: classes.dex */
public final class e3 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.i2 f13271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f13272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.v f13274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(q1.i2 i2Var, i2 i2Var2, y2.c0 c0Var, y2.v vVar) {
        super(3);
        this.f13271a = i2Var;
        this.f13272b = i2Var2;
        this.f13273c = c0Var;
        this.f13274d = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        androidx.compose.ui.d dVarC;
        androidx.compose.ui.d dVar2 = dVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-84507373);
        boolean zBooleanValue = ((Boolean) jVar2.f(j2.j2.f14794w)).booleanValue();
        boolean zC = jVar2.c(zBooleanValue);
        Object objG = jVar2.g();
        Object obj = j.a.f31715a;
        if (zC || objG == obj) {
            objG = new k0.p(zBooleanValue);
            jVar2.C(objG);
        }
        k0.p pVar = (k0.p) objG;
        q1.i2 i2Var = this.f13271a;
        boolean z10 = i2Var.f21711a != 16;
        if (((p5) jVar2.f(j2.j2.f14791t)).a()) {
            i2 i2Var2 = this.f13272b;
            if (i2Var2.b()) {
                y2.c0 c0Var = this.f13273c;
                if (t2.j0.b(c0Var.f33683b) && z10) {
                    jVar2.L(808460990);
                    t2.b bVar = c0Var.f33682a;
                    t2.j0 j0Var = new t2.j0(c0Var.f33683b);
                    boolean zL = jVar2.l(pVar);
                    Object objG2 = jVar2.g();
                    if (zL || objG2 == obj) {
                        objG2 = new c3(pVar, null);
                        jVar2.C(objG2);
                    }
                    x0.o0.e(bVar, j0Var, (eh.p) objG2, jVar2);
                    boolean zL2 = jVar2.l(pVar) | jVar2.l(this.f13274d) | jVar2.K(c0Var) | jVar2.l(i2Var2) | jVar2.K(i2Var);
                    Object objG3 = jVar2.g();
                    if (zL2 || objG3 == obj) {
                        Object d3Var = new d3(pVar, this.f13274d, this.f13273c, i2Var2, i2Var);
                        jVar2.C(d3Var);
                        objG3 = d3Var;
                    }
                    dVarC = androidx.compose.ui.draw.a.c(dVar2, (eh.l) objG3);
                    jVar2.B();
                } else {
                    jVar2.L(810474750);
                    jVar2.B();
                    dVarC = d.a.f1143b;
                }
            }
        }
        jVar2.B();
        return dVarC;
    }
}

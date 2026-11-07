package j9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3 f15546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(List list, x1 x1Var, q8.d0 d0Var, long j10, p5.x xVar, r3 r3Var) {
        super(4);
        this.f15542a = list;
        this.f15543b = d0Var;
        this.f15544c = j10;
        this.f15545d = xVar;
        this.f15546e = r3Var;
    }

    @Override // eh.r
    public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        b0.e eVar2 = eVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        boolean z10 = false;
        if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
            String category = (String) this.f15542a.get(iIntValue);
            jVar2.L(-1708039813);
            jVar2.L(-1579118923);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new q8.e0();
                jVar2.C(objG);
            }
            q8.e0 e0Var = (q8.e0) objG;
            jVar2.B();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(aVar, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            boolean zBooleanValue = ((Boolean) this.f15546e.getValue()).booleanValue();
            kotlin.jvm.internal.r.e(category, "category");
            if (!zBooleanValue && !category.equals("interaction") && !category.equals("starter") && !category.equals("starter_libraries") && !category.equals("ads")) {
                z10 = true;
            }
            jVar2.L(-1420246874);
            boolean zK = jVar2.K(this.f15543b) | jVar2.l(e0Var) | jVar2.j(this.f15544c) | jVar2.l(this.f15545d) | jVar2.K(category);
            Object objG2 = jVar2.g();
            if (zK || objG2 == obj) {
                Object p1Var = new p1(this.f15543b, e0Var, this.f15544c, this.f15545d, category);
                jVar2.C(p1Var);
                objG2 = p1Var;
            }
            jVar2.B();
            d0.b(category, z10, (eh.a) objG2, q8.p0.c(aVar, e0Var), jVar2, 0);
            jVar2.H();
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}

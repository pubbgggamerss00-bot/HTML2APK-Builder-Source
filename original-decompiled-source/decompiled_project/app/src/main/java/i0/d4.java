package i0;

import com.yalantis.ucrop.view.CropImageView;
import x0.j;

/* loaded from: classes.dex */
public final class d4 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4 f13259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.m f13261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, boolean z10, x.m mVar) {
        super(3);
        this.f13259a = f4Var;
        this.f13260b = z10;
        this.f13261c = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        f4 f4Var = this.f13259a;
        x0.x1 x1Var = f4Var.f13286f;
        jVar2.L(805428266);
        boolean z10 = ((v.t0) x1Var.getValue()) == v.t0.f30083a || !(jVar2.f(j2.j2.f14785n) == f3.r.f8829b);
        boolean zK = jVar2.K(f4Var);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (zK || objG == c0321a) {
            objG = new b4(f4Var, 0);
            jVar2.C(objG);
        }
        x0.n1 n1VarK = bg.b.k((eh.l) objG, jVar2);
        Object objG2 = jVar2.g();
        if (objG2 == c0321a) {
            v.j jVar3 = new v.j(new c2.g(n1VarK, 1));
            jVar2.C(jVar3);
            objG2 = jVar3;
        }
        v.l1 l1Var = (v.l1) objG2;
        boolean zK2 = jVar2.K(l1Var) | jVar2.K(f4Var);
        Object objG3 = jVar2.g();
        if (zK2 || objG3 == c0321a) {
            objG3 = new c4(l1Var, f4Var);
            jVar2.C(objG3);
        }
        androidx.compose.ui.d dVarB = androidx.compose.foundation.gestures.i.b((c4) objG3, (v.t0) x1Var.getValue(), this.f13260b && f4Var.f13282b.getFloatValue() != CropImageView.DEFAULT_ASPECT_RATIO, z10, this.f13261c);
        jVar2.B();
        return dVarB;
    }
}

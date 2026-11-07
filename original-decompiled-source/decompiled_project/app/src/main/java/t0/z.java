package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import x0.j;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.u1 f27501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f27502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lf f27503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f27505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b f27507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(z.u1 u1Var, float f10, lf lfVar, eh.p pVar, t2.l0 l0Var, eh.p pVar2, f1.b bVar) {
        super(2);
        this.f27501a = u1Var;
        this.f27502b = f10;
        this.f27503c = lfVar;
        this.f27504d = pVar;
        this.f27505e = l0Var;
        this.f27506f = pVar2;
        this.f27507g = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(e1.d.e(z.y1.a(d.a.f1143b, this.f27501a)), CropImageView.DEFAULT_ASPECT_RATIO, this.f27502b, 1);
            boolean zK = jVar2.K(null);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new y();
                jVar2.C(objG);
            }
            ta taVar = (ta) objG;
            lf lfVar = this.f27503c;
            g0.c(dVarH, taVar, lfVar.f26396c, lfVar.f26397d, lfVar.f26398e, this.f27504d, this.f27505e, z.b.f34448e, z.b.f34444a, this.f27506f, this.f27507g, jVar2, 113246208, 3126);
        }
        return pg.f0.f21461a;
    }
}

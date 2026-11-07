package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class i8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0.q0 f26088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(u0.q0 q0Var) {
        super(2);
        this.f26088a = q0Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(d.a.f1143b, "indicatorRipple");
            float f10 = v0.u.f30480a;
            z.g.a(androidx.compose.foundation.e.a(e1.d.d(dVarB, ab.a(v0.c0.f30231d, jVar2)), this.f26088a, ha.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar2, 0, 7)), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}

package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class z8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f27527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0.q0 f27528b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(q1.f2 f2Var, u0.q0 q0Var) {
        super(2);
        this.f27527a = f2Var;
        this.f27528b = q0Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.g.a(androidx.compose.foundation.e.a(e1.d.d(androidx.compose.ui.layout.a.b(d.a.f1143b, "indicatorRipple"), this.f27527a), this.f27528b, ha.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar2, 0, 7)), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}

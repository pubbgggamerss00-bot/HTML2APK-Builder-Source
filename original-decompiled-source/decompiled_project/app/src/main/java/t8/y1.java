package t8;

import com.yalantis.ucrop.view.CropImageView;
import x0.j;

/* loaded from: classes.dex */
public final class y1 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3 f28579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28580b;

    public y1(m3 m3Var, androidx.compose.ui.d dVar) {
        this.f28579a = m3Var;
        this.f28580b = dVar;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(764115353);
            m3 m3Var = this.f28579a;
            boolean zL = jVar2.l(m3Var);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new b9.t1(m3Var, 2);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, androidx.compose.foundation.layout.f.l(this.f28580b, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), false, null, null, null, c4.f28154f, jVar2, 805306416, 508);
        }
        return pg.f0.f21461a;
    }
}

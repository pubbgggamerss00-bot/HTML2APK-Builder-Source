package i9;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import t0.g0;
import t0.mf;

/* loaded from: classes.dex */
public final class k implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f14353a;

    public k(p5.x xVar) {
        this.f14353a = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVar = c.f14287a;
            f1.b bVarB = f1.c.b(1349504960, new j(this.f14353a), jVar2);
            float f10 = mf.f26477a;
            g0.b(bVar, null, bVarB, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
        }
        return pg.f0.f21461a;
    }
}

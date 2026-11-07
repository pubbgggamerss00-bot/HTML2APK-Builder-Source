package e9;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import t0.mf;

/* loaded from: classes.dex */
public final class a0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f8404b;

    public a0(String str, p5.x xVar) {
        this.f8403a = str;
        this.f8404b = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVarB = f1.c.b(1341559753, new y(this.f8403a), jVar2);
            f1.b bVarB2 = f1.c.b(1555176839, new z(this.f8404b), jVar2);
            float f10 = mf.f26477a;
            t0.g0.b(bVarB, null, bVarB2, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
        }
        return pg.f0.f21461a;
    }
}

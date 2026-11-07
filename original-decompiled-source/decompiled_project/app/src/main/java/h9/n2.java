package h9;

import com.yalantis.ucrop.view.CropImageView;
import t0.mf;

/* loaded from: classes.dex */
public final class n2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12739a;

    public n2(int i10) {
        this.f12739a = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVarB = f1.c.b(-253863102, new m2(this.f12739a), jVar2);
            float f10 = mf.f26477a;
            t0.g0.b(bVarB, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 6, 190);
        }
        return pg.f0.f21461a;
    }
}

package j9;

import com.yalantis.ucrop.view.CropImageView;
import j9.x1;
import t0.mf;

/* loaded from: classes.dex */
public final class k0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1.a f15453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f15454b;

    public k0(x1.a aVar, p5.x xVar) {
        this.f15453a = aVar;
        this.f15454b = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVarB = f1.c.b(-1504183904, new h0(this.f15453a), jVar2);
            f1.b bVarB2 = f1.c.b(-1561049250, new j0(this.f15454b), jVar2);
            float f10 = mf.f26477a;
            t0.g0.b(bVarB, null, bVarB2, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
        }
        return pg.f0.f21461a;
    }
}

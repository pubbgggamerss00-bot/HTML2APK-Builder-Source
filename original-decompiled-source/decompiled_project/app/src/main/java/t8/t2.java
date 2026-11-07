package t8;

import com.yalantis.ucrop.view.CropImageView;
import t0.mf;

/* loaded from: classes.dex */
public final class t2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<g8.d> f28466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f28467d;

    public t2(x0.n1 n1Var, eh.a aVar, x0.n1 n1Var2, p5.x xVar) {
        this.f28464a = n1Var;
        this.f28465b = aVar;
        this.f28466c = n1Var2;
        this.f28467d = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVarB = f1.c.b(-958611276, new q2(this.f28464a), jVar2);
            f1.b bVarB2 = f1.c.b(-486271630, new r2(this.f28465b), jVar2);
            f1.b bVarB3 = f1.c.b(-165448919, new s2(this.f28467d, this.f28466c), jVar2);
            float f10 = mf.f26477a;
            t0.g0.b(bVarB, null, bVarB2, bVarB3, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 3462, 178);
        }
        return pg.f0.f21461a;
    }
}

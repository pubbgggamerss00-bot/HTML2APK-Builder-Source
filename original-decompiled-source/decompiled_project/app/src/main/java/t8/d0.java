package t8;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import t0.mf;

/* loaded from: classes.dex */
public final class d0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f28192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<List<x>> f28194c;

    public d0(p5.x xVar, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f28192a = xVar;
        this.f28193b = n1Var;
        this.f28194c = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVar = b4.f28119a;
            f1.b bVarB = f1.c.b(-781837392, new b0(this.f28192a), jVar2);
            f1.b bVarB2 = f1.c.b(-461014681, new c0(this.f28193b, this.f28194c), jVar2);
            float f10 = mf.f26477a;
            t0.g0.b(bVar, null, bVarB, bVarB2, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 3462, 178);
        }
        return pg.f0.f21461a;
    }
}

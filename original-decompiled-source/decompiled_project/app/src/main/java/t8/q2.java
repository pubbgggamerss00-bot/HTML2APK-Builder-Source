package t8;

import com.basitce.htmltoapk.R;
import t0.ff;

/* loaded from: classes.dex */
public final class q2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28412a;

    public q2(x0.n1 n1Var) {
        this.f28412a = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            mh.k kVar = v2.f28495e;
            String strC = ((b3) this.f28412a.getValue()).f28113c;
            jVar2.L(1987455899);
            if (strC == null) {
                strC = f3.q.c(R.string.ai_create_title, jVar2);
            }
            jVar2.B();
            ff.b(strC, null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 1, 0, null, jVar2, 196608, 3072, 122846);
        }
        return pg.f0.f21461a;
    }
}

package u8;

import com.basitce.htmltoapk.R;
import t0.ff;
import z.n1;

/* loaded from: classes.dex */
public final class s0 implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29520a;

    public s0(boolean z10) {
        this.f29520a = z10;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(f3.q.c(R.string.cat_farm_quest_claim_btn, jVar2), null, this.f29520a ? q1.b1.f21650d : c2.n0.c(4286082403L), f3.u.c(11), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 199680, 0, 131026);
        }
        return pg.f0.f21461a;
    }
}

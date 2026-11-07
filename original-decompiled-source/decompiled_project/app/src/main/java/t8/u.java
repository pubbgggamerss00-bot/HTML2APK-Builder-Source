package t8;

import com.basitce.htmltoapk.R;
import t0.ff;

/* loaded from: classes.dex */
public final class u implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28477a;

    public u(boolean z10) {
        this.f28477a = z10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            String strC = f3.q.c(R.string.ai_free_note_body, jVar2);
            jVar2.L(2141253176);
            String strA = this.f28477a ? m3.a.a("\n\n", f3.q.c(R.string.ai_free_note_long_prompt, jVar2)) : "";
            jVar2.B();
            ff.b(strC + strA, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}

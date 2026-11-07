package b9;

import com.basitce.htmltoapk.R;
import java.util.List;
import t0.ff;

/* loaded from: classes.dex */
public final class a2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f3728a;

    public a2(y2 y2Var) {
        this.f3728a = y2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(f3.q.d(R.string.pdf_reader_bookmarks_count, new Object[]{Integer.valueOf(((List) this.f3728a.f4164h.getValue()).size())}, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}

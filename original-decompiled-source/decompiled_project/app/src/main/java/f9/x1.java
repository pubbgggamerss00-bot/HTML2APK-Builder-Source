package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class x1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10885a;

    public x1(int i10) {
        this.f10885a = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            int i10 = this.f10885a;
            if (i10 < 1) {
                i10 = 1;
            }
            t0.ff.b(f3.q.d(R.string.editor_html_go_to_line_hint, new Object[]{Integer.valueOf(i10)}, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}

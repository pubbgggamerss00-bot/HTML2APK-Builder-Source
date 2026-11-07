package b9;

import com.basitce.htmltoapk.R;
import t0.ff;

/* loaded from: classes.dex */
public final class w1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4133a;

    public w1(int i10) {
        this.f4133a = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(f3.q.d(R.string.pdf_document_invalid_page, new Object[]{Integer.valueOf(this.f4133a)}, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}

package b9;

import com.basitce.htmltoapk.R;
import t0.t4;

/* loaded from: classes.dex */
public final class i2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1.d f3882a;

    public i2(w1.d dVar) {
        this.f3882a = dVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t4.b(this.f3882a, f3.q.c(R.string.pdf_document_previous, jVar2), null, 0L, jVar2, 0, 12);
        }
        return pg.f0.f21461a;
    }
}

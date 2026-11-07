package b9;

import com.basitce.htmltoapk.R;
import t0.t4;

/* loaded from: classes.dex */
public final class k2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f3921b;

    public k2(boolean z10, t0.e2 e2Var) {
        this.f3920a = z10;
        this.f3921b = e2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = this.f3920a;
            t4.b(z10 ? r0.g.a() : r0.f.a(), f3.q.c(z10 ? R.string.pdf_document_bookmark_remove : R.string.pdf_document_bookmark_add, jVar2), null, z10 ? o1.f3959a : this.f3921b.f25771q, jVar2, 0, 4);
        }
        return pg.f0.f21461a;
    }
}

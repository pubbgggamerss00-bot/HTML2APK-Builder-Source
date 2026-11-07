package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class r1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f10350c;

    public r1(boolean z10, long j10, t0.e2 e2Var) {
        this.f10348a = z10;
        this.f10349b = j10;
        this.f10350c = e2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = this.f10348a;
            t0.t4.b(z10 ? r0.f0.a() : r0.e0.a(), f3.q.c(R.string.editor_html_toggle_replace, jVar2), null, z10 ? this.f10349b : this.f10350c.f25773s, jVar2, 0, 4);
        }
        return pg.f0.f21461a;
    }
}

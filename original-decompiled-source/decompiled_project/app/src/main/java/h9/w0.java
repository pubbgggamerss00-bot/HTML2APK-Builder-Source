package h9;

import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class w0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenSourceLicenses.b f12839a;

    public w0(OpenSourceLicenses.b bVar) {
        this.f12839a = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            String str = this.f12839a.f5704c;
            t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26549l;
            ff.b(str, null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, x2.f.f32016c, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65466);
        }
        return pg.f0.f21461a;
    }
}

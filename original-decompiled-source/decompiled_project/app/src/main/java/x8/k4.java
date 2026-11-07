package x8;

import t0.ff;
import x8.j6;

/* loaded from: classes.dex */
public final class k4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6.c f32871a;

    public k4(j6.c cVar) {
        this.f32871a = cVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        long j10;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            j6.c cVar = this.f32871a;
            String str = cVar.f32808a;
            if (cVar.f32809b) {
                jVar2.L(1095663054);
                j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w;
            } else {
                jVar2.L(1095664249);
                j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s;
            }
            jVar2.B();
            ff.b(str, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
        }
        return pg.f0.f21461a;
    }
}

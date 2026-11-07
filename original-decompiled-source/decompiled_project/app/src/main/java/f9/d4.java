package f9;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class d4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9308a;

    public d4(long j10) {
        this.f9308a = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.t4.b(r0.o.a(), null, androidx.compose.foundation.layout.g.n(d.a.f1143b, 16), this.f9308a, jVar2, 432, 0);
        }
        return pg.f0.f21461a;
    }
}

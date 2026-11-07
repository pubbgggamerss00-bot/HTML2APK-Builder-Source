package com.basitce.htmltoapk.ui.crop;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import eh.p;
import f3.q;
import pg.f0;
import t0.t4;
import t0.z9;
import x0.n1;

/* loaded from: classes.dex */
public final class e implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5758b;

    public e(long j10, n1<Boolean> n1Var) {
        this.f5757a = j10;
        this.f5758b = n1Var;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else if (this.f5758b.getValue().booleanValue()) {
            jVar2.L(-426745263);
            z9.a(2, 0, 390, 24, this.f5757a, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 22), jVar2);
            jVar2.B();
        } else {
            jVar2.L(-426387988);
            t4.b(p0.n1.a(), q.c(R.string.common_save, jVar2), null, this.f5757a, jVar2, 0, 4);
            jVar2.B();
        }
        return f0.f21461a;
    }
}

package com.basitce.htmltoapk.ui.crop;

import com.basitce.htmltoapk.R;
import eh.p;
import f3.q;
import pg.f0;
import t0.t4;

/* loaded from: classes.dex */
public final class b implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5751a;

    public b(long j10) {
        this.f5751a = j10;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t4.b(n0.a.a(), q.c(R.string.common_back, jVar2), null, this.f5751a, jVar2, 0, 4);
        }
        return f0.f21461a;
    }
}

package com.basitce.htmltoapk.ui.crop;

import com.basitce.htmltoapk.R;
import eh.p;
import f3.q;
import pg.f0;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class a implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5750a;

    public a(long j10) {
        this.f5750a = j10;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(q.c(R.string.editor_crop_title, jVar2), null, this.f5750a, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65498);
        }
        return f0.f21461a;
    }
}

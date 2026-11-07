package com.google.android.recaptcha.internal;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzbh extends i implements p {
    public zzbh(tg.e eVar) {
        super(2, eVar);
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzbh(eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        Thread.currentThread().setPriority(8);
        return f0.f21461a;
    }
}

package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzjc extends i implements p {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, tg.e eVar) {
        super(2, eVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzjc(this.zza, this.zzb, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        WebView webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}

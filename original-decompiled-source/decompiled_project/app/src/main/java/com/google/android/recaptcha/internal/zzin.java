package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzin extends i implements p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzin(this.zzb, this.zzc, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.zzF(r1, r3) == r0) goto L13;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 != 0) {
            if (i10 == 1) {
            }
            return f0.f21461a;
        }
        zzja zzjaVar = this.zzb;
        this.zza = 1;
        obj = zzjaVar.zzw(this);
        if (obj != aVar) {
        }
        return aVar;
        ((WebView) obj).clearCache(true);
        zzja zzjaVar2 = this.zzb;
        String str = this.zzc;
        this.zza = 2;
    }
}

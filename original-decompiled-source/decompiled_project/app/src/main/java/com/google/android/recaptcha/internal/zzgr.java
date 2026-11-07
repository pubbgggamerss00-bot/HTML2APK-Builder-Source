package com.google.android.recaptcha.internal;

import eh.p;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes2.dex */
final class zzgr extends s implements p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i10) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zze(i10, objArr);
        }
        return f0.f21461a;
    }
}

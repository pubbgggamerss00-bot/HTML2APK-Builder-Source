package com.google.android.gms.internal.p002firebaseauthapi;

import b6.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzafz extends zzaeg {
    private final String zza;
    private final /* synthetic */ zzafu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafz(zzafu zzafuVar, zzaeg zzaegVar, String str) {
        super(zzaegVar);
        this.zzb = zzafuVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(Status status) {
        zzafu.zza.c(a.b("SMS verification code request failed: ", d.a(status.f5910a), " ", status.f5911b), new Object[0]);
        zzagb zzagbVar = (zzagb) this.zzb.zzd.get(this.zza);
        if (zzagbVar == null) {
            return;
        }
        Iterator<zzaeg> it = zzagbVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb(String str) {
        zzafu.zza.a("onCodeSent", new Object[0]);
        zzagb zzagbVar = (zzagb) this.zzb.zzd.get(this.zza);
        if (zzagbVar == null) {
            return;
        }
        Iterator<zzaeg> it = zzagbVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzagbVar.zzg = true;
        zzagbVar.zzd = str;
        if (zzagbVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzagbVar.zzc) {
            this.zzb.zzd(this.zza);
        } else {
            if (zzae.zzc(zzagbVar.zze)) {
                return;
            }
            zzafu.zzb(this.zzb, this.zza);
        }
    }
}

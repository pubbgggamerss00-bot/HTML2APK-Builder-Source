package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzaar implements zzafn<zzaic> {
    private final /* synthetic */ zzaid zza;
    private final /* synthetic */ zzahc zzb;
    private final /* synthetic */ zzaeg zzc;
    private final /* synthetic */ zzahn zzd;
    private final /* synthetic */ zzafk zze;
    private final /* synthetic */ zzaam zzf;

    public zzaar(zzaam zzaamVar, zzaid zzaidVar, zzahc zzahcVar, zzaeg zzaegVar, zzahn zzahnVar, zzafk zzafkVar) {
        this.zza = zzaidVar;
        this.zzb = zzahcVar;
        this.zzc = zzaegVar;
        this.zzd = zzahnVar;
        this.zze = zzafkVar;
        this.zzf = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final void zza(zzaic zzaicVar) {
        zzaic zzaicVar2 = zzaicVar;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb(null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc(null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            byte[] bytes = "redacted".getBytes();
            p.d(bytes != null ? Base64.encodeToString(bytes, 0) : null);
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(zzaj.zzh());
        }
        List<zzaht> listZze = zzaicVar2.zze();
        if (listZze == null) {
            listZze = new ArrayList<>();
        }
        this.zzb.zza(listZze);
        zzaeg zzaegVar = this.zzc;
        zzahn zzahnVar = this.zzd;
        p.f(zzahnVar);
        String strZzc = zzaicVar2.zzc();
        String strZzd = zzaicVar2.zzd();
        if (!TextUtils.isEmpty(strZzc) && !TextUtils.isEmpty(strZzd)) {
            zzahnVar = new zzahn(strZzd, strZzc, Long.valueOf(zzaicVar2.zza()), zzahnVar.zze());
        }
        zzaegVar.zza(zzahnVar, this.zzb);
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import qd.w0;

/* loaded from: classes2.dex */
final class zzaau implements zzafn<zzahd> {
    private final /* synthetic */ zzafk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ w0 zze;
    private final /* synthetic */ zzaeg zzf;
    private final /* synthetic */ zzahn zzg;

    public zzaau(zzaam zzaamVar, zzafk zzafkVar, String str, String str2, Boolean bool, w0 w0Var, zzaeg zzaegVar, zzahn zzahnVar) {
        this.zza = zzafkVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = w0Var;
        this.zzf = zzaegVar;
        this.zzg = zzahnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahd zzahdVar) {
        List<zzahc> listZza = zzahdVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahc zzahcVar = listZza.get(0);
        zzahs zzahsVarZzf = zzahcVar.zzf();
        List<zzaht> listZza2 = zzahsVarZzf != null ? zzahsVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                listZza2.get(0).zza(this.zzc);
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 >= listZza2.size()) {
                        break;
                    }
                    if (listZza2.get(i10).zzf().equals(this.zzb)) {
                        listZza2.get(i10).zza(this.zzc);
                        break;
                    }
                    i10++;
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzahcVar.zza(bool.booleanValue());
        } else {
            zzahcVar.zza(zzahcVar.zzb() - zzahcVar.zza() < 1000);
        }
        zzahcVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzahcVar);
    }
}

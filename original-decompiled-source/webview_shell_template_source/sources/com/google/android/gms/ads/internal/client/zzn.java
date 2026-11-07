package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzn {
    private Bundle zza = new Bundle();
    private List zzb = new ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final Bundle zze = new Bundle();
    private final Bundle zzf = new Bundle();
    private final List zzg = new ArrayList();
    private int zzh = -1;
    private String zzi = null;
    private final List zzj = new ArrayList();
    private int zzk = 60000;
    private final int zzl = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    private long zzm = 0;

    public final zzm zza() {
        Bundle bundle = this.zze;
        Bundle bundle2 = this.zza;
        Bundle bundle3 = this.zzf;
        return new zzm(8, -1L, bundle2, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, bundle, bundle3, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null, this.zzl, this.zzm);
    }

    public final zzn zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzn zzc(int i6) {
        this.zzk = i6;
        return this;
    }

    public final zzn zzd(boolean z6) {
        this.zzc = z6;
        return this;
    }

    public final zzn zze(List list) {
        this.zzb = list;
        return this;
    }

    public final zzn zzf(String str) {
        this.zzi = str;
        return this;
    }

    public final zzn zzg(long j6) {
        this.zzm = j6;
        return this;
    }

    public final zzn zzh(int i6) {
        this.zzd = i6;
        return this;
    }

    public final zzn zzi(int i6) {
        this.zzh = i6;
        return this;
    }
}

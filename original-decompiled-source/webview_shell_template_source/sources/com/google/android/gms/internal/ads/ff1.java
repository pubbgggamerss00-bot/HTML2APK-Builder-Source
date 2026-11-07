package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Optional;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ff1 extends yf1 {
    @Override // com.google.android.gms.internal.ads.yf1
    public final ps1 c() {
        ps1 ps1Var = new ps1();
        k3.b bVar = new k3.b(this.f10958b);
        zzs zzsVarZzb = zzs.zzb();
        String str = this.f10961e.zza;
        zzby zzbyVarZzc = this.f10957a.zzc(bVar, zzsVarZzb, str, this.f10960d, this.f10959c);
        if (zzbyVarZzc == null) {
            ps1Var.f(new df1());
            return ps1Var;
        }
        try {
            zzbyVarZzc.zzH(new ef1(this, ps1Var, this.f10961e));
            zzbyVarZzc.zzab(this.f10961e.zzc);
            return ps1Var;
        } catch (RemoteException e6) {
            zzo.zzk("Failed to load app open ad.", e6);
            ps1Var.f(new df1());
            return ps1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.yf1
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        try {
            return Optional.ofNullable(((hj) obj).zzf());
        } catch (RemoteException e6) {
            zzo.zzf("Failed to get response info for the app open ad.", e6);
            return Optional.empty();
        }
    }
}

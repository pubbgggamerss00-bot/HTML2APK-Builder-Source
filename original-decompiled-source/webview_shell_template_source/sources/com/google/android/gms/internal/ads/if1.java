package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class if1 extends yf1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5738p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if1(ClientApi clientApi, Context context, int i6, gy gyVar, zzft zzftVar, zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, gf1 gf1Var, i3.a aVar, int i7) {
        super(clientApi, context, i6, gyVar, zzftVar, zzcfVar, scheduledExecutorService, gf1Var, aVar);
        this.f5738p = i7;
    }

    @Override // com.google.android.gms.internal.ads.yf1
    public final ps1 c() {
        switch (this.f5738p) {
            case 0:
                ps1 ps1Var = new ps1();
                k3.b bVar = new k3.b(this.f10958b);
                zzs zzsVar = new zzs();
                String str = this.f10961e.zza;
                zzby zzbyVarZze = this.f10957a.zze(bVar, zzsVar, str, this.f10960d, this.f10959c);
                if (zzbyVarZze != null) {
                    try {
                        zzbyVarZze.zzy(this.f10961e.zzc, new hf1(this, ps1Var, zzbyVarZze));
                    } catch (RemoteException e6) {
                        zzo.zzk("Failed to load interstitial ad.", e6);
                        ps1Var.f(new df1());
                    }
                } else {
                    ps1Var.f(new df1());
                }
                return ps1Var;
            default:
                ps1 ps1Var2 = new ps1();
                k3.b bVar2 = new k3.b(this.f10958b);
                String str2 = this.f10961e.zza;
                r40 r40VarZzp = this.f10957a.zzp(bVar2, str2, this.f10960d, this.f10959c);
                ag1 ag1Var = new ag1(this, ps1Var2, r40VarZzp);
                if (r40VarZzp != null) {
                    try {
                        r40VarZzp.zzf(this.f10961e.zzc, ag1Var);
                    } catch (RemoteException unused) {
                        zzo.zzj("Failed to load rewarded ad.");
                        ps1Var2.f(new df1());
                    }
                } else {
                    ps1Var2.f(new df1());
                }
                return ps1Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for  the interstitial ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the rewarded ad.", r2);
     */
    @Override // com.google.android.gms.internal.ads.yf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        switch (this.f5738p) {
        }
        return Optional.empty();
    }
}

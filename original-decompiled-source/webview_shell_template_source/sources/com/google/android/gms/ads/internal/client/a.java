package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.p40;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.v40;
import com.google.android.gms.internal.ads.y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy f2270d;

    public a(Context context, String str, gy gyVar) {
        this.f2268b = context;
        this.f2269c = str;
        this.f2270d = gyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2268b, "rewarded");
        return new zzfq();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzp(new k3.b(this.f2268b), this.f2269c, this.f2270d, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        String str = this.f2269c;
        gy gyVar = this.f2270d;
        Context context = this.f2268b;
        try {
            IBinder iBinderZze = ((v40) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new y5(19))).zze(new k3.b(context), str, gyVar, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof r40 ? (r40) iInterfaceQueryLocalInterface : new p40(iBinderZze);
        } catch (RemoteException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            e = e7;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzba f2309c;

    public m(zzba zzbaVar, Context context) {
        this.f2308b = context;
        this.f2309c = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2308b, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzh(new k3.b(this.f2308b), 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2308b;
        zn.a(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue();
        zzba zzbaVar = this.f2309c;
        if (!zBooleanValue) {
            return zzbaVar.zzc.zza(context);
        }
        try {
            IBinder iBinderZze = ((zzda) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzau
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzda ? (zzda) iInterfaceQueryLocalInterface : new zzda(iBinder);
                }
            })).zze(new k3.b(context), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(iBinderZze);
        } catch (RemoteException e6) {
            e = e6;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            e = e7;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }
}

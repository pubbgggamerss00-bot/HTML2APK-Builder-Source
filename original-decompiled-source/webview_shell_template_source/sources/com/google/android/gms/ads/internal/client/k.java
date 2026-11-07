package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy f2303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzba f2304e;

    public k(zzba zzbaVar, Context context, String str, gy gyVar) {
        this.f2301b = context;
        this.f2302c = str;
        this.f2303d = gyVar;
        this.f2304e = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2301b, "native_ad");
        return new zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzb(new k3.b(this.f2301b), this.f2302c, this.f2303d, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2301b;
        zn.a(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue();
        gy gyVar = this.f2303d;
        String str = this.f2302c;
        zzba zzbaVar = this.f2304e;
        if (!zBooleanValue) {
            return zzbaVar.zzb.zza(context, str, gyVar);
        }
        try {
            IBinder iBinderZze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaq
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
                }
            })).zze(new k3.b(context), str, gyVar, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
        } catch (RemoteException e6) {
            e = e6;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            e = e7;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}

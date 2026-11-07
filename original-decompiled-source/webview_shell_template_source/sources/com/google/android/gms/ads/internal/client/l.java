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
public final class l extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gy f2306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzba f2307d;

    public l(zzba zzbaVar, Context context, gy gyVar) {
        this.f2305b = context;
        this.f2306c = gyVar;
        this.f2307d = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2305b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        k3.b bVar = new k3.b(this.f2305b);
        gy gyVar = this.f2306c;
        zzci zzciVarZzg = zzcpVar.zzg(bVar, gyVar, 244410000);
        zzciVarZzg.zzh(gyVar);
        return zzciVarZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        zzci zzcgVar;
        Context context = this.f2305b;
        k3.b bVar = new k3.b(context);
        zn.a(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue();
        zzba zzbaVar = this.f2307d;
        gy gyVar = this.f2306c;
        if (!zBooleanValue) {
            return zzbaVar.zzh.zza(context, gyVar);
        }
        try {
            IBinder iBinderZze = ((zzcj) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzas
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcj ? (zzcj) iInterfaceQueryLocalInterface : new zzcj(iBinder);
                }
            })).zze(bVar, gyVar, 244410000);
            if (iBinderZze == null) {
                zzcgVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(iBinderZze);
            }
            zzcgVar.zzh(gyVar);
            return zzcgVar;
        } catch (RemoteException e6) {
            e = e6;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            e = e7;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            zzbaVar.zzg = t20.a(context);
            zzbaVar.zzg.b("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzl extends k3.c {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // k3.c
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof zzcj ? (zzcj) iInterfaceQueryLocalInterface : new zzcj(iBinder);
    }

    public final zzci zza(Context context, gy gyVar) {
        zzci zzcgVar;
        try {
            IBinder iBinderZze = ((zzcj) getRemoteCreatorInstance(context)).zze(new k3.b(context), gyVar, 244410000);
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
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (c.a e7) {
            e = e7;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}

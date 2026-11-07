package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzi extends k3.c {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // k3.c
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, String str, gy gyVar) {
        try {
            IBinder iBinderZze = ((zzbv) getRemoteCreatorInstance(context)).zze(new k3.b(context), str, gyVar, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
        } catch (RemoteException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (c.a e7) {
            e = e7;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}

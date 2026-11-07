package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfe extends k3.c {
    public zzfe() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // k3.c
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzda ? (zzda) iInterfaceQueryLocalInterface : new zzda(iBinder);
    }

    public final zzcz zza(Context context) {
        try {
            IBinder iBinderZze = ((zzda) getRemoteCreatorInstance(context)).zze(new k3.b(context), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(iBinderZze);
        } catch (RemoteException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (c.a e7) {
            e = e7;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}

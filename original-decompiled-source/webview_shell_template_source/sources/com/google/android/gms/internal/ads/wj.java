package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzh;
import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wj extends zzc {
    public wj(Context context, Looper looper, b.a aVar, b.InterfaceC0030b interfaceC0030b) {
        super(z30.a(context), looper, 123, aVar, interfaceC0030b, null);
    }

    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zj ? (zj) iInterfaceQueryLocalInterface : new zj(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final boolean d() {
        c3.d[] availableFeatures = getAvailableFeatures();
        if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue()) {
            c3.d dVar = zzh.zza;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (!com.google.android.gms.common.internal.k.a(availableFeatures[i6], dVar)) {
                    i6++;
                } else if (i6 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.b
    public final c3.d[] getApiFeatures() {
        return zzh.zzb;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}

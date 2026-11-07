package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzbh extends sh implements zzbi {
    public zzbh() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}

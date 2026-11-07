package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class su extends sh implements uu {
    public final OnH5AdsEventListener s;

    public su(OnH5AdsEventListener onH5AdsEventListener) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        this.s = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void zzb(String str) {
        this.s.onH5AdsEvent(str);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 != 1) {
            return false;
        }
        String string = parcel.readString();
        th.b(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }
}

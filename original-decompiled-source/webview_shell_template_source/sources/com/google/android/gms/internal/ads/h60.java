package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class h60 extends sh implements i60 {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            parcel.readString();
            parcel.readString();
            th.b(parcel);
        } else if (i6 == 2) {
            String string = parcel.readString();
            th.b(parcel);
            ((g20) this).zzb(string);
        } else {
            if (i6 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
            th.b(parcel);
            ((g20) this).d2(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }
}

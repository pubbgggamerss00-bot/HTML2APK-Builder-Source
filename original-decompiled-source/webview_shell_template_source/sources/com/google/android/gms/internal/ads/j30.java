package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class j30 extends sh implements k30 {
    public j30() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) th.a(parcel, ParcelFileDescriptor.CREATOR);
            th.b(parcel);
            G0(parcelFileDescriptor);
        } else if (i6 == 2) {
            zzbb zzbbVar = (zzbb) th.a(parcel, zzbb.CREATOR);
            th.b(parcel);
            c0(zzbbVar);
        } else {
            if (i6 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) th.a(parcel, ParcelFileDescriptor.CREATOR);
            r30 r30Var = (r30) th.a(parcel, r30.CREATOR);
            th.b(parcel);
            Q1(parcelFileDescriptor2, r30Var);
        }
        parcel2.writeNoException();
        return true;
    }
}

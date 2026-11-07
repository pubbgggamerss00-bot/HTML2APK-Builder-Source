package com.google.android.gms.internal.ads;

import android.os.Parcel;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class jj1 extends sh implements kj1 {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        switch (i6) {
            case 2:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                parcel.readString();
                th.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                th.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                th.b(parcel);
                break;
            case 6:
                parcel.readInt();
                th.b(parcel);
                break;
            case 7:
                parcel.readInt();
                th.b(parcel);
                break;
            case 8:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                th.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

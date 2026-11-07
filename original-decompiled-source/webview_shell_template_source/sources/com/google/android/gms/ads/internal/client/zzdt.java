package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzdt extends sh implements zzdu {
    public zzdt() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 != 1) {
            return false;
        }
        String string = parcel.readString();
        k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
        k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
        th.b(parcel);
        zze(string, aVarR, aVarR2);
        parcel2.writeNoException();
        return true;
    }
}

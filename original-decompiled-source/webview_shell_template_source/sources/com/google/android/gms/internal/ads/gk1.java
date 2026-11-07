package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gk1 extends rh implements ik1 {
    @Override // com.google.android.gms.internal.ads.ik1
    public final void L(Bundle bundle, yk1 yk1Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        th.e(parcelZza, yk1Var);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final void a1(String str, Bundle bundle, yk1 yk1Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        th.c(parcelZza, bundle);
        th.e(parcelZza, yk1Var);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final void w0(Bundle bundle, yk1 yk1Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, bundle);
        th.e(parcelZza, yk1Var);
        zzdb(2, parcelZza);
    }
}

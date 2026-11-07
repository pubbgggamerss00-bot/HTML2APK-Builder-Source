package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vv extends rh implements xv {
    @Override // com.google.android.gms.internal.ads.xv
    public final void r1(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzda(1, parcelZza);
    }
}

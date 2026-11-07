package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d20 extends rh implements f20 {
    @Override // com.google.android.gms.internal.ads.f20
    public final void W(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(2, parcelZza);
    }
}

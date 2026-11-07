package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k20 extends e20 {
    public final /* synthetic */ List s;

    public k20(List list) {
        this.s = list;
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void W(List list) {
        zzo.zzi("Recorded impression urls: ".concat(this.s.toString()));
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze(String str) {
        zzo.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }
}

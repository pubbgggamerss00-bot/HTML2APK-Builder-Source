package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.wv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u extends wv {
    public final /* synthetic */ zzex s;

    public /* synthetic */ u(zzex zzexVar) {
        this.s = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.xv
    public final void r1(List list) {
        int i6;
        ArrayList arrayList;
        synchronized (this.s.zzc) {
            this.s.zzf = false;
            this.s.zzg = true;
            arrayList = new ArrayList(this.s.zze);
            this.s.zze.clear();
        }
        InitializationStatus initializationStatusZzA = zzex.zzA(list);
        int size = arrayList.size();
        for (i6 = 0; i6 < size; i6++) {
            ((OnInitializationCompleteListener) arrayList.get(i6)).onInitializationComplete(initializationStatusZzA);
        }
    }
}

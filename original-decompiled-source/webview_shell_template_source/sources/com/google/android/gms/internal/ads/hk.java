package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hk {
    public static final ak a(Context context, xj xjVar) {
        gk gkVar = new gk(context);
        ak akVar = new ak(gkVar);
        ek ekVar = new ek(gkVar, xjVar, akVar);
        fk fkVar = new fk(gkVar, akVar);
        synchronized (gkVar.f5082c) {
            wj wjVar = new wj(context, zzv.zzu().zzb(), ekVar, fkVar);
            gkVar.f5080a = wjVar;
            wjVar.checkAvailabilityAndConnect();
        }
        return akVar;
    }
}

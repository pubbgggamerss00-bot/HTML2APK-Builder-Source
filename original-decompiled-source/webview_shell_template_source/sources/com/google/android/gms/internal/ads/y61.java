package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class y61 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10873a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10873a) {
            case 0:
                return new r51(zzv.zzt().zzb(), zzv.zzt().zzm(), 1);
            default:
                HashMap map = new HashMap();
                String str = (String) zzbe.zzc().a(zn.W);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzbe.zzc().a(zn.X)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, zzcj.zza(str2));
                        }
                    }
                }
                return new v91(map);
        }
    }
}

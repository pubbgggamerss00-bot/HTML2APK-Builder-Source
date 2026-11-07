package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class cr0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3644a;

    public /* synthetic */ cr0(int i6) {
        this.f3644a = i6;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        switch (this.f3644a) {
            case 0:
                zze.zzb("Error during loading assets.", (Exception) obj);
                return ds1.f4001t;
            case 1:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return bs1.l(cause);
            case 2:
                return ((Throwable) obj) instanceof TimeoutException ? bs1.m(new f51(Integer.toString(17), 0)) : bs1.m(new f51(null, 0));
            default:
                return bs1.m(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }
}

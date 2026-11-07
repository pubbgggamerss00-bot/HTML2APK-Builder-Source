package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mk {

    /* renamed from: a, reason: collision with root package name */
    public wh f7170a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7171b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f7172c;

    public mk() {
        this.f7172c = zzb.zzb;
    }

    public mk(Context context) {
        ExecutorService executorService = zzb.zzb;
        this.f7172c = executorService;
        executorService.execute(new bb(this, context, 1, false));
    }
}

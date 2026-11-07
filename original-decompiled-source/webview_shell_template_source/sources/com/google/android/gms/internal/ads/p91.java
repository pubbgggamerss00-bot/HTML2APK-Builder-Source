package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f8000a;

    public p91(ScheduledExecutorService scheduledExecutorService) {
        this.f8000a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return bs1.o(bs1.q(bs1.m(new Bundle()), ((Long) zzbe.zzc().a(zn.f11426k4)).longValue(), TimeUnit.MILLISECONDS, this.f8000a), new u5(2), i70.f5586a);
    }
}

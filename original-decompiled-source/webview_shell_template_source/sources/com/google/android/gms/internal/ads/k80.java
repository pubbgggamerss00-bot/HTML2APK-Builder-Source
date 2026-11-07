package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k80 {

    /* renamed from: b, reason: collision with root package name */
    public long f6279b;

    /* renamed from: a, reason: collision with root package name */
    public final long f6278a = TimeUnit.MILLISECONDS.toNanos(((Long) zzbe.zzc().a(zn.Q)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f6280c = true;

    public final void a(SurfaceTexture surfaceTexture, f80 f80Var) {
        if (f80Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f6280c) {
            long j6 = timestamp - this.f6279b;
            if (Math.abs(j6) < this.f6278a) {
                return;
            }
        }
        this.f6280c = false;
        this.f6279b = timestamp;
        zzs.zza.post(new b(8, f80Var));
    }
}

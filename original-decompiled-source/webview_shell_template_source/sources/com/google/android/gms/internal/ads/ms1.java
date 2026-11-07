package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ms1 extends zq1 implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f7219z;

    public ms1(Runnable runnable) {
        runnable.getClass();
        this.f7219z = runnable;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        return androidx.camera.camera2.internal.v0.b("task=[", this.f7219z.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7219z.run();
        } catch (Throwable th) {
            f(th);
            throw th;
        }
    }
}

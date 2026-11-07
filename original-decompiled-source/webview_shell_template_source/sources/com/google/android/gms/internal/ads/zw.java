package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zw extends s70 {

    /* renamed from: v, reason: collision with root package name */
    public final Object f11590v;

    /* renamed from: w, reason: collision with root package name */
    public final bx f11591w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11592x;

    public zw(bx bxVar) {
        super(0);
        this.f11590v = new Object();
        this.f11591w = bxVar;
    }

    public final void e() {
        zze.zza("release: Trying to acquire lock");
        synchronized (this.f11590v) {
            try {
                zze.zza("release: Lock acquired");
                if (this.f11592x) {
                    zze.zza("release: Lock already released");
                    return;
                }
                this.f11592x = true;
                d(new y5(18), new f0(14));
                d(new ck1(1, this), new ej0(3, this));
                zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

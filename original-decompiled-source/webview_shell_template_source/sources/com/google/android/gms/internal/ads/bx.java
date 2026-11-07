package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bx extends s70 {

    /* renamed from: v, reason: collision with root package name */
    public final Object f3314v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3315w;

    /* renamed from: x, reason: collision with root package name */
    public int f3316x;

    public bx(me0 me0Var) {
        super(0);
        this.f3314v = new Object();
        this.f3315w = false;
        this.f3316x = 0;
    }

    public final zw e() {
        zw zwVar = new zw(this);
        zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.f3314v) {
            zze.zza("createNewReference: Lock acquired");
            d(new l2(6, zwVar), new xj1(4, zwVar));
            int i6 = this.f3316x;
            if (i6 < 0) {
                throw new IllegalStateException();
            }
            this.f3316x = i6 + 1;
        }
        zze.zza("createNewReference: Lock released");
        return zwVar;
    }

    public final void f() {
        zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f3314v) {
            zze.zza("markAsDestroyable: Lock acquired");
            if (this.f3316x < 0) {
                throw new IllegalStateException();
            }
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f3315w = true;
            g();
        }
        zze.zza("markAsDestroyable: Lock released");
    }

    public final void g() {
        zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.f3314v) {
            try {
                zze.zza("maybeDestroy: Lock acquired");
                int i6 = this.f3316x;
                if (i6 < 0) {
                    throw new IllegalStateException();
                }
                if (this.f3315w && i6 == 0) {
                    zze.zza("No reference is left (including root). Cleaning up engine.");
                    d(new ax(), new f0(14));
                } else {
                    zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("maybeDestroy: Lock released");
    }

    public final void h() {
        zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.f3314v) {
            zze.zza("releaseOneReference: Lock acquired");
            if (this.f3316x <= 0) {
                throw new IllegalStateException();
            }
            zze.zza("Releasing 1 reference for JS Engine");
            this.f3316x--;
            g();
        }
        zze.zza("releaseOneReference: Lock released");
    }
}

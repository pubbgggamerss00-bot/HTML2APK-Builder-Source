package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fm1 implements Serializable, em1 {
    public final transient im1 s = new im1();

    /* renamed from: t, reason: collision with root package name */
    public final em1 f4724t;

    /* renamed from: u, reason: collision with root package name */
    public volatile transient boolean f4725u;

    /* renamed from: v, reason: collision with root package name */
    public transient Object f4726v;

    public fm1(em1 em1Var) {
        this.f4724t = em1Var;
    }

    public final String toString() {
        return androidx.camera.camera2.internal.v0.b("Suppliers.memoize(", (this.f4725u ? androidx.camera.camera2.internal.v0.b("<supplier that returned ", String.valueOf(this.f4726v), ">") : this.f4724t).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public final Object mo7zza() {
        if (!this.f4725u) {
            synchronized (this.s) {
                try {
                    if (!this.f4725u) {
                        Object objMo7zza = this.f4724t.mo7zza();
                        this.f4726v = objMo7zza;
                        this.f4725u = true;
                        return objMo7zza;
                    }
                } finally {
                }
            }
        }
        return this.f4726v;
    }
}

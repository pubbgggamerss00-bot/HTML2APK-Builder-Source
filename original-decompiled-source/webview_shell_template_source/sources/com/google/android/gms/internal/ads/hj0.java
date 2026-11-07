package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hj0 implements jl0, zza, yl0, al0, pk0, lm0 {
    public final i3.a s;

    /* renamed from: t, reason: collision with root package name */
    public final v60 f5430t;

    public hj0(i3.a aVar, v60 v60Var) {
        this.s = aVar;
        this.f5430t = v60Var;
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void M(am amVar) {
        v60 v60Var = this.f5430t;
        synchronized (v60Var.f9725d) {
            e70 e70Var = v60Var.f9723b;
            synchronized (e70Var.f4140a) {
                e70Var.f4143d.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
        i3.a aVar = this.s;
        v60 v60Var = this.f5430t;
        long jB = aVar.b();
        synchronized (v60Var.f9725d) {
            try {
                v60Var.f9731k = jB;
                if (jB != -1) {
                    v60Var.f9723b.a(v60Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void j(am amVar) {
        v60 v60Var = this.f5430t;
        synchronized (v60Var.f9725d) {
            e70 e70Var = v60Var.f9723b;
            synchronized (e70Var.f4140a) {
                e70Var.f4143d.b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        v60 v60Var = this.f5430t;
        synchronized (v60Var.f9725d) {
            if (v60Var.f9731k != -1) {
                u60 u60Var = new u60(v60Var);
                u60Var.f9466a = v60Var.f9722a.b();
                v60Var.f9724c.add(u60Var);
                v60Var.f9729i++;
                e70 e70Var = v60Var.f9723b;
                synchronized (e70Var.f4140a) {
                    c70 c70Var = e70Var.f4143d;
                    synchronized (c70Var.f3451f) {
                        c70Var.f3453i++;
                    }
                }
                v60Var.f9723b.a(v60Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        v60 v60Var = this.f5430t;
        synchronized (v60Var.f9725d) {
            try {
                if (v60Var.f9731k != -1) {
                    v60Var.h = v60Var.f9722a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
        v60 v60Var = this.f5430t;
        synchronized (v60Var.f9725d) {
            try {
                if (v60Var.f9731k != -1 && !v60Var.f9724c.isEmpty()) {
                    u60 u60Var = (u60) v60Var.f9724c.getLast();
                    if (u60Var.f9467b == -1) {
                        u60Var.f9467b = u60Var.f9468c.f9722a.b();
                        v60Var.f9723b.a(v60Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        v60 v60Var = this.f5430t;
        synchronized (v60Var.f9725d) {
            try {
                if (v60Var.f9731k != -1 && v60Var.f9728g == -1) {
                    v60Var.f9728g = v60Var.f9722a.b();
                    v60Var.f9723b.a(v60Var);
                }
                e70 e70Var = v60Var.f9723b;
                synchronized (e70Var.f4140a) {
                    c70 c70Var = e70Var.f4143d;
                    synchronized (c70Var.f3451f) {
                        c70Var.f3454j++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void G(am amVar) {
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void i(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void w(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) {
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f11 extends j40 implements gl0 {
    public h31 s;

    /* renamed from: t, reason: collision with root package name */
    public n31 f4440t;

    /* renamed from: u, reason: collision with root package name */
    public g31 f4441u;

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void B1(k3.a aVar) {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.B1(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void K0(k3.a aVar, l40 l40Var) {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.f5240v.Q(l40Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void O(k3.a aVar, int i6) {
        n31 n31Var = this.f4440t;
        if (n31Var != null) {
            n31Var.a(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void R1() {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.f5239u.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void X(k3.a aVar) {
        n31 n31Var = this.f4440t;
        if (n31Var != null) {
            synchronized (n31Var) {
                ((o70) n31Var.f7312c).a(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void Z0(k3.a aVar) {
        g31 g31Var = this.f4441u;
        if (g31Var != null) {
            Executor executor = g31Var.f4889d.f5544b;
            b01 b01Var = g31Var.f4888c;
            executor.execute(new f31(g31Var, g31Var.f4886a, g31Var.f4887b, b01Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void a0() {
        g31 g31Var = this.f4441u;
        if (g31Var != null) {
            zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(g31Var.f4888c.f2883a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.gl0
    public final synchronized void r(n31 n31Var) {
        this.f4440t = n31Var;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void u1(k3.a aVar) {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.f5240v.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void zze(k3.a aVar) {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.f5238t.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void zzj(k3.a aVar) {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.s.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final synchronized void zzn(k3.a aVar) {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.f5239u.o0(new f0(17));
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class md1 {

    /* renamed from: a, reason: collision with root package name */
    public final xc1 f7092a;

    /* renamed from: b, reason: collision with root package name */
    public final l2 f7093b;

    /* renamed from: d, reason: collision with root package name */
    public qd1 f7095d;

    /* renamed from: e, reason: collision with root package name */
    public int f7096e = 1;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f7094c = new ArrayDeque();

    public md1(xc1 xc1Var, vc1 vc1Var, l2 l2Var) {
        this.f7092a = xc1Var;
        this.f7093b = l2Var;
        vc1Var.f9808a = new ck1(12, this);
    }

    public final synchronized void a() {
        if (((Boolean) zzbe.zzc().a(zn.e6)).booleanValue() && !zzv.zzp().d().zzg().f10070j) {
            this.f7094c.clear();
            return;
        }
        synchronized (this) {
            if (this.f7095d == null) {
                while (!this.f7094c.isEmpty()) {
                    ld1 ld1Var = (ld1) this.f7094c.pollFirst();
                    if (ld1Var != null) {
                        if (ld1Var.zza() != null) {
                            xc1 xc1Var = this.f7092a;
                            fd1 fd1VarZza = ld1Var.zza();
                            synchronized (xc1Var) {
                                wc1 wc1Var = (wc1) xc1Var.f10494a.get(fd1VarZza);
                                if (wc1Var != null) {
                                    cd1 cd1Var = xc1Var.f10495b;
                                    wc1Var.a();
                                    if (wc1Var.f10157a.size() < cd1Var.f3525w) {
                                    }
                                }
                            }
                        }
                    }
                    qd1 qd1Var = new qd1(this.f7092a, this.f7093b, ld1Var);
                    this.f7095d = qd1Var;
                    ro0 ro0Var = new ro0();
                    ro0Var.s = ld1Var;
                    ro0Var.f8673t = this;
                    synchronized (qd1Var) {
                        gr1 gr1VarP = bs1.p(qd1Var.f8356b, new ye0(4), ld1Var.zzb());
                        gr1VarP.addListener(new as1(0, gr1VarP, ro0Var), ld1Var.zzb());
                    }
                    return;
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qt0 implements yl0, jl0, rk0, al0, zza, lm0 {
    public final kk s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8453t = false;

    public qt0(kk kkVar, cb1 cb1Var) {
        this.s = kkVar;
        kkVar.b(2);
        if (cb1Var != null) {
            kkVar.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void G(am amVar) {
        kk kkVar = this.s;
        synchronized (kkVar) {
            if (kkVar.f6441c) {
                try {
                    kkVar.f6440b.j(amVar);
                } catch (NullPointerException e6) {
                    zzv.zzp().h("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        this.s.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void M(am amVar) {
        kk kkVar = this.s;
        synchronized (kkVar) {
            if (kkVar.f6441c) {
                try {
                    kkVar.f6440b.j(amVar);
                } catch (NullPointerException e6) {
                    zzv.zzp().h("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        this.s.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
        this.s.a(new dh0(15, ac1Var));
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void i(boolean z6) {
        this.s.b(true != z6 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void j(am amVar) {
        kk kkVar = this.s;
        synchronized (kkVar) {
            if (kkVar.f6441c) {
                try {
                    kkVar.f6440b.j(amVar);
                } catch (NullPointerException e6) {
                    zzv.zzp().h("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        this.s.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        int i6 = zzeVar.zza;
        kk kkVar = this.s;
        switch (i6) {
            case 1:
                kkVar.b(101);
                break;
            case 2:
                kkVar.b(102);
                break;
            case 3:
                kkVar.b(5);
                break;
            case 4:
                kkVar.b(103);
                break;
            case 5:
                kkVar.b(104);
                break;
            case 6:
                kkVar.b(105);
                break;
            case 7:
                kkVar.b(106);
                break;
            default:
                kkVar.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.f8453t) {
            this.s.b(8);
        } else {
            this.s.b(7);
            this.f8453t = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        this.s.b(3);
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void w(boolean z6) {
        this.s.b(true != z6 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final void zzh() {
        this.s.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final synchronized void zzr() {
        this.s.b(6);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
    }
}

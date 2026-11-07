package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c11 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3361t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3362u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3363v;

    public /* synthetic */ c11(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f3361t = obj;
        this.f3362u = obj2;
        this.f3363v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                d11 d11Var = (d11) this.f3361t;
                c5.a aVarQ = bs1.q(d11Var.f3727b.b((ac1) this.f3362u, (tb1) this.f3363v), r2.R, TimeUnit.SECONDS, d11Var.f3730e);
                aVarQ.addListener(new as1(0, aVarQ, new ej0(13, d11Var)), d11Var.f3728c);
                break;
            default:
                cf1 cf1Var = (cf1) this.f3361t;
                String str = (String) this.f3362u;
                zzv zzvVar = (zzv) this.f3363v;
                is1 is1Var = cf1Var.f3555c;
                if (zzvVar == null) {
                    is1Var.u(new vw0(3, cf1Var, str));
                    break;
                } else {
                    try {
                        new ye1(zzvVar.zzb(), cf1Var.f3556d, is1Var, cf1Var.f3557e).a(1, str, 0L);
                        break;
                    } catch (NullPointerException | RejectedExecutionException unused) {
                        bs1.m(zzt.PERMANENT_FAILURE);
                        return;
                    }
                }
        }
    }
}

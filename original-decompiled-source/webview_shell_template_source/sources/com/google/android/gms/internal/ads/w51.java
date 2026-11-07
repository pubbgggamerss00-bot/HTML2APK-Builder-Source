package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final b70 f10050a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.l f10051b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f10052c;

    /* renamed from: d, reason: collision with root package name */
    public final hs1 f10053d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f10054e;

    public w51(Context context, b70 b70Var, ScheduledExecutorService scheduledExecutorService, hs1 hs1Var) {
        if (!((Boolean) zzbe.zzc().a(zn.f11361b3)).booleanValue()) {
            this.f10051b = new n3.l(context);
        }
        this.f10054e = context;
        this.f10050a = b70Var;
        this.f10052c = scheduledExecutorService;
        this.f10053d = hs1Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        v3.p pVarA;
        if (((Boolean) zzbe.zzc().a(zn.X2)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().a(zn.f11369c3)).booleanValue()) {
                if (!((Boolean) zzbe.zzc().a(zn.Y2)).booleanValue()) {
                    return bs1.o(ek1.a(this.f10051b.a()), new kt(2), i70.f5592g);
                }
                if (((Boolean) zzbe.zzc().a(zn.f11361b3)).booleanValue()) {
                    ed0.o(this.f10054e, false);
                    synchronized (ed0.C) {
                        pVarA = ed0.A;
                    }
                } else {
                    pVarA = this.f10051b.a();
                }
                if (pVarA == null) {
                    return bs1.m(new x51(null, -1, 0));
                }
                c5.a aVarP = bs1.p(ek1.a(pVarA), new ye0(2), i70.f5592g);
                if (((Boolean) zzbe.zzc().a(zn.Z2)).booleanValue()) {
                    aVarP = bs1.q(aVarP, ((Long) zzbe.zzc().a(zn.f11353a3)).longValue(), TimeUnit.MILLISECONDS, this.f10052c);
                }
                return bs1.j(aVarP, Exception.class, new ta1(3, this), this.f10053d);
            }
        }
        return bs1.m(new x51(null, -1, 0));
    }
}

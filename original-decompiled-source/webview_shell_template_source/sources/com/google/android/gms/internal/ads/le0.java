package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzu;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class le0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6676a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f6677b;

    public /* synthetic */ le0(w92 w92Var, int i6) {
        this.f6676a = i6;
        this.f6677b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f6676a) {
            case 0:
                return new zzu((String) this.f6677b.zzb());
            case 1:
                pi0 pi0Var = (pi0) this.f6677b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(pi0Var, h70Var);
            case 2:
                tl0 tl0Var = (tl0) this.f6677b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(tl0Var, h70Var2);
            case 3:
                cg0 cg0Var = (cg0) this.f6677b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new kn0(cg0Var, h70Var3);
            case 4:
                return new kn0((ak0) this.f6677b.zzb(), i70.f5592g);
            case 5:
                return new kn0((ce1) this.f6677b.zzb(), i70.f5592g);
            case 6:
                return new kn0((ko0) this.f6677b.zzb(), i70.f5591f);
            case 7:
                eu0 eu0Var = (eu0) this.f6677b.zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new kn0(eu0Var, h70Var4);
            case 8:
                kv0 kv0Var = (kv0) this.f6677b.zzb();
                h70 h70Var5 = i70.f5586a;
                ih1.j(h70Var5);
                return new kn0(kv0Var, h70Var5);
            default:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f6677b.zzb()));
                ih1.j(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }
}

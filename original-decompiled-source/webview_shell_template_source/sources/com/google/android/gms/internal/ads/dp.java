package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dp implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3983a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f3984b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f3985c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f3986d;

    public /* synthetic */ dp(ca2 ca2Var, ca2 ca2Var2, ca2 ca2Var3, int i6) {
        this.f3983a = i6;
        this.f3984b = ca2Var;
        this.f3985c = ca2Var2;
        this.f3986d = ca2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        String string;
        switch (this.f3983a) {
            case 0:
                ((oc0) this.f3984b).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f3985c.zzb();
                new me0(14);
                return new cp(scheduledExecutorService);
            default:
                i3.a aVar = (i3.a) this.f3984b.zzb();
                e70 e70VarZzb = ((dd0) this.f3985c).zzb();
                String str = ((lk0) this.f3986d).a().f4211f;
                com.google.android.gms.ads.mediation.customevent.a aVar2 = e70VarZzb.f4142c;
                synchronized (aVar2) {
                    string = ((BigInteger) aVar2.f2372t).toString();
                    aVar2.f2372t = ((BigInteger) aVar2.f2372t).add(BigInteger.ONE);
                    aVar2.f2373u = string;
                }
                return new v60(aVar, e70VarZzb, string, str);
        }
    }
}

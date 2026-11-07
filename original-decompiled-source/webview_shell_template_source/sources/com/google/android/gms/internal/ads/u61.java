package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u61 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9469a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9470b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9471c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f9472d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f9473e;

    public /* synthetic */ u61(x92 x92Var, w92 w92Var, w92 w92Var2, w92 w92Var3, int i6) {
        this.f9469a = i6;
        this.f9470b = x92Var;
        this.f9471c = w92Var;
        this.f9472d = w92Var2;
        this.f9473e = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f9469a) {
            case 0:
                a61 a61VarZzb = ((d61) this.f9470b).zzb();
                n61 n61Var = (n61) this.f9471c.zzb();
                List list = (List) this.f9472d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9473e.zzb();
                if (list.contains("54")) {
                    return new s71(n61Var, ((Integer) zzbe.zzc().a(zn.ic)).intValue(), scheduledExecutorService);
                }
                return new s71(a61VarZzb, ((Integer) zzbe.zzc().a(zn.ic)).intValue(), scheduledExecutorService);
            default:
                a91 a91VarZzb = ((b91) this.f9470b).zzb();
                n61 n61Var2 = (n61) this.f9471c.zzb();
                List list2 = (List) this.f9472d.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f9473e.zzb();
                if (list2.contains("39")) {
                    return new s71(n61Var2, ((Integer) zzbe.zzc().a(zn.Tb)).intValue(), scheduledExecutorService2);
                }
                return new s71(a91VarZzb, ((Integer) zzbe.zzc().a(zn.Tb)).intValue(), scheduledExecutorService2);
        }
    }
}

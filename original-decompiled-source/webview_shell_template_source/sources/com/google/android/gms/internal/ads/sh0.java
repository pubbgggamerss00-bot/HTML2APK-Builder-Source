package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8935a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f8936b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8937c;

    public /* synthetic */ sh0(ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f8935a = i6;
        this.f8936b = ca2Var;
        this.f8937c = ca2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8935a) {
            case 0:
                return new z50(((oc0) this.f8936b).a(), ((lk0) this.f8937c).a().f4211f);
            case 1:
                return new fx0(((oc0) this.f8936b).a(), (b60) this.f8937c.zzb());
            default:
                return new s71((n61) this.f8936b.zzb(), ((Integer) zzbe.zzc().a(zn.gc)).intValue(), (ScheduledExecutorService) this.f8937c.zzb());
        }
    }
}

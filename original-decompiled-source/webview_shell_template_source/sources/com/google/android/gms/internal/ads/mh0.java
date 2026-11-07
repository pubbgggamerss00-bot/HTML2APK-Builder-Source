package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7157a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7158b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f7159c;

    public /* synthetic */ mh0(Object obj, ca2 ca2Var, int i6) {
        this.f7157a = i6;
        this.f7158b = obj;
        this.f7159c = ca2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7157a) {
            case 0:
                return ((lh0) this.f7158b).a(((ea2) this.f7159c).zzb());
            case 1:
                return new ln0((Context) ((ga2) this.f7158b).zzb(), new HashSet(), ((qi0) this.f7159c).a());
            case 2:
                return new vv0(((oc0) this.f7158b).a(), ((bd0) this.f7159c).a());
            case 3:
                return new ly0(((sy0) this.f7158b).zzb(), ((lc0) this.f7159c).zzb());
            case 4:
                return new sb1((i3.a) ((w92) this.f7158b).zzb(), (cu0) ((w92) this.f7159c).zzb());
            case 5:
                return new s71(((li0) this.f7158b).b(), ((Integer) zzbe.zzc().a(zn.lc)).intValue(), (ScheduledExecutorService) this.f7159c.zzb());
            case 6:
                cf0 cf0Var = (cf0) this.f7158b;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new s71(new i71(h70Var, (sv0) cf0Var.f3552b.zzb()), ((Integer) zzbe.zzc().a(zn.cc)).intValue(), (ScheduledExecutorService) this.f7159c.zzb());
            case 7:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new r71(h70Var2, ((oc0) ((ga2) this.f7158b)).a(), (Set) ((ca2) this.f7159c).zzb());
            case 8:
                return new a81((String) ((ga2) this.f7158b).zzb(), ((Integer) this.f7159c.zzb()).intValue());
            default:
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new ae1(h70Var3, (ScheduledExecutorService) ((ga2) this.f7158b).zzb(), new zd1(((wk0) this.f7159c).f10212b.zzb()));
        }
    }
}

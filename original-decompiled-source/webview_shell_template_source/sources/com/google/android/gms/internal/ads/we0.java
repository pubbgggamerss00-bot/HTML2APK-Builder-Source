package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class we0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10178a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10179b;

    public /* synthetic */ we0(ca2 ca2Var, int i6) {
        this.f10178a = i6;
        this.f10179b = ca2Var;
    }

    public dx0 a() {
        Context contextA = ((oc0) this.f10179b).a();
        dx0 dx0Var = new dx0();
        dx0Var.h = 1;
        dx0Var.f3322f = new x20(contextA, zzv.zzu().zzb(), dx0Var, dx0Var);
        return dx0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10178a) {
            case 0:
                return new ve0(((lc0) this.f10179b).zzb());
            case 1:
                return new kn0((hj0) this.f10179b.zzb(), i70.f5592g);
            case 2:
                qt0 qt0Var = (qt0) this.f10179b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(qt0Var, h70Var);
            case 3:
                ku0 ku0Var = (ku0) this.f10179b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                Set setI = bq.i(ku0Var, h70Var2);
                ih1.j(setI);
                return setI;
            case 4:
                return a();
            case 5:
                ly0 ly0Var = (ly0) this.f10179b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new kn0(ly0Var, h70Var3);
            case 6:
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new s71(new z61(h70Var4), ((Integer) zzbe.zzc().a(zn.dc)).intValue(), (ScheduledExecutorService) this.f10179b.zzb());
            default:
                return new ba1((vc1) this.f10179b.zzb());
        }
    }
}

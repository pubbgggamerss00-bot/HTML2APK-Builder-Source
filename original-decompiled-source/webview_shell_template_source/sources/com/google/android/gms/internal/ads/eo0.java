package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eo0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4360b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f4361c;

    public /* synthetic */ eo0(Object obj, ca2 ca2Var, int i6) {
        this.f4359a = i6;
        this.f4360b = obj;
        this.f4361c = ca2Var;
    }

    public kw0 a() {
        h70 h70Var = i70.f5587b;
        ih1.j(h70Var);
        h70 h70Var2 = i70.f5586a;
        ih1.j(h70Var2);
        Context context = (Context) ((wc0) this.f4360b).f10156b.zzb();
        ih1.j(h70Var2);
        return new kw0(h70Var, h70Var2, new yw0(context, h70Var2), w92.a(new da2((zx0) this.f4361c)));
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4359a) {
            case 0:
                Executor executor = (Executor) this.f4361c.zzb();
                final xa0 xa0Var = ((bo0) this.f4360b).f3235b;
                return new kn0(new dm0() { // from class: com.google.android.gms.internal.ads.ao0
                    @Override // com.google.android.gms.internal.ads.dm0
                    public final void zza() {
                        zzm zzmVarZzL;
                        xa0 xa0Var2 = xa0Var;
                        if (xa0Var2 == null || (zzmVarZzL = xa0Var2.zzL()) == null) {
                            return;
                        }
                        zzmVarZzL.zzb();
                    }
                }, executor);
            case 1:
                return a();
            case 2:
                return new s71(((i51) this.f4360b).b(), ((Integer) zzbe.zzc().a(zn.jc)).intValue(), (ScheduledExecutorService) this.f4361c.zzb());
            case 3:
                return new s71(new t41(2, (oa1) ((y31) this.f4360b).f10825b.f10908a), ((Integer) zzbe.zzc().a(zn.fc)).intValue(), (ScheduledExecutorService) this.f4361c.zzb());
            default:
                rg0 rg0Var = (rg0) this.f4360b;
                b60 b60Var = (b60) rg0Var.f8629b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new s71(new i81(b60Var, h70Var, ((oc0) rg0Var.f8630c).a()), ((Integer) zzbe.zzc().a(zn.Xb)).intValue(), (ScheduledExecutorService) this.f4361c.zzb());
        }
    }
}

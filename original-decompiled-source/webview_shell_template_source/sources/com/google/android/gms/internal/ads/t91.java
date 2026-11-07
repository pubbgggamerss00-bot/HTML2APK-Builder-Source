package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t91 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9144a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9145b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9146c;

    /* renamed from: d, reason: collision with root package name */
    public final ca2 f9147d;

    /* renamed from: e, reason: collision with root package name */
    public final ca2 f9148e;

    /* renamed from: f, reason: collision with root package name */
    public final ca2 f9149f;

    public t91(oc0 oc0Var, w92 w92Var, ca2 ca2Var, w92 w92Var2, w92 w92Var3) {
        this.f9146c = oc0Var;
        this.f9147d = w92Var;
        this.f9145b = ca2Var;
        this.f9148e = w92Var2;
        this.f9149f = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9144a) {
            case 0:
                b70 b70Var = (b70) this.f9145b.zzb();
                boolean z6 = ((q91) ((af0) this.f9147d).f2738b).f8279a.s.getBoolean("is_gbid");
                boolean z7 = ((q91) ((qi0) this.f9148e).f8393b).f8279a.C;
                new fo(12);
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                ih1.j(((q91) ((rc0) this.f9149f).f8608b).f8279a.f8526v);
                return new s91(b70Var, z6, z7, h70Var, (ScheduledExecutorService) this.f9146c.zzb());
            default:
                Context contextA = ((oc0) this.f9146c).a();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new cf1(contextA, h70Var2, (is1) ((w92) this.f9147d).zzb(), (zzu) this.f9145b.zzb(), (ze1) ((w92) this.f9148e).zzb(), (ie1) ((w92) this.f9149f).zzb());
        }
    }

    public t91(w92 w92Var, af0 af0Var, qi0 qi0Var, rc0 rc0Var, w92 w92Var2) {
        this.f9145b = w92Var;
        this.f9147d = af0Var;
        this.f9148e = qi0Var;
        this.f9149f = rc0Var;
        this.f9146c = w92Var2;
    }
}

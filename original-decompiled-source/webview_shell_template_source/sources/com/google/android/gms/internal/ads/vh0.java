package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9866a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9867b;

    /* renamed from: c, reason: collision with root package name */
    public final ca2 f9868c;

    /* renamed from: d, reason: collision with root package name */
    public final ca2 f9869d;

    public /* synthetic */ vh0(ca2 ca2Var, w92 w92Var, ca2 ca2Var2, int i6) {
        this.f9866a = i6;
        this.f9868c = ca2Var;
        this.f9867b = w92Var;
        this.f9869d = ca2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9866a) {
            case 0:
                return new uh0(((nh0) this.f9868c).f7444b.f6734d, (cu0) this.f9867b.zzb(), ((qi0) this.f9869d).a());
            case 1:
                return new u21((Context) ((w92) this.f9868c).zzb(), (Executor) this.f9867b.zzb(), (us0) ((y92) this.f9869d).f10908a);
            case 2:
                a61 a61VarA = ((d61) this.f9868c).zzb();
                i3.a aVar = (i3.a) ((w92) this.f9867b).zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new n61(a61VarA, 2147483647L, aVar, h70Var, (cu0) ((w92) this.f9869d).zzb());
            default:
                return new rb1((mb1) ((w92) this.f9868c).zzb(), (hb1) ((w92) this.f9867b).zzb(), (bc1) ((w92) this.f9869d).zzb());
        }
    }
}

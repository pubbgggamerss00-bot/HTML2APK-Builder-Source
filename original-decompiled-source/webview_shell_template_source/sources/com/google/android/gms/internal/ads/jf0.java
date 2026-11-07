package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jf0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6050a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6051b;

    public /* synthetic */ jf0(ca2 ca2Var, int i6) {
        this.f6050a = i6;
        this.f6051b = ca2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f6050a) {
            case 0:
                y50 y50VarB = y50.b(((ie0) this.f6051b).f5724a.a());
                return new if0(new r0((i3.a) y50VarB.s, (u50) ((w92) y50VarB.f10861u).zzb()));
            case 1:
                return ((eh0) this.f6051b).zzb();
            case 2:
                wt0 wt0Var = (wt0) this.f6051b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(wt0Var, h70Var);
            case 3:
                ku0 ku0Var = (ku0) this.f6051b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                Set setI = bq.i(ku0Var, h70Var2);
                ih1.j(setI);
                return setI;
            case 4:
                ku0 ku0Var2 = (ku0) this.f6051b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                Set setI2 = bq.i(ku0Var2, h70Var3);
                ih1.j(setI2);
                return setI2;
            default:
                kv0 kv0Var = (kv0) this.f6051b.zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new kn0(kv0Var, h70Var4);
        }
    }
}

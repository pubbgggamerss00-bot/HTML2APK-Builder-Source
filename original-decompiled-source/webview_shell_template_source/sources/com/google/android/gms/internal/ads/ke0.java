package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ke0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6380a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6381b;

    public /* synthetic */ ke0(ca2 ca2Var, int i6) {
        this.f6380a = i6;
        this.f6381b = ca2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f6380a) {
            case 0:
                return new zzbo(((oc0) this.f6381b).a());
            case 1:
                return new xe0((sv0) this.f6381b.zzb());
            case 2:
                qt0 qt0Var = (qt0) this.f6381b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(qt0Var, h70Var);
            case 3:
                ku0 ku0Var = (ku0) this.f6381b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                Set setI = bq.i(ku0Var, h70Var2);
                ih1.j(setI);
                return setI;
            case 4:
                ku0 ku0Var2 = (ku0) this.f6381b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                Set setI2 = bq.i(ku0Var2, h70Var3);
                ih1.j(setI2);
                return setI2;
            case 5:
                kv0 kv0Var = (kv0) this.f6381b.zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new kn0(kv0Var, h70Var4);
            case 6:
                return new fy0(((oc0) this.f6381b).a());
            case 7:
                return new wz0(((oc0) this.f6381b).a());
            case 8:
                return new j41((cu0) this.f6381b.zzb());
            case 9:
                h70 h70Var5 = i70.f5586a;
                ih1.j(h70Var5);
                return new a71(((oc0) this.f6381b).a(), h70Var5);
            case 10:
                h70 h70Var6 = i70.f5586a;
                ih1.j(h70Var6);
                return new o81(((oc0) this.f6381b).a(), h70Var6);
            default:
                new fo(8);
                h70 h70Var7 = i70.f5586a;
                ih1.j(h70Var7);
                ((oc0) this.f6381b).a();
                return new j91(h70Var7);
        }
    }
}

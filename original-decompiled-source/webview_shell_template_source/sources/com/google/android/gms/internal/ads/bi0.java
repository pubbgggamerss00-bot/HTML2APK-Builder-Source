package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bi0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3183a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f3184b;

    public /* synthetic */ bi0(ca2 ca2Var, int i6) {
        this.f3183a = i6;
        this.f3184b = ca2Var;
    }

    public Boolean a() {
        boolean z6 = true;
        if (((lk0) this.f3184b).a().a() == null) {
            if (!((Boolean) zzbe.zzc().a(zn.f11521z5)).booleanValue()) {
                z6 = false;
            }
        }
        return Boolean.valueOf(z6);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f3183a) {
            case 0:
                return a();
            case 1:
                qt0 qt0Var = (qt0) this.f3184b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(qt0Var, h70Var);
            case 2:
                ku0 ku0Var = (ku0) this.f3184b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                Set setI = bq.i(ku0Var, h70Var2);
                ih1.j(setI);
                return setI;
            case 3:
                return new xz0(((oc0) this.f3184b).a());
            case 4:
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new o51(((oc0) this.f3184b).a(), h70Var3);
            case 5:
                Context contextA = ((oc0) this.f3184b).a();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new x61(contextA, h70Var4);
            default:
                return new he1((ie1) this.f3184b.zzb());
        }
    }
}

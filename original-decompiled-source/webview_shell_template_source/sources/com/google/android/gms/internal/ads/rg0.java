package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rg0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8628a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f8629b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8630c;

    public /* synthetic */ rg0(ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f8628a = i6;
        this.f8629b = ca2Var;
        this.f8630c = ca2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    @Override // com.google.android.gms.internal.ads.ga2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        Object rp1Var;
        int i6 = this.f8628a;
        ga2 ga2Var = this.f8630c;
        ga2 ga2Var2 = this.f8629b;
        switch (i6) {
            case 0:
                lg0 lg0Var = (lg0) ((w92) ga2Var2).zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                Set setSingleton = ((JSONObject) ((w92) ga2Var).zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new kn0(lg0Var, h70Var));
                ih1.j(setSingleton);
                return setSingleton;
            case 1:
                return new s71(((pj0) ga2Var2).a(), ((Integer) zzbe.zzc().a(zn.oc)).intValue(), (ScheduledExecutorService) ga2Var.zzb());
            case 2:
                return new tl0(((ea2) ga2Var2).zzb(), ((qi0) ga2Var).a());
            case 3:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new ox0(h70Var2, ((we0) ga2Var2).a(), w92.a(new da2((zx0) ga2Var)));
            case 4:
                return new oy0(((ky0) ga2Var2).zzb(), ((lc0) ga2Var).zzb(), 6, false);
            case 5:
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                a71 a71Var = new a71(((oc0) ((ke0) ga2Var2).f6381b).a(), h70Var3);
                Context contextA = ((oc0) ga2Var).a();
                if (((Boolean) zzbe.zzc().a(zn.kb)).booleanValue()) {
                    zzv.zzq();
                    if (zzs.zzC(contextA)) {
                        int i7 = go1.f5097u;
                        rp1Var = new rp1(a71Var);
                    } else {
                        int i8 = go1.f5097u;
                        rp1Var = jp1.B;
                    }
                }
                ih1.j(rp1Var);
                return rp1Var;
            default:
                b60 b60Var = (b60) ga2Var2.zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new i81(b60Var, h70Var4, ((oc0) ga2Var).a());
        }
    }
}

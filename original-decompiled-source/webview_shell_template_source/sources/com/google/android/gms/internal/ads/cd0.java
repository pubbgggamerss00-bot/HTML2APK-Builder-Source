package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cd0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3520a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3521b;

    public /* synthetic */ cd0(int i6, Object obj) {
        this.f3520a = i6;
        this.f3521b = obj;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Object rp1Var;
        int i6 = this.f3520a;
        Object obj = this.f3521b;
        switch (i6) {
            case 0:
                return Long.valueOf(((kc0) obj).f6322c);
            case 1:
                try {
                    return new JSONObject(((qi0) obj).a().f9218z);
                } catch (JSONException unused) {
                    return null;
                }
            case 2:
                th0 th0Var = (th0) obj;
                ei0 ei0Var = new ei0(((nh0) th0Var.f9284c).f7444b.f6734d, (Executor) th0Var.f9283b.zzb());
                if (((Boolean) zzbe.zzc().a(zn.vc)).booleanValue()) {
                    kn0 kn0Var = new kn0(ei0Var, i70.f5586a);
                    int i7 = go1.f5097u;
                    rp1Var = new rp1(kn0Var);
                } else {
                    int i8 = go1.f5097u;
                    rp1Var = jp1.B;
                }
                ih1.j(rp1Var);
                return rp1Var;
            case 3:
                return (c11) ((ni0) obj).f7448u;
            case 4:
                hm0 hm0Var = (hm0) ((ni0) obj).f7448u;
                return hm0Var != null ? new kn0(hm0Var, i70.f5592g) : new kn0(new mi0(), i70.f5592g);
            case 5:
                return Integer.valueOf(((jk0) obj).f6101g);
            case 6:
                return new em0(((ea2) obj).zzb());
            case 7:
                pp0 pp0Var = (pp0) ((to0) obj).f9355a.s;
                ih1.j(pp0Var);
                Set setSingleton = pp0Var.f8128d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                ih1.j(setSingleton);
                return setSingleton;
            case 8:
                gs0 gs0Var = (gs0) ((j00) obj).f5892u;
                ih1.j(gs0Var);
                return gs0Var;
            case 9:
                return new jt0((xa0) ((x92) obj).zzb());
            case 10:
                return (to) ((v31) obj).f9702t;
            case 11:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new y81(((oc0) obj).a(), h70Var);
            default:
                return Boolean.valueOf(((q91) obj).f8279a.D);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t50 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9108a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9109b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9110c;

    public t50(w92 w92Var, y92 y92Var) {
        this.f9108a = 8;
        this.f9110c = w92Var;
        this.f9109b = y92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9108a) {
            case 0:
                return new s50((Context) ((y92) this.f9109b).f10908a, (zzg) ((y92) this.f9110c).f10908a);
            case 1:
                Context context = (Context) ((y92) this.f9109b).f10908a;
                x50 x50Var = (x50) this.f9110c;
                return new f60(context, new r0((i3.a) x50Var.f10386c.f10908a, (u50) x50Var.f10385b.zzb()));
            case 2:
                return new kn0((bm0) ((w92) this.f9109b).zzb(), (Executor) this.f9110c.zzb());
            case 3:
                Set setZzb = ((ea2) this.f9110c).zzb();
                rm0 rm0Var = (rm0) this.f9109b;
                if (rm0Var.f8670p == null) {
                    rm0Var.f8670p = new qk0(setZzb);
                }
                qk0 qk0Var = rm0Var.f8670p;
                ih1.j(qk0Var);
                return qk0Var;
            case 4:
                Set setA = ((bo0) this.f9109b).a((yj0) ((w92) this.f9110c).zzb());
                ih1.j(setA);
                return setA;
            case 5:
                tb1 tb1VarA = ((qi0) this.f9109b).a();
                JSONObject jSONObject = (JSONObject) ((j00) ((qc0) this.f9110c).f8305b).f5891t;
                ih1.j(jSONObject);
                return new lp0(tb1VarA, jSONObject);
            case 6:
                return new iu0((String) ((w92) this.f9109b).zzb(), (fu0) ((w92) this.f9110c).zzb());
            case 7:
                Map map = ((aa2) this.f9109b).f9761a;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new gx0(map, h70Var, new xl0(((zk0) this.f9110c).f11325b.zzb()));
            case 8:
                Context context2 = (Context) ((w92) this.f9110c).zzb();
                yg0 yg0Var = (yg0) ((y92) this.f9109b).f10908a;
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new m01(context2, yg0Var, h70Var2);
            case 9:
                bi0 bi0Var = (bi0) this.f9109b;
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new s71(new o51(((oc0) bi0Var.f3184b).a(), h70Var3), ((Integer) zzbe.zzc().a(zn.tc)).intValue(), (ScheduledExecutorService) this.f9110c.zzb());
            case 10:
                return new s71(((lv0) this.f9109b).a(), ((Integer) zzbe.zzc().a(zn.mc)).intValue(), (ScheduledExecutorService) this.f9110c.zzb());
            default:
                ke0 ke0Var = (ke0) this.f9109b;
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new s71(new o81(((oc0) ke0Var.f6381b).a(), h70Var4), ((Integer) zzbe.zzc().a(zn.Vb)).intValue(), (ScheduledExecutorService) this.f9110c.zzb());
        }
    }

    public /* synthetic */ t50(Object obj, ca2 ca2Var, int i6) {
        this.f9108a = i6;
        this.f9109b = obj;
        this.f9110c = ca2Var;
    }
}

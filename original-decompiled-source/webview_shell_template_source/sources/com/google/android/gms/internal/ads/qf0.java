package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class qf0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8368c;

    public /* synthetic */ qf0(int i6, Object obj, Object obj2) {
        this.f8366a = i6;
        this.f8367b = obj;
        this.f8368c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws fx {
        switch (this.f8366a) {
            case 0:
                vf0 vf0Var = (vf0) this.f8367b;
                Uri.Builder builder = (Uri.Builder) this.f8368c;
                vf0Var.f9848e.w(new bb(vf0Var, (Throwable) obj, 7, false));
                builder.appendQueryParameter((String) zzbe.zzc().a(zn.ca), "9");
                return bs1.m(builder.toString());
            case 1:
                qr0 qr0Var = (qr0) this.f8367b;
                JSONObject jSONObject = (JSONObject) this.f8368c;
                xa0 xa0Var = (xa0) obj;
                bw bwVar = qr0Var.f8445a.f4207b;
                n70 n70Var = new n70(xa0Var);
                if (bwVar != null) {
                    xa0Var.h0(new cc0(5, 0, 0));
                } else {
                    xa0Var.h0(new cc0(4, 0, 0));
                }
                xa0Var.zzN().f4196y = new b7(qr0Var, xa0Var, n70Var);
                xa0Var.l0("google.afma.nativeAds.renderVideo", jSONObject);
                return n70Var;
            case 2:
                return ((hx0) ((ga2) this.f8367b).zzb()).a((r30) this.f8368c);
            case 3:
                jd0 jd0Var = (jd0) this.f8367b;
                kd0 kd0Var = jd0Var.f6030b;
                Context context = kd0Var.f6331b.f6321b;
                ih1.j(context);
                q91 q91Var = jd0Var.f6029a;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                new d0(15);
                r30 r30Var = q91Var.f8279a;
                ih1.j(r30Var.f8526v);
                m91 m91Var = new m91();
                w92 w92Var = kd0Var.f6337e;
                s71 s71Var = new s71(m91Var, 0L, (ScheduledExecutorService) w92Var.zzb());
                new bq(17, (byte) 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) w92Var.zzb();
                kc0 kc0Var = kd0Var.f6331b;
                ih1.j(kc0Var.f6321b);
                s71 s71Var2 = new s71(new p91(scheduledExecutorService), ((Long) zzbe.zzc().a(zn.f11426k4)).longValue(), (ScheduledExecutorService) w92Var.zzb());
                t60 t60Var = new t60();
                Context context2 = kc0Var.f6321b;
                ih1.j(context2);
                s71 s71Var3 = new s71(new f91(t60Var, context2, (ScheduledExecutorService) w92Var.zzb(), h70Var, q91Var.f8280b, r30Var.D, r30Var.C), 0L, (ScheduledExecutorService) w92Var.zzb());
                s71 s71Var4 = new s71(new u91(h70Var), 0L, (ScheduledExecutorService) w92Var.zzb());
                new fo(8);
                ih1.j(context2);
                j91 j91Var = new j91(h70Var);
                new ln();
                ih1.j(h70Var);
                List list = q91Var.f8279a.f8527w;
                ih1.j(list);
                o91 o91Var = new o91(h70Var, list);
                h91 h91VarA = jd0Var.a();
                q81 q81Var = (q81) kd0Var.N0.zzb();
                ih1.j(r30Var.f8526v);
                new y5(17);
                q81[] q81VarArr = {h91VarA, q81Var, new i91((b70) kd0Var.Q.zzb(), (ScheduledExecutorService) w92Var.zzb(), h70Var)};
                int i6 = go1.f5097u;
                Object[] objArr = new Object[9];
                objArr[0] = s71Var;
                objArr[1] = s71Var2;
                objArr[2] = s71Var3;
                objArr[3] = s71Var4;
                objArr[4] = j91Var;
                objArr[5] = o91Var;
                System.arraycopy(q81VarArr, 0, objArr, 6, 3);
                return new t81(context, h70Var, go1.m(objArr, 9), (he1) jd0Var.f6031c.zzb(), (cu0) kd0Var.f6376z.zzb()).a(zzbc.zzb().zzi((Bundle) obj), ((r30) this.f8368c).E, false);
            default:
                u11 u11Var = (u11) this.f8367b;
                gs0 gs0Var = (gs0) this.f8368c;
                JSONObject jSONObject2 = (JSONObject) obj;
                sc1 sc1Var = u11Var.f9428d;
                ds1 ds1VarM = bs1.m(gs0Var);
                synchronized (sc1Var) {
                    sc1Var.f8894a.addFirst(ds1VarM);
                }
                if (jSONObject2.optBoolean("success")) {
                    return bs1.m(jSONObject2.getJSONObject("json").getJSONArray("ads"));
                }
                throw new fx("process json failed");
        }
    }
}

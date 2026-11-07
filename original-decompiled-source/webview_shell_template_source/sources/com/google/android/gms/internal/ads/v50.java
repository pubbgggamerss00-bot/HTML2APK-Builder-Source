package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v50 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9707a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9708b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9709c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f9710d;

    public /* synthetic */ v50(x92 x92Var, ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f9707a = i6;
        this.f9708b = x92Var;
        this.f9709c = ca2Var;
        this.f9710d = ca2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        lx lxVar;
        switch (this.f9707a) {
            case 0:
                zzg zzgVar = (zzg) ((y92) this.f9709c).f10908a;
                return new u50(zzgVar);
            case 1:
                uk0 uk0Var = new uk0(((wk0) this.f9708b).f10212b.zzb());
                Set setZzb = ((ea2) this.f9709c).zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new vk0(uk0Var, setZzb, h70Var, (ScheduledExecutorService) this.f9710d.zzb());
            case 2:
                return new ur0((String) ((androidx.camera.view.b) ((pc0) this.f9708b).f8025b).f676v, (fp0) ((pc0) this.f9709c).zzb(), ((qc0) this.f9710d).a());
            case 3:
                Context contextA = ((oc0) this.f9708b).a();
                b70 b70Var = (b70) this.f9709c.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9710d.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new w51(contextA, b70Var, scheduledExecutorService, h70Var2);
            case 4:
                Context contextA2 = ((je0) this.f9708b).f6041b.a();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                u81 u81Var = new u81(contextA2, h70Var3);
                i3.a aVar = (i3.a) ((w92) this.f9709c).zzb();
                ih1.j(h70Var3);
                return new n61(u81Var, 2147483647L, aVar, h70Var3, (cu0) ((w92) this.f9710d).zzb());
            case 5:
                k81 k81VarA = ((m81) this.f9708b).zzb();
                i3.a aVar2 = (i3.a) ((w92) this.f9709c).zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new n61(k81VarA, ((Long) jp.f6122g.c()).longValue(), aVar2, h70Var4, (cu0) ((w92) this.f9710d).zzb());
            case 6:
                ih1.j(((q91) ((rc0) this.f9708b).f8608b).f8279a.f8526v);
                new y5(17);
                b70 b70Var2 = (b70) this.f9709c.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f9710d.zzb();
                h70 h70Var5 = i70.f5586a;
                ih1.j(h70Var5);
                return new i91(b70Var2, scheduledExecutorService2, h70Var5);
            default:
                Context contextA3 = ((oc0) this.f9708b).a();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f9709c).a();
                ie1 ie1Var = (ie1) ((w92) this.f9710d).zzb();
                synchronized (new Object()) {
                    Context applicationContext = contextA3.getApplicationContext();
                    if (applicationContext != null) {
                        contextA3 = applicationContext;
                    }
                    lxVar = new lx(contextA3, versionInfoParcelA, (String) zzbe.zzc().a(zn.f11349a), ie1Var);
                }
                return lxVar;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10981a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10982b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f10983c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f10984d;

    public yh0(i51 i51Var, i51 i51Var2, lk0 lk0Var) {
        this.f10981a = 2;
        this.f10984d = i51Var;
        this.f10982b = i51Var2;
        this.f10983c = lk0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10981a) {
            case 0:
                return true == ((bi0) this.f10982b).a().booleanValue() ? ((h21) this.f10983c).zzb() : ((i51) this.f10984d).a();
            case 1:
                jp0 jp0VarA = ((qc0) this.f10982b).a();
                lp0 lp0Var = (lp0) ((rh0) this.f10983c).f8636b.zzb();
                ih1.j(lp0Var);
                Executor executor = (Executor) this.f10984d.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new jq0(jp0VarA, lp0Var, executor, h70Var);
            case 2:
                int i6 = ((lk0) this.f10983c).a().f4219o.f2239a;
                if (i6 != 0) {
                    return i6 + (-1) != 0 ? ((i51) this.f10982b).a() : ((i51) this.f10984d).a();
                }
                throw null;
            case 3:
                Context contextA = ((oc0) this.f10982b).a();
                WeakReference weakReference = ((kc0) ((pc0) this.f10983c).f8025b).f6323d;
                ih1.j(weakReference);
                vv0 vv0Var = (vv0) ((w92) this.f10984d).zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new dw0(contextA, weakReference, vv0Var, h70Var2);
            case 4:
                ez0 ez0Var = (ez0) this.f10982b;
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                k61 k61Var = new k61(ez0Var.f4426b.a(), h70Var3);
                i3.a aVar = (i3.a) ((w92) this.f10983c).zzb();
                ih1.j(h70Var3);
                return new n61(k61Var, ((Long) jp.f6118c.c()).longValue(), aVar, h70Var3, (cu0) ((w92) this.f10984d).zzb());
            case 5:
                v71 v71VarZzb = ((x71) this.f10982b).zzb();
                i3.a aVar2 = (i3.a) ((w92) this.f10983c).zzb();
                h70 h70Var4 = i70.f5586a;
                ih1.j(h70Var4);
                return new n61(v71VarZzb, 2147483647L, aVar2, h70Var4, (cu0) ((w92) this.f10984d).zzb());
            default:
                h70 h70Var5 = i70.f5586a;
                ih1.j(h70Var5);
                l71 l71Var = new l71(h70Var5);
                n61 n61Var = (n61) this.f10982b.zzb();
                List list = (List) this.f10983c.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10984d.zzb();
                if (list.contains("24")) {
                    return new s71(n61Var, ((Integer) zzbe.zzc().a(zn.bc)).intValue(), scheduledExecutorService);
                }
                return new s71(l71Var, ((Integer) zzbe.zzc().a(zn.bc)).intValue(), scheduledExecutorService);
        }
    }

    public /* synthetic */ yh0(ca2 ca2Var, ca2 ca2Var2, ca2 ca2Var3, int i6) {
        this.f10981a = i6;
        this.f10982b = ca2Var;
        this.f10983c = ca2Var2;
        this.f10984d = ca2Var3;
    }
}

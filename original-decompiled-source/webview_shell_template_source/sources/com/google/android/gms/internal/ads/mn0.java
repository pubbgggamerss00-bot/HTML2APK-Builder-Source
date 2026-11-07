package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mn0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7190a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f7191b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f7192c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f7193d;

    public mn0(w92 w92Var, w92 w92Var2, y92 y92Var) {
        this.f7190a = 1;
        this.f7192c = w92Var;
        this.f7193d = y92Var;
        this.f7191b = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7190a) {
            case 0:
                return new ln0((Context) this.f7191b.zzb(), ((ea2) this.f7192c).zzb(), ((qi0) this.f7193d).a());
            case 1:
                return new v11((Context) ((w92) this.f7192c).zzb(), (uo0) ((y92) this.f7193d).f10908a, (Executor) this.f7191b.zzb());
            case 2:
                return new wv0((oc1) this.f7191b.zzb(), (lt0) this.f7192c.zzb(), (cu0) this.f7193d.zzb());
            case 3:
                t51 t51VarZzb = ((v51) this.f7191b).zzb();
                i3.a aVar = (i3.a) ((w92) this.f7192c).zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new n61(t51VarZzb, ((Long) jp.f6116a.c()).longValue(), aVar, h70Var, (cu0) ((w92) this.f7193d).zzb());
            case 4:
                f71 f71VarZzb = ((h71) this.f7191b).zzb();
                i3.a aVar2 = (i3.a) ((w92) this.f7192c).zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new n61(f71VarZzb, ((Long) jp.f6120e.c()).longValue(), aVar2, h70Var2, (cu0) ((w92) this.f7193d).zzb());
            default:
                Context contextA = ((oc0) this.f7191b).a();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f7192c).a();
                lt0 lt0Var = (lt0) ((w92) this.f7193d).zzb();
                new f0(26);
                return new ie1(contextA, versionInfoParcelA, lt0Var, new ed0(14));
        }
    }

    public /* synthetic */ mn0(ca2 ca2Var, ca2 ca2Var2, ca2 ca2Var3, int i6) {
        this.f7190a = i6;
        this.f7191b = ca2Var;
        this.f7192c = ca2Var2;
        this.f7193d = ca2Var3;
    }
}

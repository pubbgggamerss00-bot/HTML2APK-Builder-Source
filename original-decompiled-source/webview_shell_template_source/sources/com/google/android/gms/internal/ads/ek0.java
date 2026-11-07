package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ek0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final w92 f4322a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f4323b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f4324c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f4325d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f4326e;

    /* renamed from: f, reason: collision with root package name */
    public final w92 f4327f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f4328g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final gi0 f4329i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f4330j;

    /* renamed from: k, reason: collision with root package name */
    public final w92 f4331k;

    /* renamed from: l, reason: collision with root package name */
    public final ga2 f4332l;

    public ek0(w92 w92Var, bd0 bd0Var, w92 w92Var2, nw0 nw0Var, w92 w92Var3, w92 w92Var4, lc0 lc0Var, w92 w92Var5, gi0 gi0Var, lk0 lk0Var, w92 w92Var6, w92 w92Var7) {
        this.f4322a = w92Var;
        this.f4323b = bd0Var;
        this.f4324c = w92Var2;
        this.f4325d = nw0Var;
        this.f4326e = w92Var3;
        this.f4327f = w92Var4;
        this.f4328g = lc0Var;
        this.h = w92Var5;
        this.f4329i = gi0Var;
        this.f4330j = lk0Var;
        this.f4331k = w92Var6;
        this.f4332l = w92Var7;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dk0 zzb() {
        ae1 ae1Var = (ae1) this.f4322a.zzb();
        VersionInfoParcel versionInfoParcelA = ((bd0) this.f4323b).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f4324c.zzb();
        String packageName = ((oc0) ((nw0) this.f4325d).f7527a).a().getPackageName();
        ih1.j(packageName);
        sn snVar = zn.f11349a;
        return new dk0(ae1Var, versionInfoParcelA, applicationInfo, packageName, zzbe.zza().a(), (PackageInfo) this.f4326e.zzb(), w92.a(new da2(this.f4327f)), ((lc0) this.f4328g).zzb(), (String) this.h.zzb(), this.f4329i.a(), ((lk0) this.f4330j).a(), (mm0) this.f4331k.zzb(), ((Integer) this.f4332l.zzb()).intValue());
    }
}

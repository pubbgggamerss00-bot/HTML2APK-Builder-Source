package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f7985a;

    /* renamed from: b, reason: collision with root package name */
    public final ec1 f7986b;

    /* renamed from: c, reason: collision with root package name */
    public final PackageInfo f7987c;

    /* renamed from: d, reason: collision with root package name */
    public final zzg f7988d;

    public p71(hs1 hs1Var, ec1 ec1Var, PackageInfo packageInfo, zzj zzjVar) {
        this.f7985a = hs1Var;
        this.f7986b = ec1Var;
        this.f7987c = packageInfo;
        this.f7988d = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return this.f7985a.u(new mw0(2, this));
    }
}

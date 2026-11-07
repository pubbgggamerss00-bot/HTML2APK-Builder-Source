package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.math.BigInteger;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e70 implements li {

    /* renamed from: b, reason: collision with root package name */
    public final zzj f4141b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.ads.mediation.customevent.a f4142c;

    /* renamed from: d, reason: collision with root package name */
    public final c70 f4143d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4140a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f4144e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f4145f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f4146g = false;

    public e70(String str, zzj zzjVar) {
        this.f4143d = new c70(str, zzjVar);
        this.f4141b = zzjVar;
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(4);
        aVar.f2372t = BigInteger.ONE;
        aVar.f2373u = "0";
        this.f4142c = aVar;
    }

    public final void a(v60 v60Var) {
        synchronized (this.f4140a) {
            this.f4144e.add(v60Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.li
    public final void zza(boolean z6) {
        long jA = zzv.zzC().a();
        c70 c70Var = this.f4143d;
        zzj zzjVar = this.f4141b;
        if (!z6) {
            zzjVar.zzr(jA);
            zzjVar.zzG(c70Var.f3449d);
            return;
        }
        if (jA - zzjVar.zzd() > ((Long) zzbe.zzc().a(zn.f11375d1)).longValue()) {
            c70Var.f3449d = -1;
        } else {
            c70Var.f3449d = zzjVar.zzc();
        }
        this.f4146g = true;
    }
}

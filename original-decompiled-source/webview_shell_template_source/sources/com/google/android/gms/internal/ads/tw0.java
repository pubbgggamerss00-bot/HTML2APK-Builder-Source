package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tw0 implements hx0 {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final kw0 f9395a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f9396b;

    /* renamed from: c, reason: collision with root package name */
    public final ec1 f9397c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f9398d;

    /* renamed from: e, reason: collision with root package name */
    public final my0 f9399e;

    /* renamed from: f, reason: collision with root package name */
    public final he1 f9400f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f9401g;

    public tw0(Context context, ec1 ec1Var, kw0 kw0Var, hs1 hs1Var, ScheduledExecutorService scheduledExecutorService, my0 my0Var, he1 he1Var) {
        this.f9401g = context;
        this.f9397c = ec1Var;
        this.f9395a = kw0Var;
        this.f9396b = hs1Var;
        this.f9398d = scheduledExecutorService;
        this.f9399e = my0Var;
        this.f9400f = he1Var;
    }

    @Override // com.google.android.gms.internal.ads.hx0
    public final c5.a a(final r30 r30Var) {
        final kw0 kw0Var = this.f9395a;
        hs1 hs1Var = kw0Var.f6513b;
        String str = r30Var.f8526v;
        zzv.zzq();
        c5.a aVarL = zzs.zzD(str) ? bs1.l(new ix0(1)) : bs1.k(kw0Var.f6512a.u(new av0(1, kw0Var, r30Var)), ExecutionException.class, new cr0(1), hs1Var);
        final int callingUid = Binder.getCallingUid();
        oq1 oq1VarK = bs1.k(aVarL, ix0.class, new pr1() { // from class: com.google.android.gms.internal.ads.jw0
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                Bundle bundle;
                r30 r30Var2 = r30Var;
                if (r30Var2 != null && (bundle = r30Var2.E) != null) {
                    bundle.putBoolean("ls", true);
                }
                kw0 kw0Var2 = kw0Var;
                return bs1.p(((yx0) kw0Var2.f6515d.zzb()).e2(r30Var2, callingUid), new sx(1, r30Var2), kw0Var2.f6513b);
            }
        }, hs1Var);
        de1 de1VarE = d0.e(this.f9401g, 11);
        ge1.a(oq1VarK, de1VarE);
        c5.a aVarP = bs1.p(oq1VarK, new sx(2, this), this.f9396b);
        if (((Boolean) zzbe.zzc().a(zn.f11508x5)).booleanValue()) {
            aVarP = bs1.k(bs1.q(aVarP, ((Integer) zzbe.zzc().a(zn.f11514y5)).intValue(), TimeUnit.SECONDS, this.f9398d), TimeoutException.class, new sw0(0), i70.f5592g);
        }
        ge1.c(aVarP, this.f9400f, de1VarE, false);
        aVarP.addListener(new as1(0, aVarP, new ej0(10, this)), i70.f5592g);
        return aVarP;
    }
}

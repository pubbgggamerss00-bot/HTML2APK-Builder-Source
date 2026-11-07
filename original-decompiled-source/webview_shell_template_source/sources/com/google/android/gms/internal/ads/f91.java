package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f4566b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4567c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4568d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4569e;

    public f91(t60 t60Var, Context context, ScheduledExecutorService scheduledExecutorService, h70 h70Var, int i6, boolean z6, boolean z7) {
        this.f4565a = context;
        this.f4566b = scheduledExecutorService;
        this.f4567c = h70Var;
        this.f4568d = z6;
        this.f4569e = z7;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        o70 o70Var = new o70();
        zzbc.zzb();
        Context context = this.f4565a;
        if (zzf.zzt(context)) {
            i70.f5586a.execute(new s60(context, o70Var));
        }
        xr1 xr1VarP = xr1.p(o70Var);
        ta1 ta1Var = new ta1(4, this);
        Executor executor = this.f4567c;
        return bs1.j((xr1) bs1.q(bs1.o(xr1VarP, ta1Var, executor), ((Long) zzbe.zzc().a(zn.f11383e1)).longValue(), TimeUnit.MILLISECONDS, this.f4566b), Throwable.class, new ua1(1, this), executor);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class es0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final zza f4373a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4374b;

    /* renamed from: c, reason: collision with root package name */
    public final cu0 f4375c;

    /* renamed from: d, reason: collision with root package name */
    public final dz0 f4376d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4377e;

    /* renamed from: f, reason: collision with root package name */
    public final mf f4378f;

    /* renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f4379g;
    public final cf1 h;

    /* renamed from: i, reason: collision with root package name */
    public final oz0 f4380i;

    /* renamed from: j, reason: collision with root package name */
    public final fc1 f4381j;

    public es0(Context context, Executor executor, mf mfVar, VersionInfoParcel versionInfoParcel, zza zzaVar, dz0 dz0Var, cf1 cf1Var, cu0 cu0Var, oz0 oz0Var, fc1 fc1Var) {
        this.f4374b = context;
        this.f4377e = executor;
        this.f4378f = mfVar;
        this.f4379g = versionInfoParcel;
        this.f4373a = zzaVar;
        this.f4376d = dz0Var;
        this.h = cf1Var;
        this.f4375c = cu0Var;
        this.f4380i = oz0Var;
        this.f4381j = fc1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        gs0 gs0Var = new gs0(this);
        synchronized (gs0Var) {
            hr1 hr1VarO = bs1.o(bs1.n(new gb0(gs0Var.f5142c, gs0Var.f5145f, gs0Var.f5146g, gs0Var.f5141b, gs0Var.f5149k, gs0Var.f5150l, (String) zzbe.zzc().a(zn.Q3)), i70.f5591f), new bs0(0, gs0Var), gs0Var.f5144e);
            gs0Var.f5151m = hr1VarO;
            y5.g(hr1VarO, "NativeJavascriptExecutor.initializeEngine");
        }
        return gs0Var;
    }
}

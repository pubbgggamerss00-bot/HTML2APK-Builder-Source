package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cu0 {

    /* renamed from: a, reason: collision with root package name */
    public final fu0 f3661a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3662b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3663c;

    public cu0(fu0 fu0Var, h70 h70Var) {
        this.f3661a = fu0Var;
        fu0Var.getClass();
        this.f3663c = new HashMap(fu0Var.f5483a);
        this.f3662b = h70Var;
    }

    public final bu0 a() {
        bu0 bu0Var = new bu0(this);
        bu0Var.f3291a.putAll(this.f3663c);
        return bu0Var;
    }

    public final void b() {
        if (((Boolean) zzbe.zzc().a(zn.wb)).booleanValue()) {
            bu0 bu0VarA = a();
            bu0VarA.a("action", "pecr");
            bu0VarA.c();
        }
    }
}

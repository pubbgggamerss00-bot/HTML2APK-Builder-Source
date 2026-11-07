package com.google.android.gms.internal.ads;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class uo implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9590t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9591u;

    public /* synthetic */ uo(int i6, int i7, Object obj) {
        this.s = i7;
        this.f9591u = obj;
        this.f9590t = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                cu0 cu0Var = ((wo) this.f9591u).f10238d;
                if (cu0Var != null) {
                    bu0 bu0VarA = cu0Var.a();
                    bu0VarA.a("action", "cct_nav");
                    bu0VarA.a("cct_navs", String.valueOf(this.f9590t));
                    bu0VarA.c();
                    break;
                }
                break;
            default:
                ((SystemForegroundService) this.f9591u).f1819w.cancel(this.f9590t);
                break;
        }
    }
}

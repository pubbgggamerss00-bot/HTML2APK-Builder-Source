package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzs;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bq0 {

    /* renamed from: a, reason: collision with root package name */
    public final ct0 f3251a;

    /* renamed from: b, reason: collision with root package name */
    public final gs0 f3252b;

    /* renamed from: c, reason: collision with root package name */
    public final sg0 f3253c;

    /* renamed from: d, reason: collision with root package name */
    public final yo0 f3254d;

    public bq0(ct0 ct0Var, gs0 gs0Var, sg0 sg0Var, yo0 yo0Var) {
        this.f3251a = ct0Var;
        this.f3252b = gs0Var;
        this.f3253c = sg0Var;
        this.f3254d = yo0Var;
    }

    public final View a() {
        xa0 xa0VarA = this.f3251a.a(zzs.zzc(), null, null);
        xa0VarA.zzF().setVisibility(8);
        xa0VarA.Z("/sendMessageToSdk", new au(1, this));
        xa0VarA.Z("/adMuted", new nu(1, this));
        WeakReference weakReference = new WeakReference(xa0VarA);
        pu puVar = new pu(1, this);
        gs0 gs0Var = this.f3252b;
        gs0Var.c("/loadHtml", new fs0(gs0Var, weakReference, "/loadHtml", puVar));
        gs0Var.c("/showOverlay", new fs0(gs0Var, new WeakReference(xa0VarA), "/showOverlay", new et(1, this)));
        gs0Var.c("/hideOverlay", new fs0(gs0Var, new WeakReference(xa0VarA), "/hideOverlay", new gt(1, this)));
        return xa0VarA.zzF();
    }
}

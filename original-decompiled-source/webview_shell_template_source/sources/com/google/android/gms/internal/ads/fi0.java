package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fi0 extends fh0 {

    /* renamed from: j, reason: collision with root package name */
    public final ps f4689j;

    /* renamed from: k, reason: collision with root package name */
    public final c11 f4690k;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f4691l;

    public fi0(si0 si0Var, ps psVar, c11 c11Var, Executor executor) {
        super(si0Var);
        this.f4689j = psVar;
        this.f4690k = c11Var;
        this.f4691l = executor;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void a() {
        this.f4691l.execute(new as1(5, this, new t(6, new AtomicReference(this.f4690k))));
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final int b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final View d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final zzeb e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final ub1 f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final ub1 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void i(FrameLayout frameLayout, zzs zzsVar) {
    }
}

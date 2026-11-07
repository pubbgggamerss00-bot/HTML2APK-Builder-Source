package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class na0 extends b80 {

    /* renamed from: u, reason: collision with root package name */
    public final q80 f7363u;

    /* renamed from: v, reason: collision with root package name */
    public xj1 f7364v;

    /* renamed from: w, reason: collision with root package name */
    public f80 f7365w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7366x;

    /* renamed from: y, reason: collision with root package name */
    public int f7367y;

    public na0(Context context, q80 q80Var) {
        super(context);
        this.f7367y = 1;
        this.f7366x = false;
        this.f7363u = q80Var;
        q80Var.a(this);
    }

    public final boolean C() {
        int i6 = this.f7367y;
        return (i6 == 1 || i6 == 2 || this.f7364v == null) ? false : true;
    }

    public final void D(int i6) {
        t80 t80Var = this.f2979t;
        q80 q80Var = this.f7363u;
        if (i6 == 4) {
            q80Var.b();
            t80Var.f9128d = true;
            t80Var.a();
        } else if (this.f7367y == 4) {
            q80Var.f8261m = false;
            t80Var.f9128d = false;
            t80Var.a();
        }
        this.f7367y = i6;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int j() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int k() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long n() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long o() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long p() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final String q() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void r() {
        zze.zza("AdImmersivePlayerView pause");
        if (C() && ((AtomicBoolean) this.f7364v.f10619t).get()) {
            ((AtomicBoolean) this.f7364v.f10619t).set(false);
            D(5);
            zzs.zza.post(new p(5, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void s() {
        zze.zza("AdImmersivePlayerView play");
        if (C()) {
            ((AtomicBoolean) this.f7364v.f10619t).set(true);
            D(4);
            this.s.f6280c = true;
            zzs.zza.post(new b(9, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void t(int i6) {
        zze.zza("AdImmersivePlayerView seek " + i6);
    }

    @Override // android.view.View
    public final String toString() {
        return androidx.activity.m.d(na0.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void u(f80 f80Var) {
        this.f7365w = f80Var;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void v(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f7364v = new xj1();
            D(3);
            zzs.zza.post(new u(4, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void w() {
        zze.zza("AdImmersivePlayerView stop");
        xj1 xj1Var = this.f7364v;
        if (xj1Var != null) {
            ((AtomicBoolean) xj1Var.f10619t).set(false);
            this.f7364v = null;
            D(1);
        }
        this.f7363u.c();
    }

    @Override // com.google.android.gms.internal.ads.s80
    public final void zzn() {
        if (this.f7364v != null) {
            this.f2979t.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void x(float f6, float f7) {
    }
}

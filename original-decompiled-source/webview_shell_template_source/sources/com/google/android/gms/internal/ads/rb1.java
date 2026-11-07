package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rb1 extends b40 {
    public final mb1 s;

    /* renamed from: t, reason: collision with root package name */
    public final hb1 f8603t;

    /* renamed from: u, reason: collision with root package name */
    public final bc1 f8604u;

    /* renamed from: v, reason: collision with root package name */
    public rs0 f8605v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8606w;

    public rb1(mb1 mb1Var, hb1 hb1Var, bc1 bc1Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f8606w = false;
        this.s = mb1Var;
        this.f8603t = hb1Var;
        this.f8604u = bc1Var;
    }

    public final synchronized void B1(k3.a aVar) {
        com.google.android.gms.common.internal.l.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f8603t.f5316t.set(null);
        if (this.f8605v != null) {
            if (aVar != null) {
                context = (Context) k3.b.i1(aVar);
            }
            dl0 dl0Var = this.f8605v.f9290c;
            dl0Var.getClass();
            dl0Var.o0(new wg1(context));
        }
    }

    public final synchronized void X(k3.a aVar) {
        com.google.android.gms.common.internal.l.d("pause must be called on the main UI thread.");
        if (this.f8605v != null) {
            Context context = aVar == null ? null : (Context) k3.b.i1(aVar);
            dl0 dl0Var = this.f8605v.f9290c;
            dl0Var.getClass();
            dl0Var.o0(new cl0(context));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(com.google.android.gms.internal.ads.zn.f11482t5)).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e2(g40 g40Var) {
        com.google.android.gms.common.internal.l.d("loadAd must be called on the main UI thread.");
        String str = g40Var.f4895t;
        String str2 = (String) zzbe.zzc().a(zn.r5);
        if (str2 != null && str != null) {
            try {
                if (!Pattern.matches(str2, str)) {
                }
            } catch (RuntimeException e6) {
                zzv.zzp().h("NonagonUtil.isPatternMatched", e6);
            }
            return;
        }
        if (g2()) {
        }
        ib1 ib1Var = new ib1(27);
        this.f8605v = null;
        mb1 mb1Var = this.s;
        mb1Var.h.f3842o.f10916a = 1;
        mb1Var.a(g40Var.s, g40Var.f4895t, ib1Var, new ej0(16, this));
    }

    public final synchronized void f2(k3.a aVar) {
        try {
            com.google.android.gms.common.internal.l.d("showAd must be called on the main UI thread.");
            if (this.f8605v != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objI1 = k3.b.i1(aVar);
                    if (objI1 instanceof Activity) {
                        activity = (Activity) objI1;
                    }
                }
                this.f8605v.b(this.f8606w, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g2() {
        rs0 rs0Var = this.f8605v;
        if (rs0Var != null) {
            if (!rs0Var.f8697p.f3602t.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized String i1() {
        mk0 mk0Var;
        rs0 rs0Var = this.f8605v;
        if (rs0Var == null || (mk0Var = rs0Var.f9293f) == null) {
            return null;
        }
        return mk0Var.s;
    }

    public final synchronized void zzk(k3.a aVar) {
        com.google.android.gms.common.internal.l.d("resume must be called on the main UI thread.");
        if (this.f8605v != null) {
            Context context = aVar == null ? null : (Context) k3.b.i1(aVar);
            dl0 dl0Var = this.f8605v.f9290c;
            dl0Var.getClass();
            dl0Var.o0(new yn(context, 1));
        }
    }

    public final synchronized void zzq() {
        f2(null);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xn0 extends ti0 {

    /* renamed from: j, reason: collision with root package name */
    public final Context f10639j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f10640k;

    /* renamed from: l, reason: collision with root package name */
    public final cn0 f10641l;

    /* renamed from: m, reason: collision with root package name */
    public final jo0 f10642m;

    /* renamed from: n, reason: collision with root package name */
    public final cj0 f10643n;

    /* renamed from: o, reason: collision with root package name */
    public final di1 f10644o;

    /* renamed from: p, reason: collision with root package name */
    public final vk0 f10645p;

    /* renamed from: q, reason: collision with root package name */
    public final e70 f10646q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10647r;

    public xn0(si0 si0Var, Context context, xa0 xa0Var, cn0 cn0Var, jo0 jo0Var, cj0 cj0Var, di1 di1Var, vk0 vk0Var, e70 e70Var) {
        super(si0Var);
        this.f10647r = false;
        this.f10639j = context;
        this.f10640k = new WeakReference(xa0Var);
        this.f10641l = cn0Var;
        this.f10642m = jo0Var;
        this.f10643n = cj0Var;
        this.f10644o = di1Var;
        this.f10645p = vk0Var;
        this.f10646q = e70Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z6, Activity activity) {
        tb1 tb1VarD;
        int i6;
        Context context = this.f10639j;
        vk0 vk0Var = this.f10645p;
        cn0 cn0Var = this.f10641l;
        cn0Var.o0(new y5(26));
        if (((Boolean) zzbe.zzc().a(zn.M0)).booleanValue()) {
            zzv.zzq();
            if (zzs.zzH(context)) {
                zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                vk0Var.zzb();
                if (((Boolean) zzbe.zzc().a(zn.N0)).booleanValue()) {
                    this.f10644o.a(((vb1) this.f9288a.f2648b.f1103u).f9774b);
                    return;
                }
                return;
            }
        }
        xa0 xa0Var = (xa0) this.f10640k.get();
        if (((Boolean) zzbe.zzc().a(zn.Lb)).booleanValue() && xa0Var != null && (tb1VarD = xa0Var.d()) != null && tb1VarD.f9204r0) {
            int i7 = tb1VarD.f9205s0;
            e70 e70Var = this.f10646q;
            synchronized (e70Var.f4140a) {
                c70 c70Var = e70Var.f4143d;
                synchronized (c70Var.f3451f) {
                    i6 = c70Var.f3455k;
                }
            }
            if (i7 != i6) {
                zzo.zzj("The interstitial consent form has been shown.");
                vk0Var.c(tc1.d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f10647r) {
            zzo.zzj("The interstitial ad has been shown.");
            vk0Var.c(tc1.d(10, null, null));
        }
        if (this.f10647r) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            this.f10642m.c(z6, activity, vk0Var);
            cn0Var.o0(new bq(23, (byte) 0));
            this.f10647r = true;
        } catch (io0 e6) {
            vk0Var.v(e6);
        }
    }

    public final void finalize() throws Throwable {
        try {
            xa0 xa0Var = (xa0) this.f10640k.get();
            if (((Boolean) zzbe.zzc().a(zn.A6)).booleanValue()) {
                if (!this.f10647r && xa0Var != null) {
                    i70.f5591f.execute(new yh(8, xa0Var));
                }
            } else if (xa0Var != null) {
                xa0Var.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}

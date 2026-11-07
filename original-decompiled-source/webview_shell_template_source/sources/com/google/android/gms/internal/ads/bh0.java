package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bh0 extends ti0 {

    /* renamed from: j, reason: collision with root package name */
    public final xa0 f3172j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3173k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f3174l;

    /* renamed from: m, reason: collision with root package name */
    public final j00 f3175m;

    /* renamed from: n, reason: collision with root package name */
    public final jo0 f3176n;

    /* renamed from: o, reason: collision with root package name */
    public final cn0 f3177o;

    /* renamed from: p, reason: collision with root package name */
    public final vk0 f3178p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3179q;

    /* renamed from: r, reason: collision with root package name */
    public final e70 f3180r;
    public boolean s;

    public bh0(si0 si0Var, Context context, xa0 xa0Var, int i6, j00 j00Var, jo0 jo0Var, cn0 cn0Var, vk0 vk0Var, e70 e70Var) {
        super(si0Var);
        this.s = false;
        this.f3172j = xa0Var;
        this.f3174l = context;
        this.f3173k = i6;
        this.f3175m = j00Var;
        this.f3176n = jo0Var;
        this.f3177o = cn0Var;
        this.f3178p = vk0Var;
        this.f3179q = ((Boolean) zzbe.zzc().a(zn.f11465q5)).booleanValue();
        this.f3180r = e70Var;
    }

    public final void b() {
        dl0 dl0Var = this.f9290c;
        dl0Var.getClass();
        dl0Var.o0(new wg1(null));
        xa0 xa0Var = this.f3172j;
        if (xa0Var != null) {
            xa0Var.destroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.content.Context] */
    public final void c(boolean z6, Activity activity) {
        xa0 xa0Var;
        tb1 tb1VarD;
        int i6;
        cn0 cn0Var = this.f3177o;
        boolean z7 = this.f3179q;
        vk0 vk0Var = this.f3178p;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f3174l;
        }
        if (z7) {
            cn0Var.o0(new y5(26));
        }
        if (((Boolean) zzbe.zzc().a(zn.M0)).booleanValue()) {
            zzv.zzq();
            if (zzs.zzH(activity2)) {
                zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                vk0Var.zzb();
                if (((Boolean) zzbe.zzc().a(zn.N0)).booleanValue()) {
                    new di1(activity2.getApplicationContext(), zzv.zzu().zzb()).a(((vb1) this.f9288a.f2648b.f1103u).f9774b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) zzbe.zzc().a(zn.Lb)).booleanValue() && (xa0Var = this.f3172j) != null && (tb1VarD = xa0Var.d()) != null && tb1VarD.f9204r0) {
            int i7 = tb1VarD.f9205s0;
            e70 e70Var = this.f3180r;
            synchronized (e70Var.f4140a) {
                c70 c70Var = e70Var.f4143d;
                synchronized (c70Var.f3451f) {
                    i6 = c70Var.f3455k;
                }
            }
            if (i7 != i6) {
                zzo.zzj("The app open consent form has been shown.");
                vk0Var.c(tc1.d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.s) {
            zzo.zzj("App open interstitial ad is already visible.");
            vk0Var.c(tc1.d(10, null, null));
        }
        if (this.s) {
            return;
        }
        try {
            this.f3176n.c(z6, activity2, vk0Var);
            if (z7) {
                cn0Var.o0(new bq(23, (byte) 0));
            }
            this.s = true;
        } catch (io0 e6) {
            vk0Var.v(e6);
        }
    }

    public final void d(int i6, long j6) {
        j00 j00Var = this.f3175m;
        bu0 bu0VarA = ((cu0) j00Var.f5891t).a();
        bu0VarA.a("gqi", ((vb1) ((ac1) j00Var.f5892u).f2648b.f1103u).f9774b);
        bu0VarA.a("action", "ad_closed");
        bu0VarA.a("show_time", String.valueOf(j6));
        bu0VarA.a("ad_format", "app_open_ad");
        int i7 = i6 - 1;
        bu0VarA.a("acr", i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        bu0VarA.c();
    }
}

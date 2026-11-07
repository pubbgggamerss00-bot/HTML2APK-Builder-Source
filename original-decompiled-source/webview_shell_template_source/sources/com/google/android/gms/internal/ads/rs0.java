package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rs0 extends ti0 {

    /* renamed from: j, reason: collision with root package name */
    public final Context f8691j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f8692k;

    /* renamed from: l, reason: collision with root package name */
    public final jo0 f8693l;

    /* renamed from: m, reason: collision with root package name */
    public final cn0 f8694m;

    /* renamed from: n, reason: collision with root package name */
    public final vk0 f8695n;

    /* renamed from: o, reason: collision with root package name */
    public final ml0 f8696o;

    /* renamed from: p, reason: collision with root package name */
    public final cj0 f8697p;

    /* renamed from: q, reason: collision with root package name */
    public final h50 f8698q;

    /* renamed from: r, reason: collision with root package name */
    public final di1 f8699r;
    public final cc1 s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8700t;

    public rs0(si0 si0Var, Context context, xa0 xa0Var, jo0 jo0Var, cn0 cn0Var, vk0 vk0Var, ml0 ml0Var, cj0 cj0Var, tb1 tb1Var, di1 di1Var, cc1 cc1Var) {
        super(si0Var);
        this.f8700t = false;
        this.f8691j = context;
        this.f8693l = jo0Var;
        this.f8692k = new WeakReference(xa0Var);
        this.f8694m = cn0Var;
        this.f8695n = vk0Var;
        this.f8696o = ml0Var;
        this.f8697p = cj0Var;
        this.f8699r = di1Var;
        l40 l40Var = tb1Var.f9192l;
        this.f8698q = new h50(l40Var != null ? l40Var.s : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, l40Var != null ? l40Var.f6572t : 1);
        this.s = cc1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z6, Activity activity) {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.M0)).booleanValue();
        Context context = this.f8691j;
        vk0 vk0Var = this.f8695n;
        if (zBooleanValue) {
            zzv.zzq();
            if (zzs.zzH(context)) {
                zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                vk0Var.zzb();
                if (((Boolean) zzbe.zzc().a(zn.N0)).booleanValue()) {
                    this.f8699r.a(((vb1) this.f9288a.f2648b.f1103u).f9774b);
                    return;
                }
                return;
            }
        }
        if (this.f8700t) {
            zzo.zzj("The rewarded ad have been showed.");
            vk0Var.c(tc1.d(10, null, null));
            return;
        }
        this.f8700t = true;
        y5 y5Var = new y5(26);
        cn0 cn0Var = this.f8694m;
        cn0Var.o0(y5Var);
        if (activity == null) {
            activity = context;
        }
        try {
            this.f8693l.c(z6, activity, vk0Var);
            cn0Var.o0(new bq(23, (byte) 0));
        } catch (io0 e6) {
            vk0Var.v(e6);
        }
    }

    public final void finalize() throws Throwable {
        try {
            xa0 xa0Var = (xa0) this.f8692k.get();
            if (((Boolean) zzbe.zzc().a(zn.A6)).booleanValue()) {
                if (!this.f8700t && xa0Var != null) {
                    i70.f5591f.execute(new iq0(xa0Var, 1));
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

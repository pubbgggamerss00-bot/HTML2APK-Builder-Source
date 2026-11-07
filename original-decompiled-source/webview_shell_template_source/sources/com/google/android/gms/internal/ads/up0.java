package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class up0 {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f9594k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final zzg f9595a;

    /* renamed from: b, reason: collision with root package name */
    public final ec1 f9596b;

    /* renamed from: c, reason: collision with root package name */
    public final mp0 f9597c;

    /* renamed from: d, reason: collision with root package name */
    public final jp0 f9598d;

    /* renamed from: e, reason: collision with root package name */
    public final bq0 f9599e;

    /* renamed from: f, reason: collision with root package name */
    public final gq0 f9600f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f9601g;
    public final Executor h;

    /* renamed from: i, reason: collision with root package name */
    public final oq f9602i;

    /* renamed from: j, reason: collision with root package name */
    public final hp0 f9603j;

    public up0(zzj zzjVar, ec1 ec1Var, mp0 mp0Var, jp0 jp0Var, bq0 bq0Var, gq0 gq0Var, Executor executor, h70 h70Var, hp0 hp0Var) {
        this.f9595a = zzjVar;
        this.f9596b = ec1Var;
        this.f9602i = ec1Var.f4213i;
        this.f9597c = mp0Var;
        this.f9598d = jp0Var;
        this.f9599e = bq0Var;
        this.f9600f = gq0Var;
        this.f9601g = executor;
        this.h = h70Var;
        this.f9603j = hp0Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i6) {
        if (i6 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i6 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i6 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(hq0 hq0Var) {
        if (hq0Var == null) {
            return;
        }
        Context context = hq0Var.zzf().getContext();
        if (zzbv.zzh(context, this.f9597c.f7202a)) {
            if (!(context instanceof Activity)) {
                zzo.zze("Activity context is needed for policy validator.");
                return;
            }
            gq0 gq0Var = this.f9600f;
            if (gq0Var == null || hq0Var.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(gq0Var.a(hq0Var.zzh(), windowManager), zzbv.zzb());
            } catch (hb0 e6) {
                zze.zzb("web view can not be obtained", e6);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z6) {
        View view;
        if (z6) {
            jp0 jp0Var = this.f9598d;
            synchronized (jp0Var) {
                view = jp0Var.f6136o;
            }
        } else {
            jp0 jp0Var2 = this.f9598d;
            synchronized (jp0Var2) {
                view = jp0Var2.f6137p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) zzbe.zzc().a(zn.V3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Collections;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w00 extends ni0 {
    public int A;
    public int B;
    public int C;
    public final Object D;
    public final xa0 E;
    public final Activity F;
    public cc0 G;
    public ImageView H;
    public LinearLayout I;
    public final xj1 J;
    public PopupWindow K;
    public RelativeLayout L;
    public ViewGroup M;

    /* renamed from: v, reason: collision with root package name */
    public String f9999v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10000w;

    /* renamed from: x, reason: collision with root package name */
    public int f10001x;

    /* renamed from: y, reason: collision with root package name */
    public int f10002y;

    /* renamed from: z, reason: collision with root package name */
    public int f10003z;

    static {
        w.b bVar = new w.b(7);
        Collections.addAll(bVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(bVar);
    }

    public w00(xa0 xa0Var, xj1 xj1Var) {
        super(5, xa0Var, "resize");
        this.f9999v = "top-right";
        this.f10000w = true;
        this.f10001x = 0;
        this.f10002y = 0;
        this.f10003z = -1;
        this.A = 0;
        this.B = 0;
        this.C = -1;
        this.D = new Object();
        this.E = xa0Var;
        this.F = xa0Var.zzi();
        this.J = xj1Var;
    }

    public final void q(final boolean z6) {
        synchronized (this.D) {
            try {
                if (this.K != null) {
                    if (!((Boolean) zzbe.zzc().a(zn.Ha)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        r(z6);
                    } else {
                        i70.f5591f.w(new Runnable() { // from class: com.google.android.gms.internal.ads.u00
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                this.s.r(z6);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(boolean z6) throws JSONException {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Ia)).booleanValue();
        xa0 xa0Var = this.E;
        if (zBooleanValue) {
            this.L.removeView((View) xa0Var);
            this.K.dismiss();
        } else {
            this.K.dismiss();
            this.L.removeView((View) xa0Var);
        }
        if (((Boolean) zzbe.zzc().a(zn.Ja)).booleanValue()) {
            View view = (View) xa0Var;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            viewGroup.removeView(this.H);
            if (((Boolean) zzbe.zzc().a(zn.Ka)).booleanValue()) {
                try {
                    this.M.addView((View) xa0Var);
                    xa0Var.h0(this.G);
                } catch (IllegalStateException e6) {
                    zzo.zzh("Unable to add webview back to view hierarchy.", e6);
                }
            } else {
                this.M.addView((View) xa0Var);
                xa0Var.h0(this.G);
            }
        }
        if (z6) {
            p("default");
            xj1 xj1Var = this.J;
            if (xj1Var != null) {
                ((bt0) xj1Var.f10619t).f3272c.o0(new y5(22));
            }
        }
        this.K = null;
        this.L = null;
        this.M = null;
        this.I = null;
    }
}

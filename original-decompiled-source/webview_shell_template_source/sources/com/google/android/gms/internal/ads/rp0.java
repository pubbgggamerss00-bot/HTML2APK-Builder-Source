package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rp0 extends ir implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, hq0 {
    public final WeakReference s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f8684t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f8685u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f8686v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public fp0 f8687w;

    /* renamed from: x, reason: collision with root package name */
    public final ci f8688x;

    public rp0(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzv.zzy();
        u70 u70Var = new u70(view, this);
        View view2 = (View) ((WeakReference) u70Var.s).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            u70Var.A(viewTreeObserver3);
        }
        zzv.zzy();
        v70 v70Var = new v70(view, this);
        View view3 = (View) ((WeakReference) v70Var.s).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            v70Var.A(viewTreeObserver2);
        }
        this.s = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f8684t.put(str, new WeakReference(view4));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f8686v.putAll(this.f8684t);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f8685u.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f8686v.putAll(this.f8685u);
        this.f8688x = new ci(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized void n(String str, View view) {
        this.f8686v.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f8684t.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        fp0 fp0Var = this.f8687w;
        if (fp0Var != null) {
            fp0Var.c(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        fp0 fp0Var = this.f8687w;
        if (fp0Var != null) {
            fp0Var.b(zzf(), zzl(), zzm(), fp0.h(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        fp0 fp0Var = this.f8687w;
        if (fp0Var != null) {
            fp0Var.b(zzf(), zzl(), zzm(), fp0.h(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        fp0 fp0Var = this.f8687w;
        if (fp0Var != null) {
            View viewZzf = zzf();
            synchronized (fp0Var) {
                fp0Var.f4750l.o(motionEvent, viewZzf);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jr
    public final synchronized void zzb(k3.a aVar) {
        try {
            if (this.f8687w != null) {
                Object objI1 = k3.b.i1(aVar);
                if (!(objI1 instanceof View)) {
                    zzo.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                fp0 fp0Var = this.f8687w;
                View view = (View) objI1;
                synchronized (fp0Var) {
                    fp0Var.f4750l.b(view);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.jr
    public final synchronized void zzc(k3.a aVar) {
        Object objI1 = k3.b.i1(aVar);
        if (!(objI1 instanceof fp0)) {
            zzo.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        fp0 fp0Var = this.f8687w;
        if (fp0Var != null) {
            fp0Var.g(this);
        }
        fp0 fp0Var2 = (fp0) objI1;
        if (!fp0Var2.f4752n.d()) {
            zzo.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f8687w = fp0Var2;
        fp0Var2.f(this);
        this.f8687w.e(zzf());
    }

    @Override // com.google.android.gms.internal.ads.jr
    public final synchronized void zzd() {
        fp0 fp0Var = this.f8687w;
        if (fp0Var != null) {
            fp0Var.g(this);
            this.f8687w = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final View zzf() {
        return (View) this.s.get();
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.f8686v.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final ci zzi() {
        return this.f8688x;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized k3.a zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized Map zzl() {
        return this.f8686v;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized Map zzm() {
        return this.f8684t;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized Map zzn() {
        return this.f8685u;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized JSONObject zzp() {
        JSONObject jSONObjectR;
        fp0 fp0Var = this.f8687w;
        if (fp0Var == null) {
            return null;
        }
        View viewZzf = zzf();
        Map mapZzl = zzl();
        Map mapZzm = zzm();
        synchronized (fp0Var) {
            jSONObjectR = fp0Var.f4750l.r(viewZzf, mapZzl, mapZzm, fp0Var.j());
        }
        return jSONObjectR;
    }
}

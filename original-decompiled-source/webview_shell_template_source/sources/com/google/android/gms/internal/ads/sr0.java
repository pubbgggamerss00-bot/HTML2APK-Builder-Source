package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sr0 extends ew implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public View s;

    /* renamed from: t, reason: collision with root package name */
    public zzeb f8994t;

    /* renamed from: u, reason: collision with root package name */
    public fp0 f8995u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8996v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8997w;

    public final void e2() {
        View view;
        fp0 fp0Var = this.f8995u;
        if (fp0Var == null || (view = this.s) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        fp0Var.b(view, map, map, fp0.h(view));
    }

    public final void f2() {
        View view = this.s;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.s);
        }
    }

    public final void i1(k3.a aVar, hw hwVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
        if (this.f8996v) {
            zzo.zzg("Instream ad can not be shown after destroy().");
            try {
                hwVar.zze(2);
                return;
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
                return;
            }
        }
        View view = this.s;
        if (view == null || this.f8994t == null) {
            zzo.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                hwVar.zze(0);
                return;
            } catch (RemoteException e7) {
                zzo.zzl("#007 Could not call remote method.", e7);
                return;
            }
        }
        if (this.f8997w) {
            zzo.zzg("Instream ad should not be used again.");
            try {
                hwVar.zze(1);
                return;
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
                return;
            }
        }
        this.f8997w = true;
        f2();
        ((ViewGroup) k3.b.i1(aVar)).addView(this.s, new ViewGroup.LayoutParams(-1, -1));
        zzv.zzy();
        u70 u70Var = new u70(this.s, this);
        View view2 = (View) ((WeakReference) u70Var.s).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            u70Var.A(viewTreeObserver);
        }
        zzv.zzy();
        v70 v70Var = new v70(this.s, this);
        View view3 = (View) ((WeakReference) v70Var.s).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            v70Var.A(viewTreeObserver3);
        }
        e2();
        try {
            hwVar.zzf();
        } catch (RemoteException e9) {
            zzo.zzl("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e2();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e2();
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ci implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long G = ((Long) zzbe.zzc().a(zn.f11491v1)).longValue();
    public final zzbx A = new zzbx(G);
    public boolean B = false;
    public int C = -1;
    public final HashSet D = new HashSet();
    public final DisplayMetrics E;
    public final Rect F;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final Application f3580t;

    /* renamed from: u, reason: collision with root package name */
    public final PowerManager f3581u;

    /* renamed from: v, reason: collision with root package name */
    public final KeyguardManager f3582v;

    /* renamed from: w, reason: collision with root package name */
    public zh f3583w;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference f3584x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakReference f3585y;

    /* renamed from: z, reason: collision with root package name */
    public final fi f3586z;

    public ci(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.s = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f3581u = (PowerManager) applicationContext.getSystemService("power");
        this.f3582v = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f3580t = application;
            this.f3586z = new fi(application, this);
        }
        this.E = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.F = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f3585y;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f3585y = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f6 = rect.left;
        float f7 = this.E.density;
        return new Rect((int) (f6 / f7), (int) (rect.top / f7), (int) (rect.right / f7), (int) (rect.bottom / f7));
    }

    public final void b(Activity activity, int i6) {
        Window window;
        WeakReference weakReference = this.f3585y;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.C = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        r4 = 1;
        r14 = true;
        r15 = true;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i6) {
        WeakReference weakReference;
        int i7;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        View view;
        ?? arrayList;
        int i8;
        PowerManager powerManager;
        HashSet hashSet;
        boolean z6;
        HashSet hashSet2 = this.D;
        if (hashSet2.isEmpty() || (weakReference = this.f3585y) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
                i7 = 0;
            } catch (Exception e6) {
                i7 = 0;
                zzo.zzh("Failure getting view location.", e6);
            }
            if (((Boolean) zzbe.zzc().a(zn.U4)).booleanValue()) {
                rect.left = iArr2[i7];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[i7];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            i7 = 0;
            globalVisibleRect = false;
            localVisibleRect = false;
            view = null;
        }
        if (!((Boolean) zzbe.zzc().a(zn.f11511y1)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(a(rect5));
                    }
                }
            } catch (Exception e7) {
                zzv.zzp().h("PositionWatcher.getParentScrollViewRects", e7);
                arrayList = Collections.EMPTY_LIST;
            }
        }
        List list = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i9 = this.C;
        if (i9 != -1) {
            windowVisibility = i9;
        }
        zzv.zzq();
        long jZzx = zzs.zzx(view);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.ua)).booleanValue();
        KeyguardManager keyguardManager = this.f3582v;
        PowerManager powerManager2 = this.f3581u;
        if (zBooleanValue) {
            if (view2 != null) {
                zzv.zzq();
                if (zzs.zzS(view, powerManager2, keyguardManager)) {
                    if (globalVisibleRect) {
                        if (localVisibleRect) {
                            if (jZzx >= ((Integer) zzbe.zzc().a(zn.xa)).intValue()) {
                            }
                            globalVisibleRect = true;
                            localVisibleRect = true;
                        }
                        globalVisibleRect = true;
                        i8 = i7;
                        localVisibleRect = i8;
                    }
                    i8 = i7;
                    globalVisibleRect = i8;
                }
            }
            i8 = i7;
        } else {
            if (view2 != null) {
                zzv.zzq();
                if (zzs.zzS(view, powerManager2, keyguardManager)) {
                    if (globalVisibleRect) {
                        if (localVisibleRect) {
                        }
                        globalVisibleRect = true;
                        i8 = i7;
                        localVisibleRect = i8;
                    }
                    i8 = i7;
                    globalVisibleRect = i8;
                }
            }
            i8 = i7;
        }
        if (((Boolean) zzbe.zzc().a(zn.za)).booleanValue()) {
            zzv.zzq();
            int i10 = true != zzs.zzS(view, powerManager2, keyguardManager) ? i7 : 64;
            int i11 = true != globalVisibleRect ? i7 : 8;
            int i12 = true != localVisibleRect ? i7 : 16;
            powerManager = powerManager2;
            hashSet = hashSet2;
            int i13 = windowVisibility == 0 ? 128 : i7;
            int i14 = i10;
            int i15 = jZzx >= ((long) ((Integer) zzbe.zzc().a(zn.xa)).intValue()) ? 32 : i7;
            zzv.zzq();
            zzs.zzK(view, i15 | i14 | i11 | i12 | i13 | i8, null);
        } else {
            powerManager = powerManager2;
            hashSet = hashSet2;
        }
        if (i6 == 1 && !this.A.zzb() && i8 == this.B) {
            return;
        }
        if (i8 != 0 || this.B) {
            z6 = true;
        } else {
            z6 = true;
            if (i6 == 1) {
                return;
            }
        }
        zzv.zzC().b();
        powerManager.isScreenOn();
        ?? r18 = (view == null || !view.isAttachedToWindow()) ? i7 : z6;
        int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
        Rect rectA = a(this.F);
        Rect rectA2 = a(rect);
        Rect rectA3 = a(rect2);
        Rect rectA4 = a(rect3);
        Rect rectA5 = a(rect4);
        float f6 = this.E.density;
        ?? r27 = i8;
        ai aiVar = new ai(r18, windowVisibility2, rectA, rectA2, rectA3, globalVisibleRect, rectA4, localVisibleRect, rectA5, r27, list);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bi) it.next()).C(aiVar);
        }
        this.B = r27;
    }

    public final void d() {
        zzs.zza.post(new yh(0, this));
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f3584x = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f3583w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f3583w = new zh(this);
            zzv.zzw().zzc(this.s, this.f3583w, intentFilter);
        }
        Application application = this.f3580t;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f3586z);
            } catch (Exception e6) {
                zzo.zzh("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f3584x;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f3584x = null;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e6);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e7) {
            zzo.zzh("Error while unregistering listeners from the ViewTreeObserver.", e7);
        }
        if (this.f3583w != null) {
            try {
                zzv.zzw().zzd(this.s, this.f3583w);
            } catch (IllegalStateException e8) {
                zzo.zzh("Failed trying to unregister the receiver", e8);
            } catch (Exception e9) {
                zzv.zzp().h("ActiveViewUnit.stopScreenStatusMonitoring", e9);
            }
            this.f3583w = null;
        }
        Application application = this.f3580t;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f3586z);
            } catch (Exception e10) {
                zzo.zzh("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(3);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c(2);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C = -1;
        e(view);
        c(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = -1;
        c(3);
        d();
        f(view);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler E = new Handler(Looper.getMainLooper());
    public final vf A;
    public byte B = -1;
    public int C = -1;
    public long D = -3;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final Application f6053t;

    /* renamed from: u, reason: collision with root package name */
    public final PowerManager f6054u;

    /* renamed from: v, reason: collision with root package name */
    public final KeyguardManager f6055v;

    /* renamed from: w, reason: collision with root package name */
    public ig f6056w;

    /* renamed from: x, reason: collision with root package name */
    public final zzavw f6057x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f6058y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f6059z;

    public jg(Context context, zzavw zzavwVar) {
        Context applicationContext = context.getApplicationContext();
        this.s = applicationContext;
        this.f6057x = zzavwVar;
        this.f6054u = (PowerManager) applicationContext.getSystemService("power");
        this.f6055v = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f6053t = application;
            this.A = new vf(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j6;
        WeakReference weakReference = this.f6059z;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f6059z = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j6 = -2;
        } else {
            j6 = -3;
        }
        this.D = j6;
    }

    public final void b(Activity activity, int i6) {
        Window window;
        if (this.f6059z == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f6059z;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.C = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.f6059z;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.D = -3L;
            this.B = (byte) -1;
            return;
        }
        int i6 = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i6 |= 2;
        }
        PowerManager powerManager = this.f6054u;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i6 |= 4;
        }
        if (!this.f6057x.f11612a) {
            KeyguardManager keyguardManager = this.f6055v;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i6 |= 8;
            } else {
                char[] cArr = gg.f5032a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                for (int i7 = 0; (context instanceof ContextWrapper) && i7 < 10; i7++) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                activity = null;
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                    }
                }
            }
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            i6 |= 16;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            i6 |= 32;
        }
        int windowVisibility = view.getWindowVisibility();
        int i8 = this.C;
        if (i8 != -1) {
            windowVisibility = i8;
        }
        if (windowVisibility != 0) {
            i6 |= 64;
        }
        if (this.B != i6) {
            this.B = (byte) i6;
            this.D = i6 == 0 ? SystemClock.elapsedRealtime() : (-3) - i6;
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f6058y = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f6056w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ig igVar = new ig(this);
            this.f6056w = igVar;
            this.s.registerReceiver(igVar, intentFilter);
        }
        Application application = this.f6053t;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.A);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f6058y;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f6058y = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        ig igVar = this.f6056w;
        if (igVar != null) {
            try {
                this.s.unregisterReceiver(igVar);
            } catch (Exception unused3) {
            }
            this.f6056w = null;
        }
        Application application = this.f6053t;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.A);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        E.post(new u(1, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = -1;
        c();
        E.post(new u(1, this));
        e(view);
    }
}

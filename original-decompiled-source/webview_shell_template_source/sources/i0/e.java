package i0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f13292a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f13293b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f13294c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f13295d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f13296e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f13297f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f13298g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f13292a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f13293b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f13294c = declaredField2;
        Class<?> cls2 = f13292a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f13295d = declaredMethod;
        Class<?> cls4 = f13292a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f13296e = declaredMethod2;
        Class<?> cls5 = f13292a;
        int i6 = Build.VERSION.SDK_INT;
        if ((i6 == 26 || i6 == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f13297f = method;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public Object s;

        /* renamed from: t, reason: collision with root package name */
        public Activity f13299t;

        /* renamed from: u, reason: collision with root package name */
        public final int f13300u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f13301v = false;

        /* renamed from: w, reason: collision with root package name */
        public boolean f13302w = false;

        /* renamed from: x, reason: collision with root package name */
        public boolean f13303x = false;

        public a(Activity activity) {
            this.f13299t = activity;
            this.f13300u = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f13299t == activity) {
                this.f13299t = null;
                this.f13302w = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f13302w || this.f13303x || this.f13301v) {
                return;
            }
            Object obj = this.s;
            try {
                Object obj2 = e.f13294c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f13300u) {
                    e.f13298g.postAtFrontOfQueue(new d(0, e.f13293b.get(activity), obj2));
                    this.f13303x = true;
                    this.s = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f13299t == activity) {
                this.f13301v = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}

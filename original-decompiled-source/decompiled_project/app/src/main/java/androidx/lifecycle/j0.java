package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.e0;
import androidx.lifecycle.l;

/* loaded from: classes.dex */
public class j0 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2313b = 0;

    /* renamed from: a, reason: collision with root package name */
    public e0.b f2314a;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(Activity activity, l.a event) {
            kotlin.jvm.internal.r.e(event, "event");
            if (activity instanceof w) {
                ((w) activity).getLifecycle().f(event);
            } else if (activity instanceof t) {
                l lifecycle = ((t) activity).getLifecycle();
                if (lifecycle instanceof v) {
                    ((v) lifecycle).f(event);
                }
            }
        }

        public static void b(Activity activity) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new b());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new j0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.r.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            a.a(activity, l.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            a.a(activity, l.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            a.a(activity, l.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            a.a(activity, l.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            a.a(activity, l.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            int i10 = j0.f2313b;
            a.a(activity, l.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.r.e(activity, "activity");
            kotlin.jvm.internal.r.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
        }
    }

    public final void a(l.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.r.d(activity, "getActivity(...)");
            a.a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(l.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(l.a.ON_DESTROY);
        this.f2314a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(l.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        e0.b bVar = this.f2314a;
        if (bVar != null) {
            e0.this.a();
        }
        a(l.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        e0.b bVar = this.f2314a;
        if (bVar != null) {
            e0 e0Var = e0.this;
            int i10 = e0Var.f2261a + 1;
            e0Var.f2261a = i10;
            if (i10 == 1 && e0Var.f2264d) {
                e0Var.f2266f.f(l.a.ON_START);
                e0Var.f2264d = false;
            }
        }
        a(l.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(l.a.ON_STOP);
    }
}

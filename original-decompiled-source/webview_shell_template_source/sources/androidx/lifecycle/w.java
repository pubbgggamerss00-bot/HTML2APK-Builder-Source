package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.u;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class w extends Fragment {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f1337t = 0;
    public u.b s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(Activity activity, h.a aVar) {
            kotlin.jvm.internal.j.e("event", aVar);
            if (activity instanceof o) {
                ((o) activity).getLifecycle().f(aVar);
            } else if (activity instanceof m) {
                h lifecycle = ((m) activity).getLifecycle();
                if (lifecycle instanceof n) {
                    ((n) lifecycle).f(aVar);
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
                fragmentManager.beginTransaction().add(new w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.j.e("activity", activity);
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e("activity", activity);
            int i6 = w.f1337t;
            a.a(activity, h.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            int i6 = w.f1337t;
            a.a(activity, h.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            int i6 = w.f1337t;
            a.a(activity, h.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            int i6 = w.f1337t;
            a.a(activity, h.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            int i6 = w.f1337t;
            a.a(activity, h.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            int i6 = w.f1337t;
            a.a(activity, h.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e("activity", activity);
            kotlin.jvm.internal.j.e("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
        }
    }

    public final void a(h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.j.d("activity", activity);
            a.a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(h.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(h.a.ON_DESTROY);
        this.s = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(h.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        u.b bVar = this.s;
        if (bVar != null) {
            u.this.a();
        }
        a(h.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        u.b bVar = this.s;
        if (bVar != null) {
            u uVar = u.this;
            int i6 = uVar.s + 1;
            uVar.s = i6;
            if (i6 == 1 && uVar.f1331v) {
                uVar.f1333x.f(h.a.ON_START);
                uVar.f1331v = false;
            }
        }
        a(h.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(h.a.ON_STOP);
    }
}

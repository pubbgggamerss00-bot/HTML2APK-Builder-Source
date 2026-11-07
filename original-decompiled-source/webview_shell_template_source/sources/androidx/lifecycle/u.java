package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u implements m {
    public static final u A = new u();
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f1329t;

    /* renamed from: w, reason: collision with root package name */
    public Handler f1332w;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1330u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1331v = true;

    /* renamed from: x, reason: collision with root package name */
    public final n f1333x = new n(this);

    /* renamed from: y, reason: collision with root package name */
    public final androidx.camera.core.y f1334y = new androidx.camera.core.y(4, this);

    /* renamed from: z, reason: collision with root package name */
    public final b f1335z = new b();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            kotlin.jvm.internal.j.e("activity", activity);
            kotlin.jvm.internal.j.e("callback", activityLifecycleCallbacks);
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i6 = this.f1329t + 1;
        this.f1329t = i6;
        if (i6 == 1) {
            if (this.f1330u) {
                this.f1333x.f(h.a.ON_RESUME);
                this.f1330u = false;
            } else {
                Handler handler = this.f1332w;
                kotlin.jvm.internal.j.b(handler);
                handler.removeCallbacks(this.f1334y);
            }
        }
    }

    @Override // androidx.lifecycle.m
    public final h getLifecycle() {
        return this.f1333x;
    }
}

package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;
import androidx.lifecycle.f0;
import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class e0 implements t {

    /* renamed from: j, reason: collision with root package name */
    public static final e0 f2260j = new e0();

    /* renamed from: a, reason: collision with root package name */
    public int f2261a;

    /* renamed from: b, reason: collision with root package name */
    public int f2262b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f2265e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2263c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2264d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f2266f = new v(this);

    /* renamed from: g, reason: collision with root package name */
    public final d0 f2267g = new Runnable() { // from class: androidx.lifecycle.d0
        @Override // java.lang.Runnable
        public final void run() {
            e0 e0Var = this.f2259a;
            v vVar = e0Var.f2266f;
            if (e0Var.f2262b == 0) {
                e0Var.f2263c = true;
                vVar.f(l.a.ON_PAUSE);
            }
            if (e0Var.f2261a == 0 && e0Var.f2263c) {
                vVar.f(l.a.ON_STOP);
                e0Var.f2264d = true;
            }
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public final b f2268h = new b();

    public static final class a {
        public static final void a(Activity activity, f0.a aVar) {
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i10 = this.f2262b + 1;
        this.f2262b = i10;
        if (i10 == 1) {
            if (this.f2263c) {
                this.f2266f.f(l.a.ON_RESUME);
                this.f2263c = false;
            } else {
                Handler handler = this.f2265e;
                kotlin.jvm.internal.r.b(handler);
                handler.removeCallbacks(this.f2267g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final l getLifecycle() {
        return this.f2266f;
    }
}

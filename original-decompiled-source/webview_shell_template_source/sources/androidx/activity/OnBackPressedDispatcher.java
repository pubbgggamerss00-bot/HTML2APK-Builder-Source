package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f43a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.h<f0> f44b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f45c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f46d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f47e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49g;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.k, androidx.activity.c {
        public final androidx.lifecycle.h s;

        /* renamed from: t, reason: collision with root package name */
        public final f0 f50t;

        /* renamed from: u, reason: collision with root package name */
        public c f51u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f52v;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.h hVar, f0 f0Var) {
            kotlin.jvm.internal.j.e("onBackPressedCallback", f0Var);
            this.f52v = onBackPressedDispatcher;
            this.s = hVar;
            this.f50t = f0Var;
            hVar.a(this);
        }

        @Override // androidx.lifecycle.k
        public final void a(androidx.lifecycle.m mVar, h.a aVar) {
            if (aVar != h.a.ON_START) {
                if (aVar != h.a.ON_STOP) {
                    if (aVar == h.a.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    c cVar = this.f51u;
                    if (cVar != null) {
                        cVar.cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f52v;
            onBackPressedDispatcher.getClass();
            f0 f0Var = this.f50t;
            kotlin.jvm.internal.j.e("onBackPressedCallback", f0Var);
            onBackPressedDispatcher.f44b.addLast(f0Var);
            c cVar2 = new c(onBackPressedDispatcher, f0Var);
            f0Var.f64b.add(cVar2);
            onBackPressedDispatcher.e();
            f0Var.f65c = new n0(0, onBackPressedDispatcher, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            this.f51u = cVar2;
        }

        @Override // androidx.activity.c
        public final void cancel() {
            this.s.c(this);
            this.f50t.f64b.remove(this);
            c cVar = this.f51u;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f51u = null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static void a(Object obj, Object obj2) {
            kotlin.jvm.internal.j.e("dispatcher", obj);
            kotlin.jvm.internal.j.e("callback", obj2);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
        }

        public static void b(Object obj, Object obj2) {
            kotlin.jvm.internal.j.e("dispatcher", obj);
            kotlin.jvm.internal.j.e("callback", obj2);
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class c implements androidx.activity.c {
        public final f0 s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f53t;

        public c(OnBackPressedDispatcher onBackPressedDispatcher, f0 f0Var) {
            kotlin.jvm.internal.j.e("onBackPressedCallback", f0Var);
            this.f53t = onBackPressedDispatcher;
            this.s = f0Var;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.i, p5.a] */
        @Override // androidx.activity.c
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f53t;
            e5.h<f0> hVar = onBackPressedDispatcher.f44b;
            f0 f0Var = this.s;
            hVar.remove(f0Var);
            if (kotlin.jvm.internal.j.a(onBackPressedDispatcher.f45c, f0Var)) {
                f0Var.getClass();
                onBackPressedDispatcher.f45c = null;
            }
            f0Var.f64b.remove(this);
            ?? r02 = f0Var.f65c;
            if (r02 != 0) {
                r02.a();
            }
            f0Var.f65c = null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public /* synthetic */ class d extends kotlin.jvm.internal.i implements p5.a<d5.j> {
        @Override // p5.a
        public final d5.j a() {
            ((OnBackPressedDispatcher) this.receiver).e();
            return d5.j.f12745a;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback m0Var;
        this.f43a = runnable;
        this.f44b = new e5.h<>();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            if (i6 >= 34) {
                m0Var = new m0(new g0(this), new h0(this), new i0(this), new j0(this));
            } else {
                final k0 k0Var = new k0(this);
                m0Var = new OnBackInvokedCallback() { // from class: androidx.activity.l0
                    public final void onBackInvoked() {
                        k0Var.a();
                    }
                };
            }
            this.f46d = m0Var;
        }
    }

    public final void a(androidx.lifecycle.m mVar, f0 f0Var) {
        kotlin.jvm.internal.j.e("onBackPressedCallback", f0Var);
        androidx.lifecycle.h lifecycle = mVar.getLifecycle();
        if (lifecycle.b() == h.b.s) {
            return;
        }
        f0Var.f64b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, f0Var));
        e();
        f0Var.f65c = new d(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final void b() {
        f0 f0VarPrevious;
        if (this.f45c == null) {
            e5.h<f0> hVar = this.f44b;
            ListIterator<f0> listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    f0VarPrevious = null;
                    break;
                } else {
                    f0VarPrevious = listIterator.previous();
                    if (f0VarPrevious.f63a) {
                        break;
                    }
                }
            }
        }
        this.f45c = null;
    }

    public final void c() {
        f0 f0VarPrevious;
        f0 f0Var = this.f45c;
        if (f0Var == null) {
            e5.h<f0> hVar = this.f44b;
            hVar.getClass();
            ListIterator<f0> listIterator = hVar.listIterator(hVar.f12933u);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    f0VarPrevious = null;
                    break;
                } else {
                    f0VarPrevious = listIterator.previous();
                    if (f0VarPrevious.f63a) {
                        break;
                    }
                }
            }
            f0Var = f0VarPrevious;
        }
        this.f45c = null;
        if (f0Var != null) {
            f0Var.a();
            return;
        }
        Runnable runnable = this.f43a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z6) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f47e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f46d) == null) {
            return;
        }
        if (z6 && !this.f48f) {
            a.a(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f48f = true;
        } else {
            if (z6 || !this.f48f) {
                return;
            }
            a.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f48f = false;
        }
    }

    public final void e() {
        boolean z6 = this.f49g;
        boolean z7 = false;
        e5.h<f0> hVar = this.f44b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator<f0> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f63a) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f49g = z7;
        if (z7 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z7);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}

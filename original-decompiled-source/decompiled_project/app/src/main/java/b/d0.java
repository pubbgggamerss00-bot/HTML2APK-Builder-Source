package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.l;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3222a;

    /* renamed from: b, reason: collision with root package name */
    public final qg.l<w> f3223b;

    /* renamed from: c, reason: collision with root package name */
    public w f3224c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3225d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3226e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3227f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3228g;

    public static final class a {
        public static void a(Object dispatcher, Object callback) {
            kotlin.jvm.internal.r.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.r.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
        }

        public static void b(Object dispatcher, Object callback) {
            kotlin.jvm.internal.r.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.r.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class b {
    }

    public final class c implements androidx.lifecycle.r, b.d {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.l f3229a;

        /* renamed from: b, reason: collision with root package name */
        public final w f3230b;

        /* renamed from: c, reason: collision with root package name */
        public d f3231c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d0 f3232d;

        public c(d0 d0Var, androidx.lifecycle.l lVar, w onBackPressedCallback) {
            kotlin.jvm.internal.r.e(onBackPressedCallback, "onBackPressedCallback");
            this.f3232d = d0Var;
            this.f3229a = lVar;
            this.f3230b = onBackPressedCallback;
            lVar.a(this);
        }

        @Override // b.d
        public final void cancel() {
            this.f3229a.c(this);
            this.f3230b.f3278b.remove(this);
            d dVar = this.f3231c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f3231c = null;
        }

        @Override // androidx.lifecycle.r
        public final void l(androidx.lifecycle.t tVar, l.a aVar) {
            if (aVar != l.a.ON_START) {
                if (aVar != l.a.ON_STOP) {
                    if (aVar == l.a.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    d dVar = this.f3231c;
                    if (dVar != null) {
                        dVar.cancel();
                        return;
                    }
                    return;
                }
            }
            d0 d0Var = this.f3232d;
            d0Var.getClass();
            w onBackPressedCallback = this.f3230b;
            kotlin.jvm.internal.r.e(onBackPressedCallback, "onBackPressedCallback");
            d0Var.f3223b.addLast(onBackPressedCallback);
            d dVar2 = new d(d0Var, onBackPressedCallback);
            onBackPressedCallback.f3278b.add(dVar2);
            d0Var.e();
            onBackPressedCallback.f3279c = new f0(0, d0Var, d0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            this.f3231c = dVar2;
        }
    }

    public final class d implements b.d {

        /* renamed from: a, reason: collision with root package name */
        public final w f3233a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f3234b;

        public d(d0 d0Var, w onBackPressedCallback) {
            kotlin.jvm.internal.r.e(onBackPressedCallback, "onBackPressedCallback");
            this.f3234b = d0Var;
            this.f3233a = onBackPressedCallback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [eh.a, kotlin.jvm.internal.p] */
        @Override // b.d
        public final void cancel() {
            d0 d0Var = this.f3234b;
            qg.l<w> lVar = d0Var.f3223b;
            w wVar = this.f3233a;
            lVar.remove(wVar);
            if (kotlin.jvm.internal.r.a(d0Var.f3224c, wVar)) {
                wVar.a();
                d0Var.f3224c = null;
            }
            wVar.f3278b.remove(this);
            ?? r02 = wVar.f3279c;
            if (r02 != 0) {
                r02.invoke();
            }
            wVar.f3279c = null;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
        @Override // eh.a
        public final pg.f0 invoke() {
            ((d0) this.receiver).e();
            return pg.f0.f21461a;
        }
    }

    public d0(Runnable runnable) {
        OnBackInvokedCallback e0Var;
        this.f3222a = runnable;
        this.f3223b = new qg.l<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                e0Var = new e0(new x(this), new y(this), new z(this), new a0(this));
            } else {
                final b0 b0Var = new b0(this, 0);
                e0Var = new OnBackInvokedCallback() { // from class: b.c0
                    public final void onBackInvoked() {
                        b0Var.invoke();
                    }
                };
            }
            this.f3225d = e0Var;
        }
    }

    public final void a(androidx.lifecycle.t owner, w onBackPressedCallback) {
        kotlin.jvm.internal.r.e(owner, "owner");
        kotlin.jvm.internal.r.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.l lifecycle = owner.getLifecycle();
        if (lifecycle.b() == l.b.f2319a) {
            return;
        }
        onBackPressedCallback.f3278b.add(new c(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f3279c = new e(0, this, d0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final void b() {
        w wVarPrevious;
        w wVar = this.f3224c;
        if (wVar == null) {
            qg.l<w> lVar = this.f3223b;
            ListIterator<w> listIterator = lVar.listIterator(lVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wVarPrevious = null;
                    break;
                } else {
                    wVarPrevious = listIterator.previous();
                    if (wVarPrevious.f3277a) {
                        break;
                    }
                }
            }
            wVar = wVarPrevious;
        }
        this.f3224c = null;
        if (wVar != null) {
            wVar.a();
        }
    }

    public final void c() {
        w wVarPrevious;
        w wVar = this.f3224c;
        if (wVar == null) {
            qg.l<w> lVar = this.f3223b;
            ListIterator<w> listIterator = lVar.listIterator(lVar.c());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wVarPrevious = null;
                    break;
                } else {
                    wVarPrevious = listIterator.previous();
                    if (wVarPrevious.f3277a) {
                        break;
                    }
                }
            }
            wVar = wVarPrevious;
        }
        this.f3224c = null;
        if (wVar != null) {
            wVar.b();
            return;
        }
        Runnable runnable = this.f3222a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3226e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f3225d) == null) {
            return;
        }
        if (z10 && !this.f3227f) {
            a.a(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3227f = true;
        } else {
            if (z10 || !this.f3227f) {
                return;
            }
            a.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3227f = false;
        }
    }

    public final void e() {
        boolean z10 = this.f3228g;
        boolean z11 = false;
        qg.l<w> lVar = this.f3223b;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator<w> it = lVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f3277a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f3228g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z11);
    }

    public d0() {
        this(null);
    }
}

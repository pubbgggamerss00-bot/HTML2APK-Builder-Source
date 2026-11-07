package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.l;
import java.util.Map;
import o.b;
import t6.w;

/* loaded from: classes.dex */
public abstract class z<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2381k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final o.b<b0<? super T>, z<T>.d> f2383b;

    /* renamed from: c, reason: collision with root package name */
    public int f2384c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2385d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2386e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2387f;

    /* renamed from: g, reason: collision with root package name */
    public int f2388g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2389h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2390i;

    /* renamed from: j, reason: collision with root package name */
    public final a f2391j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (z.this.f2382a) {
                obj = z.this.f2387f;
                z.this.f2387f = z.f2381k;
            }
            z.this.h(obj);
        }
    }

    public class b extends z<T>.d {
        @Override // androidx.lifecycle.z.d
        public final boolean d() {
            return true;
        }
    }

    public class c extends z<T>.d implements r {

        /* renamed from: e, reason: collision with root package name */
        public final t f2393e;

        public c(t tVar, b0<? super T> b0Var) {
            super(b0Var);
            this.f2393e = tVar;
        }

        @Override // androidx.lifecycle.z.d
        public final void b() {
            this.f2393e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.z.d
        public final boolean c(t tVar) {
            return this.f2393e == tVar;
        }

        @Override // androidx.lifecycle.z.d
        public final boolean d() {
            return this.f2393e.getLifecycle().b().compareTo(l.b.f2322d) >= 0;
        }

        @Override // androidx.lifecycle.r
        public final void l(t tVar, l.a aVar) {
            t tVar2 = this.f2393e;
            l.b bVarB = tVar2.getLifecycle().b();
            if (bVarB == l.b.f2319a) {
                z.this.g(this.f2395a);
                return;
            }
            l.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = tVar2.getLifecycle().b();
            }
        }
    }

    public abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final b0<? super T> f2395a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2396b;

        /* renamed from: c, reason: collision with root package name */
        public int f2397c = -1;

        public d(b0<? super T> b0Var) {
            this.f2395a = b0Var;
        }

        public final void a(boolean z10) {
            if (z10 == this.f2396b) {
                return;
            }
            this.f2396b = z10;
            int i10 = z10 ? 1 : -1;
            z zVar = z.this;
            int i11 = zVar.f2384c;
            zVar.f2384c = i10 + i11;
            if (!zVar.f2385d) {
                zVar.f2385d = true;
                while (true) {
                    try {
                        int i12 = zVar.f2384c;
                        if (i11 == i12) {
                            break;
                        }
                        boolean z11 = i11 == 0 && i12 > 0;
                        boolean z12 = i11 > 0 && i12 == 0;
                        if (z11) {
                            zVar.e();
                        } else if (z12) {
                            zVar.f();
                        }
                        i11 = i12;
                    } catch (Throwable th2) {
                        zVar.f2385d = false;
                        throw th2;
                    }
                }
                zVar.f2385d = false;
            }
            if (this.f2396b) {
                zVar.c(this);
            }
        }

        public void b() {
        }

        public boolean c(t tVar) {
            return false;
        }

        public abstract boolean d();
    }

    public z(int i10) {
        w.a.b bVar = t6.w.f28061b;
        this.f2382a = new Object();
        this.f2383b = new o.b<>();
        this.f2384c = 0;
        this.f2387f = f2381k;
        this.f2391j = new a();
        this.f2386e = bVar;
        this.f2388g = 0;
    }

    public static void a(String str) {
        n.b.b0().f18285a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(i8.n.d("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(z<T>.d dVar) {
        if (dVar.f2396b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f2397c;
            int i11 = this.f2388g;
            if (i10 >= i11) {
                return;
            }
            dVar.f2397c = i11;
            dVar.f2395a.a((Object) this.f2386e);
        }
    }

    public final void c(z<T>.d dVar) {
        if (this.f2389h) {
            this.f2390i = true;
            return;
        }
        this.f2389h = true;
        do {
            this.f2390i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                o.b<b0<? super T>, z<T>.d> bVar = this.f2383b;
                bVar.getClass();
                b.d dVar2 = new b.d();
                bVar.f18829c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.f2390i) {
                        break;
                    }
                }
            }
        } while (this.f2390i);
        this.f2389h = false;
    }

    public final void d(t tVar, b0<? super T> b0Var) {
        z<T>.d dVar;
        a("observe");
        if (tVar.getLifecycle().b() == l.b.f2319a) {
            return;
        }
        c cVar = new c(tVar, b0Var);
        o.b<b0<? super T>, z<T>.d> bVar = this.f2383b;
        b.c<b0<? super T>, z<T>.d> cVarA = bVar.a(b0Var);
        if (cVarA != null) {
            dVar = cVarA.f18832b;
        } else {
            b.c<K, V> cVar2 = new b.c<>(b0Var, cVar);
            bVar.f18830d++;
            b.c<b0<? super T>, z<T>.d> cVar3 = bVar.f18828b;
            if (cVar3 == 0) {
                bVar.f18827a = cVar2;
                bVar.f18828b = cVar2;
            } else {
                cVar3.f18833c = cVar2;
                cVar2.f18834d = cVar3;
                bVar.f18828b = cVar2;
            }
            dVar = null;
        }
        z<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.c(tVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        tVar.getLifecycle().a(cVar);
    }

    public void e() {
    }

    public void f() {
    }

    public void g(b0<? super T> b0Var) {
        a("removeObserver");
        z<T>.d dVarB = this.f2383b.b(b0Var);
        if (dVarB == null) {
            return;
        }
        dVarB.b();
        dVarB.a(false);
    }

    public void h(T t3) {
        a("setValue");
        this.f2388g++;
        this.f2386e = t3;
        c(null);
    }

    public z() {
        this.f2382a = new Object();
        this.f2383b = new o.b<>();
        this.f2384c = 0;
        Object obj = f2381k;
        this.f2387f = obj;
        this.f2391j = new a();
        this.f2386e = obj;
        this.f2388g = -1;
    }
}

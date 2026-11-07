package j2;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import tg.h;

/* loaded from: classes.dex */
public final class h1 extends ph.g0 {

    /* renamed from: n, reason: collision with root package name */
    public static final pg.s f14729n = e9.w0.b(a.f14741a);

    /* renamed from: p, reason: collision with root package name */
    public static final b f14730p = new b();

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f14731c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f14732d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14737j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14738k;

    /* renamed from: m, reason: collision with root package name */
    public final i1 f14740m;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14733e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final qg.l<Runnable> f14734f = new qg.l<>();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f14735g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f14736h = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final c f14739l = new c();

    public static final class a extends kotlin.jvm.internal.s implements eh.a<tg.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14741a = new a(0);

        @Override // eh.a
        public final tg.h invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                wh.c cVar = ph.z0.f21632a;
                choreographer = (Choreographer) ph.h.d(uh.o.f29764a, new g1(2, null));
            }
            h1 h1Var = new h1(choreographer, Handler.createAsync(Looper.getMainLooper()));
            return h.a.C0291a.c(h1Var, h1Var.f14740m);
        }
    }

    public static final class b extends ThreadLocal<tg.h> {
        @Override // java.lang.ThreadLocal
        public final tg.h initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            h1 h1Var = new h1(choreographer, Handler.createAsync(looperMyLooper));
            return h.a.C0291a.c(h1Var, h1Var.f14740m);
        }
    }

    public static final class c implements Choreographer.FrameCallback, Runnable {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            h1.this.f14732d.removeCallbacks(this);
            h1.H0(h1.this);
            h1 h1Var = h1.this;
            synchronized (h1Var.f14733e) {
                if (h1Var.f14738k) {
                    h1Var.f14738k = false;
                    ArrayList arrayList = h1Var.f14735g;
                    h1Var.f14735g = h1Var.f14736h;
                    h1Var.f14736h = arrayList;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j10);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            h1.H0(h1.this);
            h1 h1Var = h1.this;
            synchronized (h1Var.f14733e) {
                try {
                    if (h1Var.f14735g.isEmpty()) {
                        h1Var.f14731c.removeFrameCallback(this);
                        h1Var.f14738k = false;
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public h1(Choreographer choreographer, Handler handler) {
        this.f14731c = choreographer;
        this.f14732d = handler;
        this.f14740m = new i1(choreographer, this);
    }

    public static final void H0(h1 h1Var) {
        Runnable runnableRemoveFirst;
        boolean z10;
        do {
            synchronized (h1Var.f14733e) {
                qg.l<Runnable> lVar = h1Var.f14734f;
                runnableRemoveFirst = lVar.isEmpty() ? null : lVar.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (h1Var.f14733e) {
                    qg.l<Runnable> lVar2 = h1Var.f14734f;
                    runnableRemoveFirst = lVar2.isEmpty() ? null : lVar2.removeFirst();
                }
            }
            synchronized (h1Var.f14733e) {
                if (h1Var.f14734f.isEmpty()) {
                    z10 = false;
                    h1Var.f14737j = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        synchronized (this.f14733e) {
            try {
                this.f14734f.addLast(runnable);
                if (!this.f14737j) {
                    this.f14737j = true;
                    this.f14732d.post(this.f14739l);
                    if (!this.f14738k) {
                        this.f14738k = true;
                        this.f14731c.postFrameCallback(this.f14739l);
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

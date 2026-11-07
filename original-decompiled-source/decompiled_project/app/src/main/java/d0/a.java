package d0;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import d0.e2;
import x0.u2;

/* loaded from: classes.dex */
public final class a implements h2, u2, Runnable, Choreographer.FrameCallback {

    /* renamed from: g, reason: collision with root package name */
    public static long f7037g;

    /* renamed from: a, reason: collision with root package name */
    public final View f7038a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7040c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7042e;

    /* renamed from: f, reason: collision with root package name */
    public long f7043f;

    /* renamed from: b, reason: collision with root package name */
    public final z0.b<g2> f7039b = new z0.b<>(new g2[16]);

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f7041d = Choreographer.getInstance();

    /* renamed from: d0.a$a, reason: collision with other inner class name */
    public static final class C0075a {

        /* renamed from: a, reason: collision with root package name */
        public final long f7044a;

        public C0075a(long j10) {
            this.f7044a = j10;
        }

        public final long a() {
            return Math.max(0L, this.f7044a - System.nanoTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(View view) {
        float refreshRate;
        this.f7038a = view;
        if (f7037g == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
            }
            f7037g = (long) (1000000000 / refreshRate);
        }
    }

    @Override // d0.h2
    public final void a(e2.a aVar) {
        this.f7039b.b(aVar);
        if (this.f7040c) {
            return;
        }
        this.f7040c = true;
        this.f7038a.post(this);
    }

    @Override // x0.u2
    public final void b() {
    }

    @Override // x0.u2
    public final void c() {
        this.f7042e = false;
        this.f7038a.removeCallbacks(this);
        this.f7041d.removeFrameCallback(this);
    }

    @Override // x0.u2
    public final void d() {
        this.f7042e = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f7042e) {
            this.f7043f = j10;
            this.f7038a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0.b<g2> bVar = this.f7039b;
        if (bVar.f34702c == 0 || !this.f7040c || !this.f7042e || this.f7038a.getWindowVisibility() != 0) {
            this.f7040c = false;
            return;
        }
        C0075a c0075a = new C0075a(this.f7043f + f7037g);
        boolean z10 = false;
        while (bVar.f34702c != 0 && !z10) {
            if (c0075a.a() <= 0 || bVar.f34700a[0].b(c0075a)) {
                z10 = true;
            } else {
                bVar.k(0);
            }
        }
        if (z10) {
            this.f7041d.postFrameCallback(this);
        } else {
            this.f7040c = false;
        }
    }
}

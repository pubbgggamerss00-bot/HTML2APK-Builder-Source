package qh;

import android.os.Handler;
import android.os.Looper;
import eh.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import pg.f0;
import ph.b1;
import ph.f2;
import ph.m;
import ph.v1;
import ph.z0;
import uh.o;

/* loaded from: classes2.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f22759c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22760d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22761e;

    /* renamed from: f, reason: collision with root package name */
    public final f f22762f;

    public f(Handler handler, String str, boolean z10) {
        this.f22759c = handler;
        this.f22760d = str;
        this.f22761e = z10;
        this.f22762f = z10 ? this : new f(handler, str, true);
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        if (this.f22759c.post(runnable)) {
            return;
        }
        I0(hVar, runnable);
    }

    @Override // ph.g0
    public final boolean F0(tg.h hVar) {
        return (this.f22761e && r.a(Looper.myLooper(), this.f22759c.getLooper())) ? false : true;
    }

    @Override // qh.g
    public final g H0() {
        return this.f22762f;
    }

    public final void I0(tg.h hVar, Runnable runnable) {
        v1.b(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        wh.c cVar = z0.f21632a;
        wh.b.f31563c.D0(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f22759c == this.f22759c && fVar.f22761e == this.f22761e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22759c) ^ (this.f22761e ? 1231 : 1237);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Runnable, qh.d] */
    @Override // ph.r0
    public final void i0(long j10, final m mVar) {
        final ?? r02 = new Runnable() { // from class: qh.d
            @Override // java.lang.Runnable
            public final void run() {
                mVar.B(this, f0.f21461a);
            }
        };
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f22759c.postDelayed(r02, j10)) {
            mVar.s(new l() { // from class: qh.e
                @Override // eh.l
                public final Object invoke(Object obj) {
                    this.f22757a.f22759c.removeCallbacks(r02);
                    return f0.f21461a;
                }
            });
        } else {
            I0(mVar.f21567e, r02);
        }
    }

    @Override // qh.g, ph.g0
    public final String toString() {
        g gVarH0;
        String str;
        wh.c cVar = z0.f21632a;
        g gVar = o.f29764a;
        if (this == gVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                gVarH0 = gVar.H0();
            } catch (UnsupportedOperationException unused) {
                gVarH0 = null;
            }
            str = this == gVarH0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f22760d;
        if (string == null) {
            string = this.f22759c.toString();
        }
        return this.f22761e ? k3.a.a(string, ".immediate") : string;
    }

    @Override // qh.g, ph.r0
    public final b1 z(long j10, final Runnable runnable, tg.h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f22759c.postDelayed(runnable, j10)) {
            return new b1() { // from class: qh.c
                @Override // ph.b1
                public final void a() {
                    this.f22753a.f22759c.removeCallbacks(runnable);
                }
            };
        }
        I0(hVar, runnable);
        return f2.f21533a;
    }

    public f(Handler handler) {
        this(handler, null, false);
    }
}

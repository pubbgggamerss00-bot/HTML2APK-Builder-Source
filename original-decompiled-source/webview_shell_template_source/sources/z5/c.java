package z5;

import android.os.Handler;
import android.os.Looper;
import b6.p;
import g5.f;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import y5.f1;
import y5.i0;
import y5.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends d {
    private volatile c _immediate;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f15443u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15444v;

    /* renamed from: w, reason: collision with root package name */
    public final c f15445w;

    public c(Handler handler, boolean z6) {
        this.f15443u = handler;
        this.f15444v = z6;
        this._immediate = z6 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, true);
            this._immediate = cVar;
        }
        this.f15445w = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f15443u == this.f15443u;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f15443u);
    }

    @Override // y5.f1, y5.u
    public final String toString() {
        f1 f1VarZ;
        String str;
        c6.c cVar = i0.f15349a;
        f1 f1Var = p.f2047a;
        if (this == f1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                f1VarZ = f1Var.z();
            } catch (UnsupportedOperationException unused) {
                f1VarZ = null;
            }
            str = this == f1VarZ ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f15443u.toString();
        return this.f15444v ? androidx.camera.core.c.b(string, ".immediate") : string;
    }

    @Override // y5.u
    public final void x(f fVar, Runnable runnable) {
        if (this.f15443u.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        x0 x0Var = (x0) fVar.t(x0.b.s);
        if (x0Var != null) {
            x0Var.r(cancellationException);
        }
        i0.f15350b.x(fVar, runnable);
    }

    @Override // y5.u
    public final boolean y() {
        return (this.f15444v && j.a(Looper.myLooper(), this.f15443u.getLooper())) ? false : true;
    }

    @Override // y5.f1
    public final f1 z() {
        return this.f15445w;
    }
}

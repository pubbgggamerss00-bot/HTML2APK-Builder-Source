package qc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import mc.d;
import qc.a;
import qc.i;

/* loaded from: classes2.dex */
public abstract class e<I, O, F, T> extends i.a<O> implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f22630k = 0;

    /* renamed from: h, reason: collision with root package name */
    public m<? extends I> f22631h;

    /* renamed from: j, reason: collision with root package name */
    public d.l.a f22632j;

    public static final class a<I, O> extends e<I, O, lc.e<? super I, ? extends O>, O> {
    }

    @Override // qc.a
    public final void d() {
        m<? extends I> mVar = this.f22631h;
        boolean z10 = false;
        if ((mVar != null) & (this.f22601a instanceof a.b)) {
            Object obj = this.f22601a;
            if ((obj instanceof a.b) && ((a.b) obj).f22606a) {
                z10 = true;
            }
            mVar.cancel(z10);
        }
        this.f22631h = null;
        this.f22632j = null;
    }

    @Override // qc.a
    public final String i() {
        String str;
        m<? extends I> mVar = this.f22631h;
        d.l.a aVar = this.f22632j;
        String strI = super.i();
        if (mVar != null) {
            str = "inputFuture=[" + mVar + "], ";
        } else {
            str = "";
        }
        if (aVar == null) {
            if (strI != null) {
                return k3.a.a(str, strI);
            }
            return null;
        }
        return str + "function=[" + aVar + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        a.c cVar;
        m<? extends I> mVar = this.f22631h;
        d.l.a aVar = this.f22632j;
        if (((this.f22601a instanceof a.b) | (mVar == null)) || (aVar == 0)) {
            return;
        }
        this.f22631h = null;
        if (mVar.isCancelled()) {
            Object obj = this.f22601a;
            if (obj == null) {
                if (mVar.isDone()) {
                    if (qc.a.f22599f.b(this, null, qc.a.h(mVar))) {
                        qc.a.e(this);
                        return;
                    }
                    return;
                }
                a.f fVar = new a.f(this, mVar);
                if (qc.a.f22599f.b(this, null, fVar)) {
                    try {
                        mVar.a(fVar, f.f22633a);
                        return;
                    } catch (Throwable th2) {
                        try {
                            cVar = new a.c(th2);
                        } catch (Throwable unused) {
                            cVar = a.c.f22608b;
                        }
                        qc.a.f22599f.b(this, fVar, cVar);
                        return;
                    }
                }
                obj = this.f22601a;
            }
            if (obj instanceof a.b) {
                mVar.cancel(((a.b) obj).f22606a);
                return;
            }
            return;
        }
        try {
            Object objI = j.I(mVar);
            try {
                aVar.apply(objI);
                this.f22632j = null;
                a aVar2 = (a) this;
                if (objI == null) {
                    objI = qc.a.f22600g;
                }
                if (qc.a.f22599f.b(aVar2, null, objI)) {
                    qc.a.e(aVar2);
                }
            } catch (Throwable th3) {
                try {
                    k(th3);
                } finally {
                    this.f22632j = null;
                }
            }
        } catch (Error e10) {
            k(e10);
        } catch (CancellationException unused2) {
            cancel(false);
        } catch (RuntimeException e11) {
            k(e11);
        } catch (ExecutionException e12) {
            k(e12.getCause());
        }
    }
}

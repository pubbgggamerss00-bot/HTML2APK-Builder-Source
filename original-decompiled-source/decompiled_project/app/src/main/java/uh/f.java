package uh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ph.f1;
import ph.m0;
import ph.p2;
import ph.x0;

/* loaded from: classes2.dex */
public final class f<T> extends x0<T> implements vg.d, tg.e<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29732h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final ph.g0 f29733d;

    /* renamed from: e, reason: collision with root package name */
    public final vg.c f29734e;

    /* renamed from: f, reason: collision with root package name */
    public Object f29735f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29736g;

    public f(ph.g0 g0Var, vg.c cVar) {
        super(-1);
        this.f29733d = g0Var;
        this.f29734e = cVar;
        this.f29735f = g.f29737a;
        this.f29736g = b0.b(cVar.getContext());
    }

    @Override // ph.x0
    public final tg.e<T> c() {
        return this;
    }

    @Override // ph.x0
    public final Object g() {
        Object obj = this.f29735f;
        this.f29735f = g.f29737a;
        return obj;
    }

    @Override // vg.d
    public final vg.d getCallerFrame() {
        vg.c cVar = this.f29734e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // tg.e
    public final tg.h getContext() {
        return this.f29734e.getContext();
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        Throwable thA = pg.p.a(obj);
        Object yVar = thA == null ? obj : new ph.y(false, thA);
        vg.c cVar = this.f29734e;
        tg.h context = cVar.getContext();
        ph.g0 g0Var = this.f29733d;
        if (g.c(g0Var, context)) {
            this.f29735f = yVar;
            this.f21605c = 0;
            g.b(g0Var, cVar.getContext(), this);
            return;
        }
        f1 f1VarA = p2.a();
        if (f1VarA.f21530c >= 4294967296L) {
            this.f29735f = yVar;
            this.f21605c = 0;
            f1VarA.I0(this);
            return;
        }
        f1VarA.J0(true);
        try {
            tg.h context2 = cVar.getContext();
            Object objC = b0.c(context2, this.f29736g);
            try {
                cVar.resumeWith(obj);
                pg.f0 f0Var = pg.f0.f21461a;
                while (f1VarA.L0()) {
                }
            } finally {
                b0.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f29733d + ", " + m0.f(this.f29734e) + ']';
    }
}

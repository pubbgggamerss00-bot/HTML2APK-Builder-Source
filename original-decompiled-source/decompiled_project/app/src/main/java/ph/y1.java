package ph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ph.s1;
import tg.h;

@pg.d
/* loaded from: classes2.dex */
public class y1 implements s1, t, h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21611a = AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21612b = AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public static final class a<T> extends m<T> {

        /* renamed from: j, reason: collision with root package name */
        public final y1 f21613j;

        public a(y1 y1Var, tg.e eVar) {
            super(1, eVar);
            this.f21613j = y1Var;
        }

        @Override // ph.m
        public final Throwable n(y1 y1Var) {
            Throwable thB;
            y1 y1Var2 = this.f21613j;
            y1Var2.getClass();
            Object obj = y1.f21611a.get(y1Var2);
            return (!(obj instanceof c) || (thB = ((c) obj).b()) == null) ? obj instanceof y ? ((y) obj).f21609a : y1Var.getCancellationException() : thB;
        }

        @Override // ph.m
        public final String y() {
            return "AwaitContinuation";
        }
    }

    public static final class b extends x1 {

        /* renamed from: e, reason: collision with root package name */
        public final y1 f21614e;

        /* renamed from: f, reason: collision with root package name */
        public final c f21615f;

        /* renamed from: g, reason: collision with root package name */
        public final s f21616g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f21617h;

        public b(y1 y1Var, c cVar, s sVar, Object obj) {
            this.f21614e = y1Var;
            this.f21615f = cVar;
            this.f21616g = sVar;
            this.f21617h = obj;
        }

        @Override // ph.x1
        public final boolean j() {
            return false;
        }

        @Override // ph.x1
        public final void k(Throwable th2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y1.f21611a;
            y1 y1Var = this.f21614e;
            y1Var.getClass();
            s sVar = this.f21616g;
            s sVarL = y1.L(sVar);
            c cVar = this.f21615f;
            Object obj = this.f21617h;
            if (sVarL == null || !y1Var.X(cVar, sVarL, obj)) {
                cVar.f21621a.d(new uh.j(2), 2);
                s sVarL2 = y1.L(sVar);
                if (sVarL2 == null || !y1Var.X(cVar, sVarL2, obj)) {
                    y1Var.i(y1Var.v(cVar, obj));
                }
            }
        }
    }

    public static final class c implements n1 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f21618b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f21619c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f21620d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        public final d2 f21621a;

        public c(d2 d2Var, Throwable th2) {
            this.f21621a = d2Var;
            this._rootCause$volatile = th2;
        }

        public final void a(Throwable th2) {
            Throwable thB = b();
            if (thB == null) {
                f21619c.set(this, th2);
                return;
            }
            if (th2 == thB) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21620d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th2 == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th2);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        public final Throwable b() {
            return (Throwable) f21619c.get(this);
        }

        @Override // ph.n1
        public final d2 c() {
            return this.f21621a;
        }

        public final boolean d() {
            return b() != null;
        }

        public final ArrayList e(Throwable th2) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21620d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thB = b();
            if (thB != null) {
                arrayList.add(0, thB);
            }
            if (th2 != null && !th2.equals(thB)) {
                arrayList.add(th2);
            }
            atomicReferenceFieldUpdater.set(this, b2.f21502e);
            return arrayList;
        }

        @Override // ph.n1
        public final boolean isActive() {
            return b() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(d());
            sb.append(", completing=");
            sb.append(f21618b.get(this) == 1);
            sb.append(", rootCause=");
            sb.append(b());
            sb.append(", exceptions=");
            sb.append(f21620d.get(this));
            sb.append(", list=");
            sb.append(this.f21621a);
            sb.append(']');
            return sb.toString();
        }
    }

    public final class d extends x1 {

        /* renamed from: e, reason: collision with root package name */
        public final xh.j<?> f21622e;

        public d(xh.j<?> jVar) {
            this.f21622e = jVar;
        }

        @Override // ph.x1
        public final boolean j() {
            return false;
        }

        @Override // ph.x1
        public final void k(Throwable th2) {
            y1 y1Var = y1.this;
            y1Var.getClass();
            Object objA = y1.f21611a.get(y1Var);
            if (!(objA instanceof y)) {
                objA = b2.a(objA);
            }
            this.f21622e.c(y1Var, objA);
        }
    }

    public final class e extends x1 {

        /* renamed from: e, reason: collision with root package name */
        public final xh.j<?> f21624e;

        public e(xh.j<?> jVar) {
            this.f21624e = jVar;
        }

        @Override // ph.x1
        public final boolean j() {
            return false;
        }

        @Override // ph.x1
        public final void k(Throwable th2) {
            this.f21624e.c(y1.this, pg.f0.f21461a);
        }
    }

    @vg.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    public static final class f extends vg.h implements eh.p<lh.i<? super s1>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public uh.k f21626a;

        /* renamed from: b, reason: collision with root package name */
        public s f21627b;

        /* renamed from: c, reason: collision with root package name */
        public int f21628c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21629d;

        public f(tg.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            f fVar = y1.this.new f(eVar);
            fVar.f21629d = obj;
            return fVar;
        }

        @Override // eh.p
        public final Object invoke(lh.i<? super s1> iVar, tg.e<? super pg.f0> eVar) {
            return ((f) create(iVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:25:0x007a). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d2 d2VarC;
            uh.k kVar;
            uh.l lVarG;
            lh.i iVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f21628c;
            if (i10 == 0) {
                pg.q.b(obj);
                lh.i iVar2 = (lh.i) this.f21629d;
                Object obj2 = y1.f21611a.get(y1.this);
                if (obj2 instanceof s) {
                    t tVar = ((s) obj2).f21586e;
                    this.f21628c = 1;
                    iVar2.c(tVar, this);
                    return aVar;
                }
                if ((obj2 instanceof n1) && (d2VarC = ((n1) obj2).c()) != null) {
                    Object obj3 = uh.l.f29752a.get(d2VarC);
                    kotlin.jvm.internal.r.c(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    uh.l lVar = (uh.l) obj3;
                    kVar = d2VarC;
                    lVarG = lVar;
                    iVar = iVar2;
                    if (!lVarG.equals(kVar)) {
                    }
                }
            } else if (i10 == 1) {
                pg.q.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVarG = this.f21627b;
                kVar = this.f21626a;
                iVar = (lh.i) this.f21629d;
                pg.q.b(obj);
                lVarG = lVarG.g();
                if (!lVarG.equals(kVar)) {
                    if (lVarG instanceof s) {
                        s sVar = (s) lVarG;
                        t tVar2 = sVar.f21586e;
                        this.f21629d = iVar;
                        this.f21626a = kVar;
                        this.f21627b = sVar;
                        this.f21628c = 2;
                        iVar.c(tVar2, this);
                        ug.a aVar2 = ug.a.f29706a;
                        return aVar;
                    }
                    lVarG = lVarG.g();
                    if (!lVarG.equals(kVar)) {
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    public /* synthetic */ class g extends kotlin.jvm.internal.p implements eh.q<y1, xh.j<?>, Object, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f21631a = new g(3, y1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // eh.q
        public final pg.f0 b(y1 y1Var, xh.j<?> jVar, Object obj) {
            y1 y1Var2 = y1Var;
            xh.j<?> jVar2 = jVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y1.f21611a;
            y1Var2.getClass();
            while (true) {
                Object obj2 = y1.f21611a.get(y1Var2);
                if (!(obj2 instanceof n1)) {
                    jVar2.e(pg.f0.f21461a);
                    break;
                }
                if (y1Var2.T(obj2) >= 0) {
                    jVar2.a(v1.g(y1Var2, y1Var2.new e(jVar2)));
                    break;
                }
            }
            return pg.f0.f21461a;
        }
    }

    public y1(boolean z10) {
        this._state$volatile = z10 ? b2.f21504g : b2.f21503f;
    }

    public static s L(uh.l lVar) {
        while (lVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uh.l.f29753b;
            uh.l lVarE = lVar.e();
            if (lVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (uh.l) obj;
                    if (!lVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = lVarE;
            }
        }
        while (true) {
            lVar = lVar.g();
            if (!lVar.h()) {
                if (lVar instanceof s) {
                    return (s) lVar;
                }
                if (lVar instanceof d2) {
                    return null;
                }
            }
        }
    }

    public static String U(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof n1 ? ((n1) obj).isActive() ? "Active" : "New" : obj instanceof y ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : c.f21618b.get(cVar) == 1 ? "Completing" : "Active";
    }

    public static CancellationException V(y1 y1Var, Throwable th2) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new t1(y1Var.q(), th2, y1Var) : cancellationException;
    }

    public boolean A() {
        return this instanceof v;
    }

    public final d2 B(n1 n1Var) {
        d2 d2VarC = n1Var.c();
        if (d2VarC != null) {
            return d2VarC;
        }
        if (n1Var instanceof e1) {
            return new d2();
        }
        if (n1Var instanceof x1) {
            S((x1) n1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + n1Var).toString());
    }

    public boolean C(Throwable th2) {
        return false;
    }

    public void D(z zVar) {
        throw zVar;
    }

    public final void F(s1 s1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21612b;
        f2 f2Var = f2.f21533a;
        if (s1Var == null) {
            atomicReferenceFieldUpdater.set(this, f2Var);
            return;
        }
        s1Var.start();
        r rVarAttachChild = s1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, rVarAttachChild);
        if (isCompleted()) {
            rVarAttachChild.a();
            atomicReferenceFieldUpdater.set(this, f2Var);
        }
    }

    public final b1 G(boolean z10, x1 x1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f2 f2Var;
        boolean z11;
        boolean zD;
        x1Var.f21606d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f21611a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof e1;
            f2Var = f2.f21533a;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof n1)) {
                    z11 = false;
                    break;
                }
                n1 n1Var = (n1) obj;
                d2 d2VarC = n1Var.c();
                if (d2VarC == null) {
                    S((x1) obj);
                } else {
                    if (x1Var.j()) {
                        c cVar = n1Var instanceof c ? (c) n1Var : null;
                        Throwable thB = cVar != null ? cVar.b() : null;
                        if (thB == null) {
                            zD = d2VarC.d(x1Var, 5);
                        } else if (z10) {
                            x1Var.k(thB);
                            return f2Var;
                        }
                    } else {
                        zD = d2VarC.d(x1Var, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                e1 e1Var = (e1) obj;
                if (e1Var.f21525a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                R(e1Var);
            }
        }
        if (z11) {
            return x1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            y yVar = obj2 instanceof y ? (y) obj2 : null;
            x1Var.k(yVar != null ? yVar.f21609a : null);
        }
        return f2Var;
    }

    public boolean H() {
        return this instanceof ph.f;
    }

    public final boolean I(Object obj) {
        Object objW;
        do {
            objW = W(f21611a.get(this), obj);
            if (objW == b2.f21498a) {
                return false;
            }
            if (objW == b2.f21499b) {
                return true;
            }
        } while (objW == b2.f21500c);
        i(objW);
        return true;
    }

    public final Object J(Object obj) {
        Object objW;
        do {
            objW = W(f21611a.get(this), obj);
            if (objW == b2.f21498a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                y yVar = obj instanceof y ? (y) obj : null;
                throw new IllegalStateException(str, yVar != null ? yVar.f21609a : null);
            }
        } while (objW == b2.f21500c);
        return objW;
    }

    public String K() {
        return getClass().getSimpleName();
    }

    public final void O(d2 d2Var, Throwable th2) {
        d2Var.d(new uh.j(4), 4);
        Object obj = uh.l.f29752a.get(d2Var);
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        z zVar = null;
        for (uh.l lVarG = (uh.l) obj; !lVarG.equals(d2Var); lVarG = lVarG.g()) {
            if ((lVarG instanceof x1) && ((x1) lVarG).j()) {
                try {
                    ((x1) lVarG).k(th2);
                } catch (Throwable th3) {
                    if (zVar != null) {
                        c9.u1.b(zVar, th3);
                    } else {
                        zVar = new z("Exception in completion handler " + lVarG + " for " + this, th3);
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                }
            }
        }
        if (zVar != null) {
            D(zVar);
        }
        o(th2);
    }

    public void P(Object obj) {
    }

    public void Q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ph.m1] */
    public final void R(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d2 d2Var = new d2();
        if (!e1Var.f21525a) {
            d2Var = new m1(d2Var);
        }
        do {
            atomicReferenceFieldUpdater = f21611a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e1Var, d2Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e1Var);
    }

    public final void S(x1 x1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d2 d2Var = new d2();
        x1Var.getClass();
        uh.l.f29753b.set(d2Var, x1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = uh.l.f29752a;
        atomicReferenceFieldUpdater2.set(d2Var, x1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(x1Var) == x1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(x1Var, x1Var, d2Var)) {
                    if (atomicReferenceFieldUpdater2.get(x1Var) != x1Var) {
                        break;
                    }
                }
                d2Var.f(x1Var);
                break loop0;
            }
            break;
        }
        uh.l lVarG = x1Var.g();
        do {
            atomicReferenceFieldUpdater = f21611a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, x1Var, lVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == x1Var);
    }

    public final int T(Object obj) {
        boolean z10 = obj instanceof e1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21611a;
        if (z10) {
            if (((e1) obj).f21525a) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b2.f21504g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Q();
            return 1;
        }
        if (!(obj instanceof m1)) {
            return 0;
        }
        d2 d2Var = ((m1) obj).f21568a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d2Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Q();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object W(Object obj, Object obj2) {
        if (!(obj instanceof n1)) {
            return b2.f21498a;
        }
        if (((obj instanceof e1) || (obj instanceof x1)) && !(obj instanceof s) && !(obj2 instanceof y)) {
            n1 n1Var = (n1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21611a;
            Object o1Var = obj2 instanceof n1 ? new o1((n1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, n1Var, o1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != n1Var) {
                    return b2.f21500c;
                }
            }
            P(obj2);
            t(n1Var, obj2);
            return obj2;
        }
        n1 n1Var2 = (n1) obj;
        d2 d2VarB = B(n1Var2);
        if (d2VarB == null) {
            return b2.f21500c;
        }
        c cVar = n1Var2 instanceof c ? (c) n1Var2 : null;
        if (cVar == null) {
            cVar = new c(d2VarB, null);
        }
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        synchronized (cVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.f21618b;
            if (atomicIntegerFieldUpdater.get(cVar) == 1) {
                return b2.f21498a;
            }
            atomicIntegerFieldUpdater.set(cVar, 1);
            if (cVar != n1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f21611a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, n1Var2, cVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != n1Var2) {
                        return b2.f21500c;
                    }
                }
            }
            boolean zD = cVar.d();
            y yVar = obj2 instanceof y ? (y) obj2 : null;
            if (yVar != null) {
                cVar.a(yVar.f21609a);
            }
            ?? B = zD ? 0 : cVar.b();
            g0Var.f16327a = B;
            pg.f0 f0Var = pg.f0.f21461a;
            if (B != 0) {
                O(d2VarB, B);
            }
            s sVarL = L(d2VarB);
            if (sVarL != null && X(cVar, sVarL, obj2)) {
                return b2.f21499b;
            }
            d2VarB.d(new uh.j(2), 2);
            s sVarL2 = L(d2VarB);
            return (sVarL2 == null || !X(cVar, sVarL2, obj2)) ? v(cVar, obj2) : b2.f21499b;
        }
    }

    public final boolean X(c cVar, s sVar, Object obj) {
        do {
            t tVar = sVar.f21586e;
            b bVar = new b(this, cVar, sVar, obj);
            if ((tVar instanceof y1 ? ((y1) tVar).G(false, bVar) : tVar.invokeOnCompletion(false, false, new w1(1, bVar, x1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0))) != f2.f21533a) {
                return true;
            }
            sVar = L(sVar);
        } while (sVar != null);
        return false;
    }

    @Override // ph.s1
    public final r attachChild(t tVar) {
        s sVar = new s(tVar);
        sVar.f21606d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21611a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                if (e1Var.f21525a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                R(e1Var);
            } else {
                boolean z10 = obj instanceof n1;
                f2 f2Var = f2.f21533a;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    y yVar = obj2 instanceof y ? (y) obj2 : null;
                    sVar.k(yVar != null ? yVar.f21609a : null);
                    return f2Var;
                }
                d2 d2VarC = ((n1) obj).c();
                if (d2VarC == null) {
                    S((x1) obj);
                } else if (!d2VarC.d(sVar, 7)) {
                    boolean zD = d2VarC.d(sVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof c) {
                        thB = ((c) obj3).b();
                    } else {
                        y yVar2 = obj3 instanceof y ? (y) obj3 : null;
                        if (yVar2 != null) {
                            thB = yVar2.f21609a;
                        }
                    }
                    sVar.k(thB);
                    if (zD) {
                        break loop0;
                    }
                    return f2Var;
                }
            }
        }
        return sVar;
    }

    @Override // ph.s1
    @pg.d
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // ph.t
    public final void e0(y1 y1Var) {
        l(y1Var);
    }

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> operation) {
        kotlin.jvm.internal.r.e(operation, "operation");
        return operation.invoke(r10, this);
    }

    public boolean g0(Object obj) {
        return I(obj);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // ph.s1
    public final CancellationException getCancellationException() {
        Object obj = f21611a.get(this);
        if (!(obj instanceof c)) {
            if (!(obj instanceof n1)) {
                return obj instanceof y ? V(this, ((y) obj).f21609a) : new t1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thB = ((c) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = q();
        }
        return new t1(strConcat, thB, this);
    }

    @Override // ph.s1
    public final lh.g<s1> getChildren() {
        return new lh.k(new f(null));
    }

    public Object getCompleted() {
        return x();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f21611a.get(this);
        if (obj instanceof n1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            return yVar.f21609a;
        }
        return null;
    }

    @Override // tg.h.a
    public final h.b<?> getKey() {
        return s1.a.f21589a;
    }

    @Override // ph.s1
    public final xh.c getOnJoin() {
        g gVar = g.f21631a;
        kotlin.jvm.internal.r.c(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.m0.b(3, gVar);
        return new xh.d(this, gVar);
    }

    @Override // ph.s1
    public final s1 getParent() {
        r rVar = (r) f21612b.get(this);
        if (rVar != null) {
            return rVar.getParent();
        }
        return null;
    }

    public void i(Object obj) {
    }

    @Override // ph.s1
    public final b1 invokeOnCompletion(eh.l<? super Throwable, pg.f0> lVar) {
        return G(true, new r1(lVar));
    }

    @Override // ph.s1
    public boolean isActive() {
        Object obj = f21611a.get(this);
        return (obj instanceof n1) && ((n1) obj).isActive();
    }

    @Override // ph.s1
    public final boolean isCancelled() {
        Object obj = f21611a.get(this);
        if (obj instanceof y) {
            return true;
        }
        return (obj instanceof c) && ((c) obj).d();
    }

    @Override // ph.s1
    public final boolean isCompleted() {
        return !(f21611a.get(this) instanceof n1);
    }

    public void j(Object obj) {
        i(obj);
    }

    @Override // ph.s1
    public final Object join(tg.e<? super pg.f0> eVar) throws Throwable {
        Object obj;
        do {
            obj = f21611a.get(this);
            if (!(obj instanceof n1)) {
                v1.e(eVar.getContext());
                return pg.f0.f21461a;
            }
        } while (T(obj) < 0);
        m mVar = new m(1, ah.p.c(eVar));
        mVar.p();
        mVar.t(new c1(v1.g(this, new j2(mVar))));
        Object objO = mVar.o();
        ug.a aVar = ug.a.f29706a;
        if (objO != aVar) {
            objO = pg.f0.f21461a;
        }
        return objO == aVar ? objO : pg.f0.f21461a;
    }

    public final Object k(tg.e<Object> eVar) throws Throwable {
        Object obj;
        do {
            obj = f21611a.get(this);
            if (!(obj instanceof n1)) {
                if (obj instanceof y) {
                    throw ((y) obj).f21609a;
                }
                return b2.a(obj);
            }
        } while (T(obj) < 0);
        a aVar = new a(this, ah.p.c(eVar));
        aVar.p();
        aVar.t(new c1(v1.g(this, new i2(aVar))));
        Object objO = aVar.o();
        ug.a aVar2 = ug.a.f29706a;
        return objO;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(Object obj) {
        uh.v vVar;
        Object objW = b2.f21498a;
        if (A()) {
            do {
                Object obj2 = f21611a.get(this);
                if (obj2 instanceof n1) {
                    if (obj2 instanceof c) {
                        if (c.f21618b.get((c) obj2) == 1) {
                        }
                    }
                    objW = W(obj2, new y(false, u(obj)));
                }
                objW = b2.f21498a;
                break;
            } while (objW == b2.f21500c);
            if (objW != b2.f21499b) {
                if (objW == b2.f21498a) {
                    Throwable thU = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21611a;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof c)) {
                            if (!(obj3 instanceof n1)) {
                                vVar = b2.f21501d;
                                break;
                            }
                            if (thU == null) {
                                thU = u(obj);
                            }
                            n1 n1Var = (n1) obj3;
                            if (n1Var.isActive()) {
                                d2 d2VarB = B(n1Var);
                                if (d2VarB != null) {
                                    c cVar = new c(d2VarB, thU);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, n1Var, cVar)) {
                                        if (atomicReferenceFieldUpdater.get(this) != n1Var) {
                                            break;
                                        }
                                    }
                                    O(d2VarB, thU);
                                    vVar = b2.f21498a;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objW2 = W(obj3, new y(false, thU));
                                if (objW2 == b2.f21498a) {
                                    throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                                }
                                if (objW2 != b2.f21500c) {
                                    objW = objW2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (c.f21620d.get((c) obj3) == b2.f21502e) {
                                    vVar = b2.f21501d;
                                } else {
                                    boolean zD = ((c) obj3).d();
                                    if (obj != null || !zD) {
                                        if (thU == null) {
                                            thU = u(obj);
                                        }
                                        ((c) obj3).a(thU);
                                    }
                                    Throwable thB = zD ? null : ((c) obj3).b();
                                    if (thB != null) {
                                        O(((c) obj3).f21621a, thB);
                                    }
                                    vVar = b2.f21498a;
                                }
                            }
                        }
                    }
                    objW = vVar;
                }
                if (objW != b2.f21498a && objW != b2.f21499b) {
                    if (objW == b2.f21501d) {
                        return false;
                    }
                    i(objW);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // ph.h2
    public final CancellationException l0() {
        CancellationException cancellationExceptionB;
        Object obj = f21611a.get(this);
        if (obj instanceof c) {
            cancellationExceptionB = ((c) obj).b();
        } else if (obj instanceof y) {
            cancellationExceptionB = ((y) obj).f21609a;
        } else {
            if (obj instanceof n1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            cancellationExceptionB = null;
        }
        CancellationException cancellationException = cancellationExceptionB instanceof CancellationException ? cancellationExceptionB : null;
        return cancellationException == null ? new t1("Parent job is ".concat(U(obj)), cancellationExceptionB, this) : cancellationException;
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    public void n(CancellationException cancellationException) {
        l(cancellationException);
    }

    public final boolean o(Throwable th2) {
        if (!H()) {
            boolean z10 = th2 instanceof CancellationException;
            r rVar = (r) f21612b.get(this);
            return (rVar == null || rVar == f2.f21533a) ? z10 : rVar.b(th2) || z10;
        }
        return true;
    }

    @Override // ph.s1
    @pg.d
    public final s1 plus(s1 s1Var) {
        return s1Var;
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return l(th2) && z();
    }

    @Override // ph.s1
    public final boolean start() {
        int iT;
        do {
            iT = T(f21611a.get(this));
            if (iT == 0) {
                return false;
            }
        } while (iT != 1);
        return true;
    }

    public final void t(n1 n1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21612b;
        r rVar = (r) atomicReferenceFieldUpdater.get(this);
        if (rVar != null) {
            rVar.a();
            atomicReferenceFieldUpdater.set(this, f2.f21533a);
        }
        z zVar = null;
        y yVar = obj instanceof y ? (y) obj : null;
        Throwable th2 = yVar != null ? yVar.f21609a : null;
        if (n1Var instanceof x1) {
            try {
                ((x1) n1Var).k(th2);
                return;
            } catch (Throwable th3) {
                D(new z("Exception in completion handler " + n1Var + " for " + this, th3));
                return;
            }
        }
        d2 d2VarC = n1Var.c();
        if (d2VarC != null) {
            d2VarC.d(new uh.j(1), 1);
            Object obj2 = uh.l.f29752a.get(d2VarC);
            kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (uh.l lVarG = (uh.l) obj2; !lVarG.equals(d2VarC); lVarG = lVarG.g()) {
                if (lVarG instanceof x1) {
                    try {
                        ((x1) lVarG).k(th2);
                    } catch (Throwable th4) {
                        if (zVar != null) {
                            c9.u1.b(zVar, th4);
                        } else {
                            zVar = new z("Exception in completion handler " + lVarG + " for " + this, th4);
                            pg.f0 f0Var = pg.f0.f21461a;
                        }
                    }
                }
            }
            if (zVar != null) {
                D(zVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K() + '{' + U(f21611a.get(this)) + '}');
        sb.append('@');
        sb.append(m0.a(this));
        return sb.toString();
    }

    public final Throwable u(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new t1(q(), null, this) : th2;
        }
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((h2) obj).l0();
    }

    public final Object v(c cVar, Object obj) {
        Throwable thY;
        y yVar = obj instanceof y ? (y) obj : null;
        Throwable th2 = yVar != null ? yVar.f21609a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList arrayListE = cVar.e(th2);
            thY = y(cVar, arrayListE);
            if (thY != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                int size = arrayListE.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayListE.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != thY && th3 != thY && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        c9.u1.b(thY, th3);
                    }
                }
            }
        }
        if (thY != null && thY != th2) {
            obj = new y(false, thY);
        }
        if (thY != null && (o(thY) || C(thY))) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            y.f21608b.compareAndSet((y) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21611a;
        Object o1Var = obj instanceof n1 ? new o1((n1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, o1Var) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        t(cVar, obj);
        return obj;
    }

    public final Object x() throws Throwable {
        Object obj = f21611a.get(this);
        if (obj instanceof n1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof y) {
            throw ((y) obj).f21609a;
        }
        return b2.a(obj);
    }

    public final Throwable y(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new t1(q(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof r2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof r2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean z() {
        return true;
    }

    @Override // ph.s1
    @pg.d
    public /* synthetic */ boolean cancel(Throwable th2) {
        n(th2 != null ? V(this, th2) : new t1(q(), null, this));
        return true;
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }

    @Override // ph.s1
    public final b1 invokeOnCompletion(boolean z10, boolean z11, eh.l<? super Throwable, pg.f0> lVar) {
        x1 r1Var;
        if (z10) {
            r1Var = new q1(lVar);
        } else {
            r1Var = new r1(lVar);
        }
        return G(z11, r1Var);
    }

    @Override // ph.s1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new t1(q(), null, this);
        }
        n(cancellationException);
    }
}

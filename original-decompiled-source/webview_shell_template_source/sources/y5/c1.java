package y5;

import com.google.android.gms.internal.ads.hm1;
import g5.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y5.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c1 implements x0, j1 {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(c1.class, Object.class, "_state");

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15322t = AtomicReferenceFieldUpdater.newUpdater(c1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends b1 {

        /* renamed from: w, reason: collision with root package name */
        public final c1 f15323w;

        /* renamed from: x, reason: collision with root package name */
        public final b f15324x;

        /* renamed from: y, reason: collision with root package name */
        public final j f15325y;

        /* renamed from: z, reason: collision with root package name */
        public final Object f15326z;

        public a(c1 c1Var, b bVar, j jVar, Object obj) {
            this.f15323w = c1Var;
            this.f15324x = bVar;
            this.f15325y = jVar;
            this.f15326z = obj;
        }

        @Override // p5.l
        public final /* bridge */ /* synthetic */ d5.j invoke(Throwable th) {
            j(th);
            return d5.j.f12745a;
        }

        @Override // y5.n
        public final void j(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1.s;
            c1 c1Var = this.f15323w;
            c1Var.getClass();
            j jVarI = c1.I(this.f15325y);
            b bVar = this.f15324x;
            Object obj = this.f15326z;
            if (jVarI != null) {
                while (jVarI.f15351w.f((1 & 1) == 0, (1 & 2) != 0, new a(c1Var, bVar, jVarI, obj)) == h1.s) {
                    jVarI = c1.I(jVarI);
                    if (jVarI == null) {
                    }
                }
                return;
            }
            c1Var.n(c1Var.B(bVar, obj));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b implements s0 {

        /* renamed from: t, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f15327t = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting");

        /* renamed from: u, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f15328u = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause");

        /* renamed from: v, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f15329v = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting = 0;
        private volatile Object _rootCause;
        public final g1 s;

        public b(g1 g1Var, Throwable th) {
            this.s = g1Var;
            this._rootCause = th;
        }

        @Override // y5.s0
        public final boolean a() {
            return d() == null;
        }

        public final void b(Throwable th) {
            Throwable thD = d();
            if (thD == null) {
                f15328u.set(this, th);
                return;
            }
            if (th == thD) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15329v;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Override // y5.s0
        public final g1 c() {
            return this.s;
        }

        public final Throwable d() {
            return (Throwable) f15328u.get(this);
        }

        public final boolean e() {
            return d() != null;
        }

        public final boolean f() {
            return f15327t.get(this) != 0;
        }

        public final ArrayList g(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15329v;
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
            Throwable thD = d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th != null && !th.equals(thD)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, e1.f15337e);
            return arrayList;
        }

        public final String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f15329v.get(this) + ", list=" + this.s + ']';
        }
    }

    public c1(boolean z6) {
        this._state = z6 ? e1.f15339g : e1.f15338f;
    }

    public static j I(b6.l lVar) {
        while (lVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.l.f2034t;
            b6.l lVarE = lVar.e();
            if (lVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (b6.l) obj;
                    if (!lVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = lVarE;
            }
        }
        while (true) {
            lVar = lVar.h();
            if (!lVar.i()) {
                if (lVar instanceof j) {
                    return (j) lVar;
                }
                if (lVar instanceof g1) {
                    return null;
                }
            }
        }
    }

    public static String N(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof s0 ? ((s0) obj).a() ? "Active" : "New" : obj instanceof l ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.e() ? "Cancelling" : bVar.f() ? "Completing" : "Active";
    }

    public final Throwable A(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new y0(y(), null, this) : th;
        }
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.ParentJob", obj);
        return ((j1) obj).p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object B(b bVar, Object obj) {
        Throwable y0Var = null;
        l lVar = obj instanceof l ? (l) obj : null;
        Throwable th = lVar != null ? lVar.f15358a : null;
        synchronized (bVar) {
            bVar.e();
            ArrayList arrayListG = bVar.g(th);
            if (!arrayListG.isEmpty()) {
                int size = arrayListG.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    Object obj2 = arrayListG.get(i6);
                    i6++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        y0Var = obj2;
                        break;
                    }
                }
                y0Var = y0Var;
                if (y0Var == null) {
                    y0Var = (Throwable) arrayListG.get(0);
                }
            } else if (bVar.e()) {
                y0Var = new y0(y(), null, this);
            }
            if (y0Var != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                int size2 = arrayListG.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj3 = arrayListG.get(i7);
                    i7++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != y0Var && th2 != y0Var && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        b0.a(y0Var, th2);
                    }
                }
            }
        }
        if (y0Var != null && y0Var != th) {
            obj = new l(y0Var, false);
        }
        if (y0Var != null && x(y0Var)) {
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            l.f15357b.compareAndSet((l) obj, 0, 1);
        }
        K(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        Object t0Var = obj instanceof s0 ? new t0((s0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, t0Var) && atomicReferenceFieldUpdater.get(this) == bVar) {
        }
        z(bVar, obj);
        return obj;
    }

    public boolean C() {
        return true;
    }

    public final g1 D(s0 s0Var) {
        g1 g1VarC = s0Var.c();
        if (g1VarC != null) {
            return g1VarC;
        }
        if (s0Var instanceof k0) {
            return new g1();
        }
        if (s0Var instanceof b1) {
            M((b1) s0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + s0Var).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = s.get(this);
            if (!(obj instanceof b6.q)) {
                return obj;
            }
            ((b6.q) obj).a(this);
        }
    }

    public final void G(x0 x0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15322t;
        h1 h1Var = h1.s;
        if (x0Var == null) {
            atomicReferenceFieldUpdater.set(this, h1Var);
            return;
        }
        x0Var.start();
        i iVarI = x0Var.i(this);
        atomicReferenceFieldUpdater.set(this, iVarI);
        if (E() instanceof s0) {
            return;
        }
        iVarI.d();
        atomicReferenceFieldUpdater.set(this, h1Var);
    }

    public boolean H() {
        return false;
    }

    public final void J(g1 g1Var, Throwable th) {
        Object objG = g1Var.g();
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objG);
        hm1 hm1Var = null;
        for (b6.l lVarH = (b6.l) objG; !lVarH.equals(g1Var); lVarH = lVarH.h()) {
            if (lVarH instanceof z0) {
                b1 b1Var = (b1) lVarH;
                try {
                    b1Var.j(th);
                } catch (Throwable th2) {
                    if (hm1Var != null) {
                        b0.a(hm1Var, th2);
                    } else {
                        hm1Var = new hm1("Exception in completion handler " + b1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (hm1Var != null) {
            F(hm1Var);
        }
        x(th);
    }

    public final void M(b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1 g1Var = new g1();
        b1Var.getClass();
        b6.l.f2034t.lazySet(g1Var, b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b6.l.s;
        atomicReferenceFieldUpdater2.lazySet(g1Var, b1Var);
        loop0: while (true) {
            if (b1Var.g() == b1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b1Var, b1Var, g1Var)) {
                    if (atomicReferenceFieldUpdater2.get(b1Var) != b1Var) {
                        break;
                    }
                }
                g1Var.f(b1Var);
                break loop0;
            }
            break;
        }
        b6.l lVarH = b1Var.h();
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, lVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b1Var);
    }

    public final Object O(Object obj, Object obj2) {
        if (!(obj instanceof s0)) {
            return e1.f15333a;
        }
        if (((obj instanceof k0) || (obj instanceof b1)) && !(obj instanceof j) && !(obj2 instanceof l)) {
            s0 s0Var = (s0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            Object t0Var = obj2 instanceof s0 ? new t0((s0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, s0Var, t0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != s0Var) {
                    return e1.f15335c;
                }
            }
            K(obj2);
            z(s0Var, obj2);
            return obj2;
        }
        s0 s0Var2 = (s0) obj;
        g1 g1VarD = D(s0Var2);
        if (g1VarD == null) {
            return e1.f15335c;
        }
        j jVarI = null;
        b bVar = s0Var2 instanceof b ? (b) s0Var2 : null;
        if (bVar == null) {
            bVar = new b(g1VarD, null);
        }
        synchronized (bVar) {
            if (bVar.f()) {
                return e1.f15333a;
            }
            b.f15327t.set(bVar, 1);
            if (bVar != s0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, s0Var2, bVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != s0Var2) {
                        return e1.f15335c;
                    }
                }
            }
            boolean zE = bVar.e();
            l lVar = obj2 instanceof l ? (l) obj2 : null;
            if (lVar != null) {
                bVar.b(lVar.f15358a);
            }
            Throwable thD = bVar.d();
            if (zE) {
                thD = null;
            }
            if (thD != null) {
                J(g1VarD, thD);
            }
            j jVar = s0Var2 instanceof j ? (j) s0Var2 : null;
            if (jVar == null) {
                g1 g1VarC = s0Var2.c();
                if (g1VarC != null) {
                    jVarI = I(g1VarC);
                }
            } else {
                jVarI = jVar;
            }
            if (jVarI != null) {
                while (jVarI.f15351w.f((1 & 1) == 0, (1 & 2) != 0, new a(this, bVar, jVarI, obj2)) == h1.s) {
                    jVarI = I(jVarI);
                    if (jVarI == null) {
                    }
                }
                return e1.f15334b;
            }
            return B(bVar, obj2);
        }
    }

    @Override // y5.x0
    public boolean a() {
        Object objE = E();
        return (objE instanceof s0) && ((s0) objE).a();
    }

    @Override // g5.f
    public final g5.f b(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // g5.f
    public final g5.f e(g5.f fVar) {
        return f.b.a.c(this, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b3 A[SYNTHETIC] */
    @Override // y5.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j0 f(boolean z6, boolean z7, p5.l<? super Throwable, d5.j> lVar) {
        b1 w0Var;
        Throwable thD;
        if (z6) {
            w0Var = lVar instanceof z0 ? (z0) lVar : null;
            if (w0Var == null) {
                w0Var = new v0(lVar);
            }
        } else {
            w0Var = lVar instanceof b1 ? (b1) lVar : null;
            if (w0Var == null) {
                w0Var = new w0(lVar);
            }
        }
        w0Var.f15321v = this;
        loop0: while (true) {
            Object objE = E();
            if (objE instanceof k0) {
                k0 k0Var = (k0) objE;
                if (k0Var.s) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objE, w0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != objE) {
                            break;
                        }
                    }
                    break loop0;
                }
                g1 g1Var = new g1();
                Object r0Var = k0Var.s ? g1Var : new r0(g1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, k0Var, r0Var) && atomicReferenceFieldUpdater2.get(this) == k0Var) {
                }
            } else {
                if (!(objE instanceof s0)) {
                    if (z7) {
                        l lVar2 = objE instanceof l ? (l) objE : null;
                        lVar.invoke(lVar2 != null ? lVar2.f15358a : null);
                    }
                    return h1.s;
                }
                s0 s0Var = (s0) objE;
                g1 g1VarC = s0Var.c();
                if (g1VarC == null) {
                    M((b1) objE);
                } else {
                    j0 j0Var = h1.s;
                    if (z6 && (objE instanceof b)) {
                        synchronized (objE) {
                            try {
                                thD = ((b) objE).d();
                                if (thD == null || ((lVar instanceof j) && !((b) objE).f())) {
                                    if (l((s0) objE, g1VarC, w0Var)) {
                                        if (thD == null) {
                                            return w0Var;
                                        }
                                        j0Var = w0Var;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thD == null) {
                        }
                    } else {
                        thD = null;
                        if (thD == null) {
                            if (z7) {
                                lVar.invoke(thD);
                            }
                            return j0Var;
                        }
                        if (l(s0Var, g1VarC, w0Var)) {
                            break;
                        }
                    }
                }
            }
        }
        return w0Var;
    }

    @Override // g5.f.b
    public final f.c<?> getKey() {
        return x0.b.s;
    }

    @Override // y5.x0
    public final CancellationException h() {
        CancellationException cancellationException;
        Object objE = E();
        if (!(objE instanceof b)) {
            if (objE instanceof s0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objE instanceof l)) {
                return new y0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((l) objE).f15358a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new y0(y(), th, this) : cancellationException;
        }
        Throwable thD = ((b) objE).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = y();
        }
        return new y0(strConcat, thD, this);
    }

    @Override // y5.x0
    public final i i(c1 c1Var) {
        return (i) f((1 & 1) == 0, (1 & 2) != 0, new j(c1Var));
    }

    public final boolean l(s0 s0Var, g1 g1Var, b1 b1Var) {
        b6.l lVarE;
        d1 d1Var = new d1(b1Var, this, s0Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.l.f2034t;
            lVarE = g1Var.e();
            if (lVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(g1Var);
                while (true) {
                    lVarE = (b6.l) obj;
                    if (!lVarE.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVarE);
                }
            }
            b6.l.f2034t.lazySet(b1Var, lVarE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b6.l.s;
            atomicReferenceFieldUpdater2.lazySet(b1Var, g1Var);
            d1Var.f2037c = g1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(lVarE, g1Var, d1Var)) {
                if (atomicReferenceFieldUpdater2.get(lVarE) != g1Var) {
                    break;
                }
            }
        }
        return d1Var.a(lVarE) == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // y5.j1
    public final CancellationException p() {
        CancellationException cancellationExceptionD;
        Object objE = E();
        if (objE instanceof b) {
            cancellationExceptionD = ((b) objE).d();
        } else if (objE instanceof l) {
            cancellationExceptionD = ((l) objE).f15358a;
        } else {
            if (objE instanceof s0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objE).toString());
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new y0("Parent job is ".concat(N(objE)), cancellationExceptionD, this) : cancellationException;
    }

    @Override // y5.x0
    public final void r(CancellationException cancellationException) {
        w(cancellationException);
    }

    @Override // g5.f
    public final <R> R s(R r5, p5.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r5, pVar);
    }

    @Override // y5.x0
    public final boolean start() {
        while (true) {
            Object objE = E();
            boolean z6 = objE instanceof k0;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            if (z6) {
                if (((k0) objE).s) {
                    return false;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, objE, e1.f15339g)) {
                    if (atomicReferenceFieldUpdater.get(this) != objE) {
                        break;
                    }
                }
                return true;
            }
            if (!(objE instanceof r0)) {
                return false;
            }
            g1 g1Var = ((r0) objE).s;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, objE, g1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != objE) {
                    break;
                }
            }
            return true;
        }
    }

    @Override // g5.f
    public final <E extends f.b> E t(f.c<E> cVar) {
        kotlin.jvm.internal.j.e("key", cVar);
        if (kotlin.jvm.internal.j.a(x0.b.s, cVar)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + N(E()) + '}');
        sb.append('@');
        sb.append(b0.e(this));
        return sb.toString();
    }

    public void u(Object obj) {
        n(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[PHI: r0
      0x0038: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0006, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(Object obj) {
        b6.v vVar;
        Object objO = e1.f15333a;
        if (this instanceof a1) {
            do {
                Object objE = E();
                if (!(objE instanceof s0) || ((objE instanceof b) && ((b) objE).f())) {
                    objO = e1.f15333a;
                    break;
                }
                objO = O(objE, new l(A(obj), false));
            } while (objO == e1.f15335c);
            if (objO != e1.f15334b) {
                if (objO == e1.f15333a) {
                    Throwable thA = null;
                    loop1: while (true) {
                        Object objE2 = E();
                        if (!(objE2 instanceof b)) {
                            if (!(objE2 instanceof s0)) {
                                vVar = e1.f15336d;
                                break;
                            }
                            if (thA == null) {
                                thA = A(obj);
                            }
                            s0 s0Var = (s0) objE2;
                            if (s0Var.a()) {
                                g1 g1VarD = D(s0Var);
                                if (g1VarD != null) {
                                    b bVar = new b(g1VarD, thA);
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, s0Var, bVar)) {
                                        if (atomicReferenceFieldUpdater.get(this) != s0Var) {
                                            break;
                                        }
                                    }
                                    J(g1VarD, thA);
                                    vVar = e1.f15333a;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objO2 = O(objE2, new l(thA, false));
                                if (objO2 == e1.f15333a) {
                                    throw new IllegalStateException(("Cannot happen in " + objE2).toString());
                                }
                                if (objO2 != e1.f15335c) {
                                    objO = objO2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (objE2) {
                                if (b.f15329v.get((b) objE2) == e1.f15337e) {
                                    vVar = e1.f15336d;
                                } else {
                                    boolean zE = ((b) objE2).e();
                                    if (obj != null || !zE) {
                                        if (thA == null) {
                                            thA = A(obj);
                                        }
                                        ((b) objE2).b(thA);
                                    }
                                    Throwable thD = zE ? null : ((b) objE2).d();
                                    if (thD != null) {
                                        J(((b) objE2).s, thD);
                                    }
                                    vVar = e1.f15333a;
                                }
                            }
                        }
                    }
                    objO = vVar;
                }
                if (objO != e1.f15333a && objO != e1.f15334b) {
                    if (objO == e1.f15336d) {
                        return false;
                    }
                    n(objO);
                    return true;
                }
            }
        }
        return true;
    }

    public final boolean x(Throwable th) {
        if (!H()) {
            boolean z6 = th instanceof CancellationException;
            i iVar = (i) f15322t.get(this);
            return (iVar == null || iVar == h1.s) ? z6 : iVar.b(th) || z6;
        }
        return true;
    }

    public String y() {
        return "Job was cancelled";
    }

    public final void z(s0 s0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15322t;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        if (iVar != null) {
            iVar.d();
            atomicReferenceFieldUpdater.set(this, h1.s);
        }
        hm1 hm1Var = null;
        l lVar = obj instanceof l ? (l) obj : null;
        Throwable th = lVar != null ? lVar.f15358a : null;
        if (s0Var instanceof b1) {
            try {
                ((b1) s0Var).j(th);
                return;
            } catch (Throwable th2) {
                F(new hm1("Exception in completion handler " + s0Var + " for " + this, th2));
                return;
            }
        }
        g1 g1VarC = s0Var.c();
        if (g1VarC != null) {
            Object objG = g1VarC.g();
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objG);
            for (b6.l lVarH = (b6.l) objG; !lVarH.equals(g1VarC); lVarH = lVarH.h()) {
                if (lVarH instanceof b1) {
                    b1 b1Var = (b1) lVarH;
                    try {
                        b1Var.j(th);
                    } catch (Throwable th3) {
                        if (hm1Var != null) {
                            b0.a(hm1Var, th3);
                        } else {
                            hm1Var = new hm1("Exception in completion handler " + b1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (hm1Var != null) {
                F(hm1Var);
            }
        }
    }

    public void L() {
    }

    public void F(hm1 hm1Var) {
        throw hm1Var;
    }

    public void K(Object obj) {
    }

    public void n(Object obj) {
    }
}

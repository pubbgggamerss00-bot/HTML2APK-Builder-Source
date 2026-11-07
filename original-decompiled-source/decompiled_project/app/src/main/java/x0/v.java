package x0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p.n0;
import x0.g0;

/* loaded from: classes.dex */
public final class v implements f0, j2, r {

    /* renamed from: a, reason: collision with root package name */
    public final s f31924a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.r2 f31925b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<Object> f31926c = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f31927d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final p.n0 f31928e;

    /* renamed from: f, reason: collision with root package name */
    public final a3 f31929f;

    /* renamed from: g, reason: collision with root package name */
    public final p.l0<Object, Object> f31930g;

    /* renamed from: h, reason: collision with root package name */
    public final p.m0<h2> f31931h;

    /* renamed from: j, reason: collision with root package name */
    public final p.m0<h2> f31932j;

    /* renamed from: k, reason: collision with root package name */
    public final p.l0<Object, Object> f31933k;

    /* renamed from: l, reason: collision with root package name */
    public final y0.a f31934l;

    /* renamed from: m, reason: collision with root package name */
    public final y0.a f31935m;

    /* renamed from: n, reason: collision with root package name */
    public final p.l0<Object, Object> f31936n;

    /* renamed from: p, reason: collision with root package name */
    public p.l0<Object, Object> f31937p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31938q;

    /* renamed from: r, reason: collision with root package name */
    public v f31939r;

    /* renamed from: s, reason: collision with root package name */
    public int f31940s;

    /* renamed from: t, reason: collision with root package name */
    public final b0 f31941t;

    /* renamed from: v, reason: collision with root package name */
    public final k f31942v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31943w;

    public v(s sVar, i2.r2 r2Var) {
        this.f31924a = sVar;
        this.f31925b = r2Var;
        Object obj = null;
        p.n0 n0Var = new p.n0(new p.m0(obj));
        this.f31928e = n0Var;
        a3 a3Var = new a3();
        if (sVar.d()) {
            a3Var.f31619l = new p.y<>();
        }
        if (sVar.f()) {
            a3Var.e();
        }
        this.f31929f = a3Var;
        this.f31930g = p.w0.b();
        this.f31931h = new p.m0<>(obj);
        this.f31932j = new p.m0<>(obj);
        this.f31933k = p.w0.b();
        y0.a aVar = new y0.a();
        this.f31934l = aVar;
        y0.a aVar2 = new y0.a();
        this.f31935m = aVar2;
        this.f31936n = p.w0.b();
        this.f31937p = p.w0.b();
        this.f31941t = new b0();
        k kVar = new k(r2Var, sVar, a3Var, n0Var, aVar, aVar2, this);
        sVar.n(kVar);
        this.f31942v = kVar;
        f1.b bVar = g.f31680a;
    }

    public final void A() {
        AtomicReference<Object> atomicReference = this.f31926c;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.r.a(andSet, w.f31951a)) {
            return;
        }
        if (andSet instanceof Set) {
            u((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                u(set, false);
            }
            return;
        }
        if (andSet == null) {
            q.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new pg.g();
        }
        q.d("corrupt pendingModifications drain: " + atomicReference);
        throw new pg.g();
    }

    public final void B() {
        qg.b0 b0Var = qg.b0.f22711a;
        AtomicReference<Object> atomicReference = this.f31926c;
        Object andSet = atomicReference.getAndSet(b0Var);
        if (kotlin.jvm.internal.r.a(andSet, w.f31951a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            u((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            q.d("corrupt pendingModifications drain: " + atomicReference);
            throw new pg.g();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            u(set, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], EDGE_INSN: B:82:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:40:0x0075, B:41:0x007e, B:43:0x0086, B:45:0x008a, B:48:0x0096, B:50:0x00a6, B:52:0x00b2, B:54:0x00bc, B:58:0x00cb, B:62:0x00d7, B:63:0x00da, B:66:0x00df), top: B:79:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v0 C(h2 h2Var, b bVar, Object obj) {
        int i10;
        synchronized (this.f31927d) {
            try {
                v vVar = this.f31939r;
                v vVar2 = null;
                if (vVar != null) {
                    a3 a3Var = this.f31929f;
                    int i11 = this.f31940s;
                    if (a3Var.f31615g) {
                        q.c("Writer is active");
                    }
                    if (i11 < 0 || i11 >= a3Var.f31610b) {
                        q.c("Invalid group index");
                    }
                    if (a3Var.i(bVar)) {
                        int i12 = a3Var.f31609a[(i11 * 5) + 3] + i11;
                        int i13 = bVar.f31620a;
                        if (i11 > i13 || i13 >= i12) {
                            vVar = null;
                        }
                        vVar2 = vVar;
                    }
                }
                if (vVar2 == null) {
                    k kVar = this.f31942v;
                    if (kVar.E && kVar.v0(h2Var, obj)) {
                        return v0.f31947d;
                    }
                    this.f31941t.getClass();
                    this.f31924a.getClass();
                    if (obj != null && (obj instanceof h0)) {
                        Object objD = this.f31937p.d(h2Var);
                        if (objD == null) {
                            z0.e.a(this.f31937p, h2Var, obj);
                        } else if (objD instanceof p.m0) {
                            p.m0 m0Var = (p.m0) objD;
                            Object[] objArr = m0Var.f20753b;
                            long[] jArr = m0Var.f20752a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i14 = 0;
                                loop0: while (true) {
                                    long j10 = jArr[i14];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8;
                                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j10 & 255) < 128) {
                                                i10 = i15;
                                                if (objArr[(i14 << 3) + i17] == y2.f31977a) {
                                                    break loop0;
                                                }
                                            } else {
                                                i10 = i15;
                                            }
                                            j10 >>= i10;
                                            i17++;
                                            i15 = i10;
                                        }
                                        if (i16 != i15) {
                                            break;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                                z0.e.a(this.f31937p, h2Var, obj);
                            }
                        } else if (objD == y2.f31977a) {
                        }
                    } else {
                        this.f31937p.l(h2Var, y2.f31977a);
                    }
                }
                if (vVar2 != null) {
                    return vVar2.C(h2Var, bVar, obj);
                }
                this.f31924a.j(this);
                return this.f31942v.E ? v0.f31946c : v0.f31945b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void D(Object obj) {
        Object objD = this.f31930g.d(obj);
        if (objD == null) {
            return;
        }
        boolean z10 = objD instanceof p.m0;
        p.l0<Object, Object> l0Var = this.f31936n;
        if (!z10) {
            h2 h2Var = (h2) objD;
            if (h2Var.c(obj) == v0.f31947d) {
                z0.e.a(l0Var, obj, h2Var);
                return;
            }
            return;
        }
        p.m0 m0Var = (p.m0) objD;
        Object[] objArr = m0Var.f20753b;
        long[] jArr = m0Var.f20752a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        h2 h2Var2 = (h2) objArr[(i10 << 3) + i12];
                        if (h2Var2.c(obj) == v0.f31947d) {
                            z0.e.a(l0Var, obj, h2Var2);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // x0.r
    public final void a() {
        synchronized (this.f31927d) {
            try {
                if (this.f31942v.E) {
                    b2.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f31943w) {
                    this.f31943w = true;
                    f1.b bVar = g.f31681b;
                    y0.a aVar = this.f31942v.K;
                    if (aVar != null) {
                        v(aVar);
                    }
                    boolean z10 = this.f31929f.f31610b > 0;
                    if (z10 || !this.f31928e.f20764a.b()) {
                        f1.h hVar = new f1.h(this.f31928e);
                        if (z10) {
                            this.f31925b.getClass();
                            d3 d3VarG = this.f31929f.g();
                            try {
                                q.h(d3VarG, hVar);
                                pg.f0 f0Var = pg.f0.f21461a;
                                d3VarG.e(true);
                                this.f31925b.i();
                                this.f31925b.j();
                                hVar.b();
                            } catch (Throwable th2) {
                                d3VarG.e(false);
                                throw th2;
                            }
                        }
                        hVar.a();
                    }
                    k kVar = this.f31942v;
                    kVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        kVar.f31729b.q(kVar);
                        kVar.D.clear();
                        kVar.f31745r.clear();
                        kVar.f31732e.f33612a.I();
                        kVar.f31748u = null;
                        kVar.f31728a.i();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                pg.f0 f0Var3 = pg.f0.f21461a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f31924a.r(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    @Override // x0.f0, x0.j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        h2 h2VarZ;
        g0.a aVar;
        int i10;
        int i11;
        k kVar = this.f31942v;
        if (kVar.f31753z <= 0 && (h2VarZ = kVar.Z()) != null) {
            int i12 = h2VarZ.f31700a | 1;
            h2VarZ.f31700a = i12;
            Object obj2 = null;
            if ((i12 & 32) == 0) {
                p.f0<Object> f0Var = h2VarZ.f31705f;
                if (f0Var == null) {
                    f0Var = new p.f0<>(obj2);
                    h2VarZ.f31705f = f0Var;
                }
                int i13 = h2VarZ.f31704e;
                int iC = f0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i11 = -1;
                } else {
                    i11 = f0Var.f20617c[iC];
                }
                f0Var.f20616b[iC] = obj;
                f0Var.f20617c[iC] = i13;
                if (i11 == h2VarZ.f31704e) {
                    return;
                }
            }
            if (obj instanceof h1.j0) {
                ((h1.j0) obj).o(1);
            }
            z0.e.a(this.f31930g, obj, h2VarZ);
            if (obj instanceof h0) {
                h0<?> h0Var = (h0) obj;
                g0.a aVarL = h0Var.l();
                p.l0<Object, Object> l0Var = this.f31933k;
                z0.e.c(l0Var, obj);
                p.f0 f0Var2 = aVarL.f31690e;
                Object[] objArr = f0Var2.f20616b;
                long[] jArr = f0Var2.f20615a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j10 = jArr[i14];
                        aVar = aVarL;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    h1.i0 i0Var = (h1.i0) objArr[(i14 << 3) + i17];
                                    i10 = i15;
                                    if (i0Var instanceof h1.j0) {
                                        ((h1.j0) i0Var).o(1);
                                    }
                                    z0.e.a(l0Var, i0Var, obj);
                                } else {
                                    i10 = i15;
                                }
                                j10 >>= i10;
                                i17++;
                                i15 = i10;
                            }
                            if (i16 != i15) {
                                break;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                            aVarL = aVar;
                        }
                    }
                } else {
                    aVar = aVarL;
                }
                Object obj3 = aVar.f31691f;
                p.l0<h0<?>, Object> l0Var2 = h2VarZ.f31706g;
                if (l0Var2 == null) {
                    l0Var2 = new p.l0<>((Object) null);
                    h2VarZ.f31706g = l0Var2;
                }
                l0Var2.l(h0Var, obj3);
            }
        }
    }

    @Override // x0.f0
    public final void c(n2 n2Var) {
        k kVar = this.f31942v;
        if (kVar.E) {
            q.c("Preparing a composition while composing is not supported");
        }
        kVar.E = true;
        try {
            n2Var.invoke();
        } finally {
            kVar.E = false;
        }
    }

    @Override // x0.r
    public final void d(eh.p<? super j, ? super Integer, pg.f0> pVar) {
        f1.b bVar = (f1.b) pVar;
        if (this.f31943w) {
            b2.b("The composition is disposed");
        }
        this.f31924a.a(this, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // x0.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Set<? extends Object> set) {
        boolean z10 = set instanceof z0.d;
        p.l0<Object, Object> l0Var = this.f31933k;
        p.l0<Object, Object> l0Var2 = this.f31930g;
        if (z10) {
            p.x0<T> x0Var = ((z0.d) set).f34709a;
            Object[] objArr = x0Var.f20753b;
            long[] jArr = x0Var.f20752a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (l0Var2.b(obj) || l0Var.b(obj)) {
                                    break loop0;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        } else {
            for (Object obj2 : set) {
                if (l0Var2.b(obj2) || l0Var.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.f0
    public final void f(ArrayList arrayList) throws Exception {
        p.n0 n0Var = this.f31928e;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (!((j1) ((pg.n) arrayList.get(i10)).f21469a).f31720c.equals(this)) {
                    q.c("Check failed");
                    break;
                }
                i10++;
            }
        }
        try {
            k kVar = this.f31942v;
            kVar.getClass();
            try {
                kVar.b0(arrayList);
                kVar.O();
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                kVar.M();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!n0Var.f20764a.b()) {
                    new ArrayList();
                    if (!n0Var.f20764a.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            n0.a aVar = new n0.a(n0Var);
                            lh.h hVar = aVar.f20684b;
                            while (hVar.hasNext()) {
                                u2 u2Var = (u2) hVar.next();
                                aVar.remove();
                                u2Var.b();
                            }
                            pg.f0 f0Var2 = pg.f0.f21461a;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                }
                throw th3;
            } catch (Exception e10) {
                q();
                throw e10;
            }
        }
    }

    @Override // x0.j2
    public final void g() {
        this.f31938q = true;
    }

    @Override // x0.j2
    public final v0 h(h2 h2Var, Object obj) {
        v vVar;
        int i10 = h2Var.f31700a;
        if ((i10 & 2) != 0) {
            h2Var.f31700a = i10 | 4;
        }
        b bVar = h2Var.f31702c;
        if (bVar == null || !bVar.a()) {
            return v0.f31944a;
        }
        if (this.f31929f.i(bVar)) {
            return h2Var.f31703d != null ? C(h2Var, bVar, obj) : v0.f31944a;
        }
        synchronized (this.f31927d) {
            vVar = this.f31939r;
        }
        if (vVar != null) {
            k kVar = vVar.f31942v;
            if (kVar.E && kVar.v0(h2Var, obj)) {
                return v0.f31947d;
            }
        }
        return v0.f31944a;
    }

    @Override // x0.f0
    public final void i() {
        synchronized (this.f31927d) {
            try {
                if (this.f31935m.f33612a.L()) {
                    v(this.f31935m);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f31928e.f20764a.b()) {
                            p.n0 n0Var = this.f31928e;
                            new ArrayList();
                            if (!n0Var.f20764a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    n0.a aVar = new n0.a(n0Var);
                                    while (aVar.f20684b.hasNext()) {
                                        u2 u2Var = (u2) aVar.f20684b.next();
                                        aVar.remove();
                                        u2Var.b();
                                    }
                                    pg.f0 f0Var2 = pg.f0.f21461a;
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        q();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set[]] */
    @Override // x0.f0
    public final void j(z0.d dVar) {
        Object obj;
        boolean z10;
        z0.d dVar2;
        do {
            obj = this.f31926c.get();
            z10 = true;
            if (obj == null ? true : obj.equals(w.f31951a)) {
                dVar2 = dVar;
            } else if (obj instanceof Set) {
                dVar2 = new Set[]{obj, dVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f31926c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = dVar;
                dVar2 = CopyOf;
            }
            AtomicReference<Object> atomicReference = this.f31926c;
            while (true) {
                if (atomicReference.compareAndSet(obj, dVar2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (obj == null) {
            synchronized (this.f31927d) {
                A();
                pg.f0 f0Var = pg.f0.f21461a;
            }
        }
    }

    @Override // x0.r
    public final boolean k() {
        return this.f31943w;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Object obj, boolean z10) {
        int i10;
        Object objD = this.f31930g.d(obj);
        if (objD == null) {
            return;
        }
        boolean z11 = objD instanceof p.m0;
        p.m0<h2> m0Var = this.f31931h;
        p.m0<h2> m0Var2 = this.f31932j;
        p.l0<Object, Object> l0Var = this.f31936n;
        if (!z11) {
            h2 h2Var = (h2) objD;
            if (z0.e.b(l0Var, obj, h2Var) || h2Var.c(obj) == v0.f31944a) {
                return;
            }
            if (h2Var.f31706g == null || z10) {
                m0Var.d(h2Var);
                return;
            } else {
                m0Var2.d(h2Var);
                return;
            }
        }
        p.m0 m0Var3 = (p.m0) objD;
        Object[] objArr = m0Var3.f20753b;
        long[] jArr = m0Var3.f20752a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        h2 h2Var2 = (h2) objArr[(i11 << 3) + i14];
                        if (z0.e.b(l0Var, obj, h2Var2)) {
                            i10 = i12;
                        } else {
                            i10 = i12;
                            if (h2Var2.c(obj) != v0.f31944a) {
                                if (h2Var2.f31706g == null || z10) {
                                    m0Var.d(h2Var2);
                                } else {
                                    m0Var2.d(h2Var2);
                                }
                            }
                        }
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // x0.f0
    public final void m() {
        synchronized (this.f31927d) {
            try {
                v(this.f31934l);
                A();
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f31928e.f20764a.b()) {
                            p.n0 n0Var = this.f31928e;
                            new ArrayList();
                            if (!n0Var.f20764a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    n0.a aVar = new n0.a(n0Var);
                                    while (aVar.f20684b.hasNext()) {
                                        u2 u2Var = (u2) aVar.f20684b.next();
                                        aVar.remove();
                                        u2Var.b();
                                    }
                                    pg.f0 f0Var2 = pg.f0.f21461a;
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        q();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // x0.f0
    public final boolean n() {
        return this.f31942v.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // x0.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Object obj) {
        synchronized (this.f31927d) {
            try {
                D(obj);
                Object objD = this.f31933k.d(obj);
                if (objD != null) {
                    if (objD instanceof p.m0) {
                        p.m0 m0Var = (p.m0) objD;
                        Object[] objArr = m0Var.f20753b;
                        long[] jArr = m0Var.f20752a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j10 = jArr[i10];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j10) < 128) {
                                            D((h0) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 == length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        D((h0) objD);
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.r
    public final boolean p() {
        boolean z10;
        synchronized (this.f31927d) {
            z10 = this.f31937p.f20741e > 0;
        }
        return z10;
    }

    @Override // x0.f0
    public final void q() {
        this.f31926c.set(null);
        this.f31934l.f33612a.I();
        this.f31935m.f33612a.I();
        p.n0 n0Var = this.f31928e;
        if (n0Var.f20764a.b()) {
            return;
        }
        new ArrayList();
        if (n0Var.f20764a.b()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            n0.a aVar = new n0.a(n0Var);
            lh.h hVar = aVar.f20684b;
            while (hVar.hasNext()) {
                u2 u2Var = (u2) hVar.next();
                aVar.remove();
                u2Var.b();
            }
            pg.f0 f0Var = pg.f0.f21461a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // x0.f0
    public final void r() {
        synchronized (this.f31927d) {
            try {
                this.f31942v.f31748u = null;
                if (!this.f31928e.f20764a.b()) {
                    p.n0 n0Var = this.f31928e;
                    new ArrayList();
                    if (!n0Var.f20764a.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            n0.a aVar = new n0.a(n0Var);
                            while (aVar.f20684b.hasNext()) {
                                u2 u2Var = (u2) aVar.f20684b.next();
                                aVar.remove();
                                u2Var.b();
                            }
                            pg.f0 f0Var = pg.f0.f21461a;
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                pg.f0 f0Var2 = pg.f0.f21461a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f31928e.f20764a.b()) {
                            p.n0 n0Var2 = this.f31928e;
                            new ArrayList();
                            if (!n0Var2.f20764a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    n0.a aVar2 = new n0.a(n0Var2);
                                    while (aVar2.f20684b.hasNext()) {
                                        u2 u2Var2 = (u2) aVar2.f20684b.next();
                                        aVar2.remove();
                                        u2Var2.b();
                                    }
                                    pg.f0 f0Var3 = pg.f0.f21461a;
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        q();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // x0.f0
    public final boolean s() {
        boolean zE0;
        synchronized (this.f31927d) {
            try {
                z();
                try {
                    p.l0<Object, Object> l0Var = this.f31937p;
                    this.f31937p = p.w0.b();
                    try {
                        this.f31941t.getClass();
                        this.f31924a.getClass();
                        zE0 = this.f31942v.e0(l0Var);
                        if (!zE0) {
                            A();
                        }
                    } catch (Exception e10) {
                        this.f31937p = l0Var;
                        throw e10;
                    }
                } catch (Throwable th2) {
                    try {
                        if (!this.f31928e.f20764a.b()) {
                            p.n0 n0Var = this.f31928e;
                            new ArrayList();
                            if (!n0Var.f20764a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    n0.a aVar = new n0.a(n0Var);
                                    while (aVar.f20684b.hasNext()) {
                                        u2 u2Var = (u2) aVar.f20684b.next();
                                        aVar.remove();
                                        u2Var.b();
                                    }
                                    pg.f0 f0Var = pg.f0.f21461a;
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e11) {
                        q();
                        throw e11;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zE0;
    }

    @Override // x0.f0
    public final void t() {
        synchronized (this.f31927d) {
            try {
                for (Object obj : this.f31929f.f31611c) {
                    h2 h2Var = obj instanceof h2 ? (h2) obj : null;
                    if (h2Var != null) {
                        h2Var.invalidate();
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Set<? extends Object> set, boolean z10) {
        long j10;
        long j11;
        long j12;
        char c10;
        int i10;
        long[] jArr;
        long[] jArr2;
        long j13;
        boolean zA;
        long[] jArr3;
        long j14;
        long[] jArr4;
        long[] jArr5;
        int i11;
        long j15;
        boolean zB;
        int i12;
        long j16;
        long[] jArr6;
        long[] jArr7;
        char c11;
        long j17;
        int i13;
        int i14;
        long[] jArr8;
        boolean z11 = set instanceof z0.d;
        p.l0<Object, Object> l0Var = this.f31933k;
        Object obj = null;
        int i15 = 8;
        if (z11) {
            p.x0<T> x0Var = ((z0.d) set).f34709a;
            Object[] objArr = x0Var.f20753b;
            long[] jArr9 = x0Var.f20752a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i16 = 0;
                j10 = 128;
                j11 = 255;
                while (true) {
                    long j18 = jArr9[i16];
                    char c12 = 7;
                    j12 = -9187201950435737472L;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j18 & 255) < 128) {
                                Object obj2 = objArr[(i16 << 3) + i18];
                                c11 = c12;
                                if (obj2 instanceof h2) {
                                    ((h2) obj2).c(obj);
                                } else {
                                    l(obj2, z10);
                                    Object objD = l0Var.d(obj2);
                                    if (objD != null) {
                                        if (objD instanceof p.m0) {
                                            p.m0 m0Var = (p.m0) objD;
                                            Object[] objArr2 = m0Var.f20753b;
                                            long[] jArr10 = m0Var.f20752a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i19 = i15;
                                                i13 = length;
                                                int i20 = 0;
                                                while (true) {
                                                    long j19 = jArr10[i20];
                                                    j17 = j18;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j19) << c11) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            if ((j19 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                l((h0) objArr2[(i20 << 3) + i22], z10);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j19 >>= i19;
                                                            i22++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i21 != i19) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    jArr10 = jArr11;
                                                    j18 = j17;
                                                    jArr9 = jArr7;
                                                    i19 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j17 = j18;
                                            i13 = length;
                                            l((h0) objD, z10);
                                        }
                                        i14 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j17 = j18;
                                i13 = length;
                                i14 = 8;
                            } else {
                                jArr7 = jArr9;
                                c11 = c12;
                                j17 = j18;
                                i13 = length;
                                i14 = i15;
                            }
                            j18 = j17 >> i14;
                            i18++;
                            length = i13;
                            i15 = i14;
                            c12 = c11;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c10 = c12;
                        int i23 = length;
                        if (i17 != i15) {
                            break;
                        } else {
                            length = i23;
                        }
                    } else {
                        jArr6 = jArr9;
                        c10 = 7;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    jArr9 = jArr6;
                    obj = null;
                    i15 = 8;
                }
            } else {
                j10 = 128;
                j11 = 255;
                j12 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j10 = 128;
            j11 = 255;
            j12 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof h2) {
                    ((h2) obj3).c(null);
                } else {
                    l(obj3, z10);
                    Object objD2 = l0Var.d(obj3);
                    if (objD2 != null) {
                        if (objD2 instanceof p.m0) {
                            p.m0 m0Var2 = (p.m0) objD2;
                            Object[] objArr3 = m0Var2.f20753b;
                            long[] jArr12 = m0Var2.f20752a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j20 = jArr12[i10];
                                    if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i24 = 8 - ((~(i10 - length3)) >>> 31);
                                        for (int i25 = 0; i25 < i24; i25++) {
                                            if ((j20 & 255) < 128) {
                                                l((h0) objArr3[(i10 << 3) + i25], z10);
                                            }
                                            j20 >>= 8;
                                        }
                                        if (i24 == 8) {
                                            i10 = i10 != length3 ? i10 + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            l((h0) objD2, z10);
                        }
                    }
                }
            }
        }
        p.l0<Object, Object> l0Var2 = this.f31930g;
        p.m0<h2> m0Var3 = this.f31931h;
        if (z10) {
            p.m0<h2> m0Var4 = this.f31932j;
            if (m0Var4.c()) {
                long[] jArr13 = l0Var2.f20737a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j21 = jArr13[i26];
                        if ((((~j21) << c10) & j21 & j12) != j12) {
                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j21 & j11) < j10) {
                                    int i29 = (i26 << 3) + i28;
                                    Object obj4 = l0Var2.f20738b[i29];
                                    Object obj5 = l0Var2.f20739c[i29];
                                    if (obj5 instanceof p.m0) {
                                        p.m0 m0Var5 = (p.m0) obj5;
                                        Object[] objArr4 = m0Var5.f20753b;
                                        long[] jArr14 = m0Var5.f20752a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j15 = j21;
                                            int i30 = 0;
                                            while (true) {
                                                long j22 = jArr14[i30];
                                                jArr5 = jArr13;
                                                i11 = length4;
                                                if ((((~j22) << c10) & j22 & j12) != j12) {
                                                    int i31 = 8 - ((~(i30 - length5)) >>> 31);
                                                    for (int i32 = 0; i32 < i31; i32 = i12 + 1) {
                                                        if ((j22 & j11) < j10) {
                                                            i12 = i32;
                                                            int i33 = (i30 << 3) + i12;
                                                            j16 = j22;
                                                            h2 h2Var = (h2) objArr4[i33];
                                                            if (m0Var4.a(h2Var) || m0Var3.a(h2Var)) {
                                                                m0Var5.m(i33);
                                                            }
                                                        } else {
                                                            i12 = i32;
                                                            j16 = j22;
                                                        }
                                                        j22 = j16 >> 8;
                                                    }
                                                    if (i31 != 8) {
                                                        break;
                                                    }
                                                    if (i30 == length5) {
                                                        break;
                                                    }
                                                    i30++;
                                                    length4 = i11;
                                                    jArr13 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i11 = length4;
                                            j15 = j21;
                                        }
                                        zB = m0Var5.b();
                                    } else {
                                        jArr5 = jArr13;
                                        i11 = length4;
                                        j15 = j21;
                                        kotlin.jvm.internal.r.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        h2 h2Var2 = (h2) obj5;
                                        zB = m0Var4.a(h2Var2) || m0Var3.a(h2Var2);
                                    }
                                    if (zB) {
                                        l0Var2.k(i29);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i11 = length4;
                                    j15 = j21;
                                }
                                j21 = j15 >> 8;
                                i28++;
                                length4 = i11;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i34 = length4;
                            if (i27 != 8) {
                                break;
                            } else {
                                length4 = i34;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i26 == length4) {
                            break;
                        }
                        i26++;
                        jArr13 = jArr4;
                    }
                }
                m0Var4.e();
                w();
                return;
            }
        }
        if (m0Var3.c()) {
            long[] jArr15 = l0Var2.f20737a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j23 = jArr15[i35];
                    if ((((~j23) << c10) & j23 & j12) != j12) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j23 & j11) < j10) {
                                int i38 = (i35 << 3) + i37;
                                Object obj6 = l0Var2.f20738b[i38];
                                Object obj7 = l0Var2.f20739c[i38];
                                if (obj7 instanceof p.m0) {
                                    p.m0 m0Var6 = (p.m0) obj7;
                                    Object[] objArr5 = m0Var6.f20753b;
                                    long[] jArr16 = m0Var6.f20752a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j13 = j23;
                                        int i39 = 0;
                                        Object[] objArr6 = objArr5;
                                        while (true) {
                                            long j24 = jArr16[i39];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr17 = jArr16;
                                            if ((((~j24) << c10) & j24 & j12) != j12) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j24 & j11) < j10) {
                                                        jArr3 = jArr15;
                                                        int i42 = (i39 << 3) + i41;
                                                        j14 = j24;
                                                        if (m0Var3.a((h2) objArr7[i42])) {
                                                            m0Var6.m(i42);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j14 = j24;
                                                    }
                                                    i41++;
                                                    jArr15 = jArr3;
                                                    j24 = j14 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39++;
                                            objArr6 = objArr7;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j13 = j23;
                                    }
                                    zA = m0Var6.b();
                                } else {
                                    jArr2 = jArr15;
                                    j13 = j23;
                                    kotlin.jvm.internal.r.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zA = m0Var3.a((h2) obj7);
                                }
                                if (zA) {
                                    l0Var2.k(i38);
                                }
                            } else {
                                jArr2 = jArr15;
                                j13 = j23;
                            }
                            i37++;
                            j23 = j13 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i36 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i35 == length6) {
                        break;
                    }
                    i35++;
                    jArr15 = jArr;
                }
            }
            w();
            m0Var3.e();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(y0.a aVar) {
        long[] jArr;
        int i10;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i11;
        boolean zB;
        y0.a aVar2 = this.f31935m;
        f1.h hVar = new f1.h(this.f31928e);
        try {
            if (aVar.f33612a.K()) {
                if (aVar2.f33612a.K()) {
                    hVar.a();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                i2.r2 r2Var = this.f31925b;
                r2Var.getClass();
                d3 d3VarG = this.f31929f.g();
                int i12 = 0;
                try {
                    aVar.I(r2Var, d3VarG, hVar);
                    pg.f0 f0Var = pg.f0.f21461a;
                    d3VarG.e(true);
                    r2Var.j();
                    Trace.endSection();
                    hVar.b();
                    z0.b<eh.a<pg.f0>> bVar = hVar.f8796e;
                    if (bVar.f34702c != 0) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            eh.a<pg.f0>[] aVarArr = bVar.f34700a;
                            int i13 = bVar.f34702c;
                            for (int i14 = 0; i14 < i13; i14++) {
                                aVarArr[i14].invoke();
                            }
                            bVar.g();
                            pg.f0 f0Var2 = pg.f0.f21461a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (this.f31938q) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.f31938q = false;
                            p.l0<Object, Object> l0Var = this.f31930g;
                            long[] jArr3 = l0Var.f20737a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j12 = jArr3[i15];
                                    char c11 = 7;
                                    long j13 = -9187201950435737472L;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8;
                                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                                        int i18 = i12;
                                        while (i18 < i17) {
                                            if ((j12 & 255) < 128) {
                                                c10 = c11;
                                                int i19 = (i15 << 3) + i18;
                                                j11 = j13;
                                                Object obj = l0Var.f20738b[i19];
                                                Object obj2 = l0Var.f20739c[i19];
                                                if (obj2 instanceof p.m0) {
                                                    p.m0 m0Var = (p.m0) obj2;
                                                    Object[] objArr = m0Var.f20753b;
                                                    long[] jArr4 = m0Var.f20752a;
                                                    int i20 = i16;
                                                    int length2 = jArr4.length - 2;
                                                    i10 = i18;
                                                    jArr2 = jArr3;
                                                    if (length2 >= 0) {
                                                        int i21 = 0;
                                                        while (true) {
                                                            long j14 = jArr4[i21];
                                                            j10 = j12;
                                                            if ((((~j14) << c10) & j14 & j11) != j11) {
                                                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                for (int i23 = 0; i23 < i22; i23++) {
                                                                    if ((j14 & 255) < 128) {
                                                                        int i24 = (i21 << 3) + i23;
                                                                        if (!((h2) objArr[i24]).b()) {
                                                                            m0Var.m(i24);
                                                                        }
                                                                    }
                                                                    j14 >>= i20;
                                                                }
                                                                if (i22 != i20) {
                                                                    break;
                                                                }
                                                                if (i21 == length2) {
                                                                    break;
                                                                }
                                                                i21++;
                                                                i20 = 8;
                                                                j12 = j10;
                                                            }
                                                        }
                                                    } else {
                                                        j10 = j12;
                                                    }
                                                    zB = m0Var.b();
                                                } else {
                                                    i10 = i18;
                                                    jArr2 = jArr3;
                                                    j10 = j12;
                                                    kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                    zB = !((h2) obj2).b();
                                                }
                                                if (zB) {
                                                    l0Var.k(i19);
                                                }
                                                i11 = 8;
                                            } else {
                                                i10 = i18;
                                                jArr2 = jArr3;
                                                j10 = j12;
                                                c10 = c11;
                                                j11 = j13;
                                                i11 = i16;
                                            }
                                            j12 = j10 >> i11;
                                            i18 = i10 + 1;
                                            i16 = i11;
                                            c11 = c10;
                                            j13 = j11;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        if (i17 != i16) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                    }
                                    if (i15 == length) {
                                        break;
                                    }
                                    i15++;
                                    jArr3 = jArr;
                                    i12 = 0;
                                }
                            }
                            w();
                            pg.f0 f0Var3 = pg.f0.f21461a;
                            Trace.endSection();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (aVar2.f33612a.K()) {
                        hVar.a();
                    }
                } catch (Throwable th4) {
                    d3VarG.e(false);
                    throw th4;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th5) {
            if (aVar2.f33612a.K()) {
                hVar.a();
            }
            throw th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i10;
        long j13;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zB;
        int i12;
        long j16;
        p.l0<Object, Object> l0Var = this.f31933k;
        long[] jArr3 = l0Var.f20737a;
        int length = jArr3.length - 2;
        char c12 = 7;
        long j17 = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            long j18 = 128;
            while (true) {
                long j19 = jArr3[i14];
                j11 = 255;
                if ((((~j19) << c12) & j19 & j17) != j17) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j19 & 255) < j18) {
                            c11 = c12;
                            int i17 = (i14 << 3) + i16;
                            j14 = j17;
                            Object obj = l0Var.f20738b[i17];
                            Object obj2 = l0Var.f20739c[i17];
                            boolean z10 = obj2 instanceof p.m0;
                            p.l0<Object, Object> l0Var2 = this.f31930g;
                            if (z10) {
                                p.m0 m0Var = (p.m0) obj2;
                                Object[] objArr = m0Var.f20753b;
                                long[] jArr4 = m0Var.f20752a;
                                j15 = j18;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j13 = j19;
                                    int i18 = i13;
                                    int i19 = 0;
                                    while (true) {
                                        long j20 = jArr4[i19];
                                        jArr2 = jArr3;
                                        i10 = length;
                                        if ((((~j20) << c11) & j20 & j14) != j14) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j20 & 255) < j15) {
                                                    i12 = i21;
                                                    int i22 = (i19 << 3) + i12;
                                                    j16 = j20;
                                                    if (!l0Var2.b((h0) objArr[i22])) {
                                                        m0Var.m(i22);
                                                    }
                                                } else {
                                                    i12 = i21;
                                                    j16 = j20;
                                                }
                                                j20 = j16 >> i18;
                                                i21 = i12 + 1;
                                            }
                                            if (i20 != i18) {
                                                break;
                                            }
                                            if (i19 == length2) {
                                                break;
                                            }
                                            i19++;
                                            jArr3 = jArr2;
                                            length = i10;
                                            i18 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i10 = length;
                                    j13 = j19;
                                }
                                zB = m0Var.b();
                            } else {
                                jArr2 = jArr3;
                                i10 = length;
                                j13 = j19;
                                j15 = j18;
                                kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zB = !l0Var2.b((h0) obj2);
                            }
                            if (zB) {
                                l0Var.k(i17);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = length;
                            j13 = j19;
                            c11 = c12;
                            j14 = j17;
                            j15 = j18;
                            i11 = i13;
                        }
                        j19 = j13 >> i11;
                        i16++;
                        i13 = i11;
                        c12 = c11;
                        j17 = j14;
                        j18 = j15;
                        jArr3 = jArr2;
                        length = i10;
                    }
                    jArr = jArr3;
                    int i23 = length;
                    c10 = c12;
                    j10 = j17;
                    j12 = j18;
                    if (i15 != i13) {
                        break;
                    } else {
                        length = i23;
                    }
                } else {
                    jArr = jArr3;
                    c10 = c12;
                    j10 = j17;
                    j12 = j18;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c12 = c10;
                j17 = j10;
                j18 = j12;
                jArr3 = jArr;
                i13 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        p.m0<h2> m0Var2 = this.f31932j;
        if (!m0Var2.c()) {
            return;
        }
        Object[] objArr2 = m0Var2.f20753b;
        long[] jArr5 = m0Var2.f20752a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j21 = jArr5[i24];
            if ((((~j21) << c10) & j21 & j10) != j10) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j21 & j11) < j12) {
                        int i27 = (i24 << 3) + i26;
                        if (!(((h2) objArr2[i27]).f31706g != null)) {
                            m0Var2.m(i27);
                        }
                    }
                    j21 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    public final void x(f1.b bVar) throws Exception {
        try {
            synchronized (this.f31927d) {
                z();
                p.l0<Object, Object> l0Var = this.f31937p;
                this.f31937p = p.w0.b();
                try {
                    this.f31941t.getClass();
                    this.f31924a.getClass();
                    k kVar = this.f31942v;
                    if (!kVar.f31732e.f33612a.K()) {
                        q.c("Expected applyChanges() to have been called");
                    }
                    kVar.R(l0Var, bVar);
                } catch (Exception e10) {
                    this.f31937p = l0Var;
                    throw e10;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f31928e.f20764a.b()) {
                    p.n0 n0Var = this.f31928e;
                    new ArrayList();
                    if (!n0Var.f20764a.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            n0.a aVar = new n0.a(n0Var);
                            while (aVar.f20684b.hasNext()) {
                                u2 u2Var = (u2) aVar.f20684b.next();
                                aVar.remove();
                                u2Var.b();
                            }
                            pg.f0 f0Var = pg.f0.f21461a;
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e11) {
                q();
                throw e11;
            }
        }
    }

    public final void y() {
        synchronized (this.f31927d) {
            try {
                boolean z10 = this.f31929f.f31610b > 0;
                if (z10 || !this.f31928e.f20764a.b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        f1.h hVar = new f1.h(this.f31928e);
                        if (z10) {
                            this.f31925b.getClass();
                            d3 d3VarG = this.f31929f.g();
                            try {
                                q.e(d3VarG, hVar);
                                pg.f0 f0Var = pg.f0.f21461a;
                                d3VarG.e(true);
                                this.f31925b.j();
                                hVar.b();
                            } catch (Throwable th2) {
                                d3VarG.e(false);
                                throw th2;
                            }
                        }
                        hVar.a();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f31930g.f();
                this.f31933k.f();
                this.f31937p.f();
                this.f31934l.f33612a.I();
                this.f31935m.f33612a.I();
                k kVar = this.f31942v;
                kVar.D.clear();
                kVar.f31745r.clear();
                kVar.f31732e.f33612a.I();
                kVar.f31748u = null;
                pg.f0 f0Var3 = pg.f0.f21461a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void z() {
        AtomicReference<Object> atomicReference = this.f31926c;
        Object obj = w.f31951a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                q.d("pending composition has not been applied");
                throw new pg.g();
            }
            if (andSet instanceof Set) {
                u((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                q.d("corrupt pendingModifications drain: " + atomicReference);
                throw new pg.g();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                u(set, true);
            }
        }
    }
}

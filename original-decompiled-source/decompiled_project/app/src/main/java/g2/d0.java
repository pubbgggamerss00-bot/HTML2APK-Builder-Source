package g2;

import android.view.ViewGroup;
import androidx.compose.ui.d;
import d0.e2;
import g2.g1;
import g2.s1;
import g2.u1;
import h1.h;
import i2.e0;
import i2.n2;
import i2.o2;
import i2.r2;
import j2.b6;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.b2;
import x0.x1;
import z0.b;

/* loaded from: classes.dex */
public final class d0 implements x0.h {

    /* renamed from: a, reason: collision with root package name */
    public final i2.e0 f11324a;

    /* renamed from: b, reason: collision with root package name */
    public x0.s f11325b;

    /* renamed from: c, reason: collision with root package name */
    public u1 f11326c;

    /* renamed from: d, reason: collision with root package name */
    public int f11327d;

    /* renamed from: e, reason: collision with root package name */
    public int f11328e;

    /* renamed from: p, reason: collision with root package name */
    public int f11337p;

    /* renamed from: q, reason: collision with root package name */
    public int f11338q;

    /* renamed from: f, reason: collision with root package name */
    public final p.l0<i2.e0, b> f11329f = p.w0.b();

    /* renamed from: g, reason: collision with root package name */
    public final p.l0<Object, i2.e0> f11330g = p.w0.b();

    /* renamed from: h, reason: collision with root package name */
    public final c f11331h = new c();

    /* renamed from: j, reason: collision with root package name */
    public final a f11332j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final p.l0<Object, i2.e0> f11333k = p.w0.b();

    /* renamed from: l, reason: collision with root package name */
    public final u1.a f11334l = new u1.a(0);

    /* renamed from: m, reason: collision with root package name */
    public final p.l0<Object, s1.a> f11335m = p.w0.b();

    /* renamed from: n, reason: collision with root package name */
    public final z0.b<Object> f11336n = new z0.b<>(new Object[16]);

    /* renamed from: r, reason: collision with root package name */
    public final String f11339r = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final class a implements t1, o0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f11340a;

        public a() {
            this.f11340a = d0.this.f11331h;
        }

        @Override // f3.d
        public final long E(long j10) {
            return this.f11340a.E(j10);
        }

        @Override // g2.t1
        public final List<k0> F0(Object obj, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
            d0 d0Var = d0.this;
            i2.e0 e0Var = d0Var.f11324a;
            i2.e0 e0VarD = d0Var.f11330g.d(obj);
            if (e0VarD != null && ((b.a) e0Var.B()).f34703a.i(e0VarD) < d0Var.f11327d) {
                return e0VarD.w();
            }
            p.l0<Object, i2.e0> l0Var = d0Var.f11333k;
            z0.b<Object> bVar = d0Var.f11336n;
            if (bVar.f34702c < d0Var.f11328e) {
                f2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            int i10 = bVar.f34702c;
            int i11 = d0Var.f11328e;
            if (i10 == i11) {
                bVar.b(obj);
            } else {
                Object[] objArr = bVar.f34700a;
                Object obj2 = objArr[i11];
                objArr[i11] = obj;
            }
            d0Var.f11328e++;
            if (!l0Var.a(obj)) {
                d0Var.f11335m.l(obj, d0Var.f(obj, pVar));
                if (e0Var.K.f13917d == e0.d.f13835c) {
                    e0Var.c0(true);
                } else {
                    i2.e0.d0(e0Var, true, 6);
                }
            }
            i2.e0 e0VarD2 = l0Var.d(obj);
            if (e0VarD2 == null) {
                return qg.z.f22752a;
            }
            List<i2.x0> listQ0 = e0VarD2.K.f13929p.q0();
            b.a aVar = (b.a) listQ0;
            int i12 = aVar.f34703a.f34702c;
            for (int i13 = 0; i13 < i12; i13++) {
                ((i2.x0) aVar.get(i13)).f14047f.f13915b = true;
            }
            return listQ0;
        }

        @Override // f3.d
        public final float G0() {
            return this.f11340a.f11350c;
        }

        @Override // g2.q
        public final boolean I0() {
            return this.f11340a.I0();
        }

        @Override // g2.o0
        public final m0 K0(int i10, int i11, Map map, eh.l lVar) {
            return this.f11340a.K0(i10, i11, map, lVar);
        }

        @Override // f3.d
        public final float N0(float f10) {
            return this.f11340a.getDensity() * f10;
        }

        @Override // f3.d
        public final int T0(long j10) {
            return this.f11340a.T0(j10);
        }

        @Override // f3.d
        public final int b1(float f10) {
            return this.f11340a.b1(f10);
        }

        @Override // f3.d
        public final float getDensity() {
            return this.f11340a.f11349b;
        }

        @Override // g2.q
        public final f3.r getLayoutDirection() {
            return this.f11340a.f11348a;
        }

        @Override // g2.o0
        public final m0 i0(int i10, int i11, Map<g2.a, Integer> map, eh.l<? super g1.a, pg.f0> lVar) {
            return this.f11340a.K0(i10, i11, map, lVar);
        }

        @Override // f3.d
        public final long o(float f10) {
            return this.f11340a.o(f10);
        }

        @Override // f3.d
        public final long p(long j10) {
            return this.f11340a.p(j10);
        }

        @Override // f3.d
        public final float q(long j10) {
            return this.f11340a.q(j10);
        }

        @Override // f3.d
        public final float r1(long j10) {
            return this.f11340a.r1(j10);
        }

        @Override // f3.d
        public final long t(float f10) {
            return this.f11340a.t(f10);
        }

        @Override // f3.d
        public final float u(int i10) {
            return this.f11340a.u(i10);
        }

        @Override // f3.d
        public final float v(float f10) {
            return f10 / this.f11340a.getDensity();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f11342a;

        /* renamed from: b, reason: collision with root package name */
        public eh.p<? super x0.j, ? super Integer, pg.f0> f11343b;

        /* renamed from: c, reason: collision with root package name */
        public x0.v f11344c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11345d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11346e;

        /* renamed from: f, reason: collision with root package name */
        public x1 f11347f;

        public b() {
            throw null;
        }
    }

    public final class c implements t1 {

        /* renamed from: a, reason: collision with root package name */
        public f3.r f11348a = f3.r.f8829b;

        /* renamed from: b, reason: collision with root package name */
        public float f11349b;

        /* renamed from: c, reason: collision with root package name */
        public float f11350c;

        public c() {
        }

        @Override // g2.t1
        public final List<k0> F0(Object obj, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
            d0 d0Var = d0.this;
            d0Var.c();
            i2.e0 e0Var = d0Var.f11324a;
            e0.d dVar = e0Var.K.f13917d;
            e0.d dVar2 = e0.d.f13833a;
            if (dVar != dVar2 && dVar != e0.d.f13835c && dVar != e0.d.f13834b && dVar != e0.d.f13836d) {
                f2.a.b("subcompose can only be used inside the measure or layout blocks");
            }
            p.l0<Object, i2.e0> l0Var = d0Var.f11330g;
            i2.e0 e0VarD = l0Var.d(obj);
            if (e0VarD == null) {
                e0VarD = d0Var.f11333k.j(obj);
                if (e0VarD != null) {
                    if (d0Var.f11338q <= 0) {
                        f2.a.b("Check failed.");
                    }
                    d0Var.f11338q--;
                } else {
                    e0VarD = d0Var.h(obj);
                    if (e0VarD == null) {
                        int i10 = d0Var.f11327d;
                        i2.e0 e0Var2 = new i2.e0(2);
                        e0Var.f13825s = true;
                        e0Var.L(i10, e0Var2);
                        e0Var.f13825s = false;
                        e0VarD = e0Var2;
                    }
                }
                l0Var.l(obj, e0VarD);
            }
            i2.e0 e0Var3 = e0VarD;
            if (qg.x.E(d0Var.f11327d, e0Var.B()) != e0Var3) {
                int i11 = ((b.a) e0Var.B()).f34703a.i(e0Var3);
                if (i11 < d0Var.f11327d) {
                    f2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i12 = d0Var.f11327d;
                if (i12 != i11) {
                    e0Var.f13825s = true;
                    e0Var.T(i11, i12, 1);
                    e0Var.f13825s = false;
                }
            }
            d0Var.f11327d++;
            d0Var.g(e0Var3, obj, pVar);
            return (dVar == dVar2 || dVar == e0.d.f13835c) ? e0Var3.w() : e0Var3.v();
        }

        @Override // f3.d
        public final float G0() {
            return this.f11350c;
        }

        @Override // g2.q
        public final boolean I0() {
            e0.d dVar = d0.this.f11324a.K.f13917d;
            return dVar == e0.d.f13836d || dVar == e0.d.f13834b;
        }

        @Override // g2.o0
        public final m0 K0(int i10, int i11, Map map, eh.l lVar) {
            if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
                f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new e0(i10, i11, map, this, d0.this, lVar);
        }

        @Override // f3.d
        public final float getDensity() {
            return this.f11349b;
        }

        @Override // g2.q
        public final f3.r getLayoutDirection() {
            return this.f11348a;
        }
    }

    public static final class d implements s1.a {
        @Override // g2.s1.a
        public final void a() {
        }
    }

    public static final class e implements s1.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f11353b;

        public e(Object obj) {
            this.f11353b = obj;
        }

        @Override // g2.s1.a
        public final void a() {
            d0 d0Var = d0.this;
            i2.e0 e0Var = d0Var.f11324a;
            d0Var.c();
            i2.e0 e0VarJ = d0Var.f11333k.j(this.f11353b);
            if (e0VarJ != null) {
                if (d0Var.f11338q <= 0) {
                    f2.a.b("No pre-composed items to dispose");
                }
                int i10 = ((b.a) e0Var.B()).f34703a.i(e0VarJ);
                if (i10 < ((b.a) e0Var.B()).f34703a.f34702c - d0Var.f11338q) {
                    f2.a.b("Item is not in pre-composed item range");
                }
                d0Var.f11337p++;
                d0Var.f11338q--;
                int i11 = (((b.a) e0Var.B()).f34703a.f34702c - d0Var.f11338q) - d0Var.f11337p;
                e0Var.f13825s = true;
                e0Var.T(i10, i11, 1);
                e0Var.f13825s = false;
                d0Var.b(i11);
            }
        }

        @Override // g2.s1.a
        public final int b() {
            i2.e0 e0VarD = d0.this.f11333k.d(this.f11353b);
            if (e0VarD != null) {
                return ((b.a) e0VarD.A()).f34703a.f34702c;
            }
            return 0;
        }

        @Override // g2.s1.a
        public final void c(int i10, long j10) {
            d0 d0Var = d0.this;
            i2.e0 e0VarD = d0Var.f11333k.d(this.f11353b);
            if (e0VarD == null || !e0VarD.m()) {
                return;
            }
            int i11 = ((b.a) e0VarD.A()).f34703a.f34702c;
            if (i10 < 0 || i10 >= i11) {
                f2.a.d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
            }
            if (e0VarD.x()) {
                f2.a.a("Pre-measure called on node that is not placed");
            }
            i2.e0 e0Var = d0Var.f11324a;
            e0Var.f13825s = true;
            i2.i0.a(e0VarD).t((i2.e0) ((b.a) e0VarD.A()).get(i10), j10);
            e0Var.f13825s = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [z0.b] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [z0.b] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // g2.s1.a
        public final void d(e2.a.b bVar) {
            i2.d1 d1Var;
            d.c cVar;
            n2 n2Var;
            i2.e0 e0VarD = d0.this.f11333k.d(this.f11353b);
            if (e0VarD == null || (d1Var = e0VarD.I) == null || (cVar = d1Var.f13793e) == null) {
                return;
            }
            if (!cVar.f1144a.f1157p) {
                f2.a.b("visitSubtreeIf called on an unattached node");
            }
            z0.b bVar2 = new z0.b(new d.c[16]);
            d.c cVar2 = cVar.f1144a;
            d.c cVar3 = cVar2.f1149f;
            if (cVar3 == null) {
                i2.k.a(bVar2, cVar2);
            } else {
                bVar2.b(cVar3);
            }
            while (true) {
                int i10 = bVar2.f34702c;
                if (i10 == 0) {
                    return;
                }
                d.c cVar4 = (d.c) bVar2.k(i10 - 1);
                if ((cVar4.f1147d & PKIFailureInfo.transactionIdInUse) != 0) {
                    for (d.c cVar5 = cVar4; cVar5 != null; cVar5 = cVar5.f1149f) {
                        if ((cVar5.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                            i2.m mVarB = cVar5;
                            ?? bVar3 = 0;
                            while (mVarB != 0) {
                                if (mVarB instanceof o2) {
                                    o2 o2Var = (o2) mVarB;
                                    if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(o2Var.L())) {
                                        bVar.invoke(o2Var);
                                        n2Var = n2.f13964b;
                                    } else {
                                        n2Var = n2.f13963a;
                                    }
                                    if (n2Var == n2.f13965c) {
                                        return;
                                    }
                                    if (n2Var == n2.f13964b) {
                                        break;
                                    }
                                } else if ((mVarB.f1146c & PKIFailureInfo.transactionIdInUse) != 0 && (mVarB instanceof i2.m)) {
                                    d.c cVar6 = mVarB.f13947r;
                                    int i11 = 0;
                                    mVarB = mVarB;
                                    bVar3 = bVar3;
                                    while (cVar6 != null) {
                                        if ((cVar6.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                                            i11++;
                                            bVar3 = bVar3;
                                            if (i11 == 1) {
                                                mVarB = cVar6;
                                            } else {
                                                if (bVar3 == 0) {
                                                    bVar3 = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar3.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar3.b(cVar6);
                                            }
                                        }
                                        cVar6 = cVar6.f1149f;
                                        mVarB = mVarB;
                                        bVar3 = bVar3;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVarB = i2.k.b(bVar3);
                            }
                        }
                    }
                }
                i2.k.a(bVar2, cVar4);
            }
        }
    }

    public d0(i2.e0 e0Var, u1 u1Var) {
        this.f11324a = e0Var;
        this.f11326c = u1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // x0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        x0.v vVar;
        i2.e0 e0Var = this.f11324a;
        e0Var.f13825s = true;
        p.l0<i2.e0, b> l0Var = this.f11329f;
        Object[] objArr = l0Var.f20739c;
        long[] jArr = l0Var.f20737a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && (vVar = ((b) objArr[(i10 << 3) + i12]).f11344c) != null) {
                            vVar.a();
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
        e0Var.Z();
        e0Var.f13825s = false;
        l0Var.f();
        this.f11330g.f();
        this.f11338q = 0;
        this.f11337p = 0;
        this.f11333k.f();
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i10) {
        boolean z10;
        boolean z11 = false;
        this.f11337p = 0;
        List<i2.e0> listB = this.f11324a.B();
        b.a aVar = (b.a) listB;
        int i11 = (aVar.f34703a.f34702c - this.f11338q) - 1;
        if (i10 <= i11) {
            this.f11334l.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    b bVarD = this.f11329f.d((i2.e0) aVar.get(i12));
                    kotlin.jvm.internal.r.b(bVarD);
                    this.f11334l.f11456a.b(bVarD.f11342a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f11326c.a(this.f11334l);
            h1.h hVarA = h.a.a();
            eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
            h1.h hVarB = h.a.b(hVarA);
            z10 = false;
            while (i11 >= i10) {
                try {
                    i2.e0 e0Var = (i2.e0) ((b.a) listB).get(i11);
                    b bVarD2 = this.f11329f.d(e0Var);
                    kotlin.jvm.internal.r.b(bVarD2);
                    b bVar = bVarD2;
                    Object obj = bVar.f11342a;
                    if (this.f11334l.f11456a.a(obj)) {
                        this.f11337p++;
                        if (((Boolean) bVar.f11347f.getValue()).booleanValue()) {
                            i2.j0 j0Var = e0Var.K;
                            i2.x0 x0Var = j0Var.f13929p;
                            e0.f fVar = e0.f.f13842c;
                            x0Var.f14053m = fVar;
                            i2.p0 p0Var = j0Var.f13930q;
                            if (p0Var != null) {
                                p0Var.f13980k = fVar;
                            }
                            bVar.f11347f.setValue(Boolean.FALSE);
                            z10 = true;
                        }
                    } else {
                        i2.e0 e0Var2 = this.f11324a;
                        e0Var2.f13825s = true;
                        this.f11329f.j(e0Var);
                        x0.v vVar = bVar.f11344c;
                        if (vVar != null) {
                            vVar.a();
                        }
                        this.f11324a.a0(i11, 1);
                        e0Var2.f13825s = false;
                    }
                    this.f11330g.j(obj);
                    i11--;
                } catch (Throwable th2) {
                    h.a.d(hVarA, hVarB, lVarE);
                    throw th2;
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (h1.n.f12160c) {
                p.m0<h1.i0> m0Var = h1.n.f12167j.f12096h;
                if (m0Var != null) {
                    if (m0Var.c()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                h1.n.a();
            }
        }
        c();
    }

    public final void c() {
        int i10 = ((b.a) this.f11324a.B()).f34703a.f34702c;
        p.l0<i2.e0, b> l0Var = this.f11329f;
        if (l0Var.f20741e != i10) {
            f2.a.a("Inconsistency between the count of nodes tracked by the state (" + l0Var.f20741e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.f11337p) - this.f11338q < 0) {
            StringBuilder sbB = p.i0.b(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbB.append(this.f11337p);
            sbB.append(". Precomposed children ");
            sbB.append(this.f11338q);
            f2.a.a(sbB.toString());
        }
        p.l0<Object, i2.e0> l0Var2 = this.f11333k;
        if (l0Var2.f20741e == this.f11338q) {
            return;
        }
        f2.a.a("Incorrect state. Precomposed children " + this.f11338q + ". Map size " + l0Var2.f20741e);
    }

    @Override // x0.h
    public final void d() {
        e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(boolean z10) {
        this.f11338q = 0;
        this.f11333k.f();
        List<i2.e0> listB = this.f11324a.B();
        int i10 = ((b.a) listB).f34703a.f34702c;
        if (this.f11337p != i10) {
            this.f11337p = i10;
            h1.h hVarA = h.a.a();
            eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
            h1.h hVarB = h.a.b(hVarA);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    i2.e0 e0Var = (i2.e0) ((b.a) listB).get(i11);
                    b bVarD = this.f11329f.d(e0Var);
                    if (bVarD != null && ((Boolean) bVarD.f11347f.getValue()).booleanValue()) {
                        i2.j0 j0Var = e0Var.K;
                        i2.x0 x0Var = j0Var.f13929p;
                        e0.f fVar = e0.f.f13842c;
                        x0Var.f14053m = fVar;
                        i2.p0 p0Var = j0Var.f13930q;
                        if (p0Var != null) {
                            p0Var.f13980k = fVar;
                        }
                        if (z10) {
                            x0.v vVar = bVarD.f11344c;
                            if (vVar != null) {
                                vVar.y();
                            }
                            bVarD.f11347f = bg.b.h(Boolean.FALSE);
                        } else {
                            bVarD.f11347f.setValue(Boolean.FALSE);
                        }
                        bVarD.f11342a = p1.f11417a;
                    }
                } catch (Throwable th2) {
                    h.a.d(hVarA, hVarB, lVarE);
                    throw th2;
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
            this.f11330g.f();
        }
        c();
    }

    public final s1.a f(Object obj, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        i2.e0 e0Var = this.f11324a;
        if (!e0Var.m()) {
            return new d();
        }
        c();
        if (!this.f11330g.b(obj)) {
            this.f11335m.j(obj);
            p.l0<Object, i2.e0> l0Var = this.f11333k;
            i2.e0 e0VarD = l0Var.d(obj);
            if (e0VarD == null) {
                e0VarD = h(obj);
                if (e0VarD != null) {
                    int i10 = ((b.a) e0Var.B()).f34703a.i(e0VarD);
                    int i11 = ((b.a) e0Var.B()).f34703a.f34702c;
                    e0Var.f13825s = true;
                    e0Var.T(i10, i11, 1);
                    e0Var.f13825s = false;
                    this.f11338q++;
                } else {
                    int i12 = ((b.a) e0Var.B()).f34703a.f34702c;
                    i2.e0 e0Var2 = new i2.e0(2);
                    e0Var.f13825s = true;
                    e0Var.L(i12, e0Var2);
                    e0Var.f13825s = false;
                    this.f11338q++;
                    e0VarD = e0Var2;
                }
                l0Var.l(obj, e0VarD);
            }
            g(e0VarD, obj, pVar);
        }
        return new e(obj);
    }

    public final void g(i2.e0 e0Var, Object obj, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        p.l0<i2.e0, b> l0Var = this.f11329f;
        b bVarD = l0Var.d(e0Var);
        if (bVarD == null) {
            f1.b bVar = i.f11394a;
            bVarD = new b();
            bVarD.f11342a = obj;
            bVarD.f11343b = bVar;
            bVarD.f11344c = null;
            bVarD.f11347f = bg.b.h(Boolean.TRUE);
            l0Var.l(e0Var, bVarD);
        }
        b bVar2 = bVarD;
        x0.v vVar = bVar2.f11344c;
        boolean zP = vVar != null ? vVar.p() : true;
        if (bVar2.f11343b != pVar || zP || bVar2.f11345d) {
            bVar2.f11343b = pVar;
            h1.h hVarA = h.a.a();
            eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
            h1.h hVarB = h.a.b(hVarA);
            try {
                i2.e0 e0Var2 = this.f11324a;
                e0Var2.f13825s = true;
                eh.p<? super x0.j, ? super Integer, pg.f0> pVar2 = bVar2.f11343b;
                x0.v vVar2 = bVar2.f11344c;
                x0.s sVar = this.f11325b;
                if (sVar == null) {
                    f2.a.c("parent composition reference not set");
                    throw new pg.g();
                }
                boolean z10 = bVar2.f11346e;
                f1.b bVar3 = new f1.b(-1750409193, true, new g0(bVar2, pVar2));
                if (vVar2 == null || vVar2.k()) {
                    ViewGroup.LayoutParams layoutParams = b6.f14669a;
                    vVar2 = new x0.v(sVar, new r2(e0Var));
                }
                if (z10) {
                    x0.k kVar = vVar2.f31942v;
                    kVar.f31752y = 100;
                    kVar.f31751x = true;
                    if (vVar2.f31943w) {
                        b2.b("The composition is disposed");
                    }
                    vVar2.f31924a.a(vVar2, bVar3);
                    if (kVar.E || kVar.f31752y != 100) {
                        b2.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    kVar.f31752y = -1;
                    kVar.f31751x = false;
                } else {
                    vVar2.d(bVar3);
                }
                bVar2.f11344c = vVar2;
                bVar2.f11346e = false;
                e0Var2.f13825s = false;
                pg.f0 f0Var = pg.f0.f21461a;
                h.a.d(hVarA, hVarB, lVarE);
                bVar2.f11345d = false;
            } catch (Throwable th2) {
                h.a.d(hVarA, hVarB, lVarE);
                throw th2;
            }
        }
    }

    public final i2.e0 h(Object obj) {
        p.l0<i2.e0, b> l0Var;
        int i10;
        if (this.f11337p == 0) {
            return null;
        }
        i2.e0 e0Var = this.f11324a;
        b.a aVar = (b.a) e0Var.B();
        int i11 = aVar.f34703a.f34702c - this.f11338q;
        int i12 = i11 - this.f11337p;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            l0Var = this.f11329f;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            b bVarD = l0Var.d((i2.e0) aVar.get(i14));
            kotlin.jvm.internal.r.b(bVarD);
            if (kotlin.jvm.internal.r.a(bVarD.f11342a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (i13 >= i12) {
                b bVarD2 = l0Var.d((i2.e0) aVar.get(i13));
                kotlin.jvm.internal.r.b(bVarD2);
                b bVar = bVarD2;
                Object obj2 = bVar.f11342a;
                if (obj2 == p1.f11417a || this.f11326c.b(obj, obj2)) {
                    bVar.f11342a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            e0Var.f13825s = true;
            e0Var.T(i14, i12, 1);
            e0Var.f13825s = false;
        }
        this.f11337p--;
        i2.e0 e0Var2 = (i2.e0) aVar.get(i12);
        b bVarD3 = l0Var.d(e0Var2);
        kotlin.jvm.internal.r.b(bVarD3);
        b bVar2 = bVarD3;
        bVar2.f11347f = bg.b.h(Boolean.TRUE);
        bVar2.f11346e = true;
        bVar2.f11345d = true;
        return e0Var2;
    }

    @Override // x0.h
    public final void j() {
        e(false);
    }
}

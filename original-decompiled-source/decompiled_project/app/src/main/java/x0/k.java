package x0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import x0.j;
import y0.d;
import y0.e;

/* loaded from: classes.dex */
public final class k implements j {
    public int A;
    public boolean B;
    public final l C;
    public final ArrayList D;
    public boolean E;
    public z2 F;
    public a3 G;
    public d3 H;
    public boolean I;
    public a2 J;
    public y0.a K;
    public final y0.b L;
    public x0.b M;
    public y0.c N;
    public boolean O;
    public int P;
    public u Q;

    /* renamed from: a, reason: collision with root package name */
    public final i2.r2 f31728a;

    /* renamed from: b, reason: collision with root package name */
    public final s f31729b;

    /* renamed from: c, reason: collision with root package name */
    public final a3 f31730c;

    /* renamed from: d, reason: collision with root package name */
    public final p.n0 f31731d;

    /* renamed from: e, reason: collision with root package name */
    public final y0.a f31732e;

    /* renamed from: f, reason: collision with root package name */
    public final y0.a f31733f;

    /* renamed from: g, reason: collision with root package name */
    public final v f31734g;

    /* renamed from: i, reason: collision with root package name */
    public z1 f31736i;

    /* renamed from: j, reason: collision with root package name */
    public int f31737j;

    /* renamed from: k, reason: collision with root package name */
    public int f31738k;

    /* renamed from: l, reason: collision with root package name */
    public int f31739l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f31741n;

    /* renamed from: o, reason: collision with root package name */
    public p.w f31742o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31743p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31744q;

    /* renamed from: u, reason: collision with root package name */
    public p.y<a2> f31748u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31749v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f31751x;

    /* renamed from: z, reason: collision with root package name */
    public int f31753z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f31735h = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final t0 f31740m = new t0();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f31745r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final t0 f31746s = new t0();

    /* renamed from: t, reason: collision with root package name */
    public a2 f31747t = f1.f.f8790d;

    /* renamed from: w, reason: collision with root package name */
    public final t0 f31750w = new t0();

    /* renamed from: y, reason: collision with root package name */
    public int f31752y = -1;

    public static final class a implements x2 {

        /* renamed from: a, reason: collision with root package name */
        public final b f31754a;

        public a(b bVar) {
            this.f31754a = bVar;
        }

        @Override // x0.u2
        public final void b() {
            this.f31754a.s();
        }

        @Override // x0.u2
        public final void c() {
            this.f31754a.s();
        }

        @Override // x0.u2
        public final void d() {
        }
    }

    public final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        public final int f31755a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f31756b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f31757c;

        /* renamed from: d, reason: collision with root package name */
        public HashSet f31758d;

        /* renamed from: e, reason: collision with root package name */
        public final LinkedHashSet f31759e = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        public final x1 f31760f = new x1(f1.f.f8790d, s2.f31913a);

        public b(int i10, boolean z10, boolean z11, b0 b0Var) {
            this.f31755a = i10;
            this.f31756b = z10;
            this.f31757c = z11;
        }

        @Override // x0.s
        public final void a(v vVar, f1.b bVar) {
            k.this.f31729b.a(vVar, bVar);
        }

        @Override // x0.s
        public final void b(j1 j1Var) {
            k.this.f31729b.b(j1Var);
        }

        @Override // x0.s
        public final void c() {
            k kVar = k.this;
            kVar.f31753z--;
        }

        @Override // x0.s
        public final boolean d() {
            return k.this.f31729b.d();
        }

        @Override // x0.s
        public final boolean e() {
            return this.f31756b;
        }

        @Override // x0.s
        public final boolean f() {
            return this.f31757c;
        }

        @Override // x0.s
        public final a2 g() {
            return (a2) this.f31760f.getValue();
        }

        @Override // x0.s
        public final int h() {
            return this.f31755a;
        }

        @Override // x0.s
        public final tg.h i() {
            return k.this.f31729b.i();
        }

        @Override // x0.s
        public final void j(v vVar) {
            k kVar = k.this;
            s sVar = kVar.f31729b;
            sVar.j(kVar.f31734g);
            sVar.j(vVar);
        }

        @Override // x0.s
        public final void k(j1 j1Var, i1 i1Var, d<?> dVar) {
            k.this.f31729b.k(j1Var, i1Var, dVar);
        }

        @Override // x0.s
        public final i1 l(j1 j1Var) {
            return k.this.f31729b.l(j1Var);
        }

        @Override // x0.s
        public final void m(Set<i1.a> set) {
            HashSet hashSet = this.f31758d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f31758d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // x0.s
        public final void n(k kVar) {
            this.f31759e.add(kVar);
        }

        @Override // x0.s
        public final void o(v vVar) {
            k.this.f31729b.o(vVar);
        }

        @Override // x0.s
        public final void p() {
            k.this.f31753z++;
        }

        @Override // x0.s
        public final void q(j jVar) {
            HashSet hashSet = this.f31758d;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Set set = (Set) it.next();
                    kotlin.jvm.internal.r.c(jVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set.remove(((k) jVar).f31730c);
                }
            }
            LinkedHashSet linkedHashSet = this.f31759e;
            if (!(linkedHashSet instanceof fh.a) || (linkedHashSet instanceof fh.b)) {
                linkedHashSet.remove(jVar);
            } else {
                kotlin.jvm.internal.m0.d(linkedHashSet, "kotlin.collections.MutableCollection");
                throw null;
            }
        }

        @Override // x0.s
        public final void r(v vVar) {
            k.this.f31729b.r(vVar);
        }

        public final void s() {
            LinkedHashSet<k> linkedHashSet = this.f31759e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.f31758d;
            if (hashSet != null) {
                for (k kVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(kVar.f31730c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }

    public k(i2.r2 r2Var, s sVar, a3 a3Var, p.n0 n0Var, y0.a aVar, y0.a aVar2, v vVar) {
        this.f31728a = r2Var;
        this.f31729b = sVar;
        this.f31730c = a3Var;
        this.f31731d = n0Var;
        this.f31732e = aVar;
        this.f31733f = aVar2;
        this.f31734g = vVar;
        this.B = sVar.f() || sVar.d();
        this.C = new l(this);
        this.D = new ArrayList();
        z2 z2VarF = a3Var.f();
        z2VarF.c();
        this.F = z2VarF;
        a3 a3Var2 = new a3();
        if (sVar.f()) {
            a3Var2.e();
        }
        if (sVar.d()) {
            a3Var2.f31619l = new p.y<>();
        }
        this.G = a3Var2;
        d3 d3VarG = a3Var2.g();
        d3VarG.e(true);
        this.H = d3VarG;
        this.L = new y0.b(this, aVar);
        z2 z2VarF2 = this.G.f();
        try {
            x0.b bVarA = z2VarF2.a(0);
            z2VarF2.c();
            this.M = bVarA;
            this.N = new y0.c();
        } catch (Throwable th2) {
            z2VarF2.c();
            throw th2;
        }
    }

    public static final void N(k kVar, g1 g1Var, a2 a2Var, Object obj) {
        kVar.q(126665345, g1Var);
        kVar.c0();
        kVar.z0(obj);
        int i10 = kVar.P;
        try {
            kVar.P = 126665345;
            if (kVar.O) {
                d3.x(kVar.H);
            }
            boolean z10 = (kVar.O || kotlin.jvm.internal.r.a(kVar.F.f(), a2Var)) ? false : true;
            if (z10) {
                kVar.i0(a2Var);
            }
            kVar.q0(q.f31869c, 202, 0, a2Var);
            kVar.J = null;
            boolean z11 = kVar.f31749v;
            kVar.f31749v = z10;
            f1.m.d(kVar, new f1.b(316014703, true, new o(g1Var, obj)));
            kVar.f31749v = z11;
            kVar.T(false);
            kVar.J = null;
            kVar.P = i10;
            kVar.T(false);
        } catch (Throwable th2) {
            kVar.T(false);
            kVar.J = null;
            kVar.P = i10;
            kVar.T(false);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final j1 l0(k kVar, int i10) {
        ArrayList arrayList;
        z2 z2Var = kVar.F;
        int[] iArr = z2Var.f31991b;
        int i11 = i10 * 5;
        int i12 = iArr[i11];
        Object objN = z2Var.n(iArr, i10);
        if (i12 != 126665345 || !(objN instanceof g1)) {
            return null;
        }
        if (kVar.F.d(i10)) {
            ArrayList arrayList2 = new ArrayList();
            m0(kVar, arrayList2, i10);
            arrayList = !arrayList2.isEmpty() ? arrayList2 : null;
        }
        z2 z2Var2 = kVar.F;
        Object objN2 = z2Var2.n(z2Var2.f31991b, i10);
        kotlin.jvm.internal.r.c(objN2, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        g1 g1Var = (g1) objN2;
        Object objH = kVar.F.h(i10, 0);
        x0.b bVarA = kVar.F.a(i10);
        int i13 = kVar.F.f31991b[i11 + 3] + i10;
        ArrayList arrayList3 = kVar.f31745r;
        ArrayList arrayList4 = new ArrayList();
        int iG = q.g(i10, arrayList3);
        if (iG < 0) {
            iG = -(iG + 1);
        }
        while (iG < arrayList3.size()) {
            u0 u0Var = (u0) arrayList3.get(iG);
            if (u0Var.f31921b >= i13) {
                break;
            }
            arrayList4.add(u0Var);
            iG++;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size = arrayList4.size();
        for (int i14 = 0; i14 < size; i14++) {
            u0 u0Var2 = (u0) arrayList4.get(i14);
            arrayList5.add(new pg.n(u0Var2.f31920a, u0Var2.f31922c));
        }
        return new j1(g1Var, objH, kVar.f31734g, kVar.f31730c, bVarA, arrayList5, kVar.Q(i10), arrayList);
    }

    public static final void m0(k kVar, ArrayList arrayList, int i10) {
        int i11 = kVar.F.f31991b[(i10 * 5) + 3] + i10;
        int i12 = i10 + 1;
        while (i12 < i11) {
            z2 z2Var = kVar.F;
            int i13 = i12 * 5;
            if ((z2Var.f31991b[i13 + 1] & 134217728) != 0) {
                j1 j1VarL0 = l0(kVar, i12);
                if (j1VarL0 != null) {
                    arrayList.add(j1VarL0);
                }
            } else if (z2Var.d(i12)) {
                m0(kVar, arrayList, i12);
            }
            i12 += kVar.F.f31991b[i13 + 3];
        }
    }

    public static final int n0(k kVar, int i10, int i11, boolean z10, int i12) {
        z2 z2Var = kVar.F;
        s sVar = kVar.f31729b;
        y0.b bVar = kVar.L;
        int[] iArr = z2Var.f31991b;
        int i13 = i11 * 5;
        if ((iArr[i13 + 1] & 134217728) != 0) {
            int i14 = iArr[i13];
            Object objN = z2Var.n(iArr, i11);
            if (i14 == 126665345 && (objN instanceof g1)) {
                j1 j1VarL0 = l0(kVar, i11);
                if (j1VarL0 != null) {
                    sVar.b(j1VarL0);
                    bVar.e();
                    v vVar = kVar.f31734g;
                    s sVar2 = kVar.f31729b;
                    y0.e eVar = bVar.f33614b.f33612a;
                    eVar.M(d.u.f33658c);
                    e.b.c(eVar, vVar, sVar2, j1VarL0);
                }
                if (!z10 || i11 == i10) {
                    return z2Var.m(i11);
                }
                bVar.c();
                bVar.b();
                k kVar2 = bVar.f33613a;
                int iM = kVar2.F.j(i11) ? 1 : kVar2.F.m(i11);
                if (iM > 0) {
                    bVar.f(i12, iM);
                }
                return 0;
            }
            if (i14 == 206 && kotlin.jvm.internal.r.a(objN, q.f31871e)) {
                Object objH = z2Var.h(i11, 0);
                a aVar = objH instanceof a ? (a) objH : null;
                if (aVar != null) {
                    for (k kVar3 : aVar.f31754a.f31759e) {
                        a3 a3Var = kVar3.f31730c;
                        if (a3Var.f31610b > 0 && (a3Var.f31609a[1] & 67108864) != 0) {
                            v vVar2 = kVar3.f31734g;
                            synchronized (vVar2.f31927d) {
                                vVar2.B();
                                p.l0<Object, Object> l0Var = vVar2.f31937p;
                                vVar2.f31937p = p.w0.b();
                                try {
                                    vVar2.f31942v.w0(l0Var);
                                    pg.f0 f0Var = pg.f0.f21461a;
                                } catch (Exception e10) {
                                    vVar2.f31937p = l0Var;
                                    throw e10;
                                }
                            }
                            y0.a aVar2 = new y0.a();
                            kVar3.K = aVar2;
                            z2 z2VarF = kVar3.f31730c.f();
                            try {
                                kVar3.F = z2VarF;
                                y0.b bVar2 = kVar3.L;
                                y0.a aVar3 = bVar2.f33614b;
                                try {
                                    bVar2.f33614b = aVar2;
                                    kVar3.k0(0);
                                    y0.b bVar3 = kVar3.L;
                                    bVar3.b();
                                    if (bVar3.f33615c) {
                                        bVar3.f33614b.f33612a.M(d.a0.f33630c);
                                        if (bVar3.f33615c) {
                                            bVar3.d(false);
                                            bVar3.d(false);
                                            bVar3.f33614b.f33612a.M(d.j.f33647c);
                                            bVar3.f33615c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                z2VarF.c();
                            }
                        }
                        sVar.o(kVar3.f31734g);
                    }
                }
                return z2Var.m(i11);
            }
            if (!z2Var.j(i11)) {
                return z2Var.m(i11);
            }
        } else if (z2Var.d(i11)) {
            int i15 = iArr[i13 + 3] + i11;
            int iN0 = 0;
            for (int i16 = i11 + 1; i16 < i15; i16 += iArr[(i16 * 5) + 3]) {
                boolean zJ = z2Var.j(i16);
                if (zJ) {
                    bVar.c();
                    Object objL = z2Var.l(i16);
                    bVar.c();
                    bVar.f33620h.add(objL);
                }
                iN0 += n0(kVar, i10, i16, zJ || z10, zJ ? 0 : i12 + iN0);
                if (zJ) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!z2Var.j(i11)) {
                return iN0;
            }
        } else if (!z2Var.j(i11)) {
            return z2Var.m(i11);
        }
        return 1;
    }

    @Override // x0.j
    public final boolean A(int i10, boolean z10) {
        return ((i10 & 1) == 0 && (this.O || this.f31751x)) || z10 || !s();
    }

    public final int A0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f31741n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.F.m(i10) : i11;
        }
        p.w wVar = this.f31742o;
        if (wVar == null || wVar.c(i10) < 0) {
            return 0;
        }
        int iC = wVar.c(i10);
        if (iC >= 0) {
            return wVar.f20744c[iC];
        }
        q.d.c("Cannot find value for key " + i10);
        throw null;
    }

    @Override // x0.j
    public final void B() {
        T(false);
    }

    @Override // x0.j
    public final void C(Object obj) {
        int i10;
        z2 z2Var;
        int i11;
        d3 d3Var;
        if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            x0.b bVarA = null;
            if (this.O) {
                d3 d3Var2 = this.H;
                int i12 = d3Var2.f31651t;
                if (i12 > d3Var2.f31653v + 1) {
                    int i13 = i12 - 1;
                    int iE = d3Var2.E(d3Var2.f31633b, i13);
                    while (true) {
                        i11 = i13;
                        i13 = iE;
                        d3Var = this.H;
                        if (i13 == d3Var.f31653v || i13 < 0) {
                            break;
                        } else {
                            iE = d3Var.E(d3Var.f31633b, i13);
                        }
                    }
                    bVarA = d3Var.b(i11);
                }
            } else {
                z2 z2Var2 = this.F;
                int i14 = z2Var2.f31996g;
                if (i14 > z2Var2.f31998i + 1) {
                    int i15 = i14 - 1;
                    int iO = z2Var2.o(i15);
                    while (true) {
                        i10 = i15;
                        i15 = iO;
                        z2Var = this.F;
                        if (i15 == z2Var.f31998i || i15 < 0) {
                            break;
                        } else {
                            iO = z2Var.o(i15);
                        }
                    }
                    bVarA = z2Var.a(i10);
                }
            }
            v2 v2Var = new v2(u2Var, bVarA);
            if (this.O) {
                y0.e eVar = this.L.f33614b.f33612a;
                eVar.M(d.v.f33659c);
                e.b.a(eVar, 0, v2Var);
            }
            this.f31731d.add(obj);
            obj = v2Var;
        }
        z0(obj);
    }

    @Override // x0.j
    public final int D() {
        return this.P;
    }

    @Override // x0.j
    public final b E() {
        s0(206, q.f31871e);
        if (this.O) {
            d3.x(this.H);
        }
        Object objC0 = c0();
        a aVar = objC0 instanceof a ? (a) objC0 : null;
        if (aVar == null) {
            aVar = new a(new b(this.P, this.f31743p, this.B, this.f31734g.f31941t));
            z0(aVar);
        }
        b bVar = aVar.f31754a;
        bVar.f31760f.setValue(P());
        T(false);
        return bVar;
    }

    @Override // x0.j
    public final void F() {
        T(false);
    }

    @Override // x0.j
    public final void G() {
        T(false);
    }

    @Override // x0.j
    public final void H() {
        T(true);
    }

    @Override // x0.j
    public final void I(g2 g2Var) {
        h2 h2Var = g2Var instanceof h2 ? (h2) g2Var : null;
        if (h2Var == null) {
            return;
        }
        h2Var.f31700a |= 1;
    }

    @Override // x0.j
    public final <V, T> void J(V v10, eh.p<? super T, ? super V, pg.f0> pVar) {
        if (this.O) {
            y0.e eVar = this.N.f33625a;
            eVar.M(d.f0.f33640c);
            e.b.a(eVar, 0, v10);
            kotlin.jvm.internal.r.c(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.m0.b(2, pVar);
            e.b.a(eVar, 1, pVar);
            return;
        }
        y0.b bVar = this.L;
        bVar.b();
        y0.e eVar2 = bVar.f33614b.f33612a;
        eVar2.M(d.f0.f33640c);
        kotlin.jvm.internal.r.c(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.m0.b(2, pVar);
        e.b.b(eVar2, 0, v10, 1, pVar);
    }

    @Override // x0.j
    public final boolean K(Object obj) {
        if (kotlin.jvm.internal.r.a(c0(), obj)) {
            return false;
        }
        z0(obj);
        return true;
    }

    @Override // x0.j
    public final void L(int i10) {
        int i11;
        int i12;
        if (this.f31736i != null) {
            q0(null, i10, 0, null);
            return;
        }
        if (this.f31744q) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.P = this.f31739l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i10, 3);
        this.f31739l++;
        z2 z2Var = this.F;
        boolean z10 = this.O;
        j.a.C0321a c0321a = j.a.f31715a;
        if (z10) {
            z2Var.f32000k++;
            this.H.Q(i10, c0321a, c0321a, false);
            X(false, null);
            return;
        }
        if (z2Var.g() == i10 && ((i12 = z2Var.f31996g) >= z2Var.f31997h || (z2Var.f31991b[(i12 * 5) + 1] & PKIFailureInfo.duplicateCertReq) == 0)) {
            z2Var.s();
            X(false, null);
            return;
        }
        if (z2Var.f32000k <= 0 && (i11 = z2Var.f31996g) != z2Var.f31997h) {
            int i13 = this.f31737j;
            h0();
            this.L.f(i13, z2Var.q());
            q.a(this.f31745r, i11, z2Var.f31996g);
        }
        z2Var.f32000k++;
        this.O = true;
        this.J = null;
        if (this.H.f31654w) {
            d3 d3VarG = this.G.g();
            this.H = d3VarG;
            d3VarG.L();
            this.I = false;
            this.J = null;
        }
        d3 d3Var = this.H;
        d3Var.d();
        int i14 = d3Var.f31651t;
        d3Var.Q(i10, c0321a, c0321a, false);
        this.M = d3Var.b(i14);
        X(false, null);
    }

    public final void M() {
        O();
        this.f31735h.clear();
        this.f31740m.f31916b = 0;
        this.f31746s.f31916b = 0;
        this.f31750w.f31916b = 0;
        this.f31748u = null;
        y0.c cVar = this.N;
        cVar.f33626b.I();
        cVar.f33625a.I();
        this.P = 0;
        this.f31753z = 0;
        this.f31744q = false;
        this.O = false;
        this.f31751x = false;
        this.E = false;
        this.f31752y = -1;
        z2 z2Var = this.F;
        if (!z2Var.f31995f) {
            z2Var.c();
        }
        if (this.H.f31654w) {
            return;
        }
        Y();
    }

    public final void O() {
        this.f31736i = null;
        this.f31737j = 0;
        this.f31738k = 0;
        this.P = 0;
        this.f31744q = false;
        y0.b bVar = this.L;
        bVar.f33615c = false;
        bVar.f33616d.f31916b = 0;
        bVar.f33618f = 0;
        this.D.clear();
        this.f31741n = null;
        this.f31742o = null;
    }

    public final a2 P() {
        a2 a2Var = this.J;
        return a2Var != null ? a2Var : Q(this.F.f31998i);
    }

    public final a2 Q(int i10) {
        a2 a2VarB;
        boolean z10 = this.O;
        t1 t1Var = q.f31869c;
        if (z10 && this.I) {
            int iE = this.H.f31653v;
            while (iE > 0) {
                d3 d3Var = this.H;
                if (d3Var.f31633b[d3Var.q(iE) * 5] == 202 && kotlin.jvm.internal.r.a(this.H.r(iE), t1Var)) {
                    Object objP = this.H.p(iE);
                    kotlin.jvm.internal.r.c(objP, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    a2 a2Var = (a2) objP;
                    this.J = a2Var;
                    return a2Var;
                }
                d3 d3Var2 = this.H;
                iE = d3Var2.E(d3Var2.f31633b, iE);
            }
        }
        if (this.F.f31992c > 0) {
            while (i10 > 0) {
                z2 z2Var = this.F;
                int[] iArr = z2Var.f31991b;
                if (iArr[i10 * 5] == 202 && kotlin.jvm.internal.r.a(z2Var.n(iArr, i10), t1Var)) {
                    p.y<a2> yVar = this.f31748u;
                    if (yVar == null || (a2VarB = yVar.b(i10)) == null) {
                        z2 z2Var2 = this.F;
                        Object objB = z2Var2.b(z2Var2.f31991b, i10);
                        kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        a2VarB = (a2) objB;
                    }
                    this.J = a2VarB;
                    return a2VarB;
                }
                i10 = this.F.o(i10);
            }
        }
        a2 a2Var2 = this.f31747t;
        this.J = a2Var2;
        return a2Var2;
    }

    public final void R(p.l0 l0Var, f1.b bVar) {
        ArrayList arrayList = this.f31745r;
        if (this.E) {
            q.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = Long.hashCode(h1.n.k().g());
            this.f31748u = null;
            w0(l0Var);
            this.f31737j = 0;
            this.E = true;
            try {
                u0();
                Object objC0 = c0();
                if (objC0 != bVar && bVar != null) {
                    z0(bVar);
                }
                l lVar = this.C;
                z0.b bVarC = bg.b.c();
                try {
                    bVarC.b(lVar);
                    t1 t1Var = q.f31867a;
                    if (bVar != null) {
                        s0(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, t1Var);
                        f1.m.d(this, bVar);
                        T(false);
                    } else if (!this.f31749v || objC0 == null || objC0.equals(j.a.f31715a)) {
                        o0();
                    } else {
                        s0(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, t1Var);
                        kotlin.jvm.internal.m0.b(2, objC0);
                        f1.m.d(this, (eh.p) objC0);
                        T(false);
                    }
                    bVarC.k(bVarC.f34702c - 1);
                    W();
                    this.E = false;
                    arrayList.clear();
                    if (!this.H.f31654w) {
                        q.c("Check failed");
                    }
                    Y();
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    bVarC.k(bVarC.f34702c - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.E = false;
                arrayList.clear();
                M();
                if (!this.H.f31654w) {
                    q.c("Check failed");
                }
                Y();
                throw th3;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void S(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        S(this.F.o(i10), i11);
        if (this.F.j(i10)) {
            Object objL = this.F.l(i10);
            y0.b bVar = this.L;
            bVar.c();
            bVar.f33620h.add(objL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a8  */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(boolean z10) {
        int iHashCode;
        t0 t0Var;
        int i10;
        ArrayList arrayList;
        int i11;
        ?? r62;
        int i12;
        t0 t0Var2;
        int i13;
        int i14;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i15;
        int i16;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i17;
        z1 z1Var;
        int i18;
        Object[] objArr;
        long[] jArr;
        int i19;
        Object[] objArr2;
        long[] jArr2;
        int i20;
        Object[] objArr3;
        long[] jArr3;
        int i21;
        Object[] objArr4;
        long[] jArr4;
        int iHashCode2;
        t0 t0Var3 = this.f31740m;
        int i22 = t0Var3.f31915a[t0Var3.f31916b - 2] - 1;
        boolean z11 = this.O;
        j.a.C0321a c0321a = j.a.f31715a;
        if (z11) {
            d3 d3Var = this.H;
            int i23 = d3Var.f31653v;
            int i24 = d3Var.f31633b[d3Var.q(i23) * 5];
            Object objR = this.H.r(i23);
            Object objP = this.H.p(i23);
            if (objR != null) {
                iHashCode2 = Integer.hashCode(objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (objP == null || i24 != 207 || objP.equals(c0321a)) {
                iHashCode2 = Integer.rotateRight(i22 ^ this.P, 3) ^ Integer.hashCode(i24);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i22 ^ this.P, 3) ^ Integer.hashCode(objP.hashCode()), 3);
            }
            this.P = Integer.rotateRight(iHashCode2, 3);
        } else {
            z2 z2Var = this.F;
            int i25 = z2Var.f31998i;
            int[] iArr = z2Var.f31991b;
            int i26 = iArr[i25 * 5];
            Object objN = z2Var.n(iArr, i25);
            z2 z2Var2 = this.F;
            Object objB = z2Var2.b(z2Var2.f31991b, i25);
            if (objN != null) {
                iHashCode = Integer.hashCode(objN instanceof Enum ? ((Enum) objN).ordinal() : objN.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (objB == null || i26 != 207 || objB.equals(c0321a)) {
                iHashCode = Integer.rotateRight(i22 ^ this.P, 3) ^ Integer.hashCode(i26);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i22 ^ this.P, 3) ^ Integer.hashCode(objB.hashCode()), 3);
            }
            this.P = Integer.rotateRight(iHashCode, 3);
        }
        int i27 = this.f31738k;
        z1 z1Var2 = this.f31736i;
        ArrayList arrayList5 = this.f31745r;
        y0.b bVar = this.L;
        if (z1Var2 != null) {
            p.y<q0> yVar = z1Var2.f31988e;
            int i28 = z1Var2.f31985b;
            ArrayList arrayList6 = z1Var2.f31984a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = z1Var2.f31987d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i29 = 0; i29 < size; i29++) {
                    hashSet2.add(arrayList7.get(i29));
                }
                i11 = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                i10 = 1;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i30 < size3) {
                    x0 x0Var = (x0) arrayList6.get(i30);
                    if (hashSet2.contains(x0Var)) {
                        t0Var2 = t0Var3;
                        i13 = i30;
                        if (!linkedHashSet2.contains(x0Var)) {
                            int i33 = i31;
                            if (i33 < size2) {
                                x0 x0Var2 = (x0) arrayList7.get(i33);
                                if (x0Var2 != x0Var) {
                                    q0 q0VarB = yVar.b(x0Var2.f31960c);
                                    int i34 = q0VarB != null ? q0VarB.f31876b : -1;
                                    linkedHashSet2.add(x0Var2);
                                    i14 = i33;
                                    i17 = i32;
                                    z1Var = z1Var2;
                                    if (i34 != i17) {
                                        q0 q0VarB2 = yVar.b(x0Var2.f31960c);
                                        int i35 = q0VarB2 != null ? q0VarB2.f31877c : x0Var2.f31961d;
                                        linkedHashSet = linkedHashSet2;
                                        int i36 = i34 + i28;
                                        i15 = size2;
                                        int i37 = i17 + i28;
                                        if (i35 > 0) {
                                            i16 = i28;
                                            int i38 = bVar.f33624l;
                                            if (i38 > 0) {
                                                arrayList3 = arrayList6;
                                                if (bVar.f33622j == i36 - i38 && bVar.f33623k == i37 - i38) {
                                                    bVar.f33624l = i38 + i35;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            bVar.c();
                                            bVar.f33622j = i36;
                                            bVar.f33623k = i37;
                                            bVar.f33624l = i35;
                                        } else {
                                            i16 = i28;
                                            arrayList3 = arrayList6;
                                            bVar.getClass();
                                        }
                                        if (i34 > i17) {
                                            Object[] objArr5 = yVar.f20645c;
                                            long[] jArr5 = yVar.f20643a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i39 = 0;
                                                while (true) {
                                                    long j10 = jArr5[i39];
                                                    int i40 = i35;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i41 = 8 - ((~(i39 - length)) >>> 31);
                                                        int i42 = 0;
                                                        while (i42 < i41) {
                                                            if ((j10 & 255) < 128) {
                                                                i21 = i42;
                                                                q0 q0Var = (q0) objArr5[(i39 << 3) + i42];
                                                                objArr4 = objArr5;
                                                                int i43 = q0Var.f31876b;
                                                                jArr4 = jArr5;
                                                                if (i34 <= i43 && i43 < i34 + i40) {
                                                                    q0Var.f31876b = (i43 - i34) + i17;
                                                                } else if (i17 <= i43 && i43 < i34) {
                                                                    q0Var.f31876b = i43 + i40;
                                                                }
                                                            } else {
                                                                i21 = i42;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j10 >>= 8;
                                                            i42 = i21 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i41 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i39 == length) {
                                                        break;
                                                    }
                                                    i39++;
                                                    arrayList5 = arrayList2;
                                                    i35 = i40;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i44 = i35;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i17 > i34) {
                                                Object[] objArr6 = yVar.f20645c;
                                                long[] jArr6 = yVar.f20643a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i45 = 0;
                                                    while (true) {
                                                        long j11 = jArr6[i45];
                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i46 = 8 - ((~(i45 - length2)) >>> 31);
                                                            int i47 = 0;
                                                            while (i47 < i46) {
                                                                if ((j11 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    q0 q0Var2 = (q0) objArr6[(i45 << 3) + i47];
                                                                    jArr2 = jArr6;
                                                                    int i48 = q0Var2.f31876b;
                                                                    i20 = i34;
                                                                    if (i34 <= i48 && i48 < i20 + i44) {
                                                                        q0Var2.f31876b = (i48 - i20) + i17;
                                                                    } else if (i20 + 1 <= i48 && i48 < i17) {
                                                                        q0Var2.f31876b = i48 - i44;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i20 = i34;
                                                                }
                                                                j11 >>= 8;
                                                                i47++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i34 = i20;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i19 = i34;
                                                            if (i46 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i19 = i34;
                                                        }
                                                        if (i45 == length2) {
                                                            break;
                                                        }
                                                        i45++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i34 = i19;
                                                    }
                                                }
                                            }
                                        }
                                        i18 = i13;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i15 = size2;
                                        i16 = i28;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i18 = i13;
                                } else {
                                    i14 = i33;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i15 = size2;
                                    i16 = i28;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i17 = i32;
                                    z1Var = z1Var2;
                                    i18 = i13 + 1;
                                }
                                i31 = i14 + 1;
                                q0 q0VarB3 = yVar.b(x0Var2.f31960c);
                                int i49 = i17 + (q0VarB3 != null ? q0VarB3.f31877c : x0Var2.f31961d);
                                i30 = i18;
                                z1Var2 = z1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i15;
                                i28 = i16;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i32 = i49;
                                t0Var3 = t0Var2;
                            } else {
                                i31 = i33;
                                t0Var3 = t0Var2;
                                i30 = i13;
                            }
                        }
                    } else {
                        t0Var2 = t0Var3;
                        q0 q0VarB4 = yVar.b(x0Var.f31960c);
                        int i50 = q0VarB4 != null ? q0VarB4.f31876b : -1;
                        int i51 = x0Var.f31960c;
                        i13 = i30;
                        bVar.f(i50 + i28, x0Var.f31961d);
                        z1Var2.a(i51, 0);
                        bVar.f33618f = (i51 - bVar.f33613a.F.f31996g) + bVar.f33618f;
                        this.F.p(i51);
                        h0();
                        this.F.q();
                        q.a(arrayList5, i51, this.F.f31991b[(i51 * 5) + 3] + i51);
                    }
                    i30 = i13 + 1;
                    t0Var3 = t0Var2;
                }
                t0Var = t0Var3;
                arrayList = arrayList5;
                bVar.c();
                if (arrayList6.size() > 0) {
                    z2 z2Var3 = this.F;
                    bVar.f33618f = (z2Var3.f31997h - bVar.f33613a.F.f31996g) + bVar.f33618f;
                    z2Var3.r();
                }
            } else {
                t0Var = t0Var3;
                i10 = 1;
                arrayList = arrayList5;
                i11 = -1;
            }
        }
        boolean z12 = this.O;
        if (!z12) {
            z2 z2Var4 = this.F;
            int i52 = z2Var4.f32002m - z2Var4.f32001l;
            if (i52 > 0) {
                if (i52 > 0) {
                    bVar.d(false);
                    bVar.e();
                    y0.e eVar = bVar.f33614b.f33612a;
                    eVar.M(d.c0.f33634c);
                    eVar.f33666c[eVar.f33667d - eVar.f33664a[eVar.f33665b - 1].f33627a] = i52;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i53 = this.f31737j;
        while (true) {
            z2 z2Var5 = this.F;
            if (z2Var5.f32000k > 0 || (i12 = z2Var5.f31996g) == z2Var5.f31997h) {
                break;
            }
            h0();
            bVar.f(i53, this.F.q());
            q.a(arrayList, i12, this.F.f31996g);
        }
        if (z12) {
            if (z10) {
                y0.c cVar = this.N;
                y0.e eVar2 = cVar.f33626b;
                if (!eVar2.L()) {
                    q.c("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                y0.e eVar3 = cVar.f33625a;
                y0.d[] dVarArr = eVar2.f33664a;
                int i54 = eVar2.f33665b - 1;
                eVar2.f33665b = i54;
                y0.d dVar = dVarArr[i54];
                dVarArr[i54] = null;
                eVar3.M(dVar);
                Object[] objArr7 = eVar2.f33668e;
                Object[] objArr8 = eVar3.f33668e;
                int i55 = eVar3.f33669f;
                int i56 = dVar.f33628b;
                int i57 = eVar2.f33669f;
                int i58 = i57 - i56;
                System.arraycopy(objArr7, i58, objArr8, i55 - i56, i57 - i58);
                Object[] objArr9 = eVar2.f33668e;
                int i59 = eVar2.f33669f;
                Arrays.fill(objArr9, i59 - i56, i59, (Object) null);
                int[] iArr2 = eVar2.f33666c;
                int[] iArr3 = eVar3.f33666c;
                int i60 = eVar3.f33667d;
                int i61 = dVar.f33627a;
                int i62 = eVar2.f33667d;
                qg.m.d(i60 - i61, iArr2, i62 - i61, i62, iArr3);
                eVar2.f33669f -= i56;
                eVar2.f33667d -= i61;
                i27 = i10;
            }
            if (this.F.f32000k <= 0) {
                b2.a("Unbalanced begin/end empty");
            }
            r3.f32000k--;
            d3 d3Var2 = this.H;
            int i63 = d3Var2.f31653v;
            d3Var2.i();
            if (this.F.f32000k <= 0) {
                int i64 = (-2) - i63;
                this.H.j();
                this.H.e(i10);
                x0.b bVar2 = this.M;
                if (this.N.f33625a.K()) {
                    a3 a3Var = this.G;
                    bVar.b();
                    r62 = 0;
                    bVar.d(false);
                    bVar.e();
                    bVar.c();
                    y0.e eVar4 = bVar.f33614b.f33612a;
                    eVar4.M(d.p.f33653c);
                    e.b.b(eVar4, 0, bVar2, 1, a3Var);
                } else {
                    a3 a3Var2 = this.G;
                    y0.c cVar2 = this.N;
                    bVar.b();
                    bVar.d(false);
                    bVar.e();
                    bVar.c();
                    y0.e eVar5 = bVar.f33614b.f33612a;
                    eVar5.M(d.q.f33654c);
                    e.b.c(eVar5, bVar2, a3Var2, cVar2);
                    this.N = new y0.c();
                    r62 = 0;
                }
                this.O = r62;
                if (this.f31730c.f31610b != 0) {
                    x0(i64, r62);
                    y0(i64, i27);
                }
            }
        } else {
            if (z10) {
                bVar.a();
            }
            int i65 = bVar.f33613a.F.f31998i;
            t0 t0Var4 = bVar.f33616d;
            int i66 = i11;
            if (t0Var4.a(i66) > i65) {
                q.c("Missed recording an endGroup");
            }
            if (t0Var4.a(i66) == i65) {
                bVar.d(false);
                t0Var4.b();
                bVar.f33614b.f33612a.M(d.j.f33647c);
            }
            int i67 = this.F.f31998i;
            if (i27 != A0(i67)) {
                y0(i67, i27);
            }
            if (z10) {
                i27 = 1;
            }
            this.F.e();
            bVar.c();
        }
        z1 z1Var3 = (z1) this.f31735h.remove(r3.size() - 1);
        if (z1Var3 != null && !z12) {
            z1Var3.f31986c++;
        }
        this.f31736i = z1Var3;
        this.f31737j = t0Var.b() + i27;
        this.f31739l = t0Var.b();
        this.f31738k = t0Var.b() + i27;
    }

    public final void U() {
        T(false);
        h2 h2VarZ = Z();
        if (h2VarZ != null) {
            int i10 = h2VarZ.f31700a;
            if ((i10 & 1) != 0) {
                h2VarZ.f31700a = i10 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[EDGE_INSN: B:57:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078], EDGE_INSN: B:58:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h2 V() {
        h2 h2Var;
        x0.b bVarA;
        i2 i2Var;
        int i10;
        ArrayList arrayList = this.D;
        h2 h2Var2 = !arrayList.isEmpty() ? (h2) arrayList.remove(arrayList.size() - 1) : null;
        if (h2Var2 != null) {
            int i11 = h2Var2.f31700a;
            h2Var2.f31700a = i11 & (-9);
            int i12 = this.A;
            p.f0<Object> f0Var = h2Var2.f31705f;
            if (f0Var == null || (i11 & 16) != 0) {
                i2Var = null;
                y0.b bVar = this.L;
                if (i2Var != null) {
                    y0.e eVar = bVar.f33614b.f33612a;
                    eVar.M(d.i.f33645c);
                    e.b.b(eVar, 0, i2Var, 1, this.f31734g);
                }
                i10 = h2Var2.f31700a;
                if ((i10 & 512) != 0) {
                    h2Var2.f31700a = i10 & (-513);
                    y0.e eVar2 = bVar.f33614b.f33612a;
                    eVar2.M(d.l.f33649c);
                    e.b.a(eVar2, 0, h2Var2);
                }
            } else {
                Object[] objArr = f0Var.f20616b;
                int[] iArr = f0Var.f20617c;
                long[] jArr = f0Var.f20615a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    loop0: while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j10 & 255) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    Object obj = objArr[i16];
                                    if (iArr[i16] != i12) {
                                        i2Var = new i2(h2Var2, i12, f0Var);
                                        break loop0;
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    i2Var = null;
                    y0.b bVar2 = this.L;
                    if (i2Var != null) {
                    }
                    i10 = h2Var2.f31700a;
                    if ((i10 & 512) != 0) {
                    }
                }
            }
        }
        if (h2Var2 != null) {
            int i17 = h2Var2.f31700a;
            if ((i17 & 16) == 0 && ((i17 & 1) != 0 || this.f31743p)) {
                if (h2Var2.f31702c == null) {
                    if (this.O) {
                        d3 d3Var = this.H;
                        bVarA = d3Var.b(d3Var.f31653v);
                    } else {
                        z2 z2Var = this.F;
                        bVarA = z2Var.a(z2Var.f31998i);
                    }
                    h2Var2.f31702c = bVarA;
                }
                h2Var2.f31700a &= -5;
                h2Var = h2Var2;
            } else {
                h2Var = null;
            }
        }
        T(false);
        return h2Var;
    }

    public final void W() {
        T(false);
        this.f31729b.c();
        T(false);
        y0.b bVar = this.L;
        if (bVar.f33615c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f33614b.f33612a.M(d.j.f33647c);
            bVar.f33615c = false;
        }
        bVar.b();
        if (bVar.f33616d.f31916b != 0) {
            q.c("Missed recording an endGroup()");
        }
        if (!this.f31735h.isEmpty()) {
            q.c("Start/end imbalance");
        }
        O();
        this.F.c();
        this.f31749v = this.f31750w.b() != 0;
    }

    public final void X(boolean z10, z1 z1Var) {
        this.f31735h.add(this.f31736i);
        this.f31736i = z1Var;
        int i10 = this.f31738k;
        t0 t0Var = this.f31740m;
        t0Var.c(i10);
        t0Var.c(this.f31739l);
        t0Var.c(this.f31737j);
        if (z10) {
            this.f31737j = 0;
        }
        this.f31738k = 0;
        this.f31739l = 0;
    }

    public final void Y() {
        a3 a3Var = new a3();
        if (this.B) {
            a3Var.e();
        }
        if (this.f31729b.d()) {
            a3Var.f31619l = new p.y<>();
        }
        this.G = a3Var;
        d3 d3VarG = a3Var.g();
        d3VarG.e(true);
        this.H = d3VarG;
    }

    public final h2 Z() {
        if (this.f31753z != 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (h2) l.b.b(arrayList, 1);
    }

    @Override // x0.j
    public final void a() {
        this.f31743p = true;
        this.B = true;
        this.f31730c.e();
        this.G.e();
        d3 d3Var = this.H;
        a3 a3Var = d3Var.f31632a;
        d3Var.f31636e = a3Var.f31618k;
        d3Var.f31637f = a3Var.f31619l;
    }

    public final boolean a0() {
        if (!s() || this.f31749v) {
            return true;
        }
        h2 h2VarZ = Z();
        return (h2VarZ == null || (h2VarZ.f31700a & 4) == 0) ? false : true;
    }

    @Override // x0.j
    public final h2 b() {
        return Z();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(11:(36:29|(1:31)|32|(1:34)(1:35)|36|(1:38)(1:39)|(1:41)|44|120|45|46|(4:48|(1:50)(1:51)|52|(1:54))(1:55)|56|111|57|114|58|130|59|60|116|61|62|109|63|64|128|65|126|66|124|67|(1:69)|118|70|71)(1:42)|128|65|126|66|124|67|(0)|118|70|71)|130|59|60|116|61|62|109|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0200, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0201, code lost:
    
        r23 = r11;
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0205, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0208, code lost:
    
        r13 = r5;
        r23 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117 A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:3:0x000c, B:5:0x001d, B:7:0x004f, B:9:0x0057, B:11:0x005d, B:12:0x0062, B:13:0x0065, B:18:0x009a, B:72:0x01e4, B:22:0x00a9, B:23:0x00ac, B:24:0x00ad, B:26:0x00b3, B:29:0x00ba, B:31:0x00c0, B:32:0x00c5, B:36:0x00cf, B:38:0x00dc, B:43:0x00fa, B:44:0x00fc, B:46:0x010e, B:48:0x0117, B:50:0x0122, B:52:0x0133, B:54:0x0139, B:56:0x014c, B:71:0x01e1, B:99:0x0224, B:100:0x0227, B:102:0x0229, B:103:0x022c, B:39:0x00ea, B:35:0x00ca, B:27:0x00b6, B:104:0x022d, B:45:0x0105, B:14:0x0069, B:16:0x008d, B:17:0x0098), top: B:113:0x000c, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #8 {all -> 0x01fa, blocks: (B:67:0x01c2, B:69:0x01cf, B:91:0x0213, B:92:0x0215), top: B:124:0x01c2 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(ArrayList arrayList) {
        i1 i1Var;
        s sVar;
        x0.b bVar;
        ArrayList arrayList2;
        z2 z2VarF;
        int i10;
        z2 z2VarF2;
        z2 z2Var;
        z2 z2Var2;
        int[] iArr;
        p.y<a2> yVar;
        p.y<a2> yVar2;
        y0.a aVar;
        y0.a aVar2;
        boolean z10;
        a3 a3Var;
        a3 a3Var2 = this.f31730c;
        s sVar2 = this.f31729b;
        y0.a aVar3 = this.f31733f;
        y0.b bVar2 = this.L;
        y0.a aVar4 = bVar2.f33614b;
        try {
            bVar2.f33614b = aVar3;
            aVar3.f33612a.M(d.y.f33662c);
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                pg.n nVar = (pg.n) arrayList.get(i12);
                j1 j1Var = (j1) nVar.f21469a;
                j1 j1Var2 = (j1) nVar.f21470b;
                x0.b bVar3 = j1Var.f31722e;
                a3 a3Var3 = j1Var.f31721d;
                int iC = a3Var3.c(bVar3);
                f1.d dVar = new f1.d(i11);
                bVar2.b();
                y0.e eVar = bVar2.f33614b.f33612a;
                eVar.M(d.g.f33641c);
                int i13 = size;
                e.b.b(eVar, 0, dVar, 1, bVar3);
                if (j1Var2 == null) {
                    if (a3Var3.equals(this.G)) {
                        if (!this.H.f31654w) {
                            q.c("Check failed");
                        }
                        Y();
                    }
                    z2VarF = a3Var3.f();
                    try {
                        z2VarF.p(iC);
                        bVar2.f33618f = iC;
                        y0.a aVar5 = new y0.a();
                        f0(null, null, null, qg.z.f22752a, new m(this, aVar5, z2VarF, j1Var));
                        y0.a aVar6 = bVar2.f33614b;
                        aVar6.getClass();
                        if (aVar5.f33612a.L()) {
                            y0.e eVar2 = aVar6.f33612a;
                            eVar2.M(d.c.f33633c);
                            e.b.b(eVar2, 0, aVar5, 1, dVar);
                        }
                        pg.f0 f0Var = pg.f0.f21461a;
                        z2VarF.c();
                        a3Var = a3Var2;
                        sVar = sVar2;
                        i10 = i12;
                    } finally {
                    }
                } else {
                    i1 i1VarL = sVar2.l(j1Var2);
                    a3 a3Var4 = i1VarL != null ? i1VarL.f31711a : j1Var2.f31721d;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (i1VarL != null) {
                                                        a3 a3Var5 = i1VarL.f31711a;
                                                        if (a3Var5.f31615g) {
                                                            q.c("use active SlotWriter to create an anchor location instead");
                                                        }
                                                        if (a3Var5.f31610b <= 0) {
                                                            b2.a("Parameter index is out of range");
                                                        }
                                                        ArrayList<x0.b> arrayList3 = a3Var5.f31617j;
                                                        i1Var = i1VarL;
                                                        int iE = c3.e(arrayList3, 0, a3Var5.f31610b);
                                                        if (iE < 0) {
                                                            sVar = sVar2;
                                                            bVar = new x0.b(0);
                                                            arrayList3.add(-(iE + 1), bVar);
                                                        } else {
                                                            sVar = sVar2;
                                                            bVar = arrayList3.get(iE);
                                                        }
                                                        if (bVar == null) {
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        z2VarF = a3Var4.f();
                                                        q.b(z2VarF, arrayList2, a3Var4.c(bVar));
                                                        pg.f0 f0Var2 = pg.f0.f21461a;
                                                        z2VarF.c();
                                                        if (arrayList2.isEmpty()) {
                                                            y0.a aVar7 = bVar2.f33614b;
                                                            aVar7.getClass();
                                                            if (arrayList2.isEmpty()) {
                                                                i10 = i12;
                                                            } else {
                                                                y0.e eVar3 = aVar7.f33612a;
                                                                eVar3.M(d.C0338d.f33635c);
                                                                i10 = i12;
                                                                e.b.b(eVar3, 1, arrayList2, 0, dVar);
                                                            }
                                                            if (a3Var3.equals(a3Var2)) {
                                                                int iC2 = a3Var2.c(bVar3);
                                                                x0(iC2, A0(iC2) + arrayList2.size());
                                                            }
                                                        } else {
                                                            i10 = i12;
                                                        }
                                                        y0.e eVar4 = bVar2.f33614b.f33612a;
                                                        eVar4.M(d.e.f33637c);
                                                        int i14 = eVar4.f33669f - eVar4.f33664a[eVar4.f33665b - 1].f33628b;
                                                        Object[] objArr = eVar4.f33668e;
                                                        objArr[i14] = i1Var;
                                                        objArr[i14 + 1] = sVar;
                                                        objArr[i14 + 3] = j1Var;
                                                        objArr[i14 + 2] = j1Var2;
                                                        z2VarF2 = a3Var4.f();
                                                        z2Var2 = this.F;
                                                        iArr = this.f31741n;
                                                        yVar = this.f31748u;
                                                        this.f31741n = null;
                                                        this.f31748u = null;
                                                        this.F = z2VarF2;
                                                        int iC3 = a3Var4.c(bVar);
                                                        z2VarF2.p(iC3);
                                                        bVar2.f33618f = iC3;
                                                        aVar = new y0.a();
                                                        aVar2 = bVar2.f33614b;
                                                        bVar2.f33614b = aVar;
                                                        boolean z11 = bVar2.f33617e;
                                                        bVar2.f33617e = false;
                                                        v vVar = j1Var2.f31720c;
                                                        a3Var = a3Var2;
                                                        v vVar2 = j1Var.f31720c;
                                                        Integer numValueOf = Integer.valueOf(z2VarF2.f31996g);
                                                        z2Var = z2VarF2;
                                                        z10 = z11;
                                                        yVar2 = yVar;
                                                        f0(vVar, vVar2, numValueOf, j1Var2.f31723f, new n(this, j1Var));
                                                        bVar2.f33617e = z10;
                                                        bVar2.f33614b = aVar2;
                                                        aVar2.getClass();
                                                        if (aVar.f33612a.L()) {
                                                            y0.e eVar5 = aVar2.f33612a;
                                                            eVar5.M(d.c.f33633c);
                                                            e.b.b(eVar5, 0, aVar, 1, dVar);
                                                        }
                                                        this.F = z2Var2;
                                                        this.f31741n = iArr;
                                                        this.f31748u = yVar2;
                                                        z2Var.c();
                                                    } else {
                                                        i1Var = i1VarL;
                                                        sVar = sVar2;
                                                    }
                                                    this.F = z2Var2;
                                                    this.f31741n = iArr;
                                                    this.f31748u = yVar2;
                                                    z2Var.c();
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z2Var.c();
                                                    throw th;
                                                }
                                                bVar2.f33614b = aVar2;
                                                aVar2.getClass();
                                                if (aVar.f33612a.L()) {
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                this.F = z2Var2;
                                                this.f31741n = iArr;
                                                this.f31748u = yVar2;
                                                throw th;
                                            }
                                            bVar2.f33617e = z10;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bVar2.f33614b = aVar2;
                                            throw th;
                                        }
                                        f0(vVar, vVar2, numValueOf, j1Var2.f31723f, new n(this, j1Var));
                                    } catch (Throwable th5) {
                                        th = th5;
                                        bVar2.f33617e = z10;
                                        throw th;
                                    }
                                    bVar2.f33614b = aVar;
                                    boolean z112 = bVar2.f33617e;
                                    bVar2.f33617e = false;
                                    v vVar3 = j1Var2.f31720c;
                                    a3Var = a3Var2;
                                    v vVar22 = j1Var.f31720c;
                                    Integer numValueOf2 = Integer.valueOf(z2VarF2.f31996g);
                                    z2Var = z2VarF2;
                                    z10 = z112;
                                    yVar2 = yVar;
                                } catch (Throwable th6) {
                                    th = th6;
                                    z2Var = z2VarF2;
                                    yVar2 = yVar;
                                }
                                this.F = z2VarF2;
                                int iC32 = a3Var4.c(bVar);
                                z2VarF2.p(iC32);
                                bVar2.f33618f = iC32;
                                aVar = new y0.a();
                                aVar2 = bVar2.f33614b;
                            } catch (Throwable th7) {
                                th = th7;
                                z2Var = z2VarF2;
                                yVar2 = yVar;
                            }
                            z2Var2 = this.F;
                            iArr = this.f31741n;
                            yVar = this.f31748u;
                            this.f31741n = null;
                            this.f31748u = null;
                        } catch (Throwable th8) {
                            th = th8;
                            z2Var = z2VarF2;
                        }
                        q.b(z2VarF, arrayList2, a3Var4.c(bVar));
                        pg.f0 f0Var22 = pg.f0.f21461a;
                        z2VarF.c();
                        if (arrayList2.isEmpty()) {
                        }
                        y0.e eVar42 = bVar2.f33614b.f33612a;
                        eVar42.M(d.e.f33637c);
                        int i142 = eVar42.f33669f - eVar42.f33664a[eVar42.f33665b - 1].f33628b;
                        Object[] objArr2 = eVar42.f33668e;
                        objArr2[i142] = i1Var;
                        objArr2[i142 + 1] = sVar;
                        objArr2[i142 + 3] = j1Var;
                        objArr2[i142 + 2] = j1Var2;
                        z2VarF2 = a3Var4.f();
                    } finally {
                    }
                    bVar = j1Var2.f31722e;
                    arrayList2 = new ArrayList();
                    z2VarF = a3Var4.f();
                }
                bVar2.f33614b.f33612a.M(d.a0.f33630c);
                i12 = i10 + 1;
                size = i13;
                a3Var2 = a3Var;
                sVar2 = sVar;
                i11 = 0;
            }
            bVar2.f33614b.f33612a.M(d.k.f33648c);
            bVar2.f33618f = 0;
            bVar2.f33614b = aVar4;
        } catch (Throwable th9) {
            bVar2.f33614b = aVar4;
            throw th9;
        }
    }

    @Override // x0.j
    public final boolean c(boolean z10) {
        Object objC0 = c0();
        if ((objC0 instanceof Boolean) && z10 == ((Boolean) objC0).booleanValue()) {
            return false;
        }
        z0(Boolean.valueOf(z10));
        return true;
    }

    public final Object c0() {
        boolean z10 = this.O;
        j.a.C0321a c0321a = j.a.f31715a;
        if (!z10) {
            Object objK = this.F.k();
            if (!this.f31751x || (objK instanceof x2)) {
                return objK;
            }
        } else if (this.f31744q) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
            return c0321a;
        }
        return c0321a;
    }

    @Override // x0.j
    public final void d() {
        if (this.f31751x && this.F.f31998i == this.f31752y) {
            this.f31752y = -1;
            this.f31751x = false;
        }
        T(false);
    }

    public final int d0(int i10) {
        int iO = this.F.o(i10) + 1;
        int i11 = 0;
        while (iO < i10) {
            if (!this.F.i(iO)) {
                i11++;
            }
            iO += c3.a(this.F.f31991b, iO);
        }
        return i11;
    }

    @Override // x0.j
    public final void e(int i10) {
        q0(null, i10, 0, null);
    }

    public final boolean e0(p.l0 l0Var) {
        y0.e eVar = this.f31732e.f33612a;
        if (!eVar.K()) {
            q.c("Expected applyChanges() to have been called");
        }
        if (l0Var.f20741e <= 0 && this.f31745r.isEmpty()) {
            return false;
        }
        R(l0Var, null);
        return eVar.L();
    }

    @Override // x0.j
    public final <T> T f(e2 e2Var) {
        return (T) a0.a(P(), e2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(v vVar, v vVar2, Integer num, List list, eh.a aVar) {
        Object objInvoke;
        boolean z10 = this.E;
        int i10 = this.f31737j;
        try {
            this.E = true;
            this.f31737j = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                pg.n nVar = (pg.n) list.get(i11);
                h2 h2Var = (h2) nVar.f21469a;
                Object obj = nVar.f21470b;
                if (obj != null) {
                    v0(h2Var, obj);
                } else {
                    v0(h2Var, null);
                }
            }
            if (vVar == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (vVar2 == null || vVar2.equals(vVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    vVar.f31939r = vVar2;
                    vVar.f31940s = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        vVar.f31939r = null;
                        vVar.f31940s = 0;
                    } catch (Throwable th2) {
                        vVar.f31939r = null;
                        vVar.f31940s = 0;
                        throw th2;
                    }
                }
                if (objInvoke == null) {
                }
            }
            this.E = z10;
            this.f31737j = i10;
            return objInvoke;
        } catch (Throwable th3) {
            this.E = z10;
            this.f31737j = i10;
            throw th3;
        }
    }

    @Override // x0.j
    public final Object g() {
        boolean z10 = this.O;
        j.a.C0321a c0321a = j.a.f31715a;
        if (!z10) {
            Object objK = this.F.k();
            if (!this.f31751x || (objK instanceof x2)) {
                return objK instanceof v2 ? ((v2) objK).f31949a : objK;
            }
        } else if (this.f31744q) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
            return c0321a;
        }
        return c0321a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0() {
        u0 u0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        h2 h2Var;
        boolean zA;
        long j10;
        int i14;
        boolean z10;
        int i15;
        p.f0<Object> f0Var;
        ArrayList arrayList2;
        int iG;
        u0 u0Var2;
        h2 h2Var2;
        boolean z11;
        eh.p<? super j, ? super Integer, pg.f0> pVar;
        pg.f0 f0Var2;
        int iRotateLeft;
        int iHashCode;
        Object objB;
        boolean z12 = this.E;
        this.E = true;
        z2 z2Var = this.F;
        int i16 = z2Var.f31998i;
        int i17 = (i16 * 5) + 3;
        int i18 = z2Var.f31991b[i17] + i16;
        int i19 = this.f31737j;
        int i20 = this.P;
        int i21 = this.f31738k;
        int i22 = this.f31739l;
        int i23 = z2Var.f31996g;
        ArrayList arrayList3 = this.f31745r;
        int iG2 = q.g(i23, arrayList3);
        if (iG2 < 0) {
            iG2 = -(iG2 + 1);
        }
        if (iG2 < arrayList3.size()) {
            u0Var = (u0) arrayList3.get(iG2);
            if (u0Var.f31921b >= i18) {
                u0Var = null;
            }
        }
        boolean z13 = false;
        int i24 = i16;
        while (u0Var != null) {
            h2 h2Var3 = u0Var.f31920a;
            int i25 = u0Var.f31921b;
            int iG3 = q.g(i25, arrayList3);
            if (iG3 >= 0) {
            }
            Object obj = u0Var.f31922c;
            if (obj == null) {
                h2Var3.getClass();
                i10 = i17;
            } else {
                int i26 = 8;
                p.l0<h0<?>, Object> l0Var = h2Var3.f31706g;
                if (l0Var == null) {
                    i10 = i17;
                } else {
                    i10 = i17;
                    if (obj instanceof h0) {
                        zA = h2.a((h0) obj, l0Var);
                        i11 = i19;
                        i12 = i21;
                        i13 = i22;
                        arrayList = arrayList3;
                        h2Var = h2Var3;
                    } else {
                        if (obj instanceof p.x0) {
                            p.x0 x0Var = (p.x0) obj;
                            if (x0Var.c()) {
                                Object[] objArr = x0Var.f20753b;
                                long[] jArr = x0Var.f20752a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i12 = i21;
                                    i13 = i22;
                                    int i27 = 0;
                                    while (true) {
                                        long j11 = jArr[i27];
                                        arrayList = arrayList3;
                                        h2Var = h2Var3;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i28 = 8 - ((~(i27 - length)) >>> 31);
                                            int i29 = 0;
                                            while (i29 < i28) {
                                                if ((j11 & 255) < 128) {
                                                    i11 = i19;
                                                    Object obj2 = objArr[(i27 << 3) + i29];
                                                    j10 = j11;
                                                    if (!(obj2 instanceof h0) || h2.a((h0) obj2, l0Var)) {
                                                        break;
                                                    }
                                                } else {
                                                    i11 = i19;
                                                    j10 = j11;
                                                }
                                                j11 = j10 >> i26;
                                                i29++;
                                                i19 = i11;
                                            }
                                            i11 = i19;
                                            if (i28 != i26) {
                                                break;
                                            }
                                        } else {
                                            i11 = i19;
                                        }
                                        if (i27 == length) {
                                            break;
                                        }
                                        i27++;
                                        arrayList3 = arrayList;
                                        h2Var3 = h2Var;
                                        i19 = i11;
                                        i26 = 8;
                                    }
                                } else {
                                    i11 = i19;
                                    i12 = i21;
                                    i13 = i22;
                                    arrayList = arrayList3;
                                    h2Var = h2Var3;
                                }
                                zA = false;
                            }
                        }
                        zA = true;
                    }
                    if (zA) {
                        h2 h2Var4 = h2Var;
                        ArrayList arrayList4 = this.D;
                        arrayList4.add(h2Var4);
                        j2 j2Var = h2Var4.f31701b;
                        if (j2Var == null || (f0Var = h2Var4.f31705f) == null) {
                            i14 = i24;
                        } else {
                            h2Var4.e(true);
                            try {
                                Object[] objArr2 = f0Var.f20616b;
                                int[] iArr = f0Var.f20617c;
                                long[] jArr2 = f0Var.f20615a;
                                int length2 = jArr2.length - 2;
                                i14 = i24;
                                if (length2 >= 0) {
                                    int i30 = 0;
                                    while (true) {
                                        long j12 = jArr2[i30];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                            long j13 = j12;
                                            for (int i32 = 0; i32 < i31; i32++) {
                                                if ((j13 & 255) < 128) {
                                                    int i33 = (i30 << 3) + i32;
                                                    Object obj3 = objArr3[i33];
                                                    int i34 = iArr[i33];
                                                    j2Var.b(obj3);
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i31 != 8) {
                                                break;
                                            }
                                        }
                                        if (i30 == length2) {
                                            break;
                                        }
                                        i30++;
                                        objArr2 = objArr3;
                                        jArr2 = jArr3;
                                    }
                                }
                                h2Var4.e(false);
                            } catch (Throwable th2) {
                                h2Var4.e(false);
                                throw th2;
                            }
                        }
                        z10 = true;
                        arrayList4.remove(arrayList4.size() - 1);
                        i15 = i14;
                    } else {
                        this.F.p(i25);
                        i15 = this.F.f31996g;
                        j0(i24, i15, i16);
                        int iO = this.F.o(i15);
                        while (iO != i16 && !this.F.j(iO)) {
                            iO = this.F.o(iO);
                        }
                        int iA0 = this.F.j(iO) ? 0 : i11;
                        if (iO != i15) {
                            int iA02 = (A0(iO) - this.F.m(i15)) + iA0;
                            while (iA0 < iA02 && iO != i25) {
                                iO++;
                                while (iO < i25) {
                                    z2 z2Var2 = this.F;
                                    int i35 = z2Var2.f31991b[(iO * 5) + 3] + iO;
                                    if (i25 >= i35) {
                                        iA0 += z2Var2.j(iO) ? 1 : A0(iO);
                                        iO = i35;
                                    }
                                }
                                break;
                            }
                        }
                        this.f31737j = iA0;
                        this.f31739l = d0(i15);
                        int iO2 = this.F.o(i15);
                        int i36 = 3;
                        int iRotateLeft2 = 0;
                        int i37 = 0;
                        while (iO2 >= 0) {
                            if (iO2 == i16) {
                                iRotateLeft = Integer.rotateLeft(i20, i37);
                            } else {
                                z2 z2Var3 = this.F;
                                boolean zI = z2Var3.i(iO2);
                                int[] iArr2 = z2Var3.f31991b;
                                if (zI) {
                                    Object objN = z2Var3.n(iArr2, iO2);
                                    iHashCode = objN != null ? objN instanceof Enum ? ((Enum) objN).ordinal() : objN instanceof g1 ? 126665345 : objN.hashCode() : 0;
                                } else {
                                    int i38 = iArr2[iO2 * 5];
                                    iHashCode = (i38 != 207 || (objB = z2Var3.b(iArr2, iO2)) == null || objB.equals(j.a.f31715a)) ? i38 : objB.hashCode();
                                }
                                if (iHashCode == 126665345) {
                                    iRotateLeft = Integer.rotateLeft(iHashCode, i37);
                                } else {
                                    iRotateLeft2 = (iRotateLeft2 ^ Integer.rotateLeft(iHashCode, i36)) ^ Integer.rotateLeft(this.F.i(iO2) ? 0 : d0(iO2), i37);
                                    i36 = (i36 + 6) % 32;
                                    i37 = (i37 + 6) % 32;
                                    iO2 = this.F.o(iO2);
                                }
                            }
                            iRotateLeft2 ^= iRotateLeft;
                            break;
                        }
                        this.P = iRotateLeft2;
                        this.J = null;
                        if (this.f31751x) {
                            h2Var2 = h2Var;
                        } else {
                            h2Var2 = h2Var;
                            z11 = (h2Var2.f31700a & 128) != 0;
                            if (z11) {
                                this.f31751x = true;
                            }
                            pVar = h2Var2.f31703d;
                            if (pVar == null) {
                                pVar.invoke(this, 1);
                                f0Var2 = pg.f0.f21461a;
                            } else {
                                f0Var2 = null;
                            }
                            if (f0Var2 != null) {
                                throw new IllegalStateException("Invalid restart scope");
                            }
                            if (z11) {
                                this.f31751x = false;
                            }
                            this.J = null;
                            z2 z2Var4 = this.F;
                            int i39 = z2Var4.f31991b[i10] + i16;
                            int i40 = z2Var4.f31996g;
                            if (!(i40 >= i16 && i40 <= i39)) {
                                q.c("Index " + i16 + " is not a parent of " + i40);
                            }
                            z2Var4.f31998i = i16;
                            z2Var4.f31997h = i39;
                            z2Var4.f32001l = 0;
                            z2Var4.f32002m = 0;
                            z13 = true;
                            z10 = true;
                        }
                        if (z11) {
                        }
                        pVar = h2Var2.f31703d;
                        if (pVar == null) {
                        }
                        if (f0Var2 != null) {
                        }
                    }
                    arrayList2 = arrayList;
                    iG = q.g(this.F.f31996g, arrayList2);
                    if (iG < 0) {
                        iG = -(iG + 1);
                    }
                    if (iG >= arrayList2.size()) {
                        u0Var2 = (u0) arrayList2.get(iG);
                        if (u0Var2.f31921b >= i18) {
                            u0Var2 = null;
                        }
                    }
                    i24 = i15;
                    arrayList3 = arrayList2;
                    i17 = i10;
                    i21 = i12;
                    i22 = i13;
                    i19 = i11;
                    u0Var = u0Var2;
                }
            }
            i11 = i19;
            i12 = i21;
            i13 = i22;
            arrayList = arrayList3;
            h2Var = h2Var3;
            zA = true;
            if (zA) {
            }
            arrayList2 = arrayList;
            iG = q.g(this.F.f31996g, arrayList2);
            if (iG < 0) {
            }
            if (iG >= arrayList2.size()) {
            }
            i24 = i15;
            arrayList3 = arrayList2;
            i17 = i10;
            i21 = i12;
            i22 = i13;
            i19 = i11;
            u0Var = u0Var2;
        }
        int i41 = i24;
        int i42 = i19;
        int i43 = i21;
        int i44 = i22;
        if (z13) {
            j0(i41, i16, i16);
            this.F.r();
            int iA03 = A0(i16);
            this.f31737j = i42 + iA03;
            this.f31738k = i43 + iA03;
            this.f31739l = i44;
        } else {
            p0();
        }
        this.P = i20;
        this.E = z12;
    }

    @Override // x0.j
    public final boolean h(float f10) {
        Object objC0 = c0();
        if ((objC0 instanceof Float) && f10 == ((Number) objC0).floatValue()) {
            return false;
        }
        z0(Float.valueOf(f10));
        return true;
    }

    public final void h0() {
        k0(this.F.f31996g);
        y0.b bVar = this.L;
        bVar.d(false);
        bVar.e();
        bVar.f33614b.f33612a.M(d.w.f33660c);
        int i10 = bVar.f33618f;
        z2 z2Var = bVar.f33613a.F;
        bVar.f33618f = z2Var.f31991b[(z2Var.f31996g * 5) + 3] + i10;
    }

    @Override // x0.j
    public final boolean i(int i10) {
        Object objC0 = c0();
        if ((objC0 instanceof Integer) && i10 == ((Number) objC0).intValue()) {
            return false;
        }
        z0(Integer.valueOf(i10));
        return true;
    }

    public final void i0(a2 a2Var) {
        p.y<a2> yVar = this.f31748u;
        if (yVar == null) {
            yVar = new p.y<>();
            this.f31748u = yVar;
        }
        yVar.h(this.F.f31996g, a2Var);
    }

    @Override // x0.j
    public final boolean j(long j10) {
        Object objC0 = c0();
        if ((objC0 instanceof Long) && j10 == ((Number) objC0).longValue()) {
            return false;
        }
        z0(Long.valueOf(j10));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(int i10, int i11, int i12) {
        z2 z2Var = this.F;
        if (i10 != i11) {
            if (i10 != i12 && i11 != i12) {
                if (z2Var.o(i10) == i11) {
                    i12 = i11;
                } else if (z2Var.o(i11) == i10) {
                    i12 = i10;
                } else if (z2Var.o(i10) == z2Var.o(i11)) {
                    i12 = z2Var.o(i10);
                } else {
                    int iO = i10;
                    int i13 = 0;
                    while (iO > 0 && iO != i12) {
                        iO = z2Var.o(iO);
                        i13++;
                    }
                    int iO2 = i11;
                    int i14 = 0;
                    while (iO2 > 0 && iO2 != i12) {
                        iO2 = z2Var.o(iO2);
                        i14++;
                    }
                    int i15 = i13 - i14;
                    int iO3 = i10;
                    for (int i16 = 0; i16 < i15; i16++) {
                        iO3 = z2Var.o(iO3);
                    }
                    int i17 = i14 - i13;
                    int iO4 = i11;
                    for (int i18 = 0; i18 < i17; i18++) {
                        iO4 = z2Var.o(iO4);
                    }
                    i12 = iO3;
                    for (int iO5 = iO4; i12 != iO5; iO5 = z2Var.o(iO5)) {
                        i12 = z2Var.o(i12);
                    }
                }
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (z2Var.j(i10)) {
                this.L.a();
            }
            i10 = z2Var.o(i10);
        }
        S(i11, i12);
    }

    @Override // x0.j
    public final i1.a k() {
        u uVar = this.Q;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f31734g);
        this.Q = uVar2;
        return uVar2;
    }

    public final void k0(int i10) {
        boolean zJ = this.F.j(i10);
        y0.b bVar = this.L;
        if (zJ) {
            bVar.c();
            Object objL = this.F.l(i10);
            bVar.c();
            bVar.f33620h.add(objL);
        }
        n0(this, i10, i10, zJ, 0);
        bVar.c();
        if (zJ) {
            bVar.a();
        }
    }

    @Override // x0.j
    public final boolean l(Object obj) {
        if (c0() == obj) {
            return false;
        }
        z0(obj);
        return true;
    }

    @Override // x0.j
    public final boolean m() {
        return this.O;
    }

    @Override // x0.j
    public final void n(Object obj) {
        if (!this.O && this.F.g() == 207 && !kotlin.jvm.internal.r.a(this.F.f(), obj) && this.f31752y < 0) {
            this.f31752y = this.F.f31996g;
            this.f31751x = true;
        }
        q0(null, 207, 0, obj);
    }

    @Override // x0.j
    public final void o(boolean z10) {
        if (this.f31738k != 0) {
            q.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.O) {
            return;
        }
        if (!z10) {
            p0();
            return;
        }
        z2 z2Var = this.F;
        int i10 = z2Var.f31996g;
        int i11 = z2Var.f31997h;
        y0.b bVar = this.L;
        bVar.getClass();
        bVar.d(false);
        bVar.f33614b.f33612a.M(d.f.f33639c);
        q.a(this.f31745r, i10, i11);
        this.F.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        int iRotateLeft;
        if (this.f31745r.isEmpty()) {
            this.f31738k = this.F.q() + this.f31738k;
            return;
        }
        z2 z2Var = this.F;
        int iG = z2Var.g();
        int[] iArr = z2Var.f31991b;
        int i10 = z2Var.f31996g;
        Object objN = i10 < z2Var.f31997h ? z2Var.n(iArr, i10) : null;
        Object objF = z2Var.f();
        int i11 = this.f31739l;
        j.a.C0321a c0321a = j.a.f31715a;
        if (objN != null) {
            iRotateLeft = Integer.rotateLeft((objN instanceof Enum ? ((Enum) objN).ordinal() : objN.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        } else {
            if (objF != null && iG == 207 && !objF.equals(c0321a)) {
                this.P = Integer.rotateLeft(objF.hashCode() ^ Integer.rotateLeft(this.P, 3), 3) ^ i11;
                t0(null, (iArr[(z2Var.f31996g * 5) + 1] & 1073741824) != 0);
                g0();
                z2Var.e();
                if (objN == null) {
                    if (objN instanceof Enum) {
                        this.P = Integer.rotateRight(Integer.hashCode(((Enum) objN).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
                        return;
                    } else {
                        this.P = Integer.rotateRight(Integer.hashCode(objN.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
                        return;
                    }
                }
                if (objF == null || iG != 207 || objF.equals(c0321a)) {
                    this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i11, 3) ^ Integer.hashCode(iG), 3);
                    return;
                } else {
                    this.P = Integer.rotateRight(Integer.hashCode(objF.hashCode()) ^ Integer.rotateRight(this.P ^ i11, 3), 3);
                    return;
                }
            }
            iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ iG, 3) ^ i11;
        }
        this.P = iRotateLeft;
        t0(null, (iArr[(z2Var.f31996g * 5) + 1] & 1073741824) != 0);
        g0();
        z2Var.e();
        if (objN == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // x0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k p(int i10) {
        h2 h2Var;
        L(i10);
        boolean z10 = this.O;
        ArrayList arrayList = this.D;
        v vVar = this.f31734g;
        if (z10) {
            h2 h2Var2 = new h2(vVar);
            arrayList.add(h2Var2);
            z0(h2Var2);
            h2Var2.f31704e = this.A;
            h2Var2.f31700a &= -17;
            return this;
        }
        int i11 = this.F.f31998i;
        ArrayList arrayList2 = this.f31745r;
        int iG = q.g(i11, arrayList2);
        u0 u0Var = iG >= 0 ? (u0) arrayList2.remove(iG) : null;
        Object objK = this.F.k();
        if (kotlin.jvm.internal.r.a(objK, j.a.f31715a)) {
            h2Var = new h2(vVar);
            z0(h2Var);
        } else {
            kotlin.jvm.internal.r.c(objK, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            h2Var = (h2) objK;
        }
        if (u0Var == null) {
            int i12 = h2Var.f31700a;
            boolean z11 = (i12 & 64) != 0;
            if (z11) {
                h2Var.f31700a = i12 & (-65);
            }
            if (z11) {
                h2Var.f31700a |= 8;
            } else {
                h2Var.f31700a &= -9;
            }
        }
        arrayList.add(h2Var);
        h2Var.f31704e = this.A;
        int i13 = h2Var.f31700a;
        h2Var.f31700a = i13 & (-17);
        if ((i13 & 256) != 0) {
            h2Var.f31700a = (i13 & (-273)) | 512;
            y0.e eVar = this.L.f33614b.f33612a;
            eVar.M(d.b0.f33632c);
            e.b.a(eVar, 0, h2Var);
        }
        return this;
    }

    public final void p0() {
        z2 z2Var = this.F;
        int i10 = z2Var.f31998i;
        this.f31738k = i10 >= 0 ? z2Var.f31991b[(i10 * 5) + 1] & 67108863 : 0;
        z2Var.r();
    }

    @Override // x0.j
    public final void q(int i10, Object obj) {
        q0(obj, i10, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(Object obj, int i10, int i11, Object obj2) {
        int iRotateLeft;
        boolean z10;
        z1 z1Var;
        int i12;
        int i13;
        Object[] objArr;
        Object[] objArr2;
        int i14;
        int i15;
        boolean z11;
        int i16;
        Object obj3 = obj;
        if (this.f31744q) {
            q.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i17 = this.f31739l;
        Object obj4 = j.a.f31715a;
        if (obj3 != null) {
            iRotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        } else {
            if (obj2 != null && i10 == 207 && !obj2.equals(obj4)) {
                this.P = i17 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.P, 3), 3);
                if (obj3 == null) {
                    this.f31739l++;
                }
                boolean z12 = i11 == 0;
                if (!this.O) {
                    this.F.f32000k++;
                    d3 d3Var = this.H;
                    int i18 = d3Var.f31651t;
                    if (z12) {
                        d3Var.Q(i10, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        d3Var.Q(i10, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        d3Var.Q(i10, obj3, obj4, false);
                    }
                    z1 z1Var2 = this.f31736i;
                    if (z1Var2 != null) {
                        int i19 = (-2) - i18;
                        x0 x0Var = new x0(-1, i10, i19, -1);
                        z1Var2.f31988e.h(i19, new q0(-1, this.f31737j - z1Var2.f31985b, 0));
                        z1Var2.f31987d.add(x0Var);
                    }
                    X(z12, null);
                    return;
                }
                boolean z13 = i11 == 1 && this.f31751x;
                if (this.f31736i == null) {
                    int iG = this.F.g();
                    if (!z13 && iG == i10) {
                        z2 z2Var = this.F;
                        int i20 = z2Var.f31996g;
                        if (kotlin.jvm.internal.r.a(obj3, i20 < z2Var.f31997h ? z2Var.n(z2Var.f31991b, i20) : null)) {
                            t0(obj2, z12);
                            z10 = z13;
                        }
                    }
                    z2 z2Var2 = this.F;
                    int[] iArr = z2Var2.f31991b;
                    ArrayList arrayList = new ArrayList();
                    if (z2Var2.f32000k <= 0) {
                        int i21 = z2Var2.f31996g;
                        while (i21 < z2Var2.f31997h) {
                            int i22 = i21 * 5;
                            int i23 = iArr[i22];
                            Object objN = z2Var2.n(iArr, i21);
                            int i24 = iArr[i22 + 1];
                            if ((i24 & 1073741824) != 0) {
                                z11 = z13;
                                i16 = 1;
                            } else {
                                z11 = z13;
                                i16 = i24 & 67108863;
                            }
                            arrayList.add(new x0(objN, i23, i21, i16));
                            i21 += iArr[i22 + 3];
                            z13 = z11;
                        }
                    }
                    z10 = z13;
                    this.f31736i = new z1(arrayList, this.f31737j);
                } else {
                    z10 = z13;
                }
                z1 z1Var3 = this.f31736i;
                if (z1Var3 != null) {
                    ArrayList arrayList2 = z1Var3.f31987d;
                    p.y<q0> yVar = z1Var3.f31988e;
                    int i25 = z1Var3.f31985b;
                    Object w0Var = obj3 != null ? new w0(Integer.valueOf(i10), obj3) : Integer.valueOf(i10);
                    p.l0<Object, Object> l0Var = ((z0.a) z1Var3.f31989f.getValue()).f34699a;
                    Object objD = l0Var.d(w0Var);
                    if (objD == null) {
                        objD = null;
                    } else if (objD instanceof p.h0) {
                        p.h0 h0Var = (p.h0) objD;
                        Object objK = h0Var.k(0);
                        if (h0Var.d()) {
                            l0Var.j(w0Var);
                        }
                        if (h0Var.f20707b == 1) {
                            l0Var.l(w0Var, h0Var.a());
                        }
                        objD = objK;
                    } else {
                        l0Var.j(w0Var);
                    }
                    x0 x0Var2 = (x0) objD;
                    if (z10 || x0Var2 == null) {
                        this.F.f32000k++;
                        this.O = true;
                        this.J = null;
                        if (this.H.f31654w) {
                            d3 d3VarG = this.G.g();
                            this.H = d3VarG;
                            d3VarG.L();
                            this.I = false;
                            this.J = null;
                        }
                        this.H.d();
                        d3 d3Var2 = this.H;
                        int i26 = d3Var2.f31651t;
                        if (z12) {
                            d3Var2.Q(i10, obj4, obj4, true);
                            i12 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i12 = 0;
                            d3Var2.Q(i10, obj4, obj2, false);
                        } else {
                            i12 = 0;
                            d3Var2.Q(i10, obj == null ? obj4 : obj, obj4, false);
                        }
                        this.M = this.H.b(i26);
                        int i27 = (-2) - i26;
                        x0 x0Var3 = new x0(-1, i10, i27, -1);
                        yVar.h(i27, new q0(-1, this.f31737j - i25, i12));
                        arrayList2.add(x0Var3);
                        z1Var = new z1(new ArrayList(), z12 ? i12 : this.f31737j);
                    } else {
                        int i28 = x0Var2.f31960c;
                        arrayList2.add(x0Var2);
                        q0 q0VarB = yVar.b(i28);
                        this.f31737j = (q0VarB != null ? q0VarB.f31876b : -1) + i25;
                        q0 q0VarB2 = yVar.b(i28);
                        int i29 = q0VarB2 != null ? q0VarB2.f31875a : -1;
                        int i30 = z1Var3.f31986c;
                        int i31 = i29 - i30;
                        int i32 = 8;
                        if (i29 > i30) {
                            Object[] objArr3 = yVar.f20645c;
                            long[] jArr = yVar.f20643a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j10 = jArr[i33];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j10 & 255) < 128) {
                                                i15 = i32;
                                                q0 q0Var = (q0) objArr3[(i33 << 3) + i35];
                                                i14 = i31;
                                                int i36 = q0Var.f31875a;
                                                if (i36 == i29) {
                                                    q0Var.f31875a = i30;
                                                } else if (i30 <= i36 && i36 < i29) {
                                                    q0Var.f31875a = i36 + 1;
                                                }
                                            } else {
                                                i14 = i31;
                                                i15 = i32;
                                            }
                                            j10 >>= i15;
                                            i35++;
                                            i31 = i14;
                                            i32 = i15;
                                        }
                                        i13 = i31;
                                        if (i34 != i32) {
                                            break;
                                        }
                                    } else {
                                        i13 = i31;
                                    }
                                    if (i33 == length) {
                                        break;
                                    }
                                    i33++;
                                    i31 = i13;
                                    i32 = 8;
                                }
                            } else {
                                i13 = i31;
                            }
                        } else {
                            i13 = i31;
                            if (i30 > i29) {
                                Object[] objArr4 = yVar.f20645c;
                                long[] jArr2 = yVar.f20643a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i37 = 0;
                                    while (true) {
                                        long j11 = jArr2[i37];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                            int i39 = 0;
                                            while (i39 < i38) {
                                                if ((j11 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    q0 q0Var2 = (q0) objArr4[(i37 << 3) + i39];
                                                    int i40 = q0Var2.f31875a;
                                                    if (i40 == i29) {
                                                        q0Var2.f31875a = i30;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i29 + 1 <= i40 && i40 < i30) {
                                                            q0Var2.f31875a = i40 - 1;
                                                        }
                                                    }
                                                }
                                                j11 >>= 8;
                                                i39++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i38 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i37 == length2) {
                                            break;
                                        }
                                        i37++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        y0.b bVar = this.L;
                        bVar.f33618f = (i28 - bVar.f33613a.F.f31996g) + bVar.f33618f;
                        this.F.p(i28);
                        if (i13 > 0) {
                            bVar.d(false);
                            bVar.e();
                            y0.e eVar = bVar.f33614b.f33612a;
                            eVar.M(d.r.f33655c);
                            eVar.f33666c[eVar.f33667d - eVar.f33664a[eVar.f33665b - 1].f33627a] = i13;
                        }
                        t0(obj2, z12);
                        z1Var = null;
                    }
                } else {
                    z1Var = null;
                }
                X(z12, z1Var);
                return;
            }
            iRotateLeft = i17 ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i10, 3);
        }
        this.P = iRotateLeft;
        if (obj3 == null) {
        }
        if (i11 == 0) {
        }
        if (!this.O) {
        }
    }

    @Override // x0.j
    public final void r() {
        q0(null, 125, 2, null);
        this.f31744q = true;
    }

    public final void r0() {
        q0(null, -127, 0, null);
    }

    @Override // x0.j
    public final boolean s() {
        h2 h2VarZ;
        return (this.O || this.f31751x || this.f31749v || (h2VarZ = Z()) == null || (h2VarZ.f31700a & 8) != 0) ? false : true;
    }

    public final void s0(int i10, t1 t1Var) {
        q0(t1Var, i10, 0, null);
    }

    @Override // x0.j
    public final d<?> t() {
        return this.f31728a;
    }

    public final void t0(Object obj, boolean z10) {
        if (z10) {
            z2 z2Var = this.F;
            if (z2Var.f32000k <= 0) {
                if ((z2Var.f31991b[(z2Var.f31996g * 5) + 1] & 1073741824) == 0) {
                    b2.a("Expected a node group");
                }
                z2Var.s();
                return;
            }
            return;
        }
        if (obj != null && this.F.f() != obj) {
            y0.b bVar = this.L;
            bVar.getClass();
            bVar.d(false);
            y0.e eVar = bVar.f33614b.f33612a;
            eVar.M(d.e0.f33638c);
            e.b.a(eVar, 0, obj);
        }
        this.F.s();
    }

    @Override // x0.j
    public final void u(eh.a<pg.f0> aVar) {
        y0.e eVar = this.L.f33614b.f33612a;
        eVar.M(d.z.f33663c);
        e.b.a(eVar, 0, aVar);
    }

    public final void u0() {
        this.f31739l = 0;
        this.F = this.f31730c.f();
        q0(null, 100, 0, null);
        s sVar = this.f31729b;
        sVar.p();
        this.f31747t = sVar.g();
        this.f31750w.c(this.f31749v ? 1 : 0);
        this.f31749v = K(this.f31747t);
        this.J = null;
        if (!this.f31743p) {
            this.f31743p = sVar.e();
        }
        if (!this.B) {
            this.B = sVar.f();
        }
        Set<i1.a> set = (Set) a0.a(this.f31747t, i1.b.f13759a);
        if (set != null) {
            set.add(k());
            sVar.m(set);
        }
        q0(null, sVar.h(), 0, null);
    }

    @Override // x0.j
    public final void v() {
        if (this.f31738k != 0) {
            q.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.O) {
            return;
        }
        h2 h2VarZ = Z();
        if (h2VarZ != null) {
            int i10 = h2VarZ.f31700a;
            if ((i10 & 128) == 0) {
                h2VarZ.f31700a = i10 | 16;
            }
        }
        if (this.f31745r.isEmpty()) {
            p0();
        } else {
            g0();
        }
    }

    public final boolean v0(h2 h2Var, Object obj) {
        x0.b bVar = h2Var.f31702c;
        if (bVar == null) {
            return false;
        }
        int iC = this.F.f31990a.c(bVar);
        if (!this.E || iC < this.F.f31996g) {
            return false;
        }
        ArrayList arrayList = this.f31745r;
        int iG = q.g(iC, arrayList);
        if (iG < 0) {
            int i10 = -(iG + 1);
            if (!(obj instanceof h0)) {
                obj = null;
            }
            arrayList.add(i10, new u0(h2Var, iC, obj));
            return true;
        }
        u0 u0Var = (u0) arrayList.get(iG);
        if (!(obj instanceof h0)) {
            u0Var.f31922c = null;
            return true;
        }
        Object obj2 = u0Var.f31922c;
        if (obj2 == null) {
            u0Var.f31922c = obj;
            return true;
        }
        if (obj2 instanceof p.m0) {
            ((p.m0) obj2).d(obj);
            return true;
        }
        int i11 = p.y0.f20758a;
        p.m0 m0Var = new p.m0(2);
        m0Var.j(obj2);
        m0Var.j(obj);
        u0Var.f31922c = m0Var;
        return true;
    }

    @Override // x0.j
    public final <T> void w(eh.a<? extends T> aVar) {
        if (!this.f31744q) {
            q.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f31744q = false;
        if (!this.O) {
            q.c("createNode() can only be called when inserting");
        }
        t0 t0Var = this.f31740m;
        int i10 = t0Var.f31915a[t0Var.f31916b - 1];
        d3 d3Var = this.H;
        x0.b bVarB = d3Var.b(d3Var.f31653v);
        this.f31738k++;
        y0.c cVar = this.N;
        y0.e eVar = cVar.f33625a;
        eVar.M(d.o.f33652c);
        e.b.a(eVar, 0, aVar);
        eVar.f33666c[eVar.f33667d - eVar.f33664a[eVar.f33665b - 1].f33627a] = i10;
        e.b.a(eVar, 1, bVarB);
        y0.e eVar2 = cVar.f33626b;
        eVar2.M(d.t.f33657c);
        eVar2.f33666c[eVar2.f33667d - eVar2.f33664a[eVar2.f33665b - 1].f33627a] = i10;
        e.b.a(eVar2, 0, bVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(p.l0<Object, Object> l0Var) {
        Object[] objArr = l0Var.f20738b;
        Object[] objArr2 = l0Var.f20739c;
        long[] jArr = l0Var.f20737a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.f31745r;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            h2 h2Var = (h2) obj;
                            x0.b bVar = h2Var.f31702c;
                            if (bVar != null) {
                                int i14 = bVar.f31620a;
                                if (obj2 == y2.f31977a) {
                                    obj2 = null;
                                }
                                arrayList.add(new u0(h2Var, i14, obj2));
                            }
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
        qg.t.v(arrayList, q.f31872f);
    }

    @Override // x0.j
    public final tg.h x() {
        return this.f31729b.i();
    }

    public final void x0(int i10, int i11) {
        if (A0(i10) != i11) {
            if (i10 < 0) {
                p.w wVar = this.f31742o;
                if (wVar == null) {
                    wVar = new p.w();
                    this.f31742o = wVar;
                }
                wVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f31741n;
            if (iArr == null) {
                int i12 = this.F.f31992c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.f31741n = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    @Override // x0.j
    public final a2 y() {
        return P();
    }

    public final void y0(int i10, int i11) {
        int iA0 = A0(i10);
        if (iA0 != i11) {
            int i12 = i11 - iA0;
            ArrayList arrayList = this.f31735h;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iA02 = A0(i10) + i12;
                x0(i10, iA02);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        z1 z1Var = (z1) arrayList.get(i13);
                        if (z1Var != null && z1Var.a(i10, iA02)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.F.f31998i;
                } else if (this.F.j(i10)) {
                    return;
                } else {
                    i10 = this.F.o(i10);
                }
            }
        }
    }

    @Override // x0.j
    public final void z() {
        if (!this.f31744q) {
            q.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f31744q = false;
        if (this.O) {
            q.c("useNode() called while inserting");
        }
        z2 z2Var = this.F;
        Object objL = z2Var.l(z2Var.f31998i);
        y0.b bVar = this.L;
        bVar.c();
        bVar.f33620h.add(objL);
        if (this.f31751x && (objL instanceof h)) {
            bVar.b();
            bVar.f33614b.f33612a.M(d.i0.f33646c);
        }
    }

    public final void z0(Object obj) {
        if (this.O) {
            this.H.S(obj);
            return;
        }
        z2 z2Var = this.F;
        boolean z10 = z2Var.f32003n;
        y0.b bVar = this.L;
        if (!z10) {
            x0.b bVarA = z2Var.a(z2Var.f31998i);
            y0.e eVar = bVar.f33614b.f33612a;
            eVar.M(d.b.f33631c);
            e.b.b(eVar, 0, bVarA, 1, obj);
            return;
        }
        int iC = (z2Var.f32001l - c3.c(z2Var.f31991b, z2Var.f31998i)) - 1;
        if (bVar.f33613a.F.f31998i - bVar.f33618f >= 0) {
            bVar.d(true);
            y0.e eVar2 = bVar.f33614b.f33612a;
            eVar2.M(d.g0.f33642c);
            e.b.a(eVar2, 0, obj);
            eVar2.f33666c[eVar2.f33667d - eVar2.f33664a[eVar2.f33665b - 1].f33627a] = iC;
            return;
        }
        z2 z2Var2 = this.F;
        x0.b bVarA2 = z2Var2.a(z2Var2.f31998i);
        y0.e eVar3 = bVar.f33614b.f33612a;
        eVar3.M(d.d0.f33636c);
        e.b.b(eVar3, 0, obj, 1, bVarA2);
        eVar3.f33666c[eVar3.f33667d - eVar3.f33664a[eVar3.f33665b - 1].f33627a] = iC;
    }
}

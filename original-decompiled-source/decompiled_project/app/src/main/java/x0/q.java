package x0;

import java.util.ArrayList;
import java.util.List;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f31867a = new t1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f31868b = new t1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f31869c = new t1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f31870d = new t1("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f31871e = new t1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final p f31872f = new p();

    public static final class a implements j2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f31873a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j1 f31874b;

        public a(f0 f0Var, j1 j1Var) {
            this.f31873a = f0Var;
            this.f31874b = j1Var;
        }

        @Override // x0.j2
        public final void b(Object obj) {
        }

        @Override // x0.j2
        public final void g() {
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
        @Override // x0.j2
        public final v0 h(h2 h2Var, Object obj) {
            v0 v0VarH;
            f0 f0Var = this.f31873a;
            j2 j2Var = f0Var instanceof j2 ? (j2) f0Var : null;
            if (j2Var == null || (v0VarH = j2Var.h(h2Var, obj)) == null) {
                v0VarH = v0.f31944a;
            }
            if (v0VarH != v0.f31944a) {
                return v0VarH;
            }
            j1 j1Var = this.f31874b;
            j1Var.f31723f = qg.x.P(new pg.n(h2Var, obj), j1Var.f31723f);
            return v0.f31945b;
        }
    }

    public static final void a(ArrayList arrayList, int i10, int i11) {
        int iG = g(i10, arrayList);
        if (iG < 0) {
            iG = -(iG + 1);
        }
        while (iG < arrayList.size() && ((u0) arrayList.get(iG)).f31921b < i11) {
            arrayList.remove(iG);
        }
    }

    public static final void b(z2 z2Var, ArrayList arrayList, int i10) {
        boolean zJ = z2Var.j(i10);
        int[] iArr = z2Var.f31991b;
        if (zJ) {
            arrayList.add(z2Var.l(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            b(z2Var, arrayList, i12);
        }
    }

    public static final void c(String str) {
        throw new i(i8.n.d("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new i(i8.n.d("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(d3 d3Var, f1.h hVar) {
        int iO;
        int[] iArr = d3Var.f31633b;
        int i10 = d3Var.f31651t;
        int iF = d3Var.f(iArr, d3Var.q(d3Var.s(i10) + i10));
        for (int iF2 = d3Var.f(d3Var.f31633b, d3Var.q(d3Var.f31651t)); iF2 < iF; iF2++) {
            Object obj = d3Var.f31634c[d3Var.g(iF2)];
            int iC = -1;
            if (obj instanceof h) {
                hVar.d((h) obj, d3Var.o() - iF2, -1, -1);
            } else if (obj instanceof v2) {
                v2 v2Var = (v2) obj;
                if (!(v2Var.f31949a instanceof x2)) {
                    i(d3Var, iF2, obj);
                    int iO2 = d3Var.o() - iF2;
                    b bVar = v2Var.f31950b;
                    if (bVar == null || !bVar.a()) {
                        iO = -1;
                    } else {
                        iC = d3Var.c(bVar);
                        iO = d3Var.o() - d3Var.O(iC);
                    }
                    hVar.d(v2Var, iO2, iC, iO);
                }
            } else if (obj instanceof h2) {
                i(d3Var, iF2, obj);
                ((h2) obj).d();
            }
        }
    }

    public static final i1 f(f0 f0Var, j1 j1Var, d3 d3Var, d<?> dVar) {
        j.a.C0321a c0321a = j.a.f31715a;
        a3 a3Var = new a3();
        if (d3Var.f31636e != null) {
            a3Var.e();
        }
        if (d3Var.f31637f != null) {
            a3Var.f31619l = new p.y<>();
        }
        int i10 = d3Var.f31651t;
        if (dVar != null && d3Var.D(i10) > 0) {
            int iE = d3Var.f31653v;
            while (iE > 0 && !d3Var.w(iE)) {
                iE = d3Var.E(d3Var.f31633b, iE);
            }
            if (iE >= 0 && d3Var.w(iE)) {
                Object objC = d3Var.C(iE);
                int i11 = iE + 1;
                int iS = d3Var.s(iE) + iE;
                int iD = 0;
                while (i11 < iS) {
                    int iS2 = d3Var.s(i11) + i11;
                    if (iS2 > i10) {
                        break;
                    }
                    iD += d3Var.w(i11) ? 1 : d3Var.D(i11);
                    i11 = iS2;
                }
                int iD2 = d3Var.w(i10) ? 1 : d3Var.D(i10);
                dVar.b(objC);
                dVar.e(iD, iD2);
                dVar.f();
            }
        }
        d3 d3VarG = a3Var.g();
        try {
            d3VarG.d();
            d3VarG.Q(126665345, j1Var.f31718a, c0321a, false);
            d3.x(d3VarG);
            d3VarG.S(j1Var.f31719b);
            List listB = d3Var.B(j1Var.f31722e, d3VarG);
            d3VarG.K();
            d3VarG.i();
            d3VarG.j();
            d3VarG.e(true);
            i1 i1Var = new i1(a3Var);
            if (!listB.isEmpty()) {
                int size = listB.size();
                for (int i12 = 0; i12 < size; i12++) {
                    b bVar = (b) listB.get(i12);
                    if (a3Var.i(bVar)) {
                        int iC = a3Var.c(bVar);
                        int iC2 = c3.c(a3Var.f31609a, iC);
                        int i13 = iC + 1;
                        if (((i13 < a3Var.f31610b ? a3Var.f31609a[(i13 * 5) + 4] : a3Var.f31611c.length) - iC2 > 0 ? a3Var.f31611c[iC2] : c0321a) instanceof h2) {
                            a aVar = new a(f0Var, j1Var);
                            d3VarG = a3Var.g();
                            try {
                                h2.a.a(d3VarG, listB, aVar);
                                pg.f0 f0Var2 = pg.f0.f21461a;
                                d3VarG.e(true);
                                return i1Var;
                            } finally {
                            }
                        }
                    }
                }
            }
            return i1Var;
        } finally {
        }
    }

    public static final int g(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iF = kotlin.jvm.internal.r.f(((u0) list.get(i12)).f31921b, i10);
            if (iF < 0) {
                i11 = i12 + 1;
            } else {
                if (iF <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void h(d3 d3Var, f1.h hVar) {
        int iO;
        int[] iArr = d3Var.f31633b;
        int i10 = d3Var.f31651t;
        int iF = d3Var.f(iArr, d3Var.q(d3Var.s(i10) + i10));
        for (int iF2 = d3Var.f(d3Var.f31633b, d3Var.q(d3Var.f31651t)); iF2 < iF; iF2++) {
            Object obj = d3Var.f31634c[d3Var.g(iF2)];
            int iC = -1;
            if (obj instanceof h) {
                int iO2 = d3Var.o() - iF2;
                h hVar2 = (h) obj;
                p.m0<h> m0VarA = hVar.f8797f;
                if (m0VarA == null) {
                    m0VarA = p.y0.a();
                    hVar.f8797f = m0VarA;
                }
                m0VarA.j(hVar2);
                hVar.d(hVar2, iO2, -1, -1);
            }
            if (obj instanceof v2) {
                int iO3 = d3Var.o() - iF2;
                v2 v2Var = (v2) obj;
                b bVar = v2Var.f31950b;
                if (bVar == null || !bVar.a()) {
                    iO = -1;
                } else {
                    iC = d3Var.c(bVar);
                    iO = d3Var.o() - d3Var.O(iC);
                }
                hVar.d(v2Var, iO3, iC, iO);
            }
            if (obj instanceof h2) {
                ((h2) obj).d();
            }
        }
        d3Var.H();
    }

    public static final void i(d3 d3Var, int i10, Object obj) {
        int iG = d3Var.g(i10);
        Object[] objArr = d3Var.f31634c;
        Object obj2 = objArr[iG];
        objArr[iG] = j.a.f31715a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}

package y0;

import java.util.ArrayList;
import java.util.List;
import x0.a3;
import x0.c3;
import x0.d3;
import x0.h2;
import x0.i1;
import x0.j1;
import x0.r1;
import x0.v2;
import y0.e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f33627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33628b;

    public static final class a extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final a f33629c = new a(1, 0, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            d3Var.a(aVar.a(0));
        }
    }

    public static final class a0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final a0 f33630c;

        static {
            int i10 = 0;
            f33630c = new a0(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            d3Var.L();
        }
    }

    public static final class b extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final b f33631c = new b(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.b bVar = (x0.b) aVar.b(0);
            Object objB = aVar.b(1);
            if (objB instanceof v2) {
                hVar.e((v2) objB);
            }
            if (d3Var.f31645n != 0) {
                x0.q.c("Can only append a slot if not current inserting");
            }
            int i10 = d3Var.f31640i;
            int i11 = d3Var.f31641j;
            int iC = d3Var.c(bVar);
            int iF = d3Var.f(d3Var.f31633b, d3Var.q(iC + 1));
            d3Var.f31640i = iF;
            d3Var.f31641j = iF;
            d3Var.v(1, iC);
            if (i10 >= iF) {
                i10++;
                i11++;
            }
            d3Var.f31634c[iF] = objB;
            d3Var.f31640i = i10;
            d3Var.f31641j = i11;
        }
    }

    public static final class b0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final b0 f33632c;

        static {
            int i10 = 1;
            f33632c = new b0(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            hVar.getClass();
        }
    }

    public static final class c extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final c f33633c = new c(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            f1.d dVar2 = (f1.d) aVar.b(1);
            int i10 = dVar2 != null ? dVar2.f8789a : 0;
            y0.a aVar2 = (y0.a) aVar.b(0);
            if (i10 > 0) {
                dVar = new r1(dVar, i10);
            }
            aVar2.I(dVar, d3Var, hVar);
        }
    }

    public static final class c0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final c0 f33634c = new c0(1, 0, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            int iC;
            int iO;
            int iA = aVar.a(0);
            int iO2 = d3Var.o();
            int i10 = d3Var.f31653v;
            int iM = d3Var.M(d3Var.f31633b, d3Var.q(i10));
            int iF = d3Var.f(d3Var.f31633b, d3Var.q(i10 + 1));
            for (int iMax = Math.max(iM, iF - iA); iMax < iF; iMax++) {
                Object obj = d3Var.f31634c[d3Var.g(iMax)];
                if (obj instanceof v2) {
                    int i11 = iO2 - iMax;
                    v2 v2Var = (v2) obj;
                    x0.b bVar = v2Var.f31950b;
                    if (bVar == null || !bVar.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = d3Var.c(bVar);
                        iO = d3Var.o() - d3Var.O(iC);
                    }
                    hVar.d(v2Var, i11, iC, iO);
                } else if (obj instanceof h2) {
                    ((h2) obj).d();
                }
            }
            if (iA <= 0) {
                x0.q.c("Check failed");
            }
            int i12 = d3Var.f31653v;
            int iM2 = d3Var.M(d3Var.f31633b, d3Var.q(i12));
            int iF2 = d3Var.f(d3Var.f31633b, d3Var.q(i12 + 1)) - iA;
            if (iF2 < iM2) {
                x0.q.c("Check failed");
            }
            d3Var.J(iF2, iA, i12);
            int i13 = d3Var.f31640i;
            if (i13 >= iM2) {
                d3Var.f31640i = i13 - iA;
            }
        }
    }

    /* renamed from: y0.d$d, reason: collision with other inner class name */
    public static final class C0338d extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C0338d f33635c = new C0338d(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            int i10 = ((f1.d) aVar.b(0)).f8789a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                kotlin.jvm.internal.r.c(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i12 = i10 + i11;
                dVar.a(i12, obj);
                dVar.g(i12, obj);
            }
        }
    }

    public static final class d0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final d0 f33636c = new d0(1, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            int iC;
            int iO;
            Object objB = aVar.b(0);
            x0.b bVar = (x0.b) aVar.b(1);
            int iA = aVar.a(0);
            if (objB instanceof v2) {
                hVar.e((v2) objB);
            }
            int iC2 = d3Var.c(bVar);
            int iG = d3Var.g(d3Var.N(iC2, iA));
            Object[] objArr = d3Var.f31634c;
            Object obj = objArr[iG];
            objArr[iG] = objB;
            if (!(obj instanceof v2)) {
                if (obj instanceof h2) {
                    ((h2) obj).d();
                    return;
                }
                return;
            }
            int iO2 = d3Var.o() - d3Var.N(iC2, iA);
            v2 v2Var = (v2) obj;
            x0.b bVar2 = v2Var.f31950b;
            if (bVar2 == null || !bVar2.a()) {
                iC = -1;
                iO = -1;
            } else {
                iC = d3Var.c(bVar2);
                iO = d3Var.o() - d3Var.O(iC);
            }
            hVar.d(v2Var, iO2, iC, iO);
        }
    }

    public static final class e extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final e f33637c = new e(0, 4, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            j1 j1Var = (j1) aVar.b(2);
            j1 j1Var2 = (j1) aVar.b(3);
            x0.s sVar = (x0.s) aVar.b(1);
            i1 i1VarL = (i1) aVar.b(0);
            if (i1VarL == null && (i1VarL = sVar.l(j1Var)) == null) {
                x0.q.d("Could not resolve state for movable content");
                throw new pg.g();
            }
            a3 a3Var = i1VarL.f31711a;
            if (d3Var.f31645n > 0 || d3Var.s(d3Var.f31651t + 1) != 1) {
                x0.q.c("Check failed");
            }
            int i10 = d3Var.f31651t;
            int i11 = d3Var.f31640i;
            int i12 = d3Var.f31641j;
            d3Var.a(1);
            d3Var.P();
            d3Var.d();
            d3 d3VarG = a3Var.g();
            try {
                List listA = d3.a.a(d3VarG, 2, d3Var, false, true, true);
                d3VarG.e(true);
                d3Var.j();
                d3Var.i();
                d3Var.f31651t = i10;
                d3Var.f31640i = i11;
                d3Var.f31641j = i12;
                h2.a.a(d3Var, listA, j1Var2.f31720c);
            } catch (Throwable th2) {
                d3VarG.e(false);
                throw th2;
            }
        }
    }

    public static final class e0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final e0 f33638c;

        static {
            int i10 = 1;
            f33638c = new e0(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            d3Var.T(aVar.b(0));
        }
    }

    public static final class f extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final f f33639c;

        static {
            int i10 = 0;
            f33639c = new f(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.q.e(d3Var, hVar);
        }
    }

    public static final class f0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final f0 f33640c = new f0(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            ((eh.p) aVar.b(1)).invoke(dVar.h(), aVar.b(0));
        }
    }

    public static final class g extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final g f33641c = new g(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            int i10;
            f1.d dVar2 = (f1.d) aVar.b(0);
            x0.b bVar = (x0.b) aVar.b(1);
            kotlin.jvm.internal.r.c(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int iC = d3Var.c(bVar);
            if (d3Var.f31651t >= iC) {
                x0.q.c("Check failed");
            }
            p1.a.d(d3Var, dVar, iC);
            int i11 = d3Var.f31651t;
            int iE = d3Var.f31653v;
            while (iE >= 0 && !d3Var.w(iE)) {
                iE = d3Var.E(d3Var.f31633b, iE);
            }
            int iS = iE + 1;
            int iK = 0;
            while (iS < i11) {
                if (d3Var.t(i11, iS)) {
                    if (d3Var.w(iS)) {
                        iK = 0;
                    }
                    iS++;
                } else {
                    iK += d3Var.w(iS) ? 1 : d3Var.D(iS);
                    iS += d3Var.s(iS);
                }
            }
            while (true) {
                i10 = d3Var.f31651t;
                if (i10 >= iC) {
                    break;
                }
                if (d3Var.t(iC, i10)) {
                    int i12 = d3Var.f31651t;
                    if (i12 < d3Var.f31652u && (d3Var.f31633b[(d3Var.q(i12) * 5) + 1] & 1073741824) != 0) {
                        dVar.b(d3Var.C(d3Var.f31651t));
                        iK = 0;
                    }
                    d3Var.P();
                } else {
                    iK += d3Var.K();
                }
            }
            if (i10 != iC) {
                x0.q.c("Check failed");
            }
            dVar2.f8789a = iK;
        }
    }

    public static final class g0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final g0 f33642c = new g0(1, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            Object objB = aVar.b(0);
            int iA = aVar.a(0);
            if (objB instanceof v2) {
                hVar.e((v2) objB);
            }
            int iG = d3Var.g(d3Var.N(d3Var.f31651t, iA));
            Object[] objArr = d3Var.f31634c;
            Object obj = objArr[iG];
            objArr[iG] = objB;
            if (obj instanceof v2) {
                hVar.d((v2) obj, d3Var.o() - d3Var.N(d3Var.f31651t, iA), -1, -1);
            } else if (obj instanceof h2) {
                ((h2) obj).d();
            }
        }
    }

    public static final class h extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final h f33643c;

        static {
            int i10 = 1;
            f33643c = new h(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            kotlin.jvm.internal.r.c(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) aVar.b(0)) {
                dVar.b(obj);
            }
        }
    }

    public static final class h0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final h0 f33644c = new h0(1, 0, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            int iA = aVar.a(0);
            for (int i10 = 0; i10 < iA; i10++) {
                dVar.f();
            }
        }
    }

    public static final class i extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final i f33645c = new i(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            ((eh.l) aVar.b(0)).invoke((x0.r) aVar.b(1));
        }
    }

    public static final class i0 extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final i0 f33646c;

        static {
            int i10 = 0;
            f33646c = new i0(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            dVar.c();
        }
    }

    public static final class j extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final j f33647c;

        static {
            int i10 = 0;
            f33647c = new j(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            d3Var.i();
        }
    }

    public static final class k extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final k f33648c;

        static {
            int i10 = 0;
            f33648c = new k(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            kotlin.jvm.internal.r.c(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            p1.a.d(d3Var, dVar, 0);
            d3Var.i();
        }
    }

    public static final class l extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final l f33649c;

        static {
            int i10 = 1;
            f33649c = new l(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            hVar.getClass();
        }
    }

    public static final class m extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final m f33650c;

        static {
            int i10 = 1;
            f33650c = new m(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.b bVar = (x0.b) aVar.b(0);
            bVar.getClass();
            d3Var.k(d3Var.c(bVar));
        }
    }

    public static final class n extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final n f33651c;

        static {
            int i10 = 0;
            f33651c = new n(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            d3Var.k(0);
        }
    }

    public static final class o extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final o f33652c = new o(1, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            Object objInvoke = ((eh.a) aVar.b(0)).invoke();
            x0.b bVar = (x0.b) aVar.b(1);
            int iA = aVar.a(0);
            kotlin.jvm.internal.r.c(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            bVar.getClass();
            d3Var.V(d3Var.c(bVar), objInvoke);
            dVar.g(iA, objInvoke);
            dVar.b(objInvoke);
        }
    }

    public static final class p extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final p f33653c = new p(0, 2, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            a3 a3Var = (a3) aVar.b(1);
            x0.b bVar = (x0.b) aVar.b(0);
            d3Var.d();
            bVar.getClass();
            d3Var.y(a3Var, a3Var.c(bVar));
            d3Var.j();
        }
    }

    public static final class q extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final q f33654c = new q(0, 3, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            a3 a3Var = (a3) aVar.b(1);
            x0.b bVar = (x0.b) aVar.b(0);
            y0.c cVar = (y0.c) aVar.b(2);
            d3 d3VarG = a3Var.g();
            try {
                if (!cVar.f33626b.K()) {
                    x0.q.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                }
                cVar.f33625a.J(dVar, d3VarG, hVar);
                pg.f0 f0Var = pg.f0.f21461a;
                d3VarG.e(true);
                d3Var.d();
                bVar.getClass();
                d3Var.y(a3Var, a3Var.c(bVar));
                d3Var.j();
            } catch (Throwable th2) {
                d3VarG.e(false);
                throw th2;
            }
        }
    }

    public static final class r extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final r f33655c = new r(1, 0, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.b bVar;
            int iC;
            int iA = aVar.a(0);
            if (d3Var.f31645n != 0) {
                x0.q.c("Cannot move a group while inserting");
            }
            if (iA < 0) {
                x0.q.c("Parameter offset is out of bounds");
            }
            if (iA == 0) {
                return;
            }
            int i10 = d3Var.f31651t;
            int i11 = d3Var.f31653v;
            int i12 = d3Var.f31652u;
            int i13 = i10;
            while (iA > 0) {
                i13 += d3Var.f31633b[(d3Var.q(i13) * 5) + 3];
                if (i13 > i12) {
                    x0.q.c("Parameter offset is out of bounds");
                }
                iA--;
            }
            int i14 = d3Var.f31633b[(d3Var.q(i13) * 5) + 3];
            int iF = d3Var.f(d3Var.f31633b, d3Var.q(d3Var.f31651t));
            int iF2 = d3Var.f(d3Var.f31633b, d3Var.q(i13));
            int i15 = i13 + i14;
            int iF3 = d3Var.f(d3Var.f31633b, d3Var.q(i15));
            int i16 = iF3 - iF2;
            d3Var.v(i16, Math.max(d3Var.f31651t - 1, 0));
            d3Var.u(i14);
            int[] iArr = d3Var.f31633b;
            int iQ = d3Var.q(i15) * 5;
            qg.m.d(d3Var.q(i10) * 5, iArr, iQ, (i14 * 5) + iQ, iArr);
            if (i16 > 0) {
                Object[] objArr = d3Var.f31634c;
                int iG = d3Var.g(iF2 + i16);
                System.arraycopy(objArr, iG, objArr, iF, d3Var.g(iF3 + i16) - iG);
            }
            int i17 = iF2 + i16;
            int i18 = i17 - iF;
            int i19 = d3Var.f31642k;
            int i20 = d3Var.f31643l;
            int length = d3Var.f31634c.length;
            int i21 = d3Var.f31644m;
            int i22 = i10 + i14;
            int i23 = i10;
            while (i23 < i22) {
                int iQ2 = d3Var.q(i23);
                int i24 = i18;
                int[] iArr2 = iArr;
                iArr2[(iQ2 * 5) + 4] = d3.h(d3.h(d3Var.f(iArr, iQ2) - i24, i21 < iQ2 ? 0 : i19, i20, length), d3Var.f31642k, d3Var.f31643l, d3Var.f31634c.length);
                i23++;
                i18 = i24;
                i19 = i19;
                iArr = iArr2;
            }
            int i25 = i15 + i14;
            int iN = d3Var.n();
            int iB = c3.b(d3Var.f31635d, i15, iN);
            ArrayList arrayList = new ArrayList();
            if (iB >= 0) {
                while (iB < d3Var.f31635d.size() && (iC = d3Var.c((bVar = d3Var.f31635d.get(iB)))) >= i15 && iC < i25) {
                    arrayList.add(bVar);
                    d3Var.f31635d.remove(iB);
                }
            }
            int i26 = i10 - i15;
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                x0.b bVar2 = (x0.b) arrayList.get(i27);
                int iC2 = d3Var.c(bVar2) + i26;
                if (iC2 >= d3Var.f31638g) {
                    bVar2.f31620a = -(iN - iC2);
                } else {
                    bVar2.f31620a = iC2;
                }
                d3Var.f31635d.add(c3.b(d3Var.f31635d, iC2, iN), bVar2);
            }
            if (d3Var.I(i15, i14)) {
                x0.q.c("Unexpectedly removed anchors");
            }
            d3Var.l(i11, d3Var.f31652u, i10);
            if (i16 > 0) {
                d3Var.J(i17, i16, i15 - 1);
            }
        }
    }

    public static final class s extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final s f33656c = new s(3, 0, 2);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            dVar.d(aVar.a(0), aVar.a(1), aVar.a(2));
        }
    }

    public static final class t extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final t f33657c = new t(1, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.b bVar = (x0.b) aVar.b(0);
            int iA = aVar.a(0);
            dVar.f();
            bVar.getClass();
            dVar.a(iA, d3Var.C(d3Var.c(bVar)));
        }
    }

    public static final class u extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final u f33658c = new u(0, 3, 1);

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.f0 f0Var = (x0.f0) aVar.b(0);
            j1 j1Var = (j1) aVar.b(2);
            ((x0.s) aVar.b(1)).k(j1Var, x0.q.f(f0Var, j1Var, d3Var, null), dVar);
        }
    }

    public static final class v extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final v f33659c;

        static {
            int i10 = 1;
            f33659c = new v(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            hVar.e((v2) aVar.b(0));
        }
    }

    public static final class w extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final w f33660c;

        static {
            int i10 = 0;
            f33660c = new w(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            x0.q.h(d3Var, hVar);
        }
    }

    public static final class x extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final x f33661c;

        static {
            int i10 = 2;
            f33661c = new x(i10, 0, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            dVar.e(aVar.a(0), aVar.a(1));
        }
    }

    public static final class y extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final y f33662c;

        static {
            int i10 = 0;
            f33662c = new y(i10, i10, 3);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            if (d3Var.f31645n != 0) {
                x0.q.c("Cannot reset when inserting");
            }
            d3Var.G();
            d3Var.f31651t = 0;
            d3Var.f31652u = d3Var.m() - d3Var.f31639h;
            d3Var.f31640i = 0;
            d3Var.f31641j = 0;
            d3Var.f31646o = 0;
        }
    }

    public static final class z extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final z f33663c;

        static {
            int i10 = 1;
            f33663c = new z(0, i10, i10);
        }

        @Override // y0.d
        public final void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar) {
            hVar.f8796e.b((eh.a) aVar.b(0));
        }
    }

    public d(int i10, int i11) {
        this.f33627a = i10;
        this.f33628b = i11;
    }

    public abstract void a(e.a aVar, x0.d dVar, d3 d3Var, f1.h hVar);

    public final String toString() {
        String strE = kotlin.jvm.internal.h0.a(getClass()).e();
        return strE == null ? "" : strE;
    }

    public /* synthetic */ d(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}

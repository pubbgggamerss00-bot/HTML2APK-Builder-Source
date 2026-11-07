package d0;

import android.os.Trace;
import d0.a;
import d0.d1;
import d0.d1.a;
import g2.s1;
import i2.n2;
import i2.o2;
import java.util.List;
import nh.b;
import nh.h;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f7098a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.s1 f7099b;

    /* renamed from: c, reason: collision with root package name */
    public final h2 f7100c;

    public final class a implements d1.b, g2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f7101a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7102b;

        /* renamed from: c, reason: collision with root package name */
        public final f2 f7103c;

        /* renamed from: d, reason: collision with root package name */
        public s1.a f7104d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7105e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7106f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7107g;

        /* renamed from: h, reason: collision with root package name */
        public C0076a f7108h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f7109i;

        /* renamed from: j, reason: collision with root package name */
        public long f7110j;

        /* renamed from: k, reason: collision with root package name */
        public long f7111k;

        /* renamed from: l, reason: collision with root package name */
        public long f7112l = nh.g.b();

        /* renamed from: d0.e2$a$a, reason: collision with other inner class name */
        public final class C0076a {

            /* renamed from: a, reason: collision with root package name */
            public final List<d1> f7114a;

            /* renamed from: b, reason: collision with root package name */
            public final List<g2>[] f7115b;

            /* renamed from: c, reason: collision with root package name */
            public int f7116c;

            /* renamed from: d, reason: collision with root package name */
            public int f7117d;

            public C0076a(List<d1> list) {
                this.f7114a = list;
                this.f7115b = new List[list.size()];
                if (list.isEmpty()) {
                    y.c.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        public static final class b extends kotlin.jvm.internal.s implements eh.l<o2, n2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.g0<List<d1>> f7119a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlin.jvm.internal.g0<List<d1>> g0Var) {
                super(1);
                this.f7119a = g0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // eh.l
            public final n2 invoke(o2 o2Var) {
                T tK;
                o2 o2Var2 = o2Var;
                kotlin.jvm.internal.r.c(o2Var2, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d1 d1Var = ((k2) o2Var2).f7176q;
                kotlin.jvm.internal.g0<List<d1>> g0Var = this.f7119a;
                List<d1> list = g0Var.f16327a;
                if (list != null) {
                    list.add(d1Var);
                    tK = list;
                } else {
                    tK = qg.p.k(d1Var);
                }
                g0Var.f16327a = tK;
                return n2.f13964b;
            }
        }

        public a(int i10, long j10, f2 f2Var) {
            this.f7101a = i10;
            this.f7102b = j10;
            this.f7103c = f2Var;
        }

        @Override // d0.d1.b
        public final void a() {
            this.f7109i = true;
        }

        @Override // d0.g2
        public final boolean b(a.C0075a c0075a) {
            long j10;
            long j11;
            long j12;
            Object obj;
            long j13;
            List<g2> list;
            e2 e2Var = e2.this;
            g0 g0Var = (g0) e2Var.f7098a.f7071b.invoke();
            if (this.f7106f) {
                return false;
            }
            int itemCount = g0Var.getItemCount();
            int i10 = this.f7101a;
            if (i10 < 0 || i10 >= itemCount) {
                return false;
            }
            Object objE = g0Var.e(i10);
            this.f7110j = c0075a.a();
            this.f7112l = nh.g.b();
            this.f7111k = 0L;
            s1.a aVar = this.f7104d;
            f2 f2Var = this.f7103c;
            if (aVar != null) {
                j10 = 0;
            } else {
                long j14 = this.f7110j;
                j10 = 0;
                long j15 = f2Var.a(objE).f7054a;
                if ((!this.f7109i || j14 <= 0) && j15 >= j14) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    if (this.f7104d != null) {
                        y.c.a("Request was already composed!");
                    }
                    Object objD = g0Var.d(i10);
                    this.f7104d = e2Var.f7099b.a().f(objD, e2Var.f7098a.a(i10, objD, objE));
                    pg.f0 f0Var = pg.f0.f21461a;
                    Trace.endSection();
                    e();
                    long j16 = this.f7111k;
                    d0.b bVar = f2Var.f7127a;
                    long j17 = bVar.f7054a;
                    if (j17 == 0) {
                        j11 = j16;
                    } else {
                        long j18 = 4;
                        j11 = j16;
                        j16 = (j11 / j18) + ((j17 / j18) * 3);
                    }
                    bVar.f7054a = j16;
                    d0.b bVarA = f2Var.a(objE);
                    long j19 = bVarA.f7054a;
                    if (j19 == 0) {
                        j12 = j11;
                    } else {
                        long j20 = 4;
                        j12 = (j11 / j20) + ((j19 / j20) * 3);
                    }
                    bVarA.f7054a = j12;
                } finally {
                }
            }
            if (!this.f7109i) {
                if (!this.f7107g) {
                    if (this.f7110j <= j10) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f7108h = d();
                        this.f7107g = true;
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    } finally {
                    }
                }
                C0076a c0076a = this.f7108h;
                if (c0076a != null) {
                    List<g2>[] listArr = c0076a.f7115b;
                    int i11 = c0076a.f7116c;
                    List<d1> list2 = c0076a.f7114a;
                    if (i11 < list2.size()) {
                        if (a.this.f7106f) {
                            y.c.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (c0076a.f7116c < list2.size()) {
                            try {
                                if (listArr[c0076a.f7116c] == null) {
                                    if (c0075a.a() <= j10) {
                                        return true;
                                    }
                                    int i12 = c0076a.f7116c;
                                    d1 d1Var = list2.get(i12);
                                    eh.l<c2, pg.f0> lVar = d1Var.f7085b;
                                    if (lVar == null) {
                                        list = qg.z.f22752a;
                                    } else {
                                        d1.a aVar2 = d1Var.new a();
                                        lVar.invoke(aVar2);
                                        list = aVar2.f7088a;
                                    }
                                    listArr[i12] = list;
                                }
                                List<g2> list3 = listArr[c0076a.f7116c];
                                kotlin.jvm.internal.r.b(list3);
                                while (c0076a.f7117d < list3.size()) {
                                    if (list3.get(c0076a.f7117d).b(c0075a)) {
                                        return true;
                                    }
                                    c0076a.f7117d++;
                                }
                                c0076a.f7117d = 0;
                                c0076a.f7116c++;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        pg.f0 f0Var3 = pg.f0.f21461a;
                    }
                }
                e();
            }
            if (this.f7105e) {
                return false;
            }
            long j21 = this.f7102b;
            if (f3.b.l(j21)) {
                return false;
            }
            long j22 = this.f7110j;
            long j23 = f2Var.a(objE).f7055b;
            if ((!this.f7109i || j22 <= j10) && j23 >= j22) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:measure");
            try {
                c(j21);
                pg.f0 f0Var4 = pg.f0.f21461a;
                Trace.endSection();
                e();
                long j24 = this.f7111k;
                d0.b bVar2 = f2Var.f7127a;
                long j25 = bVar2.f7055b;
                if (j25 == j10) {
                    obj = objE;
                    j13 = j24;
                } else {
                    long j26 = 4;
                    obj = objE;
                    j13 = (j24 / j26) + ((j25 / j26) * 3);
                }
                bVar2.f7055b = j13;
                d0.b bVarA2 = f2Var.a(obj);
                long j27 = bVarA2.f7055b;
                if (j27 != j10) {
                    long j28 = 4;
                    j24 = (j24 / j28) + ((j27 / j28) * 3);
                }
                bVarA2.f7055b = j24;
                return false;
            } finally {
            }
        }

        public final void c(long j10) {
            if (this.f7106f) {
                y.c.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f7105e) {
                y.c.a("Request was already measured!");
            }
            this.f7105e = true;
            s1.a aVar = this.f7104d;
            if (aVar == null) {
                y.c.b("performComposition() must be called before performMeasure()");
                throw new pg.g();
            }
            int iB = aVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                aVar.c(i10, j10);
            }
        }

        @Override // d0.d1.b
        public final void cancel() {
            if (this.f7106f) {
                return;
            }
            this.f7106f = true;
            s1.a aVar = this.f7104d;
            if (aVar != null) {
                aVar.a();
            }
            this.f7104d = null;
        }

        public final C0076a d() {
            s1.a aVar = this.f7104d;
            if (aVar == null) {
                y.c.b("Should precompose before resolving nested prefetch states");
                throw new pg.g();
            }
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            aVar.d(new b(g0Var));
            List list = (List) g0Var.f16327a;
            if (list != null) {
                return new C0076a(list);
            }
            return null;
        }

        public final void e() {
            long jB = nh.g.b();
            long jA = h.a.C0211a.a(jB, this.f7112l);
            long j10 = jA >> 1;
            b.a aVar = nh.b.f18809b;
            if ((((int) jA) & 1) != 0) {
                j10 = j10 > 9223372036854L ? Long.MAX_VALUE : j10 < -9223372036854L ? Long.MIN_VALUE : j10 * 1000000;
            }
            this.f7111k = j10;
            this.f7110j -= j10;
            this.f7112l = jB;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.f7101a);
            sb.append(", constraints = ");
            sb.append((Object) f3.b.m(this.f7102b));
            sb.append(", isComposed = ");
            sb.append(this.f7104d != null);
            sb.append(", isMeasured = ");
            sb.append(this.f7105e);
            sb.append(", isCanceled = ");
            sb.append(this.f7106f);
            sb.append(" }");
            return sb.toString();
        }
    }

    public e2(c0 c0Var, g2.s1 s1Var, h2 h2Var) {
        this.f7098a = c0Var;
        this.f7099b = s1Var;
        this.f7100c = h2Var;
    }
}

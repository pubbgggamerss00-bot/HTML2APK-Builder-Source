package g2;

import g2.d0;
import g2.s1;
import i2.e0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f0 extends e0.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f11368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<t1, f3.b, m0> f11369c;

    public static final class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f11370a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f11371b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11372c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m0 f11373d;

        public a(m0 m0Var, d0 d0Var, int i10, m0 m0Var2) {
            this.f11371b = d0Var;
            this.f11372c = i10;
            this.f11373d = m0Var2;
            this.f11370a = m0Var;
        }

        @Override // g2.m0
        public final int a() {
            return this.f11370a.a();
        }

        @Override // g2.m0
        public final int getHeight() {
            return this.f11370a.getHeight();
        }

        @Override // g2.m0
        public final Map<g2.a, Integer> r() {
            return this.f11370a.r();
        }

        @Override // g2.m0
        public final void s() {
            int i10 = this.f11372c;
            d0 d0Var = this.f11371b;
            d0Var.f11328e = i10;
            this.f11373d.s();
            p.l0<Object, s1.a> l0Var = d0Var.f11335m;
            long[] jArr = l0Var.f20737a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = l0Var.f20738b[i14];
                            s1.a aVar = (s1.a) l0Var.f20739c[i14];
                            int i15 = d0Var.f11336n.i(obj);
                            if (i15 < 0 || i15 >= d0Var.f11328e) {
                                aVar.a();
                                l0Var.k(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
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

        @Override // g2.m0
        public final eh.l<Object, pg.f0> t() {
            return this.f11370a.t();
        }
    }

    public static final class b implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f11374a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f11375b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11376c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m0 f11377d;

        public b(m0 m0Var, d0 d0Var, int i10, m0 m0Var2) {
            this.f11375b = d0Var;
            this.f11376c = i10;
            this.f11377d = m0Var2;
            this.f11374a = m0Var;
        }

        @Override // g2.m0
        public final int a() {
            return this.f11374a.a();
        }

        @Override // g2.m0
        public final int getHeight() {
            return this.f11374a.getHeight();
        }

        @Override // g2.m0
        public final Map<g2.a, Integer> r() {
            return this.f11374a.r();
        }

        @Override // g2.m0
        public final void s() {
            int i10 = this.f11376c;
            d0 d0Var = this.f11375b;
            d0Var.f11327d = i10;
            this.f11377d.s();
            d0Var.b(d0Var.f11327d);
        }

        @Override // g2.m0
        public final eh.l<Object, pg.f0> t() {
            return this.f11374a.t();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(d0 d0Var, eh.p<? super t1, ? super f3.b, ? extends m0> pVar, String str) {
        super(str);
        this.f11368b = d0Var;
        this.f11369c = pVar;
    }

    @Override // g2.l0
    public final m0 h(o0 o0Var, List<? extends k0> list, long j10) {
        d0 d0Var = this.f11368b;
        d0.c cVar = d0Var.f11331h;
        cVar.f11348a = o0Var.getLayoutDirection();
        cVar.f11349b = o0Var.getDensity();
        cVar.f11350c = o0Var.G0();
        boolean zI0 = o0Var.I0();
        eh.p<t1, f3.b, m0> pVar = this.f11369c;
        if (zI0 || d0Var.f11324a.f13816h == null) {
            d0Var.f11327d = 0;
            m0 m0VarInvoke = pVar.invoke(cVar, new f3.b(j10));
            return new b(m0VarInvoke, d0Var, d0Var.f11327d, m0VarInvoke);
        }
        d0Var.f11328e = 0;
        m0 m0VarInvoke2 = pVar.invoke(d0Var.f11332j, new f3.b(j10));
        return new a(m0VarInvoke2, d0Var, d0Var.f11328e, m0VarInvoke2);
    }
}

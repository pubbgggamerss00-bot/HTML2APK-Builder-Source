package t0;

import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class wc implements g2.l0 {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27312a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27313b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27314c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27315d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27316e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27317f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27318g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f27319h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, int i10, g2.g1 g1Var2, int i11, int i12, g2.g1 g1Var3, int i13, int i14) {
            super(1);
            this.f27312a = g1Var;
            this.f27313b = i10;
            this.f27314c = g1Var2;
            this.f27315d = i11;
            this.f27316e = i12;
            this.f27317f = g1Var3;
            this.f27318g = i13;
            this.f27319h = i14;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            g1.a.g(aVar2, this.f27312a, 0, this.f27313b);
            g2.g1 g1Var = this.f27314c;
            if (g1Var != null) {
                g1.a.g(aVar2, g1Var, this.f27315d, this.f27316e);
            }
            g2.g1 g1Var2 = this.f27317f;
            if (g1Var2 != null) {
                g1.a.g(aVar2, g1Var2, this.f27318g, this.f27319h);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0104 A[PHI: r4 r6
      0x0104: PHI (r4v11 int) = (r4v10 int), (r4v15 int), (r4v15 int) binds: [B:67:0x011e, B:60:0x00f9, B:62:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r6v8 int) = (r6v7 int), (r6v13 int), (r6v13 int) binds: [B:67:0x011e, B:60:0x00f9, B:62:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // g2.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        g2.k0 k0Var;
        g2.k0 k0Var2;
        int iB1;
        int iMax;
        int i10;
        int iQ;
        List<? extends g2.k0> list2 = list;
        int iMin = Math.min(f3.b.i(j10), o0Var.b1(id.f26112a));
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                k0Var = null;
                break;
            }
            k0Var = list2.get(i11);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "action")) {
                break;
            }
            i11++;
        }
        g2.k0 k0Var3 = k0Var;
        g2.g1 g1VarP = k0Var3 != null ? k0Var3.P(j10) : null;
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                k0Var2 = null;
                break;
            }
            k0Var2 = list2.get(i12);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "dismissAction")) {
                break;
            }
            i12++;
        }
        g2.k0 k0Var4 = k0Var2;
        g2.g1 g1VarP2 = k0Var4 != null ? k0Var4.P(j10) : null;
        int i13 = g1VarP != null ? g1VarP.f11382a : 0;
        int i14 = g1VarP != null ? g1VarP.f11383b : 0;
        int i15 = g1VarP2 != null ? g1VarP2.f11382a : 0;
        int i16 = g1VarP2 != null ? g1VarP2.f11383b : 0;
        int iB12 = ((iMin - i13) - i15) - (i15 == 0 ? o0Var.b1(id.f26117f) : 0);
        int iK = f3.b.k(j10);
        if (iB12 >= iK) {
            iK = iB12;
        }
        int size3 = list2.size();
        int i17 = 0;
        while (i17 < size3) {
            g2.k0 k0Var5 = list2.get(i17);
            if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var5), "text")) {
                g2.g1 g1VarP3 = k0Var5.P(f3.b.b(j10, 0, iK, 0, 0, 9));
                g2.o oVar = g2.b.f11314a;
                int iQ2 = g1VarP3.Q(oVar);
                int iQ3 = g1VarP3.Q(g2.b.f11315b);
                boolean z10 = true;
                boolean z11 = (iQ2 == Integer.MIN_VALUE || iQ3 == Integer.MIN_VALUE) ? false : true;
                if (iQ2 != iQ3 && z11) {
                    z10 = false;
                }
                int i18 = iMin - i15;
                int i19 = i18 - i13;
                if (z10) {
                    iMax = Math.max(o0Var.b1(v0.g0.f30289f), Math.max(i14, i16));
                    iB1 = (iMax - g1VarP3.f11383b) / 2;
                    i10 = (g1VarP == null || (iQ = g1VarP.Q(oVar)) == Integer.MIN_VALUE) ? 0 : (iQ2 + iB1) - iQ;
                } else {
                    iB1 = o0Var.b1(id.f26113b) - iQ2;
                    iMax = Math.max(o0Var.b1(v0.g0.f30290g), g1VarP3.f11383b + iB1);
                    if (g1VarP != null) {
                        i10 = (iMax - g1VarP.f11383b) / 2;
                    }
                }
                return o0Var.i0(iMin, iMax, qg.a0.f22708a, new a(g1VarP3, iB1, g1VarP2, i18, g1VarP2 != null ? (iMax - g1VarP2.f11383b) / 2 : 0, g1VarP, i19, i10));
            }
            i17++;
            iK = iK;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

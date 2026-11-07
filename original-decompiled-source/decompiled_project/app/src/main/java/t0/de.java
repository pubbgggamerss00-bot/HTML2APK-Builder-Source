package t0;

import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class de implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25697b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25698a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25699b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f25700c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f25701d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f25702e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f25703f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Integer f25704g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, g2.g1 g1Var2, g2.o0 o0Var, int i10, int i11, Integer num, Integer num2) {
            super(1);
            this.f25698a = g1Var;
            this.f25699b = g1Var2;
            this.f25700c = o0Var;
            this.f25701d = i10;
            this.f25702e = i11;
            this.f25703f = num;
            this.f25704g = num2;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            g2.g1 g1Var = this.f25699b;
            int i10 = this.f25702e;
            g2.g1 g1Var2 = this.f25698a;
            if (g1Var2 != null && g1Var != null) {
                Integer num = this.f25703f;
                kotlin.jvm.internal.r.b(num);
                int iIntValue = num.intValue();
                Integer num2 = this.f25704g;
                kotlin.jvm.internal.r.b(num2);
                int iIntValue2 = num2.intValue();
                float f10 = iIntValue == iIntValue2 ? he.f26035d : he.f26036e;
                g2.o0 o0Var = this.f25700c;
                int iB1 = o0Var.b1(v0.z.f30526a) + o0Var.b1(f10);
                int iT0 = (o0Var.T0(he.f26037f) + g1Var.f11383b) - iIntValue;
                int i11 = g1Var2.f11382a;
                int i12 = this.f25701d;
                int i13 = (i10 - iIntValue2) - iB1;
                g1.a.g(aVar2, g1Var2, (i12 - i11) / 2, i13);
                g1.a.g(aVar2, g1Var, (i12 - g1Var.f11382a) / 2, i13 - iT0);
            } else if (g1Var2 != null) {
                float f11 = he.f26032a;
                g1.a.g(aVar2, g1Var2, 0, (i10 - g1Var2.f11383b) / 2);
            } else if (g1Var != null) {
                float f12 = he.f26032a;
                g1.a.g(aVar2, g1Var, 0, (i10 - g1Var.f11383b) / 2);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public de(eh.p<? super x0.j, ? super Integer, pg.f0> pVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar2) {
        this.f25696a = pVar;
        this.f25697b = pVar2;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        g2.g1 g1VarP;
        g2.g1 g1VarP2;
        if (this.f25696a != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                g2.k0 k0Var = list.get(i10);
                if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var), "text")) {
                    g1VarP = k0Var.P(f3.b.b(j10, 0, 0, 0, 0, 11));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        g1VarP = null;
        if (this.f25697b != null) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                g2.k0 k0Var2 = list.get(i11);
                if (kotlin.jvm.internal.r.a(androidx.compose.ui.layout.a.a(k0Var2), "icon")) {
                    g1VarP2 = k0Var2.P(j10);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        g1VarP2 = null;
        int iMax = Math.max(g1VarP != null ? g1VarP.f11382a : 0, g1VarP2 != null ? g1VarP2.f11382a : 0);
        int iMax2 = Math.max(o0Var.b1((g1VarP == null || g1VarP2 == null) ? he.f26032a : he.f26033b), o0Var.T0(he.f26037f) + (g1VarP2 != null ? g1VarP2.f11383b : 0) + (g1VarP != null ? g1VarP.f11383b : 0));
        return o0Var.i0(iMax, iMax2, qg.a0.f22708a, new a(g1VarP, g1VarP2, o0Var, iMax, iMax2, g1VarP != null ? Integer.valueOf(g1VarP.Q(g2.b.f11314a)) : null, g1VarP != null ? Integer.valueOf(g1VarP.Q(g2.b.f11315b)) : null));
    }
}

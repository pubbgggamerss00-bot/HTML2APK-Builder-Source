package t0;

import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class xb implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc f27409a;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27410a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27411b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27412c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f27413d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27414e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f27415f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, int i10, int i11, g2.g1 g1Var2, int i12, int i13) {
            super(1);
            this.f27410a = g1Var;
            this.f27411b = i10;
            this.f27412c = i11;
            this.f27413d = g1Var2;
            this.f27414e = i12;
            this.f27415f = i13;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            g1.a.g(aVar2, this.f27410a, this.f27411b, this.f27412c);
            g1.a.g(aVar2, this.f27413d, this.f27414e, this.f27415f);
            return pg.f0.f21461a;
        }
    }

    public xb(hc hcVar) {
        this.f27409a = hcVar;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2.k0 k0Var = list.get(i10);
            if (androidx.compose.ui.layout.a.a(k0Var) == kb.f26288a) {
                g2.g1 g1VarP = k0Var.P(j10);
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    g2.k0 k0Var2 = list.get(i11);
                    if (androidx.compose.ui.layout.a.a(k0Var2) == kb.f26289b) {
                        g2.g1 g1VarP2 = k0Var2.P(f3.b.b(f3.c.j(-g1VarP.f11382a, 0, 2, j10), 0, 0, 0, 0, 11));
                        int i12 = g1VarP.f11382a + g1VarP2.f11382a;
                        int iMax = Math.max(g1VarP2.f11383b, g1VarP.f11383b);
                        float f10 = g1VarP2.f11383b;
                        hc hcVar = this.f27409a;
                        hcVar.f26023h.e(f10);
                        hcVar.f26021f.f(i12);
                        return o0Var.i0(i12, iMax, qg.a0.f22708a, new a(g1VarP2, g1VarP.f11382a / 2, (iMax - g1VarP2.f11383b) / 2, g1VarP, gh.a.b(hcVar.c() * g1VarP2.f11382a), (iMax - g1VarP.f11383b) / 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

package t0;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.s0;

/* loaded from: classes.dex */
public final class k3 extends b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.c0 f26216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f26220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j2.z4 f26221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<m5> f26222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f26223h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f26224i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f26225j;

    public static final class a extends kotlin.jvm.internal.s implements eh.q<g2.o0, g2.k0, f3.b, g2.m0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26226a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f26227b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f26228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, x0.l1 l1Var, x0.l1 l1Var2) {
            super(3);
            this.f26226a = z10;
            this.f26227b = l1Var;
            this.f26228c = l1Var2;
        }

        @Override // eh.q
        public final g2.m0 b(g2.o0 o0Var, g2.k0 k0Var, f3.b bVar) {
            g2.o0 o0Var2 = o0Var;
            g2.k0 k0Var2 = k0Var;
            long j10 = bVar.f8811a;
            float f10 = o3.f26577a;
            int iG = f3.c.g(this.f26227b.g(), j10);
            int iF = f3.c.f(this.f26228c.g(), j10);
            boolean z10 = this.f26226a;
            int iK = z10 ? iG : f3.b.k(j10);
            if (!z10) {
                iG = f3.b.i(j10);
            }
            g2.g1 g1VarP = k0Var2.P(f3.b.b(j10, iK, iG, 0, iF, 4));
            return o0Var2.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new j3(g1VarP));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k3(o1.c0 c0Var, boolean z10, String str, String str2, String str3, j2.z4 z4Var, x0.n1<m5> n1Var, eh.l<? super Boolean, pg.f0> lVar, x0.l1 l1Var, x0.l1 l1Var2) {
        this.f26216a = c0Var;
        this.f26217b = z10;
        this.f26218c = str;
        this.f26219d = str2;
        this.f26220e = str3;
        this.f26221f = z4Var;
        this.f26222g = n1Var;
        this.f26223h = lVar;
        this.f26224i = l1Var;
        this.f26225j = l1Var2;
    }

    @Override // t0.a3
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z10) {
        return androidx.compose.ui.layout.b.a(dVar, new a(z10, this.f26224i, this.f26225j));
    }

    @Override // t0.a3
    public final String c() {
        this.f26222g.getValue().getClass();
        return "PrimaryNotEditable";
    }

    @Override // t0.a3
    public final androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z10) {
        androidx.compose.ui.d dVarA = androidx.compose.ui.focus.b.a(dVar, this.f26216a);
        androidx.compose.ui.d dVarA2 = d.a.f1143b;
        if (z10) {
            x0.n1<m5> n1Var = this.f26222g;
            eh.l<Boolean, pg.f0> lVar = this.f26223h;
            boolean z11 = this.f26217b;
            l3 l3Var = new l3(lVar, n1Var, z11);
            float f10 = o3.f26577a;
            dVarA2 = q2.q.a(dVarA2.h(new SuspendPointerInputElement(l3Var, null, new s0.a(new p3(l3Var, null)), 6)), false, new r3(z11, this.f26218c, this.f26219d, this.f26220e, l3Var, this.f26221f));
        }
        return dVarA.h(dVarA2);
    }
}

package i0;

import g2.g1;

/* loaded from: classes.dex */
public final class y1 implements g2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final f4 f13690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13691c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.o0 f13692d;

    /* renamed from: e, reason: collision with root package name */
    public final eh.a<l4> f13693e;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f13694a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1 f13695b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f13696c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f13697d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.o0 o0Var, y1 y1Var, g2.g1 g1Var, int i10) {
            super(1);
            this.f13694a = o0Var;
            this.f13695b = y1Var;
            this.f13696c = g1Var;
            this.f13697d = i10;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            y1 y1Var = this.f13695b;
            int i10 = y1Var.f13691c;
            f4 f4Var = y1Var.f13690b;
            y2.o0 o0Var = y1Var.f13692d;
            l4 l4VarInvoke = y1Var.f13693e.invoke();
            t2.h0 h0Var = l4VarInvoke != null ? l4VarInvoke.f13418a : null;
            g2.o0 o0Var2 = this.f13694a;
            boolean z10 = o0Var2.getLayoutDirection() == f3.r.f8829b;
            g2.g1 g1Var = this.f13696c;
            f4Var.a(v.t0.f30084b, e4.a(o0Var2, i10, o0Var, h0Var, z10, g1Var.f11382a), this.f13697d, g1Var.f11382a);
            g1.a.g(aVar2, g1Var, Math.round(-f4Var.f13281a.getFloatValue()), 0);
            return pg.f0.f21461a;
        }
    }

    public y1(f4 f4Var, int i10, y2.o0 o0Var, eh.a<l4> aVar) {
        this.f13690b = f4Var;
        this.f13691c = i10;
        this.f13692d = o0Var;
        this.f13693e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.r.a(this.f13690b, y1Var.f13690b) && this.f13691c == y1Var.f13691c && kotlin.jvm.internal.r.a(this.f13692d, y1Var.f13692d) && kotlin.jvm.internal.r.a(this.f13693e, y1Var.f13693e);
    }

    public final int hashCode() {
        return this.f13693e.hashCode() + ((this.f13692d.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f13691c, this.f13690b.hashCode() * 31, 31)) * 31);
    }

    @Override // g2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        long j11;
        if (k0Var.O(f3.b.h(j10)) < f3.b.i(j10)) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = f3.b.b(j11, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        g2.g1 g1VarP = k0Var.P(j10);
        int iMin = Math.min(g1VarP.f11382a, f3.b.i(j11));
        return o0Var.i0(iMin, g1VarP.f11383b, qg.a0.f22708a, new a(o0Var, this, g1VarP, iMin));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f13690b + ", cursorOffset=" + this.f13691c + ", transformedText=" + this.f13692d + ", textLayoutResultProvider=" + this.f13693e + ')';
    }
}

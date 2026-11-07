package i0;

import g2.g1;

/* loaded from: classes.dex */
public final class b5 implements g2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final f4 f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13179c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.o0 f13180d;

    /* renamed from: e, reason: collision with root package name */
    public final eh.a<l4> f13181e;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f13182a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b5 f13183b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f13184c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f13185d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.o0 o0Var, b5 b5Var, g2.g1 g1Var, int i10) {
            super(1);
            this.f13182a = o0Var;
            this.f13183b = b5Var;
            this.f13184c = g1Var;
            this.f13185d = i10;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            b5 b5Var = this.f13183b;
            int i10 = b5Var.f13179c;
            f4 f4Var = b5Var.f13178b;
            y2.o0 o0Var = b5Var.f13180d;
            l4 l4VarInvoke = b5Var.f13181e.invoke();
            t2.h0 h0Var = l4VarInvoke != null ? l4VarInvoke.f13418a : null;
            g2.g1 g1Var = this.f13184c;
            f4Var.a(v.t0.f30083a, e4.a(this.f13182a, i10, o0Var, h0Var, false, g1Var.f11382a), this.f13185d, g1Var.f11383b);
            g1.a.g(aVar2, g1Var, 0, Math.round(-f4Var.f13281a.getFloatValue()));
            return pg.f0.f21461a;
        }
    }

    public b5(f4 f4Var, int i10, y2.o0 o0Var, eh.a<l4> aVar) {
        this.f13178b = f4Var;
        this.f13179c = i10;
        this.f13180d = o0Var;
        this.f13181e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return kotlin.jvm.internal.r.a(this.f13178b, b5Var.f13178b) && this.f13179c == b5Var.f13179c && kotlin.jvm.internal.r.a(this.f13180d, b5Var.f13180d) && kotlin.jvm.internal.r.a(this.f13181e, b5Var.f13181e);
    }

    public final int hashCode() {
        return this.f13181e.hashCode() + ((this.f13180d.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f13179c, this.f13178b.hashCode() * 31, 31)) * 31);
    }

    @Override // g2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(f3.b.b(j10, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(g1VarP.f11383b, f3.b.h(j10));
        return o0Var.i0(g1VarP.f11382a, iMin, qg.a0.f22708a, new a(o0Var, this, g1VarP, iMin));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f13178b + ", cursorOffset=" + this.f13179c + ", transformedText=" + this.f13180d + ", textLayoutResultProvider=" + this.f13181e + ')';
    }
}

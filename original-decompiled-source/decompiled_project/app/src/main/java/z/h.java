package z;

import g2.g1;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final j1.d f34523a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34524b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34525a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34526a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.k0 f34527b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f34528c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f34529d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f34530e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f34531f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g2.g1 g1Var, g2.k0 k0Var, g2.o0 o0Var, int i10, int i11, h hVar) {
            super(1);
            this.f34526a = g1Var;
            this.f34527b = k0Var;
            this.f34528c = o0Var;
            this.f34529d = i10;
            this.f34530e = i11;
            this.f34531f = hVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g.b(aVar, this.f34526a, this.f34527b, this.f34528c.getLayoutDirection(), this.f34529d, this.f34530e, this.f34531f.f34523a);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1[] f34532a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<g2.k0> f34533b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f34534c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.e0 f34535d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.e0 f34536e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f34537f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(g2.g1[] g1VarArr, List<? extends g2.k0> list, g2.o0 o0Var, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, h hVar) {
            super(1);
            this.f34532a = g1VarArr;
            this.f34533b = list;
            this.f34534c = o0Var;
            this.f34535d = e0Var;
            this.f34536e = e0Var2;
            this.f34537f = hVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            g2.g1[] g1VarArr = this.f34532a;
            int length = g1VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i10;
                g2.g1 g1Var = g1VarArr[i11];
                kotlin.jvm.internal.r.c(g1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                g.b(aVar2, g1Var, this.f34533b.get(i12), this.f34534c.getLayoutDirection(), this.f34535d.f16324a, this.f34536e.f16324a, this.f34537f.f34523a);
                i11++;
                i10 = i12 + 1;
            }
            return pg.f0.f21461a;
        }
    }

    public h(j1.d dVar, boolean z10) {
        this.f34523a = dVar;
        this.f34524b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.r.a(this.f34523a, hVar.f34523a) && this.f34524b == hVar.f34524b;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        int iK;
        int iJ;
        g2.g1 g1VarP;
        boolean zIsEmpty = list.isEmpty();
        qg.a0 a0Var = qg.a0.f22708a;
        if (zIsEmpty) {
            return o0Var.i0(f3.b.k(j10), f3.b.j(j10), a0Var, a.f34525a);
        }
        long j11 = this.f34524b ? j10 : j10 & (-8589934589L);
        if (list.size() == 1) {
            g2.k0 k0Var = list.get(0);
            p.l0<j1.d, g2.l0> l0Var = g.f34506a;
            Object objW = k0Var.w();
            f fVar = objW instanceof f ? (f) objW : null;
            if (fVar != null ? fVar.f34504r : false) {
                iK = f3.b.k(j10);
                iJ = f3.b.j(j10);
                int iK2 = f3.b.k(j10);
                int iJ2 = f3.b.j(j10);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    f3.l.a("width and height must be >= 0");
                }
                g1VarP = k0Var.P(f3.c.h(iK2, iK2, iJ2, iJ2));
            } else {
                g1VarP = k0Var.P(j11);
                iK = Math.max(f3.b.k(j10), g1VarP.f11382a);
                iJ = Math.max(f3.b.j(j10), g1VarP.f11383b);
            }
            int i10 = iJ;
            int i11 = iK;
            return o0Var.i0(i11, i10, a0Var, new b(g1VarP, k0Var, o0Var, i11, i10, this));
        }
        g2.g1[] g1VarArr = new g2.g1[list.size()];
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f16324a = f3.b.k(j10);
        kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        e0Var2.f16324a = f3.b.j(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            g2.k0 k0Var2 = list.get(i12);
            p.l0<j1.d, g2.l0> l0Var2 = g.f34506a;
            Object objW2 = k0Var2.w();
            f fVar2 = objW2 instanceof f ? (f) objW2 : null;
            if (fVar2 != null ? fVar2.f34504r : false) {
                z10 = true;
            } else {
                g2.g1 g1VarP2 = k0Var2.P(j11);
                g1VarArr[i12] = g1VarP2;
                e0Var.f16324a = Math.max(e0Var.f16324a, g1VarP2.f11382a);
                e0Var2.f16324a = Math.max(e0Var2.f16324a, g1VarP2.f11383b);
            }
        }
        if (z10) {
            int i13 = e0Var.f16324a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = e0Var2.f16324a;
            long jA = f3.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                g2.k0 k0Var3 = list.get(i16);
                p.l0<j1.d, g2.l0> l0Var3 = g.f34506a;
                Object objW3 = k0Var3.w();
                f fVar3 = objW3 instanceof f ? (f) objW3 : null;
                if (fVar3 != null ? fVar3.f34504r : false) {
                    g1VarArr[i16] = k0Var3.P(jA);
                }
            }
        }
        return o0Var.i0(e0Var.f16324a, e0Var2.f16324a, a0Var, new c(g1VarArr, list, o0Var, e0Var, e0Var2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34524b) + (this.f34523a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f34523a + ", propagateMinConstraints=" + this.f34524b + ')';
    }
}

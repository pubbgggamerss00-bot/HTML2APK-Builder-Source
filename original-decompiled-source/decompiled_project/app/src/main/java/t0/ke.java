package t0;

/* loaded from: classes.dex */
public final class ke {

    /* renamed from: a, reason: collision with root package name */
    public static final ke f26292a = new ke();

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f26294b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f26295c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f26296d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f26297e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f26298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.d dVar, float f10, long j10, int i10, int i11) {
            super(2);
            this.f26294b = dVar;
            this.f26295c = f10;
            this.f26296d = j10;
            this.f26297e = i10;
            this.f26298f = i11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            ke.this.b(this.f26294b, this.f26295c, this.f26296d, jVar, f3.i.n(this.f26297e | 1), this.f26298f);
            return pg.f0.f21461a;
        }
    }

    public final void a(float f10, float f11, int i10, long j10, androidx.compose.ui.d dVar, q1.f2 f2Var, x0.j jVar) {
        q1.f2 f2Var2;
        q1.f2 f2Var3;
        x0.k kVarP = jVar.p(-1895596205);
        if ((((kVarP.K(dVar) ? 4 : 2) | i10 | 25984) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            f2Var3 = f2Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                f11 = v0.z.f30526a;
                j10 = f2.e(v0.d.f30248m, kVarP);
                f2Var2 = v0.z.f30527b;
            } else {
                kVarP.v();
                f2Var2 = f2Var;
            }
            kVarP.U();
            p1.d.b(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.m(androidx.compose.foundation.layout.g.i(dVar, f11), f10), j10, f2Var2), kVarP);
            f2Var3 = f2Var2;
        }
        float f12 = f11;
        long j11 = j10;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new je(this, dVar, f10, f12, j11, f2Var3, i10);
        }
    }

    public final void b(androidx.compose.ui.d dVar, float f10, long j10, x0.j jVar, int i10, int i11) {
        float f11;
        long jE;
        float f12;
        long j11;
        x0.k kVarP = jVar.p(-1498258020);
        int i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= kVarP.h(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= ((i11 & 4) == 0 && kVarP.j(j10)) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            f12 = f10;
            j11 = j10;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                f11 = i13 != 0 ? v0.z.f30526a : f10;
                if ((i11 & 4) != 0) {
                    float f13 = v0.z.f30526a;
                    jE = f2.e(v0.d.f30248m, kVarP);
                }
                kVarP.U();
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(dVar, 1.0f), f11), jE, q1.y1.f21750a), kVarP, 0);
                f12 = f11;
                j11 = jE;
            } else {
                kVarP.v();
                f11 = f10;
            }
            jE = j10;
            kVarP.U();
            z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(dVar, 1.0f), f11), jE, q1.y1.f21750a), kVarP, 0);
            f12 = f11;
            j11 = jE;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(dVar, f12, j11, i10, i11);
        }
    }
}

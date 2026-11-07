package t;

/* loaded from: classes.dex */
public final class v1 extends i2.m implements i2.h, i2.o1 {
    public i1 A;
    public androidx.compose.foundation.gestures.j B;
    public i2.j C;
    public j1 D;
    public i1 E;
    public boolean F;

    /* renamed from: s, reason: collision with root package name */
    public v.l1 f25391s;

    /* renamed from: t, reason: collision with root package name */
    public v.t0 f25392t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25393v;

    /* renamed from: w, reason: collision with root package name */
    public v.z f25394w;

    /* renamed from: x, reason: collision with root package name */
    public x.m f25395x;

    /* renamed from: y, reason: collision with root package name */
    public v.d f25396y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25397z;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            x0.d0 d0Var = k1.f25287a;
            v1 v1Var = v1.this;
            j1 j1Var = (j1) i2.i.a(v1Var, d0Var);
            v1Var.D = j1Var;
            v1Var.E = j1Var != null ? j1Var.a() : null;
            return pg.f0.f21461a;
        }
    }

    @Override // i2.j
    public final void B0() {
        boolean zX1 = X1();
        if (this.F != zX1) {
            this.F = zX1;
            v.l1 l1Var = this.f25391s;
            v.t0 t0Var = this.f25392t;
            boolean z10 = this.f25397z;
            i1 i1Var = z10 ? this.E : this.A;
            Y1(i1Var, this.f25396y, this.f25394w, t0Var, l1Var, this.f25395x, z10, this.f25393v);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        this.F = X1();
        W1();
        if (this.B == null) {
            v.l1 l1Var = this.f25391s;
            i1 i1Var = this.f25397z ? this.E : this.A;
            androidx.compose.foundation.gestures.j jVar = new androidx.compose.foundation.gestures.j(i1Var, this.f25396y, this.f25394w, this.f25392t, l1Var, this.f25395x, this.f25393v, this.F);
            T1(jVar);
            this.B = jVar;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        i2.j jVar = this.C;
        if (jVar != null) {
            U1(jVar);
        }
    }

    @Override // i2.o1
    public final void V0() {
        j1 j1Var = (j1) i2.i.a(this, k1.f25287a);
        if (kotlin.jvm.internal.r.a(j1Var, this.D)) {
            return;
        }
        this.D = j1Var;
        this.E = null;
        i2.j jVar = this.C;
        if (jVar != null) {
            U1(jVar);
        }
        this.C = null;
        W1();
        androidx.compose.foundation.gestures.j jVar2 = this.B;
        if (jVar2 != null) {
            v.l1 l1Var = this.f25391s;
            v.t0 t0Var = this.f25392t;
            i1 i1Var = this.f25397z ? this.E : this.A;
            jVar2.f2(i1Var, this.f25396y, this.f25394w, t0Var, l1Var, this.f25395x, this.f25393v, this.F);
        }
    }

    public final void W1() {
        i2.j jVar = this.C;
        if (jVar != null) {
            if (jVar.B().f1157p) {
                return;
            }
            T1(jVar);
            return;
        }
        if (this.f25397z) {
            i2.p1.a(this, new a());
        }
        i1 i1Var = this.f25397z ? this.E : this.A;
        if (i1Var != null) {
            i2.j jVarB = i1Var.B();
            if (jVarB.B().f1157p) {
                return;
            }
            T1(jVarB);
            this.C = jVarB;
        }
    }

    public final boolean X1() {
        f3.r rVar = f3.r.f8828a;
        if (this.f1157p) {
            rVar = i2.k.f(this).C;
        }
        return rVar != f3.r.f8829b || this.f25392t == v.t0.f30083a;
    }

    public final void Y1(i1 i1Var, v.d dVar, v.z zVar, v.t0 t0Var, v.l1 l1Var, x.m mVar, boolean z10, boolean z11) {
        boolean z12;
        this.f25391s = l1Var;
        this.f25392t = t0Var;
        boolean z13 = true;
        if (this.f25397z != z10) {
            this.f25397z = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (kotlin.jvm.internal.r.a(this.A, i1Var)) {
            z13 = false;
        } else {
            this.A = i1Var;
        }
        if (z12 || (z13 && !z10)) {
            i2.j jVar = this.C;
            if (jVar != null) {
                U1(jVar);
            }
            this.C = null;
            W1();
        }
        this.f25393v = z11;
        this.f25394w = zVar;
        this.f25395x = mVar;
        this.f25396y = dVar;
        boolean zX1 = X1();
        this.F = zX1;
        androidx.compose.foundation.gestures.j jVar2 = this.B;
        if (jVar2 != null) {
            jVar2.f2(this.f25397z ? this.E : this.A, dVar, zVar, t0Var, l1Var, mVar, z11, zX1);
        }
    }
}

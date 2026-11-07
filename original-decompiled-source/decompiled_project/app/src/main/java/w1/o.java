package w1;

import f3.r;
import kotlin.jvm.internal.s;
import pg.f0;
import q1.c1;
import s1.a;
import x0.v1;
import x0.x1;

/* loaded from: classes.dex */
public final class o extends v1.c {

    /* renamed from: f, reason: collision with root package name */
    public final x1 f31211f;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f31212g;

    /* renamed from: h, reason: collision with root package name */
    public final k f31213h;

    /* renamed from: j, reason: collision with root package name */
    public final v1 f31214j;

    /* renamed from: k, reason: collision with root package name */
    public float f31215k;

    /* renamed from: l, reason: collision with root package name */
    public c1 f31216l;

    /* renamed from: m, reason: collision with root package name */
    public int f31217m;

    public static final class a extends s implements eh.a<f0> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final f0 invoke() {
            o oVar = o.this;
            int i10 = oVar.f31217m;
            v1 v1Var = oVar.f31214j;
            if (i10 == v1Var.g()) {
                v1Var.f(v1Var.g() + 1);
            }
            return f0.f21461a;
        }
    }

    public o() {
        this(new c());
    }

    @Override // v1.c
    public final boolean a(float f10) {
        this.f31215k = f10;
        return true;
    }

    @Override // v1.c
    public final boolean e(c1 c1Var) {
        this.f31216l = c1Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.c
    public final long h() {
        return ((p1.h) this.f31211f.getValue()).f21143a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.c
    public final void i(s1.e eVar) {
        c1 c1Var = this.f31216l;
        k kVar = this.f31213h;
        if (c1Var == null) {
            c1Var = (c1) kVar.f31189g.getValue();
        }
        if (((Boolean) this.f31212g.getValue()).booleanValue() && eVar.getLayoutDirection() == r.f8829b) {
            long jH1 = eVar.h1();
            a.b bVarQ0 = eVar.Q0();
            long jD = bVarQ0.d();
            bVarQ0.a().d();
            try {
                bVarQ0.f24180a.e(-1.0f, 1.0f, jH1);
                kVar.e(eVar, this.f31215k, c1Var);
            } finally {
                t.r.a(bVarQ0, jD);
            }
        } else {
            kVar.e(eVar, this.f31215k, c1Var);
        }
        this.f31217m = this.f31214j.g();
    }

    public o(c cVar) {
        this.f31211f = bg.b.h(new p1.h(0L));
        this.f31212g = bg.b.h(Boolean.FALSE);
        k kVar = new k(cVar);
        kVar.f31188f = new a();
        this.f31213h = kVar;
        this.f31214j = new v1(0);
        this.f31215k = 1.0f;
        this.f31217m = -1;
    }
}

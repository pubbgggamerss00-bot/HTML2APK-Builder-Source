package f9;

import p5.o0;

/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9323d;

    public /* synthetic */ d9(Object obj, Object obj2, Object obj3, int i10) {
        this.f9320a = i10;
        this.f9321b = obj;
        this.f9322c = obj2;
        this.f9323d = obj3;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9320a) {
            case 0:
                eh.l lVar = (eh.l) this.f9321b;
                String str = (String) this.f9322c;
                x0.n1 n1Var = (x0.n1) this.f9323d;
                lVar.invoke(str);
                n1Var.setValue(Boolean.FALSE);
                break;
            default:
                p5.k0 k0Var = (p5.k0) this.f9321b;
                s8.e2 e2Var = (s8.e2) this.f9322c;
                final p5.s0 s0Var = (p5.s0) this.f9323d;
                if (!kotlin.jvm.internal.r.a(k0Var != null ? k0Var.f21235b.f24512e : null, e2Var.f24627a)) {
                    s0Var.b(new eh.l() { // from class: s8.c
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            p5.w0 navigate = (p5.w0) obj;
                            kotlin.jvm.internal.r.e(navigate, "$this$navigate");
                            int i10 = p5.o0.f21252g;
                            navigate.f21299d = o0.a.a(s0Var.f21304b.i()).f21235b.f24511d;
                            navigate.f21301f = false;
                            p5.e1 e1Var = new p5.e1();
                            e1Var.f21208b = true;
                            pg.f0 f0Var = pg.f0.f21461a;
                            navigate.f21301f = e1Var.f21207a;
                            navigate.f21302g = e1Var.f21208b;
                            navigate.f21297b = true;
                            navigate.f21298c = true;
                            return pg.f0.f21461a;
                        }
                    }, e2Var.f24627a);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}

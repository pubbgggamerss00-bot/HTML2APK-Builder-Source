package i0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* loaded from: classes.dex */
public final class f4 {

    /* renamed from: g, reason: collision with root package name */
    public static final g1.n f13280g = c2.y.e(a.f13287a, b.f13288a);

    /* renamed from: a, reason: collision with root package name */
    public final x0.u1 f13281a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.u1 f13282b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.v1 f13283c;

    /* renamed from: d, reason: collision with root package name */
    public p1.e f13284d;

    /* renamed from: e, reason: collision with root package name */
    public long f13285e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.x1 f13286f;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, f4, List<? extends Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13287a = new a(2);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final List<? extends Object> invoke(g1.o oVar, f4 f4Var) {
            f4 f4Var2 = f4Var;
            return qg.p.j(Float.valueOf(f4Var2.f13281a.getFloatValue()), Boolean.valueOf(((v.t0) f4Var2.f13286f.getValue()) == v.t0.f30083a));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<List<? extends Object>, f4> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13288a = new b(1);

        @Override // eh.l
        public final f4 invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            Object obj = list2.get(1);
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            v.t0 t0Var = ((Boolean) obj).booleanValue() ? v.t0.f30083a : v.t0.f30084b;
            Object obj2 = list2.get(0);
            kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new f4(t0Var, ((Float) obj2).floatValue());
        }
    }

    public f4(v.t0 t0Var, float f10) {
        this.f13281a = new x0.u1(f10);
        this.f13282b = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f13283c = new x0.v1(0);
        this.f13284d = p1.e.f21130e;
        this.f13285e = t2.j0.f27837b;
        this.f13286f = new x0.x1(t0Var, x0.u3.f31923a);
    }

    public final void a(v.t0 t0Var, p1.e eVar, int i10, int i11) {
        float f10 = i11 - i10;
        this.f13282b.e(f10);
        float f11 = eVar.f21131a;
        float f12 = eVar.f21132b;
        p1.e eVar2 = this.f13284d;
        float f13 = eVar2.f21131a;
        x0.u1 u1Var = this.f13281a;
        if (f11 != f13 || f12 != eVar2.f21132b) {
            boolean z10 = t0Var == v.t0.f30083a;
            if (z10) {
                f11 = f12;
            }
            float f14 = z10 ? eVar.f21134d : eVar.f21133c;
            float floatValue = u1Var.getFloatValue();
            float f15 = i10;
            float f16 = floatValue + f15;
            u1Var.e(u1Var.getFloatValue() + ((f14 <= f16 && (f11 >= floatValue || f14 - f11 <= f15)) ? (f11 >= floatValue || f14 - f11 > f15) ? 0.0f : f11 - floatValue : f14 - f16));
            this.f13284d = eVar;
        }
        u1Var.e(jh.j.l(u1Var.getFloatValue(), CropImageView.DEFAULT_ASPECT_RATIO, f10));
        this.f13283c.f(i10);
    }

    public /* synthetic */ f4(v.t0 t0Var) {
        this(t0Var, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public f4() {
        this(v.t0.f30083a);
    }
}

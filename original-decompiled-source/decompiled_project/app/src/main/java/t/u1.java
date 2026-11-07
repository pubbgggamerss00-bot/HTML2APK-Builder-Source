package t;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class u1 implements v.l1 {

    /* renamed from: i, reason: collision with root package name */
    public static final g1.n f25375i;

    /* renamed from: a, reason: collision with root package name */
    public final x0.v1 f25376a;

    /* renamed from: e, reason: collision with root package name */
    public float f25380e;

    /* renamed from: b, reason: collision with root package name */
    public final x0.v1 f25377b = new x0.v1(0);

    /* renamed from: c, reason: collision with root package name */
    public final x.n f25378c = new x.n();

    /* renamed from: d, reason: collision with root package name */
    public final x0.v1 f25379d = new x0.v1(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final v.j f25381f = new v.j(new e());

    /* renamed from: g, reason: collision with root package name */
    public final x0.g0 f25382g = bg.b.d(new d());

    /* renamed from: h, reason: collision with root package name */
    public final x0.g0 f25383h = bg.b.d(new c());

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, u1, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25384a = new a(2);

        @Override // eh.p
        public final Integer invoke(g1.o oVar, u1 u1Var) {
            return Integer.valueOf(u1Var.f25376a.g());
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Integer, u1> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25385a = new b(1);

        @Override // eh.l
        public final u1 invoke(Integer num) {
            return new u1(num.intValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            return Boolean.valueOf(u1.this.f25376a.g() > 0);
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            u1 u1Var = u1.this;
            return Boolean.valueOf(u1Var.f25376a.g() < u1Var.f25379d.g());
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<Float, Float> {
        public e() {
            super(1);
        }

        @Override // eh.l
        public final Float invoke(Float f10) {
            float fFloatValue = f10.floatValue();
            u1 u1Var = u1.this;
            x0.v1 v1Var = u1Var.f25376a;
            float fG = v1Var.g() + fFloatValue + u1Var.f25380e;
            float fL = jh.j.l(fG, CropImageView.DEFAULT_ASPECT_RATIO, u1Var.f25379d.g());
            boolean z10 = fG == fL;
            float fG2 = fL - v1Var.g();
            int iRound = Math.round(fG2);
            v1Var.f(v1Var.g() + iRound);
            u1Var.f25380e = fG2 - iRound;
            if (!z10) {
                fFloatValue = fG2;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    static {
        g1.n nVar = g1.m.f11307a;
        f25375i = new g1.n(a.f25384a, b.f25385a);
    }

    public u1(int i10) {
        this.f25376a = new x0.v1(i10);
    }

    @Override // v.l1
    public final boolean a() {
        return this.f25381f.a();
    }

    @Override // v.l1
    public final boolean b() {
        return ((Boolean) this.f25383h.getValue()).booleanValue();
    }

    @Override // v.l1
    public final Object c(b1 b1Var, eh.p pVar, vg.c cVar) {
        Object objC = this.f25381f.c(b1Var, pVar, cVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }

    @Override // v.l1
    public final boolean d() {
        return ((Boolean) this.f25382g.getValue()).booleanValue();
    }

    @Override // v.l1
    public final float e(float f10) {
        return this.f25381f.e(f10);
    }
}

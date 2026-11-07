package v;

import com.yalantis.ucrop.view.CropImageView;
import v.f0;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j0 extends vg.i implements eh.p<s0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f29936a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f29937b;

    /* renamed from: c, reason: collision with root package name */
    public int f29938c;

    /* renamed from: d, reason: collision with root package name */
    public int f29939d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f29941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<s.n<Float, s.o>> f29942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<f0.a> f29943h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f29944j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f29945k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f29946l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s1 f29947m;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Float, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f29948a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<f0.a> f29949b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.d0 f29950c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s1 f29951d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.b0 f29952e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0 f0Var, kotlin.jvm.internal.g0<f0.a> g0Var, kotlin.jvm.internal.d0 d0Var, s1 s1Var, kotlin.jvm.internal.b0 b0Var) {
            super(1);
            this.f29948a = f0Var;
            this.f29949b = g0Var;
            this.f29950c = d0Var;
            this.f29951d = s1Var;
            this.f29952e = b0Var;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, v.f0$a] */
        @Override // eh.l
        public final Boolean invoke(Float f10) {
            float fFloatValue = f10.floatValue();
            f0 f0Var = this.f29948a;
            f0.a aVarD = f0.d(f0Var.f29859e);
            if (aVarD != null) {
                f0Var.e(aVarD);
                kotlin.jvm.internal.g0<f0.a> g0Var = this.f29949b;
                ?? A = g0Var.f16327a.a(aVarD);
                g0Var.f16327a = A;
                long j10 = A.f29863a;
                s1 s1Var = this.f29951d;
                this.f29950c.f16322a = s1Var.g(s1Var.e(j10));
                this.f29952e.f16318a = !e0.a(r0 - fFloatValue);
            }
            return Boolean.valueOf(aVarD != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlin.jvm.internal.d0 d0Var, kotlin.jvm.internal.g0<s.n<Float, s.o>> g0Var, kotlin.jvm.internal.g0<f0.a> g0Var2, float f10, f0 f0Var, float f11, s1 s1Var, tg.e<? super j0> eVar) {
        super(2, eVar);
        this.f29941f = d0Var;
        this.f29942g = g0Var;
        this.f29943h = g0Var2;
        this.f29944j = f10;
        this.f29945k = f0Var;
        this.f29946l = f11;
        this.f29947m = s1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        j0 j0Var = new j0(this.f29941f, this.f29942g, this.f29943h, this.f29944j, this.f29945k, this.f29946l, this.f29947m, eVar);
        j0Var.f29940e = obj;
        return j0Var;
    }

    @Override // eh.p
    public final Object invoke(s0 s0Var, tg.e<? super pg.f0> eVar) {
        return ((j0) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, s.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015f -> B:37:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x016c -> B:38:0x0169). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s0 s0Var;
        kotlin.jvm.internal.b0 b0Var;
        kotlin.jvm.internal.d0 d0Var;
        kotlin.jvm.internal.g0<f0.a> g0Var;
        kotlin.jvm.internal.b0 b0Var2;
        int i10;
        kotlin.jvm.internal.g0<s.n<Float, s.o>> g0Var2;
        Object objC;
        j0 j0Var = this;
        ug.a aVar = ug.a.f29706a;
        int i11 = j0Var.f29939d;
        kotlin.jvm.internal.g0<f0.a> g0Var3 = j0Var.f29943h;
        kotlin.jvm.internal.d0 d0Var2 = j0Var.f29941f;
        kotlin.jvm.internal.g0<s.n<Float, s.o>> g0Var4 = j0Var.f29942g;
        if (i11 == 0) {
            pg.q.b(obj);
            s0 s0Var2 = (s0) j0Var.f29940e;
            kotlin.jvm.internal.b0 b0Var3 = new kotlin.jvm.internal.b0();
            b0Var3.f16318a = true;
            s0Var = s0Var2;
            b0Var = b0Var3;
        } else if (i11 == 1) {
            kotlin.jvm.internal.b0 b0Var4 = j0Var.f29937b;
            kotlin.jvm.internal.b0 b0Var5 = j0Var.f29936a;
            s0 s0Var3 = (s0) j0Var.f29940e;
            pg.q.b(obj);
            b0Var = b0Var5;
            s0Var = s0Var3;
            b0Var4.f16318a = ((Boolean) obj).booleanValue();
            j0Var = this;
            g0Var4 = g0Var4;
        } else if (i11 == 2) {
            i10 = j0Var.f29938c;
            kotlin.jvm.internal.b0 b0Var6 = j0Var.f29936a;
            s0 s0Var4 = (s0) j0Var.f29940e;
            pg.q.b(obj);
            g0Var = g0Var3;
            d0Var = d0Var2;
            b0Var2 = b0Var6;
            s0Var = s0Var4;
            if (b0Var2.f16318a) {
                j0Var.f29940e = s0Var;
                j0Var.f29936a = b0Var2;
                j0Var.f29937b = b0Var2;
                j0Var.f29939d = 3;
                g0Var2 = g0Var4;
                g0Var3 = g0Var;
                d0Var2 = d0Var;
                objC = f0.c(j0Var.f29945k, g0Var3, d0Var2, j0Var.f29947m, g0Var2, 50 - i10, j0Var);
                if (objC != aVar) {
                    b0Var = b0Var2;
                    b0Var2.f16318a = ((Boolean) objC).booleanValue();
                    g0Var4 = g0Var2;
                }
                return aVar;
            }
            b0Var = b0Var2;
            g0Var3 = g0Var;
            d0Var2 = d0Var;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.b0 b0Var7 = j0Var.f29937b;
            kotlin.jvm.internal.b0 b0Var8 = j0Var.f29936a;
            s0 s0Var5 = (s0) j0Var.f29940e;
            pg.q.b(obj);
            b0Var2 = b0Var7;
            b0Var = b0Var8;
            s0Var = s0Var5;
            g0Var2 = g0Var4;
            objC = obj;
            b0Var2.f16318a = ((Boolean) objC).booleanValue();
            g0Var4 = g0Var2;
        }
        while (b0Var.f16318a) {
            b0Var.f16318a = false;
            float fFloatValue = d0Var2.f16322a - ((Number) g0Var4.f16327a.f23843b.getValue()).floatValue();
            boolean z10 = g0Var3.f16327a.f29865c;
            f0 f0Var = j0Var.f29945k;
            if (!z10) {
                float fAbs = Math.abs(fFloatValue);
                float f10 = j0Var.f29944j;
                if (fAbs < f10) {
                    kotlin.jvm.internal.g0<s.n<Float, s.o>> g0Var5 = g0Var4;
                    f0.a(f0Var, s0Var, fFloatValue);
                    j0Var.f29940e = s0Var;
                    j0Var.f29936a = b0Var;
                    j0Var.f29937b = b0Var;
                    j0Var.f29939d = 1;
                    kotlin.jvm.internal.b0 b0Var9 = b0Var;
                    Object objC2 = f0.c(j0Var.f29945k, g0Var3, d0Var2, j0Var.f29947m, g0Var5, 50L, j0Var);
                    if (objC2 != aVar) {
                        b0Var = b0Var9;
                        b0Var9.f16318a = ((Boolean) objC2).booleanValue();
                        j0Var = this;
                        g0Var4 = g0Var5;
                    }
                } else {
                    float fSignum = Math.signum(fFloatValue) * f10;
                    f0.a(f0Var, s0Var, fSignum);
                    s.n<Float, s.o> nVar = g0Var4.f16327a;
                    ?? C = o1.j.c(nVar, ((Number) nVar.f23843b.getValue()).floatValue() + fSignum, CropImageView.DEFAULT_ASPECT_RATIO, 30);
                    g0Var4.f16327a = C;
                    int iB = gh.a.b(Math.abs(d0Var2.f16322a - ((Number) C.f23843b.getValue()).floatValue()) / j0Var.f29946l);
                    int i12 = iB > 100 ? 100 : iB;
                    s.n<Float, s.o> nVar2 = g0Var4.f16327a;
                    float f11 = d0Var2.f16322a;
                    kotlin.jvm.internal.g0<f0.a> g0Var6 = g0Var3;
                    s1 s1Var = j0Var.f29947m;
                    kotlin.jvm.internal.d0 d0Var3 = d0Var2;
                    f0 f0Var2 = j0Var.f29945k;
                    a aVar2 = new a(f0Var2, g0Var6, d0Var3, s1Var, b0Var);
                    g0Var = g0Var6;
                    d0Var = d0Var3;
                    j0Var.f29940e = s0Var;
                    j0Var.f29936a = b0Var;
                    j0Var.f29937b = null;
                    j0Var.f29938c = i12;
                    j0Var.f29939d = 2;
                    f0Var2.getClass();
                    kotlin.jvm.internal.d0 d0Var4 = new kotlin.jvm.internal.d0();
                    d0Var4.f16322a = ((Number) nVar2.f23843b.getValue()).floatValue();
                    Object objE = s.w1.e(nVar2, new Float(f11), s.m.d(i12, 0, s.d0.f23706d, 2), true, new g0(d0Var4, f0Var2, s0Var, aVar2), j0Var);
                    if (objE != ug.a.f29706a) {
                        objE = pg.f0.f21461a;
                    }
                    if (objE != aVar) {
                        b0Var2 = b0Var;
                        i10 = i12;
                        if (b0Var2.f16318a) {
                        }
                    }
                }
            }
            return aVar;
        }
        return pg.f0.f21461a;
    }
}

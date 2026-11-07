package s;

import com.yalantis.ucrop.view.CropImageView;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<a<?, ?>> f23803a = new z0.b<>(new a[16]);

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f23804b = bg.b.h(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f23805c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f23806d = bg.b.h(Boolean.TRUE);

    public final class a<T, V extends s> implements r3<T> {

        /* renamed from: a, reason: collision with root package name */
        public Number f23807a;

        /* renamed from: b, reason: collision with root package name */
        public Number f23808b;

        /* renamed from: c, reason: collision with root package name */
        public final o2 f23809c;

        /* renamed from: d, reason: collision with root package name */
        public final x0.x1 f23810d;

        /* renamed from: e, reason: collision with root package name */
        public l<T> f23811e;

        /* renamed from: f, reason: collision with root package name */
        public x1<T, V> f23812f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f23813g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f23814h;

        /* renamed from: j, reason: collision with root package name */
        public long f23815j;

        public a(Number number, Number number2, o2 o2Var, k0 k0Var) {
            this.f23807a = number;
            this.f23808b = number2;
            this.f23809c = o2Var;
            this.f23810d = bg.b.h(number);
            this.f23811e = k0Var;
            this.f23812f = new x1<>(k0Var, o2Var, this.f23807a, this.f23808b, null);
        }

        @Override // x0.r3
        public final T getValue() {
            return this.f23810d.getValue();
        }
    }

    @vg.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public kotlin.jvm.internal.d0 f23817a;

        /* renamed from: b, reason: collision with root package name */
        public int f23818b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f23819c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<r3<Long>> f23820d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l0 f23821e;

        public static final class a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0.n1<r3<Long>> f23822a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f23823b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.d0 f23824c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ph.i0 f23825d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x0.n1<r3<Long>> n1Var, l0 l0Var, kotlin.jvm.internal.d0 d0Var, ph.i0 i0Var) {
                super(1);
                this.f23822a = n1Var;
                this.f23823b = l0Var;
                this.f23824c = d0Var;
                this.f23825d = i0Var;
            }

            @Override // eh.l
            public final pg.f0 invoke(Long l10) {
                long jLongValue = l10.longValue();
                r3<Long> value = this.f23822a.getValue();
                long jLongValue2 = value != null ? value.getValue().longValue() : jLongValue;
                l0 l0Var = this.f23823b;
                long j10 = l0Var.f23805c;
                z0.b<a<?, ?>> bVar = l0Var.f23803a;
                ph.i0 i0Var = this.f23825d;
                kotlin.jvm.internal.d0 d0Var = this.f23824c;
                if (j10 == Long.MIN_VALUE || d0Var.f16322a != w1.h(i0Var.getCoroutineContext())) {
                    l0Var.f23805c = jLongValue;
                    a<?, ?>[] aVarArr = bVar.f34700a;
                    int i10 = bVar.f34702c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        aVarArr[i11].f23814h = true;
                    }
                    d0Var.f16322a = w1.h(i0Var.getCoroutineContext());
                }
                float f10 = d0Var.f16322a;
                if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    a<?, ?>[] aVarArr2 = bVar.f34700a;
                    int i12 = bVar.f34702c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        a<?, ?> aVar = aVarArr2[i13];
                        aVar.f23810d.setValue(aVar.f23812f.f23987c);
                        aVar.f23814h = true;
                    }
                } else {
                    long j11 = (long) ((jLongValue2 - l0Var.f23805c) / f10);
                    a<?, ?>[] aVarArr3 = bVar.f34700a;
                    int i14 = bVar.f34702c;
                    boolean z10 = true;
                    for (int i15 = 0; i15 < i14; i15++) {
                        a<?, ?> aVar2 = aVarArr3[i15];
                        if (!aVar2.f23813g) {
                            l0.this.f23804b.setValue(Boolean.FALSE);
                            if (aVar2.f23814h) {
                                aVar2.f23814h = false;
                                aVar2.f23815j = j11;
                            }
                            long j12 = j11 - aVar2.f23815j;
                            aVar2.f23810d.setValue(aVar2.f23812f.f(j12));
                            aVar2.f23813g = aVar2.f23812f.e(j12);
                        }
                        if (!aVar2.f23813g) {
                            z10 = false;
                        }
                    }
                    l0Var.f23806d.setValue(Boolean.valueOf(!z10));
                }
                return pg.f0.f21461a;
            }
        }

        /* renamed from: s.l0$b$b, reason: collision with other inner class name */
        public static final class C0267b extends kotlin.jvm.internal.s implements eh.a<Float> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ph.i0 f23826a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0267b(ph.i0 i0Var) {
                super(0);
                this.f23826a = i0Var;
            }

            @Override // eh.a
            public final Float invoke() {
                return Float.valueOf(w1.h(this.f23826a.getCoroutineContext()));
            }
        }

        @vg.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        public static final class c extends vg.i implements eh.p<Float, tg.e<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ float f23827a;

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                c cVar = new c(2, eVar);
                cVar.f23827a = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // eh.p
            public final Object invoke(Float f10, tg.e<? super Boolean> eVar) {
                return ((c) create(Float.valueOf(f10.floatValue()), eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                return Boolean.valueOf(this.f23827a > CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0.n1<r3<Long>> n1Var, l0 l0Var, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f23820d = n1Var;
            this.f23821e = l0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f23820d, this.f23821e, eVar);
            bVar.f23819c = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        /* JADX WARN: Path cross not found for [B:11:0x003a, B:16:0x0057], limit reached: 18 */
        /* JADX WARN: Path cross not found for [B:16:0x0057, B:11:0x003a], limit reached: 18 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[PHI: r1 r8
          0x0050: PHI (r1v2 kotlin.jvm.internal.d0) = (r1v3 kotlin.jvm.internal.d0), (r1v4 kotlin.jvm.internal.d0) binds: [B:12:0x004d, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r8v3 ph.i0) = (r8v4 ph.i0), (r8v5 ph.i0) binds: [B:12:0x004d, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0055 -> B:11:0x003a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0070 -> B:11:0x003a). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ph.i0 i0Var;
            kotlin.jvm.internal.d0 d0Var;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f23818b;
            if (i10 == 0) {
                pg.q.b(obj);
                i0Var = (ph.i0) this.f23819c;
                d0Var = new kotlin.jvm.internal.d0();
                d0Var.f16322a = 1.0f;
            } else if (i10 == 1) {
                d0Var = this.f23817a;
                ph.i0 i0Var2 = (ph.i0) this.f23819c;
                pg.q.b(obj);
                i0Var = i0Var2;
                if (d0Var.f16322a == CropImageView.DEFAULT_ASPECT_RATIO) {
                    sh.m0 m0VarL = bg.b.l(new C0267b(i0Var));
                    c cVar = new c(2, null);
                    this.f23819c = i0Var;
                    this.f23817a = d0Var;
                    this.f23818b = 2;
                    if (gg.a.e(m0VarL, cVar, this) != aVar) {
                    }
                    return aVar;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d0Var = this.f23817a;
                ph.i0 i0Var3 = (ph.i0) this.f23819c;
                pg.q.b(obj);
                i0Var = i0Var3;
            }
            a aVar2 = new a(this.f23820d, this.f23821e, d0Var, i0Var);
            this.f23819c = i0Var;
            this.f23817a = d0Var;
            this.f23818b = 1;
            if (j0.a(aVar2, this) != aVar) {
                if (d0Var.f16322a == CropImageView.DEFAULT_ASPECT_RATIO) {
                }
                a aVar22 = new a(this.f23820d, this.f23821e, d0Var, i0Var);
                this.f23819c = i0Var;
                this.f23817a = d0Var;
                this.f23818b = 1;
                if (j0.a(aVar22, this) != aVar) {
                }
            }
            return aVar;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {
        public c(int i10) {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            l0.this.a(iN, jVar);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(-318043801);
        int i11 = (kVarP.l(this) ? 4 : 2) | i10;
        if (kVarP.A(i11 & 1, (i11 & 3) != 2)) {
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(null);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            if (((Boolean) this.f23806d.getValue()).booleanValue() || ((Boolean) this.f23804b.getValue()).booleanValue()) {
                kVarP.L(1719883733);
                boolean zL = kVarP.l(this);
                Object objG2 = kVarP.g();
                if (zL || objG2 == c0321a) {
                    objG2 = new b(n1Var, this, null);
                    kVarP.C(objG2);
                }
                x0.o0.d((eh.p) objG2, this, kVarP);
                kVarP.T(false);
            } else {
                kVarP.L(1721270456);
                kVarP.T(false);
            }
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c(i10);
        }
    }
}

package s;

import com.yalantis.ucrop.view.CropImageView;
import s.z0;

@vg.e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {599}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b1 extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f23665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f23666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23668d;

    @vg.e(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2147, 612, 614, 668, 670}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public yh.c f23669a;

        /* renamed from: b, reason: collision with root package name */
        public z0 f23670b;

        /* renamed from: c, reason: collision with root package name */
        public int f23671c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z0<Object> f23672d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f23673e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f23674f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z0 z0Var, y1 y1Var, tg.e eVar) {
            super(2, eVar);
            this.f23672d = z0Var;
            this.f23673e = obj;
            this.f23674f = y1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f23673e, this.f23672d, this.f23674f, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x0181, code lost:
        
            if (s.z0.f0(r14, r24) != r0) goto L79;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c7 A[PHI: r16
          0x00c7: PHI (r16v6 long) = (r16v4 long), (r16v5 long), (r16v9 long) binds: [B:26:0x008e, B:40:0x00c3, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j10;
            yh.c cVar;
            z0<Object> z0Var;
            Object objH0;
            x0.x1 x1Var;
            z0.a aVar;
            o oVar;
            ug.a aVar2 = ug.a.f29706a;
            int i10 = this.f23671c;
            Object obj2 = this.f23673e;
            z0<Object> z0Var2 = this.f23672d;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    Object value = z0Var2.f24048b.getValue();
                    if (obj2.equals(value)) {
                        j10 = Long.MIN_VALUE;
                    } else {
                        z0.c0(z0Var2);
                        z0Var2.l0(CropImageView.DEFAULT_ASPECT_RATIO);
                        j10 = Long.MIN_VALUE;
                        y1<Object> y1Var = this.f23674f;
                        y1Var.p(obj2);
                        y1Var.n(0L);
                        z0Var2.Z(value);
                        z0Var2.f24048b.setValue(obj2);
                    }
                    yh.c cVar2 = z0Var2.f24056k;
                    this.f23669a = cVar2;
                    this.f23670b = z0Var2;
                    this.f23671c = 1;
                    if (cVar2.h(this) != aVar2) {
                        cVar = cVar2;
                        z0Var = z0Var2;
                    }
                    return aVar2;
                }
                if (i10 == 1) {
                    z0Var = this.f23670b;
                    cVar = this.f23669a;
                    pg.q.b(obj);
                    j10 = Long.MIN_VALUE;
                } else {
                    if (i10 == 2) {
                        pg.q.b(obj);
                        j10 = Long.MIN_VALUE;
                        this.f23671c = 3;
                        if (z0.g0(z0Var2, this) != aVar2) {
                            x1Var = z0Var2.f24049c;
                            x0.u1 u1Var = z0Var2.f24054h;
                            if (!kotlin.jvm.internal.r.a(x1Var.getValue(), obj2)) {
                            }
                            return pg.f0.f21461a;
                        }
                        return aVar2;
                    }
                    if (i10 == 3) {
                        pg.q.b(obj);
                        j10 = Long.MIN_VALUE;
                        x1Var = z0Var2.f24049c;
                        x0.u1 u1Var2 = z0Var2.f24054h;
                        if (!kotlin.jvm.internal.r.a(x1Var.getValue(), obj2)) {
                            if (u1Var2.getFloatValue() < 1.0f && ((aVar = z0Var2.f24060p) == null || !kotlin.jvm.internal.r.a(null, aVar.f24065b))) {
                                u2 u2Var = aVar != null ? aVar.f24065b : null;
                                if (u2Var != null) {
                                    long j11 = aVar.f24064a;
                                    o oVar2 = aVar.f24068e;
                                    o oVar3 = z0.f24047v;
                                    o oVar4 = aVar.f24069f;
                                    if (oVar4 == null) {
                                        oVar4 = z0.f24046t;
                                    }
                                    oVar = (o) u2Var.c(j11, oVar2, oVar3, oVar4);
                                } else if (aVar == null || aVar.f24064a == 0) {
                                    oVar = z0.f24046t;
                                } else {
                                    long j12 = aVar.f24070g;
                                    if (j12 == j10) {
                                        j12 = z0Var2.f24052f;
                                    }
                                    float f10 = j12 / 1.0E9f;
                                    oVar = f10 <= CropImageView.DEFAULT_ASPECT_RATIO ? z0.f24046t : new o(1.0f / f10);
                                }
                                if (aVar == null) {
                                    aVar = new z0.a();
                                }
                                o oVar5 = aVar.f24068e;
                                aVar.f24065b = null;
                                aVar.f24066c = false;
                                aVar.f24067d = u1Var2.getFloatValue();
                                oVar5.e(u1Var2.getFloatValue(), 0);
                                long j13 = z0Var2.f24052f;
                                aVar.f24070g = j13;
                                aVar.f24064a = 0L;
                                aVar.f24069f = oVar;
                                aVar.f24071h = gh.a.c((1.0d - u1Var2.getFloatValue()) * j13);
                                z0Var2.f24060p = aVar;
                            }
                            this.f23669a = null;
                            this.f23670b = null;
                            this.f23671c = 4;
                            if (z0.e0(z0Var2, this) != aVar2) {
                                z0Var2.Z(obj2);
                                this.f23671c = 5;
                            }
                            return aVar2;
                        }
                        return pg.f0.f21461a;
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                        o oVar6 = z0.f24046t;
                        z0Var2.l0(CropImageView.DEFAULT_ASPECT_RATIO);
                        return pg.f0.f21461a;
                    }
                    pg.q.b(obj);
                    z0Var2.Z(obj2);
                    this.f23671c = 5;
                }
                Object obj3 = z0Var.f24050d;
                cVar.l(null);
                if (!obj2.equals(obj3)) {
                    this.f23669a = null;
                    this.f23670b = null;
                    this.f23671c = 2;
                    if (z0Var2.f24058m == j10) {
                        objH0 = x0.f1.a(getContext()).f0(z0Var2.f24061q, this);
                        if (objH0 != aVar2) {
                            objH0 = pg.f0.f21461a;
                        }
                    } else {
                        objH0 = z0Var2.h0(this);
                        if (objH0 != aVar2) {
                            objH0 = pg.f0.f21461a;
                        }
                    }
                    if (objH0 != aVar2) {
                        this.f23671c = 3;
                        if (z0.g0(z0Var2, this) != aVar2) {
                        }
                    }
                }
                return aVar2;
            } catch (Throwable th2) {
                cVar.l(null);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Object obj, z0 z0Var, y1 y1Var, tg.e eVar) {
        super(1, eVar);
        this.f23666b = y1Var;
        this.f23667c = z0Var;
        this.f23668d = obj;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new b1(this.f23668d, this.f23667c, this.f23666b, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((b1) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23665a;
        y1<Object> y1Var = this.f23666b;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a(this.f23668d, this.f23667c, y1Var, null);
            this.f23665a = 1;
            if (ph.j0.c(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        y1Var.i();
        return pg.f0.f21461a;
    }
}

package q5;

import com.yalantis.ucrop.view.CropImageView;
import q5.k0;
import s.b1;
import s.g1;
import s.m2;
import s.v0;
import s.y1;
import s.z0;
import x0.u1;
import x0.x1;

@vg.e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {627, 634}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f21992a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0<p5.s> f21994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.s f21995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y1<p5.s> f21996e;

    @vg.e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {642, 646}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21997a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f21998b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z0<p5.s> f21999c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p5.s f22000d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, z0<p5.s> z0Var, p5.s sVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f21998b = f10;
            this.f21999c = z0Var;
            this.f22000d = sVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f21998b, this.f21999c, this.f22000d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        
            if (r8 == r0) goto L30;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object obj2 = ug.a.f29706a;
            int i10 = this.f21997a;
            z0<p5.s> z0Var = this.f21999c;
            float f10 = this.f21998b;
            if (i10 == 0) {
                pg.q.b(obj);
                if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.f21997a = 1;
                    if (z0Var.j0(f10, z0Var.f24048b.getValue(), this) != obj2) {
                    }
                    return obj2;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
            }
            if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f21997a = 2;
                y1<p5.s> y1Var = z0Var.f24051e;
                if (y1Var == null) {
                    objA = pg.f0.f21461a;
                } else {
                    T value = z0Var.f24049c.getValue();
                    p5.s sVar = this.f22000d;
                    if ((kotlin.jvm.internal.r.a(value, sVar) && kotlin.jvm.internal.r.a(z0Var.f24048b.getValue(), sVar)) || (objA = v0.a(z0Var.f24057l, new g1(sVar, z0Var, y1Var, null), this)) != obj2) {
                        objA = pg.f0.f21461a;
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(z0<p5.s> z0Var, p5.s sVar, y1<p5.s> y1Var, tg.e<? super k0> eVar) {
        super(2, eVar);
        this.f21994c = z0Var;
        this.f21995d = sVar;
        this.f21996e = y1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        k0 k0Var = new k0(this.f21994c, this.f21995d, this.f21996e, eVar);
        k0Var.f21993b = obj;
        return k0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((k0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r15 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (s.w1.c(r8, com.yalantis.ucrop.view.CropImageView.DEFAULT_ASPECT_RATIO, r10, r11, r14, 4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        return r0;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f21992a;
        if (i10 == 0) {
            pg.q.b(obj);
            final ph.i0 i0Var = (ph.i0) this.f21993b;
            final z0<p5.s> z0Var = this.f21994c;
            x1 x1Var = z0Var.f24049c;
            u1 u1Var = z0Var.f24054h;
            T value = x1Var.getValue();
            final p5.s sVar = this.f21995d;
            if (kotlin.jvm.internal.r.a(value, sVar)) {
                long jLongValue = ((Number) this.f21996e.f24012l.getValue()).longValue() / 1000000;
                float floatValue = u1Var.getFloatValue();
                m2 m2VarD = s.m.d((int) (u1Var.getFloatValue() * jLongValue), 0, null, 6);
                eh.p pVar = new eh.p() { // from class: q5.j0
                    @Override // eh.p
                    public final Object invoke(Object obj3, Object obj4) {
                        float fFloatValue = ((Float) obj3).floatValue();
                        ((Float) obj4).getClass();
                        ph.h.c(i0Var, null, null, new k0.a(fFloatValue, z0Var, sVar, null), 3);
                        return pg.f0.f21461a;
                    }
                };
                this.f21992a = 2;
            } else {
                this.f21992a = 1;
                y1<p5.s> y1Var = z0Var.f24051e;
                if (y1Var == null || (objA = v0.a(z0Var.f24057l, new b1(sVar, z0Var, y1Var, null), this)) != obj2) {
                    Object objA = pg.f0.f21461a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}

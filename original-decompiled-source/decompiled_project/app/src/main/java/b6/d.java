package b6;

import androidx.room.d0;
import androidx.room.g0;
import androidx.room.s0;
import androidx.room.t0;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import ph.i0;

@vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends vg.i implements eh.p<i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f3576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f3578c;

    @vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 60}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<t0, tg.e<Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public t0.a f3579a;

        /* renamed from: b, reason: collision with root package name */
        public int f3580b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f3581c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f3582d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g0 f3583e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d0 f3584f;

        @vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: b6.d$a$a, reason: collision with other inner class name */
        public static final class C0049a extends vg.i implements eh.p<s0<Object>, tg.e<Object>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f3585a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f3586b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0049a(tg.e eVar, d0 d0Var) {
                super(2, eVar);
                this.f3586b = d0Var;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                C0049a c0049a = new C0049a(eVar, this.f3586b);
                c0049a.f3585a = obj;
                return c0049a;
            }

            @Override // eh.p
            public final Object invoke(s0<Object> s0Var, tg.e<Object> eVar) {
                return ((C0049a) create(s0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                s0 s0Var = (s0) this.f3585a;
                kotlin.jvm.internal.r.c(s0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return g0.runInTransaction$lambda$12(this.f3586b.f2897a, ((x5.n) s0Var).d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, g0 g0Var, tg.e eVar, d0 d0Var) {
            super(2, eVar);
            this.f3582d = z10;
            this.f3583e = g0Var;
            this.f3584f = d0Var;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f3582d, this.f3583e, eVar, this.f3584f);
            aVar.f3581c = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(t0 t0Var, tg.e<Object> eVar) {
            return ((a) create(t0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[PHI: r1 r10
          0x0091: PHI (r1v8 androidx.room.t0) = (r1v5 androidx.room.t0), (r1v14 androidx.room.t0) binds: [B:29:0x008e, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x0091: PHI (r10v16 java.lang.Object) = (r10v14 java.lang.Object), (r10v0 java.lang.Object) binds: [B:29:0x008e, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            t0.a aVar;
            t0 t0Var;
            t0.a aVar2;
            t0 t0Var2;
            t0 t0Var3;
            Object objB;
            Object obj2;
            ug.a aVar3 = ug.a.f29706a;
            int i10 = this.f3580b;
            d0 d0Var = this.f3584f;
            g0 g0Var = this.f3583e;
            if (i10 == 0) {
                pg.q.b(obj);
                t0 t0Var4 = (t0) this.f3581c;
                if (!this.f3582d) {
                    kotlin.jvm.internal.r.c(t0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return g0.runInTransaction$lambda$12(d0Var.f2897a, ((x5.n) t0Var4).d());
                }
                aVar = t0.a.f3089b;
                this.f3581c = t0Var4;
                this.f3579a = aVar;
                this.f3580b = 1;
                Object objB2 = t0Var4.b(this);
                if (objB2 != aVar3) {
                    t0Var = t0Var4;
                    obj = objB2;
                }
                return aVar3;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    aVar = this.f3579a;
                    t0Var3 = (t0) this.f3581c;
                    pg.q.b(obj);
                    aVar2 = aVar;
                    t0Var2 = t0Var3;
                    C0049a c0049a = new C0049a(null, d0Var);
                    this.f3581c = t0Var2;
                    this.f3579a = null;
                    this.f3580b = 3;
                    obj = t0Var2.c(aVar2, c0049a, this);
                    if (obj != aVar3) {
                        this.f3581c = obj;
                        this.f3580b = 4;
                        objB = t0Var2.b(this);
                        if (objB != aVar3) {
                        }
                    }
                    return aVar3;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f3581c;
                    pg.q.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        androidx.room.m invalidationTracker = g0Var.getInvalidationTracker();
                        invalidationTracker.f3016c.e(invalidationTracker.f3019f, invalidationTracker.f3020g);
                    }
                    return obj2;
                }
                t0Var2 = (t0) this.f3581c;
                pg.q.b(obj);
                this.f3581c = obj;
                this.f3580b = 4;
                objB = t0Var2.b(this);
                if (objB != aVar3) {
                    obj2 = obj;
                    obj = objB;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return aVar3;
            }
            aVar = this.f3579a;
            t0Var = (t0) this.f3581c;
            pg.q.b(obj);
            if (((Boolean) obj).booleanValue()) {
                aVar2 = aVar;
                t0Var2 = t0Var;
                C0049a c0049a2 = new C0049a(null, d0Var);
                this.f3581c = t0Var2;
                this.f3579a = null;
                this.f3580b = 3;
                obj = t0Var2.c(aVar2, c0049a2, this);
                if (obj != aVar3) {
                }
                return aVar3;
            }
            androidx.room.m invalidationTracker2 = g0Var.getInvalidationTracker();
            this.f3581c = t0Var;
            this.f3579a = aVar;
            this.f3580b = 2;
            if (invalidationTracker2.a(this) != aVar3) {
                t0Var3 = t0Var;
                aVar2 = aVar;
                t0Var2 = t0Var3;
                C0049a c0049a22 = new C0049a(null, d0Var);
                this.f3581c = t0Var2;
                this.f3579a = null;
                this.f3580b = 3;
                obj = t0Var2.c(aVar2, c0049a22, this);
                if (obj != aVar3) {
                }
            }
            return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g0 g0Var, d0 d0Var, tg.e eVar) {
        super(2, eVar);
        this.f3577b = g0Var;
        this.f3578c = d0Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new d(this.f3577b, this.f3578c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<Object> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3576a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        g0 g0Var = this.f3577b;
        a aVar2 = new a((g0Var.inCompatibilityMode$room_runtime_release() && g0Var.inTransaction()) ? false : true, g0Var, null, this.f3578c);
        this.f3576a = 1;
        Object objUseConnection$room_runtime_release = g0Var.useConnection$room_runtime_release(false, aVar2, this);
        return objUseConnection$room_runtime_release == aVar ? aVar : objUseConnection$room_runtime_release;
    }
}

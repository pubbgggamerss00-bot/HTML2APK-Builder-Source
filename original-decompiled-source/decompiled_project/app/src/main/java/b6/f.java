package b6;

import androidx.room.g0;
import androidx.room.s0;
import androidx.room.t0;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import ph.i0;

@vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3", f = "DBUtil.android.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements eh.p<i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f3598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<tg.e<Object>, Object> f3600c;

    @vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 60, EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<t0, tg.e<Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public t0.a f3601a;

        /* renamed from: b, reason: collision with root package name */
        public int f3602b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f3603c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g0 f3604d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.l f3605e;

        @vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        /* renamed from: b6.f$a$a, reason: collision with other inner class name */
        public static final class C0051a extends vg.i implements eh.p<s0<Object>, tg.e<Object>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f3606a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f3607b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ eh.l f3608c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0051a(eh.l lVar, tg.e eVar) {
                super(2, eVar);
                this.f3608c = lVar;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                C0051a c0051a = new C0051a(this.f3608c, eVar);
                c0051a.f3607b = obj;
                return c0051a;
            }

            @Override // eh.p
            public final Object invoke(s0<Object> s0Var, tg.e<Object> eVar) {
                return ((C0051a) create(s0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f3606a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return obj;
                }
                pg.q.b(obj);
                this.f3606a = 1;
                Object objInvoke = this.f3608c.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var, eh.l lVar, tg.e eVar) {
            super(2, eVar);
            this.f3604d = g0Var;
            this.f3605e = lVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f3604d, this.f3605e, eVar);
            aVar.f3603c = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(t0 t0Var, tg.e<Object> eVar) {
            return ((a) create(t0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[PHI: r1 r10
          0x0094: PHI (r1v7 androidx.room.t0) = (r1v4 androidx.room.t0), (r1v13 androidx.room.t0) binds: [B:31:0x0091, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x0094: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x0091, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
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
            int i10 = this.f3602b;
            g0 g0Var = this.f3604d;
            if (i10 == 0) {
                pg.q.b(obj);
                t0 t0Var4 = (t0) this.f3603c;
                aVar = t0.a.f3089b;
                this.f3603c = t0Var4;
                this.f3601a = aVar;
                this.f3602b = 1;
                Object objB2 = t0Var4.b(this);
                if (objB2 != aVar3) {
                    t0Var = t0Var4;
                    obj = objB2;
                }
                return aVar3;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    aVar = this.f3601a;
                    t0Var3 = (t0) this.f3603c;
                    pg.q.b(obj);
                    aVar2 = aVar;
                    t0Var2 = t0Var3;
                    C0051a c0051a = new C0051a(this.f3605e, null);
                    this.f3603c = t0Var2;
                    this.f3601a = null;
                    this.f3602b = 3;
                    obj = t0Var2.c(aVar2, c0051a, this);
                    if (obj != aVar3) {
                        this.f3603c = obj;
                        this.f3602b = 4;
                        objB = t0Var2.b(this);
                        if (objB != aVar3) {
                        }
                    }
                    return aVar3;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                        return obj;
                    }
                    obj2 = this.f3603c;
                    pg.q.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        androidx.room.m invalidationTracker = g0Var.getInvalidationTracker();
                        invalidationTracker.f3016c.e(invalidationTracker.f3019f, invalidationTracker.f3020g);
                    }
                    return obj2;
                }
                t0Var2 = (t0) this.f3603c;
                pg.q.b(obj);
                this.f3603c = obj;
                this.f3602b = 4;
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
            aVar = this.f3601a;
            t0Var = (t0) this.f3603c;
            pg.q.b(obj);
            if (((Boolean) obj).booleanValue()) {
                aVar2 = aVar;
                t0Var2 = t0Var;
                C0051a c0051a2 = new C0051a(this.f3605e, null);
                this.f3603c = t0Var2;
                this.f3601a = null;
                this.f3602b = 3;
                obj = t0Var2.c(aVar2, c0051a2, this);
                if (obj != aVar3) {
                }
                return aVar3;
            }
            androidx.room.m invalidationTracker2 = g0Var.getInvalidationTracker();
            this.f3603c = t0Var;
            this.f3601a = aVar;
            this.f3602b = 2;
            if (invalidationTracker2.a(this) != aVar3) {
                t0Var3 = t0Var;
                aVar2 = aVar;
                t0Var2 = t0Var3;
                C0051a c0051a22 = new C0051a(this.f3605e, null);
                this.f3603c = t0Var2;
                this.f3601a = null;
                this.f3602b = 3;
                obj = t0Var2.c(aVar2, c0051a22, this);
                if (obj != aVar3) {
                }
            }
            return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(g0 g0Var, eh.l<? super tg.e<Object>, ? extends Object> lVar, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f3599b = g0Var;
        this.f3600c = lVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new f(this.f3599b, this.f3600c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<Object> eVar) {
        return ((f) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3598a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        g0 g0Var = this.f3599b;
        a aVar2 = new a(g0Var, this.f3600c, null);
        this.f3598a = 1;
        Object objUseConnection$room_runtime_release = g0Var.useConnection$room_runtime_release(false, aVar2, this);
        return objUseConnection$room_runtime_release == aVar ? aVar : objUseConnection$room_runtime_release;
    }
}

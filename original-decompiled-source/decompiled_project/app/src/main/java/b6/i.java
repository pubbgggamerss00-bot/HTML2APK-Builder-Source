package b6;

import androidx.room.g0;
import androidx.room.s0;
import androidx.room.t0;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;

@vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends vg.i implements eh.p<t0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public t0.a f3620a;

    /* renamed from: b, reason: collision with root package name */
    public int f3621b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f3625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.l f3626g;

    @vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<s0<Object>, tg.e<Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f3627a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l f3628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eh.l lVar, tg.e eVar) {
            super(2, eVar);
            this.f3628b = lVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f3628b, eVar);
            aVar.f3627a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(s0<Object> s0Var, tg.e<Object> eVar) {
            return ((a) create(s0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            s0 s0Var = (s0) this.f3627a;
            kotlin.jvm.internal.r.c(s0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.f3628b.invoke(((x5.n) s0Var).d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g0 g0Var, eh.l lVar, tg.e eVar, boolean z10, boolean z11) {
        super(2, eVar);
        this.f3623d = z10;
        this.f3624e = z11;
        this.f3625f = g0Var;
        this.f3626g = lVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        i iVar = new i(this.f3625f, this.f3626g, eVar, this.f3623d, this.f3624e);
        iVar.f3622c = obj;
        return iVar;
    }

    @Override // eh.p
    public final Object invoke(t0 t0Var, tg.e<Object> eVar) {
        return ((i) create(t0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[PHI: r1 r11
      0x009e: PHI (r1v11 androidx.room.t0) = (r1v8 androidx.room.t0), (r1v17 androidx.room.t0) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[RETURN] */
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
        Object obj2;
        ug.a aVar3 = ug.a.f29706a;
        int i10 = this.f3621b;
        eh.l lVar = this.f3626g;
        g0 g0Var = this.f3625f;
        boolean z10 = this.f3624e;
        if (i10 == 0) {
            pg.q.b(obj);
            t0 t0Var4 = (t0) this.f3622c;
            if (!this.f3623d) {
                kotlin.jvm.internal.r.c(t0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return lVar.invoke(((x5.n) t0Var4).d());
            }
            aVar = z10 ? t0.a.f3088a : t0.a.f3089b;
            if (!z10) {
                this.f3622c = t0Var4;
                this.f3620a = aVar;
                this.f3621b = 1;
                Object objB = t0Var4.b(this);
                if (objB != aVar3) {
                    t0Var2 = t0Var4;
                    obj = objB;
                }
                return aVar3;
            }
            t0.a aVar4 = aVar;
            t0Var = t0Var4;
            aVar2 = aVar4;
            a aVar5 = new a(lVar, null);
            this.f3622c = t0Var;
            this.f3620a = null;
            this.f3621b = 3;
            obj = t0Var.c(aVar2, aVar5, this);
            if (obj != aVar3) {
            }
            return aVar3;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                aVar = this.f3620a;
                t0Var3 = (t0) this.f3622c;
                pg.q.b(obj);
                aVar2 = aVar;
                t0Var = t0Var3;
                a aVar52 = new a(lVar, null);
                this.f3622c = t0Var;
                this.f3620a = null;
                this.f3621b = 3;
                obj = t0Var.c(aVar2, aVar52, this);
                if (obj != aVar3) {
                    if (!z10) {
                    }
                }
                return aVar3;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f3622c;
                pg.q.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    androidx.room.m invalidationTracker = g0Var.getInvalidationTracker();
                    invalidationTracker.f3016c.e(invalidationTracker.f3019f, invalidationTracker.f3020g);
                }
                return obj2;
            }
            t0Var = (t0) this.f3622c;
            pg.q.b(obj);
            if (!z10) {
                return obj;
            }
            this.f3622c = obj;
            this.f3621b = 4;
            Object objB2 = t0Var.b(this);
            if (objB2 != aVar3) {
                obj2 = obj;
                obj = objB2;
                if (!((Boolean) obj).booleanValue()) {
                }
                return obj2;
            }
            return aVar3;
        }
        aVar = this.f3620a;
        t0Var2 = (t0) this.f3622c;
        pg.q.b(obj);
        if (((Boolean) obj).booleanValue()) {
            aVar2 = aVar;
            t0Var = t0Var2;
            a aVar522 = new a(lVar, null);
            this.f3622c = t0Var;
            this.f3620a = null;
            this.f3621b = 3;
            obj = t0Var.c(aVar2, aVar522, this);
            if (obj != aVar3) {
            }
            return aVar3;
        }
        androidx.room.m invalidationTracker2 = g0Var.getInvalidationTracker();
        this.f3622c = t0Var2;
        this.f3620a = aVar;
        this.f3621b = 2;
        if (invalidationTracker2.a(this) != aVar3) {
            t0Var3 = t0Var2;
            aVar2 = aVar;
            t0Var = t0Var3;
            a aVar5222 = new a(lVar, null);
            this.f3622c = t0Var;
            this.f3620a = null;
            this.f3621b = 3;
            obj = t0Var.c(aVar2, aVar5222, this);
            if (obj != aVar3) {
            }
        }
        return aVar3;
    }
}

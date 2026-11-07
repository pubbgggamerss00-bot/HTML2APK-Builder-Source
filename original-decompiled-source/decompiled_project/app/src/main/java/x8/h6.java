package x8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$2", f = "HomeViewModel.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32719b;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$2$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<Boolean, Integer, tg.e<? super pg.n<? extends Boolean, ? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f32720a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f32721b;

        @Override // eh.q
        public final Object b(Boolean bool, Integer num, tg.e<? super pg.n<? extends Boolean, ? extends Integer>> eVar) {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            a aVar = new a(3, eVar);
            aVar.f32720a = zBooleanValue;
            aVar.f32721b = iIntValue;
            return aVar.invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return new pg.n(Boolean.valueOf(this.f32720a), new Integer(this.f32721b));
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$2$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.t<Boolean, Integer, Boolean, Long, pg.n<? extends Boolean, ? extends Integer>, tg.e<? super pg.n<? extends Boolean, ? extends u8>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f32722a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f32723b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f32724c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ long f32725d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ pg.n f32726e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j6 f32727f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j6 j6Var, tg.e<? super b> eVar) {
            super(6, eVar);
            this.f32727f = j6Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            boolean z10 = this.f32722a;
            int i10 = this.f32723b;
            boolean z11 = this.f32724c;
            long j10 = this.f32725d;
            pg.n nVar = this.f32726e;
            boolean zBooleanValue = ((Boolean) nVar.f21469a).booleanValue();
            int iIntValue = ((Number) nVar.f21470b).intValue();
            Boolean boolValueOf = Boolean.valueOf(z10);
            j6 j6Var = this.f32727f;
            boolean z12 = j6Var.f32790q;
            boolean z13 = j6Var.f32793t;
            boolean z14 = j10 == 0 || System.currentTimeMillis() - j10 >= 604800000;
            boolean z15 = !z10 && !z11 && i10 >= 15 && z14;
            return new pg.n(boolValueOf, new u8(z15 && !z12, (z10 || zBooleanValue || z15 || z13 || !z14 || i10 < iIntValue) ? false : true));
        }
    }

    public static final class c<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j6 f32728a;

        public c(j6 j6Var) {
            this.f32728a = j6Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            pg.n nVar = (pg.n) obj;
            j6 j6Var = this.f32728a;
            sh.z0 z0Var = j6Var.f32794u;
            sh.z0 z0Var2 = j6Var.f32791r;
            boolean zBooleanValue = ((Boolean) nVar.f21469a).booleanValue();
            u8 u8Var = (u8) nVar.f21470b;
            if (zBooleanValue) {
                Boolean bool = Boolean.FALSE;
                z0Var2.getClass();
                z0Var2.j(null, bool);
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            }
            if (u8Var.f33259a && !((Boolean) z0Var2.getValue()).booleanValue()) {
                Boolean bool2 = Boolean.TRUE;
                z0Var2.getClass();
                z0Var2.j(null, bool2);
                j6Var.f32790q = true;
            }
            if (u8Var.f33260b && !((Boolean) z0Var.getValue()).booleanValue()) {
                Boolean bool3 = Boolean.TRUE;
                z0Var.getClass();
                z0Var.j(null, bool3);
                j6Var.f32793t = true;
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(j6 j6Var, tg.e<? super h6> eVar) {
        super(2, eVar);
        this.f32719b = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h6(this.f32719b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f32718a;
        if (i10 == 0) {
            pg.q.b(obj);
            j6 j6Var = this.f32719b;
            n8.m1 m1Var = j6Var.f32777d;
            n8.g1 g1Var = m1Var.f18530f;
            n8.i1 i1Var = m1Var.f18532h;
            n8.j1 j1Var = m1Var.f18533i;
            n8.k1 k1Var = m1Var.f18534j;
            sh.f0 f0Var = new sh.f0(m1Var.f18535k, m1Var.f18536l, new a(3, null));
            b bVar = new b(j6Var, null);
            sh.f[] fVarArr = {g1Var, i1Var, j1Var, k1Var, f0Var};
            c cVar = new c(j6Var);
            this.f32718a = 1;
            Object objA = th.n.a(sh.h0.f24986a, new sh.e0(null, bVar), cVar, this, fVarArr);
            if (objA != obj2) {
                objA = pg.f0.f21461a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}

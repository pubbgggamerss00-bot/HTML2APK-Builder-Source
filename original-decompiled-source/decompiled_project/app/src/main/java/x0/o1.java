package x0;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final p.l0<Object, Object> f31835a = z0.a.b();

    /* renamed from: b, reason: collision with root package name */
    public final p.l0<Object, Object> f31836b = z0.a.b();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<p1, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j1 f31837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1 j1Var) {
            super(1);
            this.f31837a = j1Var;
        }

        @Override // eh.l
        public final Boolean invoke(p1 p1Var) {
            return Boolean.valueOf(kotlin.jvm.internal.r.a(p1Var.f31850b, this.f31837a));
        }
    }

    public final void a(j1 j1Var) {
        Object objD = this.f31836b.d(j1Var);
        if (objD != null) {
            boolean z10 = objD instanceof p.h0;
            p.l0<Object, Object> l0Var = this.f31835a;
            if (!z10) {
                z0.a.d(l0Var, (g1) objD, new a(j1Var));
                return;
            }
            p.q0 q0Var = (p.q0) objD;
            Object[] objArr = q0Var.f20706a;
            int i10 = q0Var.f20707b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                z0.a.d(l0Var, (g1) obj, new a(j1Var));
            }
        }
    }
}

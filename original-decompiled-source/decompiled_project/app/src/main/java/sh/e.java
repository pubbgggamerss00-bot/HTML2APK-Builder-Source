package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class e<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final f<T> f24968a;

    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<Object> f24969a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g<T> f24970b;

        @vg.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        /* renamed from: sh.e$a$a, reason: collision with other inner class name */
        public static final class C0277a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f24971a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f24972b;

            /* renamed from: c, reason: collision with root package name */
            public int f24973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0277a(a<? super T> aVar, tg.e<? super C0277a> eVar) {
                super(eVar);
                this.f24972b = aVar;
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f24971a = obj;
                this.f24973c |= PKIFailureInfo.systemUnavail;
                return this.f24972b.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(e<T> eVar, kotlin.jvm.internal.g0<Object> g0Var, g<? super T> gVar) {
            this.f24969a = g0Var;
            this.f24970b = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t3, tg.e<? super pg.f0> eVar) {
            C0277a c0277a;
            if (eVar instanceof C0277a) {
                c0277a = (C0277a) eVar;
                int i10 = c0277a.f24973c;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0277a.f24973c = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0277a = new C0277a(this, eVar);
                }
            }
            Object obj = c0277a.f24971a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0277a.f24973c;
            if (i11 == 0) {
                pg.q.b(obj);
                kotlin.jvm.internal.g0<Object> g0Var = this.f24969a;
                Object obj2 = g0Var.f16327a;
                if (obj2 != th.u.f28848a && kotlin.jvm.internal.r.a(obj2, t3)) {
                    return pg.f0.f21461a;
                }
                g0Var.f16327a = t3;
                c0277a.f24973c = 1;
                if (this.f24970b.c(t3, c0277a) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public e(f fVar) {
        this.f24968a = fVar;
    }

    @Override // sh.f
    public final Object b(g<? super T> gVar, tg.e<? super pg.f0> eVar) {
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f16327a = (T) th.u.f28848a;
        Object objB = this.f24968a.b(new a(this, g0Var, gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}

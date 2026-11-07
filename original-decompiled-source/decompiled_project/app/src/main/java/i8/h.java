package i8;

import eh.p;
import n8.g1;
import pg.f0;
import pg.q;
import ph.i0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$1", f = "BillingManager.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14212b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f14213a;

        public a(j jVar) {
            this.f14213a = jVar;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            z0 z0Var = this.f14213a.f14231k;
            z0Var.getClass();
            z0Var.j(null, bool);
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, tg.e<? super h> eVar) {
        super(2, eVar);
        this.f14212b = jVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new h(this.f14212b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((h) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14211a;
        if (i10 == 0) {
            q.b(obj);
            j jVar = this.f14212b;
            g1 g1Var = jVar.f14222b.f18530f;
            a aVar2 = new a(jVar);
            this.f14211a = 1;
            if (g1Var.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}

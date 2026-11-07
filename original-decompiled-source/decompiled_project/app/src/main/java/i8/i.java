package i8;

import eh.p;
import n8.v0;
import pg.f0;
import pg.q;
import ph.i0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$2", f = "BillingManager.kt", l = {143}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14215b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f14216a;

        public a(j jVar) {
            this.f14216a = jVar;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            z0 z0Var = this.f14216a.f14233m;
            z0Var.getClass();
            z0Var.j(null, bool);
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, tg.e<? super i> eVar) {
        super(2, eVar);
        this.f14215b = jVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new i(this.f14215b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((i) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14214a;
        if (i10 == 0) {
            q.b(obj);
            j jVar = this.f14215b;
            v0 v0Var = jVar.f14222b.f18537m;
            a aVar2 = new a(jVar);
            this.f14214a = 1;
            if (v0Var.b(aVar2, this) == aVar) {
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

package g8;

import pg.f0;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.account.AccountViewModel$signOut$1", f = "AccountViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, tg.e<? super v> eVar) {
        super(2, eVar);
        this.f11646b = uVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new v(this.f11646b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((v) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11645a;
        if (i10 == 0) {
            pg.q.b(obj);
            p pVar = this.f11646b.f11633b;
            this.f11645a = 1;
            if (pVar.n(this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return f0.f21461a;
    }
}

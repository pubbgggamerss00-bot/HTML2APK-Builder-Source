package w7;

import pg.f0;
import ph.i0;

@vg.e(c = "coil3.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f31423a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, tg.e<? super r> eVar) {
        super(2, eVar);
        this.f31423a = sVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new r(this.f31423a, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((r) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        s sVar = this.f31423a;
        q qVar = sVar.f31426c;
        if (qVar != null) {
            qVar.d();
        }
        sVar.f31426c = null;
        return f0.f21461a;
    }
}

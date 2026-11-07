package x8;

import t0.uc;
import x8.j6;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$8$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r4 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(x0.n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f33122a = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r4(this.f33122a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r4) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        boolean z10 = g5.f32665a;
        j6.b bVar = (j6.b) this.f33122a.getValue();
        if (bVar != null && bVar.f32807e) {
            uc ucVar = q8.p2.f22362a;
            q8.p2.a(bVar.f32805c, null, null);
        }
        return pg.f0.f21461a;
    }
}

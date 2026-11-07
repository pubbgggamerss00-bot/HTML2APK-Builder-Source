package g9;

import java.io.File;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$clearIcon$1", f = "SimpleBuildViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f11851a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, tg.e<? super z> eVar) {
        super(2, eVar);
        this.f11851a = yVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new z(this.f11851a, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        try {
            y yVar = this.f11851a;
            mh.k kVar = y.f11827v;
            ah.l.f(new File(yVar.l(), "icons"));
        } catch (Exception unused) {
        }
        return pg.f0.f21461a;
    }
}

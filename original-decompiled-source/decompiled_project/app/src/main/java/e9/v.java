package e9;

import com.basitce.htmltoapk.domain.model.BuildState;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildProgressScreenKt$BuildProgressScreen$5$1", f = "BuildProgressScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f8573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f8574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n1 n1Var, n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f8573a = n1Var;
        this.f8574b = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new v(this.f8573a, this.f8574b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        n1 n1Var = this.f8573a;
        boolean z10 = ((BuildState) n1Var.getValue()) instanceof BuildState.Error;
        n1<Boolean> n1Var2 = this.f8574b;
        if (z10) {
            n1Var2.setValue(Boolean.TRUE);
        } else if (((BuildState) n1Var.getValue()) instanceof BuildState.Idle) {
            n1Var2.setValue(Boolean.FALSE);
        }
        return pg.f0.f21461a;
    }
}

package e9;

import com.basitce.htmltoapk.domain.model.BuildState;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildProgressScreenKt$BuildProgressScreen$4$1", f = "BuildProgressScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f8567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f8568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j10, s0 s0Var, n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f8566a = j10;
        this.f8567b = s0Var;
        this.f8568c = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u(this.f8566a, this.f8567b, this.f8568c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        long j10 = this.f8566a;
        if (j10 != 0 && kotlin.jvm.internal.r.a((BuildState) this.f8568c.getValue(), BuildState.Idle.INSTANCE)) {
            this.f8567b.g(j10);
        }
        return pg.f0.f21461a;
    }
}

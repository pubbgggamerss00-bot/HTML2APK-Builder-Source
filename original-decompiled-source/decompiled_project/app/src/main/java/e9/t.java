package e9;

import java.util.List;
import t.b1;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildProgressScreenKt$BuildProgressScreen$3$1", f = "BuildProgressScreen.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f8560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f8561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b0.m0 m0Var, n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f8560b = m0Var;
        this.f8561c = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t(this.f8560b, this.f8561c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f8559a;
        if (i10 == 0) {
            pg.q.b(obj);
            n1 n1Var = this.f8561c;
            if (!((List) n1Var.getValue()).isEmpty()) {
                int size = ((List) n1Var.getValue()).size() - 1;
                this.f8559a = 1;
                g1.n nVar = b0.m0.f3381w;
                b0.m0 m0Var = this.f8560b;
                m0Var.getClass();
                Object objC = m0Var.c(b1.f25167a, new b0.n0(m0Var, size, 0, null), this);
                if (objC != aVar) {
                    objC = pg.f0.f21461a;
                }
                if (objC == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}

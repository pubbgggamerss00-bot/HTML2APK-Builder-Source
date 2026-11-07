package x8;

import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$reorderFolders$1", f = "HomeViewModel.kt", l = {390}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Long> f33109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(j6 j6Var, List<Long> list, tg.e<? super q7> eVar) {
        super(2, eVar);
        this.f33108b = j6Var;
        this.f33109c = list;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q7(this.f33108b, this.f33109c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33107a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.i iVar = this.f33108b.f32779f;
            this.f33107a = 1;
            Object objReorder = iVar.f18469a.reorder(this.f33109c, this);
            if (objReorder != aVar) {
                objReorder = pg.f0.f21461a;
            }
            if (objReorder == aVar) {
                return aVar;
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

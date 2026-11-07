package f9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$prepareHtmlForEditing$2$1", f = "ProjectEditorViewModel.kt", l = {1413}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class zg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f11108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(fg fgVar, String str, tg.e<? super zg> eVar) {
        super(2, eVar);
        this.f11108b = fgVar;
        this.f11109c = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new zg(this.f11108b, this.f11109c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((zg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11107a;
        if (i10 == 0) {
            pg.q.b(obj);
            c8 c8Var = new c8(this.f11109c, 1);
            this.f11107a = 1;
            mh.k kVar = fg.X0;
            if (this.f11108b.G(c8Var, this) == aVar) {
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

package f9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$prepareHtmlForEditing$1", f = "ProjectEditorViewModel.kt", l = {1398}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class yg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f11041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f11042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(fg fgVar, File file, tg.e<? super yg> eVar) {
        super(2, eVar);
        this.f11041b = fgVar;
        this.f11042c = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new yg(this.f11041b, this.f11042c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((yg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11040a;
        if (i10 == 0) {
            pg.q.b(obj);
            xg xgVar = new xg(this.f11042c, 0);
            this.f11040a = 1;
            mh.k kVar = fg.X0;
            if (this.f11041b.G(xgVar, this) == aVar) {
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

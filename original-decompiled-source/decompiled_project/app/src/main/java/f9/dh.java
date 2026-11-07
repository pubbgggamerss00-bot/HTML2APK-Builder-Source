package f9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$restoreFieldsInternal$2$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class dh extends vg.i implements eh.p<ph.i0, tg.e<? super String>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(String str, tg.e<? super dh> eVar) {
        super(2, eVar);
        this.f9337a = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new dh(this.f9337a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super String> eVar) {
        return ((dh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        try {
            return ah.l.k(new File(this.f9337a), mh.a.f18238b);
        } catch (Exception unused) {
            return "";
        }
    }
}

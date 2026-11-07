package f9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$restoreFieldsInternal$3", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class eh extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f9506a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(File file, tg.e<? super eh> eVar) {
        super(2, eVar);
        this.f9506a = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new eh(this.f9506a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((eh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        File contentDir = this.f9506a;
        kotlin.jvm.internal.r.e(contentDir, "contentDir");
        File parentFile = contentDir.getParentFile();
        if (parentFile != null) {
            File file = new File(parentFile, "content.previous");
            if (file.exists()) {
                if (contentDir.exists()) {
                    ah.l.f(file);
                } else {
                    file.renameTo(contentDir);
                }
            }
        }
        return pg.f0.f21461a;
    }
}

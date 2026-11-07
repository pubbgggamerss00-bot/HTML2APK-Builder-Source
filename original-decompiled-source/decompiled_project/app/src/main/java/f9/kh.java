package f9;

import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$scheduleDraftSync$1", f = "ProjectEditorViewModel.kt", l = {399, 405}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class kh extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public ProjectEntity f9962a;

    /* renamed from: b, reason: collision with root package name */
    public int f9963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f9964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(fg fgVar, tg.e<? super kh> eVar) {
        super(2, eVar);
        this.f9964c = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new kh(this.f9964c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((kh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ProjectEntity projectEntity;
        fg fgVar = this.f9964c;
        sh.z0 z0Var = fgVar.f9566h;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f9963b;
        try {
        } catch (Exception e10) {
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            buildLogger.error(R.string.build_log_draft_sync_error, message);
        }
        if (i10 == 0) {
            pg.q.b(obj);
            this.f9963b = 1;
            if (ph.t0.b(600L, this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            projectEntity = this.f9962a;
            pg.q.b(obj);
            z0Var.setValue(projectEntity);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        ProjectEntity projectEntity2 = (ProjectEntity) z0Var.getValue();
        if (projectEntity2 == null) {
            return pg.f0.f21461a;
        }
        ProjectEntity projectEntityK = fgVar.k(projectEntity2);
        n8.s sVar = fgVar.f9554b;
        this.f9962a = projectEntityK;
        this.f9963b = 2;
        if (sVar.c(projectEntityK, this) != aVar) {
            projectEntity = projectEntityK;
            z0Var.setValue(projectEntity);
            return pg.f0.f21461a;
        }
        return aVar;
    }
}

package f9;

import android.app.Application;
import android.net.Uri;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistSplashFile$1", f = "ProjectEditorViewModel.kt", l = {833}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f10877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f10878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(fg fgVar, Uri uri, tg.e<? super wg> eVar) {
        super(2, eVar);
        this.f10877b = fgVar;
        this.f10878c = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new wg(this.f10877b, this.f10878c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((wg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        fg fgVar = this.f10877b;
        sh.z0 z0Var = fgVar.f9578n;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10876a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                Boolean bool = Boolean.TRUE;
                z0Var.getClass();
                z0Var.j(null, bool);
                String string = mh.x.W(fgVar.z(this.f10878c)).toString();
                if (!mh.t.i(string, ".png", true) && !mh.t.i(string, ".jpg", true) && !mh.t.i(string, ".jpeg", true) && !mh.t.i(string, ".webp", true)) {
                    string = "splash.png";
                }
                String str = string;
                ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
                final String strI = fgVar.i(this.f10878c, projectEntity != null ? projectEntity.getId() : 0L, "splash", str);
                if (strI != null) {
                    fgVar.L.setValue(Uri.fromFile(new File(strI)));
                    sh.z0 z0Var2 = fgVar.K;
                    z0Var2.getClass();
                    z0Var2.j(null, str);
                    eh.l<? super ProjectEntity, ProjectEntity> lVar = new eh.l() { // from class: f9.vg
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            return ProjectEntity.copy$default((ProjectEntity) obj2, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, strI, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -16385, -1, 15, null);
                        }
                    };
                    this.f10876a = 1;
                    if (fgVar.G(lVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    BuildLogger.INSTANCE.error(R.string.build_log_editor_splash_copy_failed, new Object[0]);
                    Application application = fgVar.f9562f;
                    Toast.makeText(application, application.getString(R.string.editor_asset_copy_failed), 0).show();
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            Boolean bool2 = Boolean.FALSE;
            z0Var.getClass();
            z0Var.j(null, bool2);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            Boolean bool3 = Boolean.FALSE;
            z0Var.getClass();
            z0Var.j(null, bool3);
            throw th2;
        }
    }
}

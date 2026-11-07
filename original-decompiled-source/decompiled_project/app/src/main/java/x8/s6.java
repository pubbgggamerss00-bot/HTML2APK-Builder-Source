package x8;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$deleteProject$1", f = "HomeViewModel.kt", l = {464}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(j6 j6Var, ProjectEntity projectEntity, tg.e<? super s6> eVar) {
        super(2, eVar);
        this.f33177b = j6Var;
        this.f33178c = projectEntity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s6(this.f33177b, this.f33178c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        j6 j6Var = this.f33177b;
        Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = j6Var.f32780g;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33176a;
        ProjectEntity projectEntity = this.f33178c;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.s sVar = j6Var.f32775b;
            this.f33176a = 1;
            if (sVar.a(projectEntity, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        try {
            ah.l.f(new File(hilt_HtmlToApkApplication.getFilesDir(), "projects/" + projectEntity.getId()));
            int i11 = PdfPreviewActivity.f5788v;
            hilt_HtmlToApkApplication.deleteSharedPreferences("pdfviewer_" + ("doc_" + projectEntity.getId()));
        } catch (Exception unused) {
        }
        return pg.f0.f21461a;
    }
}

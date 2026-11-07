package b9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import f9.fg;
import f9.gg;
import java.io.File;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4019b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f4018a = i10;
        this.f4019b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        eh.l<File, pg.f0> onShare;
        int i10 = this.f4018a;
        Object obj = this.f4019b;
        switch (i10) {
            case 0:
                m9.g0 g0Var = (m9.g0) obj;
                int i11 = PdfPreviewActivity.f5788v;
                File documentFile = g0Var.getDocumentFile();
                if (documentFile != null && (onShare = g0Var.getOnShare()) != null) {
                    onShare.invoke(documentFile);
                }
                break;
            default:
                fg fgVar = (fg) obj;
                ph.l2 l2Var = fgVar.f9561e0;
                if (l2Var != null) {
                    l2Var.cancel((CancellationException) null);
                }
                ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
                File file = new File(fgVar.w(projectEntity != null ? projectEntity.getId() : 0L), "content");
                File file2 = new File(file.getParentFile(), m0.r.a("content.removed-", System.currentTimeMillis()));
                boolean z10 = file.exists() && file.renameTo(file2);
                sh.z0 z0Var = fgVar.Z;
                z0Var.getClass();
                z0Var.j(null, qg.z.f22752a);
                fgVar.f9555b0.setValue(null);
                fgVar.F.setValue(null);
                sh.z0 z0Var2 = fgVar.C;
                z0Var2.getClass();
                z0Var2.j(null, "");
                sh.z0 z0Var3 = fgVar.f9600y;
                z0Var3.getClass();
                z0Var3.j(null, "local");
                ph.h.c(androidx.lifecycle.x0.a(fgVar), null, null, new gg(fgVar, z10, file2, null), 3);
                break;
        }
        return pg.f0.f21461a;
    }
}

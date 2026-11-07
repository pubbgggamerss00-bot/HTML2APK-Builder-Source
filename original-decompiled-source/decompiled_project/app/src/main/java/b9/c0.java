package b9;

import android.content.Intent;
import com.basitce.htmltoapk.MainActivity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import s8.e2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity$convertToApp$1", f = "PdfPreviewActivity.kt", l = {239, 240, 241}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public ProjectEntity f3765a;

    /* renamed from: b, reason: collision with root package name */
    public int f3766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(PdfPreviewActivity pdfPreviewActivity, long j10, tg.e<? super c0> eVar) {
        super(1, eVar);
        this.f3767c = pdfPreviewActivity;
        this.f3768d = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new c0(this.f3767c, this.f3768d, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((c0) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r13 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProjectEntity projectEntity;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3766b;
        PdfPreviewActivity pdfPreviewActivity = this.f3767c;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.s sVarK = pdfPreviewActivity.k();
            this.f3766b = 1;
            obj = sVarK.f18583a.getById(this.f3768d, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            pg.q.b(obj);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                String strA = e2.v.a(e2.v.f24652c, ((ProjectEntity) obj).getId(), false, null, 6);
                int i11 = PdfPreviewActivity.f5788v;
                pdfPreviewActivity.startActivity(new Intent(pdfPreviewActivity, (Class<?>) MainActivity.class).putExtra(MainActivity.EXTRA_OPEN_ROUTE, strA).addFlags(603979776));
                pdfPreviewActivity.finish();
                return pg.f0.f21461a;
            }
            projectEntity = this.f3765a;
            pg.q.b(obj);
            if (((Boolean) obj).booleanValue()) {
                return pg.f0.f21461a;
            }
            n8.g gVar = pdfPreviewActivity.f5789e;
            if (gVar == null) {
                kotlin.jvm.internal.r.h("documentProjectCreator");
                throw null;
            }
            this.f3765a = null;
            this.f3766b = 3;
            wh.c cVar = ph.z0.f21632a;
            obj = ph.h.e(wh.b.f31563c, new n8.a(projectEntity, gVar, null), this);
        }
        projectEntity = (ProjectEntity) obj;
        if (projectEntity == null) {
            return pg.f0.f21461a;
        }
        this.f3765a = projectEntity;
        this.f3766b = 2;
        obj = PdfPreviewActivity.g(pdfPreviewActivity, ProjectKind.APK, this);
        if (obj != aVar) {
            if (((Boolean) obj).booleanValue()) {
            }
        }
        return aVar;
    }
}

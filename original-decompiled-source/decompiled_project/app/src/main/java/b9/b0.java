package b9;

import android.net.Uri;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity$addToLibrary$1", f = "PdfPreviewActivity.kt", l = {246, 247, 252, 253, 259}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b0 extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f3750a;

    /* renamed from: b, reason: collision with root package name */
    public PdfPreviewActivity f3751b;

    /* renamed from: c, reason: collision with root package name */
    public int f3752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f3754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.p<ProjectEntity, tg.e<? super pg.f0>, Object> f3755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(PdfPreviewActivity pdfPreviewActivity, Uri uri, eh.p<? super ProjectEntity, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super b0> eVar) {
        super(1, eVar);
        this.f3753d = pdfPreviewActivity;
        this.f3754e = uri;
        this.f3755f = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new b0(this.f3753d, this.f3754e, this.f3755f, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((b0) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r2 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r2 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r2 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0110, code lost:
    
        if (r3.invoke(r2, r17) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104 A[PHI: r2
      0x0104: PHI (r2v21 com.basitce.htmltoapk.data.local.entity.ProjectEntity) = 
      (r2v11 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
      (r2v24 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
     binds: [B:35:0x00af, B:48:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object byId;
        Object objE;
        ProjectEntity projectEntity;
        Object objG;
        Object objE2;
        eh.p<ProjectEntity, tg.e<? super pg.f0>, Object> pVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3752c;
        Uri uri = this.f3754e;
        PdfPreviewActivity pdfPreviewActivity = this.f3753d;
        if (i10 == 0) {
            pg.q.b(obj);
            Long l10 = new Long(pdfPreviewActivity.f5798p);
            if (l10.longValue() == 0) {
                l10 = null;
            }
            if (l10 != null) {
                long jLongValue = l10.longValue();
                n8.s sVarK = pdfPreviewActivity.k();
                this.f3752c = 1;
                byId = sVarK.f18583a.getById(jLongValue, this);
            } else {
                n8.g gVar = pdfPreviewActivity.f5789e;
                if (gVar == null) {
                    kotlin.jvm.internal.r.h("documentProjectCreator");
                    throw null;
                }
                this.f3752c = 2;
                wh.c cVar = ph.z0.f21632a;
                objE = ph.h.e(wh.b.f31563c, new n8.f(uri, gVar, ProjectKind.PDF, null), this);
            }
            return aVar;
        }
        if (i10 == 1) {
            pg.q.b(obj);
            byId = obj;
        } else {
            if (i10 == 2) {
                pg.q.b(obj);
                objE = obj;
                projectEntity = (ProjectEntity) objE;
                if (projectEntity != null) {
                    pdfPreviewActivity.f5798p = projectEntity.getId();
                    pdfPreviewActivity.f5800r.f4174r.setValue(Boolean.TRUE);
                } else {
                    projectEntity = null;
                }
                if (projectEntity == null) {
                    pVar = this.f3755f;
                    if (pVar != null) {
                    }
                    return pg.f0.f21461a;
                }
                this.f3750a = uri;
                this.f3751b = pdfPreviewActivity;
                this.f3752c = 3;
                objG = PdfPreviewActivity.g(pdfPreviewActivity, ProjectKind.PDF, this);
                if (objG != aVar) {
                    if (((Boolean) objG).booleanValue()) {
                    }
                }
                return aVar;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                PdfPreviewActivity pdfPreviewActivity2 = (PdfPreviewActivity) this.f3750a;
                pg.q.b(obj);
                pdfPreviewActivity = pdfPreviewActivity2;
                objE2 = obj;
                projectEntity = (ProjectEntity) objE2;
                pdfPreviewActivity.f5798p = projectEntity.getId();
                pdfPreviewActivity.f5800r.f4174r.setValue(Boolean.TRUE);
                Toast.makeText(pdfPreviewActivity, R.string.pdf_added_to_library, 0).show();
                pVar = this.f3755f;
                if (pVar != null) {
                    this.f3750a = null;
                    this.f3752c = 5;
                }
                return pg.f0.f21461a;
            }
            pdfPreviewActivity = this.f3751b;
            uri = (Uri) this.f3750a;
            pg.q.b(obj);
            objG = obj;
            if (((Boolean) objG).booleanValue()) {
                return pg.f0.f21461a;
            }
            n8.g gVar2 = pdfPreviewActivity.f5789e;
            if (gVar2 == null) {
                kotlin.jvm.internal.r.h("documentProjectCreator");
                throw null;
            }
            this.f3750a = pdfPreviewActivity;
            this.f3751b = null;
            this.f3752c = 4;
            wh.c cVar2 = ph.z0.f21632a;
            objE2 = ph.h.e(wh.b.f31563c, new n8.d(gVar2, uri, null, null), this);
        }
        projectEntity = (ProjectEntity) byId;
        if (projectEntity != null) {
            if (projectEntity == null) {
            }
        }
        return aVar;
    }
}

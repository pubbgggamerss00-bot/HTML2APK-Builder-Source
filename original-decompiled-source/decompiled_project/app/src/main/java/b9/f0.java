package b9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity$rename$1", f = "PdfPreviewActivity.kt", l = {305, 306}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f0 extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public String f3820a;

    /* renamed from: b, reason: collision with root package name */
    public int f3821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String str, PdfPreviewActivity pdfPreviewActivity, tg.e<? super f0> eVar) {
        super(1, eVar);
        this.f3822c = str;
        this.f3823d = pdfPreviewActivity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new f0(this.f3822c, this.f3823d, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((f0) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        String strB0;
        Object byId;
        String str;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f3821b;
        PdfPreviewActivity pdfPreviewActivity = this.f3823d;
        if (i10 == 0) {
            pg.q.b(obj);
            strB0 = mh.y.b0(50, mh.x.W(this.f3822c).toString());
            if (strB0.length() == 0) {
                return pg.f0.f21461a;
            }
            n8.s sVarK = pdfPreviewActivity.k();
            long j10 = pdfPreviewActivity.j();
            this.f3820a = strB0;
            this.f3821b = 1;
            byId = sVarK.f18583a.getById(j10, this);
            if (byId != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f3820a;
            pg.q.b(obj);
            y2 y2Var = pdfPreviewActivity.f5800r;
            y2Var.getClass();
            kotlin.jvm.internal.r.e(str, "<set-?>");
            y2Var.f4157a.setValue(str);
            return pg.f0.f21461a;
        }
        strB0 = this.f3820a;
        pg.q.b(obj);
        byId = obj;
        String str2 = strB0;
        ProjectEntity projectEntity = (ProjectEntity) byId;
        if (projectEntity == null) {
            return pg.f0.f21461a;
        }
        n8.s sVarK2 = pdfPreviewActivity.k();
        ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, 0L, str2, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, System.currentTimeMillis(), -3, -1, 7, null);
        this.f3820a = str2;
        this.f3821b = 2;
        if (sVarK2.c(projectEntityCopy$default, this) != aVar) {
            str = str2;
            y2 y2Var2 = pdfPreviewActivity.f5800r;
            y2Var2.getClass();
            kotlin.jvm.internal.r.e(str, "<set-?>");
            y2Var2.f4157a.setValue(str);
            return pg.f0.f21461a;
        }
        return aVar;
    }
}

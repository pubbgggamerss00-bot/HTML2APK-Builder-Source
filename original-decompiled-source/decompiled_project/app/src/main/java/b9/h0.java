package b9;

import com.basitce.htmltoapk.domain.model.ProjectLimits;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity", f = "PdfPreviewActivity.kt", l = {311, 312}, m = "withinLimit")
/* loaded from: classes.dex */
public final class h0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public PdfPreviewActivity f3856a;

    /* renamed from: b, reason: collision with root package name */
    public String f3857b;

    /* renamed from: c, reason: collision with root package name */
    public ProjectLimits f3858c;

    /* renamed from: d, reason: collision with root package name */
    public String f3859d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3860e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3862g;

    /* renamed from: h, reason: collision with root package name */
    public int f3863h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(PdfPreviewActivity pdfPreviewActivity, vg.c cVar) {
        super(cVar);
        this.f3862g = pdfPreviewActivity;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3861f = obj;
        this.f3863h |= PKIFailureInfo.systemUnavail;
        return PdfPreviewActivity.g(this.f3862g, null, this);
    }
}

package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import b9.y2;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.util.List;
import m9.g0;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1514c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f1512a = i10;
        this.f1513b = obj;
        this.f1514c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1512a;
        Object obj = this.f1514c;
        Object obj2 = this.f1513b;
        switch (i10) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1((CredentialProviderCreatePublicKeyCredentialController) obj2, (Throwable) obj);
            default:
                g0 g0Var = (g0) obj2;
                int i11 = PdfPreviewActivity.f5788v;
                g0Var.s();
                y2 y2Var = ((PdfPreviewActivity) obj).f5800r;
                List<Integer> bookmarkedPages = g0Var.getBookmarkedPages();
                y2Var.getClass();
                kotlin.jvm.internal.r.e(bookmarkedPages, "<set-?>");
                y2Var.f4164h.setValue(bookmarkedPages);
                return f0.f21461a;
        }
    }
}

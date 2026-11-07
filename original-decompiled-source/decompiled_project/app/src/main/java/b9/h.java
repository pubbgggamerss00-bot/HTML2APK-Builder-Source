package b9;

import android.content.ContentResolver;
import android.net.Uri;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3855a;

    @Override // eh.a
    public final Object invoke() throws FileNotFoundException {
        int i10 = PdfPreviewActivity.f5788v;
        PdfPreviewActivity pdfPreviewActivity = this.f3855a;
        ContentResolver contentResolver = pdfPreviewActivity.getContentResolver();
        Uri data = pdfPreviewActivity.getIntent().getData();
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(data);
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IllegalStateException("Cannot open PDF");
    }
}

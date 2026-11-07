package b9;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements e.b, r1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4138a;

    public /* synthetic */ x(Object obj) {
        this.f4138a = obj;
    }

    @Override // e.b
    public void a(Object obj) {
        PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) this.f4138a;
        final Uri uri = (Uri) obj;
        final File file = pdfPreviewActivity.f5796m;
        pdfPreviewActivity.f5796m = null;
        if (uri == null || file == null) {
            return;
        }
        Handler handler = m9.r0.f17892a;
        final Context applicationContext = pdfPreviewActivity.getApplicationContext();
        new Thread(new Runnable() { // from class: m9.j0
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                Long lValueOf;
                final Context context = applicationContext;
                Uri uri2 = uri;
                File file2 = file;
                final boolean z10 = false;
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2, "w");
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            try {
                                long jA = ah.b.a(fileInputStream, outputStreamOpenOutputStream, 65536);
                                fileInputStream.close();
                                lValueOf = Long.valueOf(jA);
                                outputStreamOpenOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        z10 = true;
                    }
                } catch (Exception e10) {
                    Log.w("PdfExport", "Save failed", e10);
                }
                r0.f17892a.post(new Runnable() { // from class: m9.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Toast.makeText(context, z10 ? R.string.pdf_document_saved : R.string.pdf_document_export_failed, 0).show();
                    }
                });
            }
        }).start();
    }

    @Override // r1.n
    public double b(double d10) {
        r1.a0 a0Var = (r1.a0) this.f4138a;
        float[] fArr = r1.j.f23075a;
        return r1.j.c(a0Var, d10);
    }
}

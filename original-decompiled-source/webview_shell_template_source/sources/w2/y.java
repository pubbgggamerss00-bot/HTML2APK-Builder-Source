package w2;

import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.util.Log;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import com.htmltoapk.template.R;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f15051a = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final File f15052a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15053b;

        public a(File file, String str) {
            kotlin.jvm.internal.j.e("file", file);
            kotlin.jvm.internal.j.e("name", str);
            this.f15052a = file;
            this.f15053b = str;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            kotlin.jvm.internal.j.e("newAttributes", printAttributes2);
            kotlin.jvm.internal.j.e("cancellationSignal", cancellationSignal);
            kotlin.jvm.internal.j.e("callback", layoutResultCallback);
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f15053b).setContentType(0).build(), printAttributes == null);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            kotlin.jvm.internal.j.e("pages", pageRangeArr);
            kotlin.jvm.internal.j.e("destination", parcelFileDescriptor);
            kotlin.jvm.internal.j.e("cancellationSignal", cancellationSignal);
            kotlin.jvm.internal.j.e("callback", writeResultCallback);
            new Thread(new androidx.camera.core.processing.h(parcelFileDescriptor, this, cancellationSignal, writeResultCallback, 2)).start();
        }
    }

    public static void a(ComponentActivity componentActivity, Exception exc) {
        Log.w("PdfExport", "Export failed", exc);
        Toast.makeText(componentActivity, R.string.pdf_document_export_failed, 0).show();
    }

    public static String b(String str) {
        kotlin.jvm.internal.j.e("title", str);
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|\\p{Cntrl}]");
        kotlin.jvm.internal.j.d("compile(...)", patternCompile);
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        kotlin.jvm.internal.j.d("replaceAll(...)", strReplaceAll);
        String strA = x5.o.A(x5.o.A(x5.p.I(80, x5.o.H(x5.o.G(strReplaceAll).toString(), '.')), ".pdf"), ".PDF");
        if (x5.o.v(strA)) {
            strA = "document";
        }
        return strA.concat(".pdf");
    }

    public static void c(ComponentActivity componentActivity, File file, Uri uri) {
        kotlin.jvm.internal.j.e("context", componentActivity);
        kotlin.jvm.internal.j.e("file", file);
        new Thread(new androidx.camera.core.processing.concurrent.d(componentActivity.getApplicationContext(), uri, file, 4)).start();
    }
}

package b9;

import android.app.Activity;
import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import java.util.WeakHashMap;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<WebView, PrintJob> f3819a = new WeakHashMap<>();

    public static final void a(Context context, WebView webView, String title) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(title, "title");
        WeakHashMap<WebView, PrintJob> weakHashMap = f3819a;
        PrintJob printJob = weakHashMap.get(webView);
        if (printJob != null && !printJob.isCompleted() && !printJob.isCancelled() && !printJob.isFailed()) {
            Toast.makeText(context, R.string.print_in_progress, 0).show();
            return;
        }
        try {
            Activity activityB = k9.j.b(context);
            if (activityB == null) {
                throw new IllegalStateException("Print requires an activity");
            }
            Object systemService = activityB.getSystemService("print");
            PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
            if (printManager == null) {
                throw new IllegalStateException("Print service unavailable");
            }
            if (mh.x.A(title)) {
                title = context.getString(R.string.app_name);
                kotlin.jvm.internal.r.d(title, "getString(...)");
            }
            String strB0 = mh.y.b0(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, title);
            PrintJob printJobPrint = printManager.print(strB0, webView.createPrintDocumentAdapter(strB0), new PrintAttributes.Builder().build());
            if (printJobPrint == null) {
                throw new IllegalStateException("Required value was null.");
            }
            weakHashMap.put(webView, printJobPrint);
        } catch (Exception e10) {
            Log.w("HtmlPrinting", "Unable to open Android printing", e10);
            Toast.makeText(context, R.string.print_launch_failed, 0).show();
        }
    }
}

package p6;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import q6.f;
import q6.i;
import q6.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21338a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static f a(WebView webView, Set set) {
        if (i.f22072e.d()) {
            return new f((ScriptHandlerBoundaryInterface) li.a.a(ScriptHandlerBoundaryInterface.class, j.b.f22075a.createWebView(webView).addDocumentStartJavaScript("window.print = function() { HtmlPrint.printPage(); };", (String[]) set.toArray(new String[0]))));
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}

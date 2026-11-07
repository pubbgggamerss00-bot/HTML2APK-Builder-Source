package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b9.e3;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import p6.b;

/* loaded from: classes.dex */
public final class i4 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3.a f3886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6.b f3887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f3889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f3890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<WebView> f3891f;

    public i4(e3.a aVar, p6.b bVar, Context context, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3) {
        this.f3886a = aVar;
        this.f3887b = bVar;
        this.f3888c = context;
        this.f3889d = n1Var;
        this.f3890e = n1Var2;
        this.f3891f = n1Var3;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        p3.c(this.f3890e, false);
        if (webView != null) {
            webView.evaluateJavascript("window.print = function() { HtmlPrint.printPage(); };", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        p3.c(this.f3890e, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        p3.c(this.f3890e, false);
        this.f3889d.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.r.e(view, "view");
        kotlin.jvm.internal.r.e(detail, "detail");
        Log.w("PreviewScreen", "Renderer gone, crashed=" + detail.didCrash());
        x0.n1<WebView> n1Var = this.f3891f;
        if (n1Var.getValue() == view) {
            n1Var.setValue(null);
        }
        p3.d(view);
        p3.c(this.f3890e, false);
        this.f3889d.setValue(Boolean.TRUE);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) throws FileNotFoundException {
        WebResourceResponse webResourceResponseA;
        InputStream inputStreamOpenInputStream;
        kotlin.jvm.internal.r.e(view, "view");
        kotlin.jvm.internal.r.e(request, "request");
        e3.a aVar = this.f3886a;
        int i10 = 0;
        if (aVar.f3798b == e3.b.f3813c && kotlin.jvm.internal.r.a(request.getUrl().getHost(), "document.htmltoapk.local") && kotlin.jvm.internal.r.a(request.getUrl().getPath(), "/index.html")) {
            try {
                Uri uri = aVar.f3801e;
                if (uri == null || (inputStreamOpenInputStream = this.f3888c.getContentResolver().openInputStream(uri)) == null) {
                    throw new FileNotFoundException();
                }
                return new WebResourceResponse("text/html", aVar.f3806j, inputStreamOpenInputStream);
            } catch (Exception unused) {
                final x0.n1<Boolean> n1Var = this.f3889d;
                final x0.n1<Boolean> n1Var2 = this.f3890e;
                view.post(new Runnable() { // from class: b9.h4
                    @Override // java.lang.Runnable
                    public final void run() {
                        n1Var.setValue(Boolean.TRUE);
                        p3.c(n1Var2, false);
                    }
                });
                return new WebResourceResponse("text/plain", "UTF-8", 404, "Not Found", qg.a0.f22708a, new ByteArrayInputStream(new byte[0]));
            }
        }
        p6.b bVar = this.f3887b;
        if (bVar != null) {
            Uri url = request.getUrl();
            ArrayList arrayList = bVar.f21331a;
            int size = arrayList.size();
            while (true) {
                webResourceResponseA = null;
                cVar = null;
                cVar = null;
                cVar = null;
                b.c cVar = null;
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                b.d dVar = (b.d) obj;
                dVar.getClass();
                String str = dVar.f21336b;
                if (!url.getScheme().equals("http") && ((url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(dVar.f21335a) && url.getPath().startsWith(str))) {
                    cVar = dVar.f21337c;
                }
                if (cVar != null) {
                    webResourceResponseA = cVar.a(url.getPath().replaceFirst(str, ""));
                    break;
                }
            }
            if (webResourceResponseA != null) {
                return webResourceResponseA;
            }
        }
        return super.shouldInterceptRequest(view, request);
    }
}

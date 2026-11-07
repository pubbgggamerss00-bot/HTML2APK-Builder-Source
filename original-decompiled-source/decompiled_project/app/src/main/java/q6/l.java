package q6;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f22076a;

    public l(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f22076a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // q6.k
    public final String[] a() {
        return this.f22076a.getSupportedFeatures();
    }

    @Override // q6.k
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) li.a.a(WebViewProviderBoundaryInterface.class, this.f22076a.createWebView(webView));
    }

    @Override // q6.k
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) li.a.a(StaticsBoundaryInterface.class, this.f22076a.getStatics());
    }

    @Override // q6.k
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) li.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f22076a.getWebkitToCompatConverter());
    }
}

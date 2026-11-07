package h2;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b6.v;
import com.google.android.gms.ads.RequestConfiguration;
import i2.a;
import i2.j;
import i2.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13280a = 0;

    static {
        Uri.parse("*");
        Uri.parse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static void a(WebView webView, String str, Set set) {
        if (!j.h.d()) {
            throw j.a();
        }
        v vVarC = c(webView);
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static v c(WebView webView) {
        return new v(4, k.b.f13361a.createWebView(webView));
    }

    public static WebViewClient d(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a.e eVar = j.f13352b;
        if (eVar.c()) {
            return webView.getWebViewClient();
        }
        if (!eVar.d()) {
            throw j.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return ((WebViewProviderBoundaryInterface) c(webView).f2049t).getWebViewClient();
    }
}

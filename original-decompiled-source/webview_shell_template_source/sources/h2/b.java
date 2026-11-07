package h2;

import android.util.Log;
import android.webkit.WebResourceResponse;
import com.htmltoapk.template.TrustedOrigins;
import com.htmltoapk.template.WebViewActivity;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13275a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements InterfaceC0065b {

        /* renamed from: a, reason: collision with root package name */
        public final i2.b f13276a;

        public a(WebViewActivity webViewActivity) {
            this.f13276a = new i2.b(webViewActivity);
        }

        @Override // h2.b.InterfaceC0065b
        public final WebResourceResponse a(String str) throws IOException {
            try {
                i2.b bVar = this.f13276a;
                String strSubstring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                InputStream inputStreamOpen = bVar.f13348a.getAssets().open(strSubstring, 2);
                if (strSubstring.endsWith(".svgz")) {
                    inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                }
                return new WebResourceResponse(i2.b.a(str), null, inputStreamOpen);
            } catch (IOException e6) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e6);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: h2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0065b {
        WebResourceResponse a(String str);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f13277a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13278b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0065b f13279c;

        public c(String str, InterfaceC0065b interfaceC0065b) {
            if (str.isEmpty() || str.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f13277a = TrustedOrigins.LOCAL_HOST;
            this.f13278b = str;
            this.f13279c = interfaceC0065b;
        }
    }

    public b(ArrayList arrayList) {
        this.f13275a = arrayList;
    }
}

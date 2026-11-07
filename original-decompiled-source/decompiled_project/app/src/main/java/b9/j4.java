package b9;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class j4 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f3915b;

    public j4(x0.l1 l1Var, x0.n1<Boolean> n1Var) {
        this.f3914a = l1Var;
        this.f3915b = n1Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        this.f3914a.f(i10);
        if (i10 >= 100) {
            p3.c(this.f3915b, false);
        }
    }
}

package b9;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f3923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3924c;

    public /* synthetic */ k3(Object obj, x0.n1 n1Var, int i10) {
        this.f3922a = i10;
        this.f3924c = obj;
        this.f3923b = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f3922a) {
            case 0:
                p5.x xVar = (p5.x) this.f3924c;
                x0.n1 n1Var = this.f3923b;
                WebView webView = (WebView) n1Var.getValue();
                if (webView == null || !webView.canGoBack()) {
                    s8.b2.e(xVar);
                } else {
                    WebView webView2 = (WebView) n1Var.getValue();
                    if (webView2 != null) {
                        webView2.goBack();
                    }
                }
                break;
            default:
                eh.a aVar = (eh.a) this.f3924c;
                this.f3923b.setValue(Boolean.FALSE);
                aVar.invoke();
                break;
        }
        return pg.f0.f21461a;
    }
}

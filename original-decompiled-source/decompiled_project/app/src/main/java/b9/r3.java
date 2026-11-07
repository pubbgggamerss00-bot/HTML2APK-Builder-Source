package b9;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4084c;

    public /* synthetic */ r3(int i10, Object obj, Object obj2) {
        this.f4082a = i10;
        this.f4083b = obj;
        this.f4084c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f4082a) {
            case 0:
                p5.x xVar = (p5.x) this.f4083b;
                x0.n1 n1Var = (x0.n1) this.f4084c;
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
            case 1:
                ((eh.l) this.f4083b).invoke((String) this.f4084c);
                break;
            default:
                eh.a aVar = (eh.a) this.f4083b;
                if (!((Boolean) ((x0.n1) this.f4084c).getValue()).booleanValue()) {
                    aVar.invoke();
                }
                break;
        }
        return pg.f0.f21461a;
    }
}

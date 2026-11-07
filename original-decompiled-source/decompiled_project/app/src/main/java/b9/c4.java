package b9;

import android.content.Context;
import android.webkit.WebView;
import b9.e3;

/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f3774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3.a f3776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f3777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f3778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f3779f;

    public /* synthetic */ c4(Context context, WebView webView, e3.a aVar, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3) {
        this.f3774a = webView;
        this.f3775b = context;
        this.f3776c = aVar;
        this.f3777d = n1Var;
        this.f3778e = n1Var2;
        this.f3779f = n1Var3;
    }

    @Override // eh.a
    public final Object invoke() {
        final Context context = this.f3775b;
        final WebView webView = this.f3774a;
        final e3.a aVar = this.f3776c;
        final x0.n1 n1Var = this.f3777d;
        final x0.n1 n1Var2 = this.f3778e;
        final x0.n1 n1Var3 = this.f3779f;
        webView.post(new Runnable() { // from class: b9.g4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) n1Var.getValue()).booleanValue() || ((Boolean) n1Var2.getValue()).booleanValue()) {
                    return;
                }
                String str = (String) n1Var3.getValue();
                if (str == null) {
                    str = aVar.f3797a;
                }
                f.a(context, webView, str);
            }
        });
        return pg.f0.f21461a;
    }
}

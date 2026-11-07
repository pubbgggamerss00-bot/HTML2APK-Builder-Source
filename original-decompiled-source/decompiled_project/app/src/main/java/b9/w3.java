package b9;

import android.webkit.WebView;
import x8.j6;

/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4137b;

    public /* synthetic */ w3(Object obj, int i10) {
        this.f4136a = i10;
        this.f4137b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f4136a) {
            case 0:
                WebView webView = (WebView) ((x0.n1) this.f4137b).getValue();
                if (webView != null) {
                    webView.reload();
                }
                break;
            case 1:
                ((x0.n1) this.f4137b).setValue(Boolean.TRUE);
                break;
            case 2:
                ((x0.n1) this.f4137b).setValue(Boolean.FALSE);
                break;
            default:
                ((j6) this.f4137b).f32798y.setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}

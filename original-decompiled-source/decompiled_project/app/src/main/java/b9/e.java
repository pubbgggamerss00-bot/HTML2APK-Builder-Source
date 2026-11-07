package b9;

import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c4 f3791a;

    public e(c4 c4Var) {
        this.f3791a = c4Var;
    }

    @JavascriptInterface
    public final void printPage() {
        this.f3791a.invoke();
    }
}

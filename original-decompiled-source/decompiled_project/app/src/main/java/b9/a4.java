package b9;

import android.webkit.WebView;
import h8.v;

/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3737b;

    public /* synthetic */ a4(Object obj, int i10) {
        this.f3736a = i10;
        this.f3737b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3736a) {
            case 0:
                x0.n1 n1Var = (x0.n1) this.f3737b;
                WebView view = (WebView) obj;
                kotlin.jvm.internal.r.e(view, "view");
                if (((WebView) n1Var.getValue()) == view) {
                    n1Var.setValue(null);
                }
                p3.d(view);
                return pg.f0.f21461a;
            case 1:
                ((eh.l) this.f3737b).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return pg.f0.f21461a;
            default:
                h8.v vVar = (h8.v) this.f3737b;
                t8.y3 y3Var = (t8.y3) obj;
                Integer num = y3Var.f28586f;
                String str = y3Var.f28585e;
                return (num != null || str.length() > 20000) ? y3Var : t8.y3.a(y3Var, null, str.concat(((v.g) vVar).f12487a), null, null, null, null, false, null, null, null, null, 0, null, null, null, 4194287);
        }
    }
}

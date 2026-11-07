package b9;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3763a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3763a) {
            case 0:
                WebView it = (WebView) obj;
                kotlin.jvm.internal.r.e(it, "it");
                break;
            default:
                kotlinx.serialization.json.d Json = (kotlinx.serialization.json.d) obj;
                kotlin.jvm.internal.r.e(Json, "$this$Json");
                Json.f16440a = true;
                Json.f16441b = true;
                break;
        }
        return pg.f0.f21461a;
    }
}

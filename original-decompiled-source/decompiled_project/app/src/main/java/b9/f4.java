package b9;

import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class f4 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3835a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3835a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                String strEncode = Uri.encode(it);
                kotlin.jvm.internal.r.d(strEncode, "encode(...)");
                break;
            case 1:
                kotlinx.serialization.json.d Json = (kotlinx.serialization.json.d) obj;
                kotlin.jvm.internal.r.e(Json, "$this$Json");
                Json.f16440a = true;
                Json.f16441b = true;
                break;
            default:
                kotlin.jvm.internal.r.e((e.a) obj, "it");
                break;
        }
        return pg.f0.f21461a;
    }
}

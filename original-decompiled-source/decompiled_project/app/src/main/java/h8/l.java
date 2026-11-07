package h8;

import pg.f0;
import t8.y3;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12415a;

    public /* synthetic */ l(int i10) {
        this.f12415a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f12415a) {
            case 0:
                kotlinx.serialization.json.d Json = (kotlinx.serialization.json.d) obj;
                kotlin.jvm.internal.r.e(Json, "$this$Json");
                Json.f16440a = true;
                return f0.f21461a;
            default:
                return y3.a((y3) obj, null, null, null, null, null, null, false, null, null, null, null, 0, "output_invalid", null, null, 4062591);
        }
    }
}

package w2;

import com.htmltoapk.template.AndroidAPI;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14882t;

    public /* synthetic */ c(int i6, Object obj) {
        this.s = i6;
        this.f14882t = obj;
    }

    @Override // p5.a
    public final Object a() throws IOException {
        switch (this.s) {
            case 0:
                InputStream inputStreamOpen = ((t) this.f14882t).getContext().getAssets().open("www/document.pdf");
                kotlin.jvm.internal.j.d("open(...)", inputStreamOpen);
                return inputStreamOpen;
            case 1:
                ((t) this.f14882t).r(-1);
                return d5.j.f12745a;
            default:
                return AndroidAPI.stopCameraPreview$lambda$68((AndroidAPI) this.f14882t);
        }
    }
}

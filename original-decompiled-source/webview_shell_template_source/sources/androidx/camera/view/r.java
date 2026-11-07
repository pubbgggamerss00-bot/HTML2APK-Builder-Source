package androidx.camera.view;

import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.u;
import com.htmltoapk.template.WebViewActivity;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f716t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f717u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f718v;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f716t = obj;
        this.f717u = obj2;
        this.f718v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                u uVar = (u) this.f716t;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f717u;
                j jVar = (j) this.f718v;
                u.a aVar = uVar.f723f;
                aVar.a();
                if (!aVar.f729y) {
                    aVar.f724t = surfaceRequest;
                    aVar.f726v = jVar;
                    Size resolution = surfaceRequest.getResolution();
                    aVar.s = resolution;
                    aVar.f728x = false;
                    if (!aVar.b()) {
                        Logger.d("SurfaceViewImpl", "Wait for new Surface creation.");
                        aVar.f730z.f722e.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
                        break;
                    }
                } else {
                    aVar.f729y = false;
                    surfaceRequest.invalidate();
                    break;
                }
                break;
            default:
                WebViewActivity.deliverPhotoFile$lambda$16$lambda$14((WebViewActivity) this.f716t, (String) this.f717u, (String) this.f718v);
                break;
        }
    }
}

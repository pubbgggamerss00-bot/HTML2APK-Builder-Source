package androidx.camera.camera2.interop;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.view.j;
import androidx.camera.view.x;
import com.htmltoapk.template.WebViewActivity;
import g.f;
import org.json.JSONException;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f488t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f489u;

    public /* synthetic */ d(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f488t = obj;
        this.f489u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                ((Camera2CameraControl) this.f488t).lambda$setCaptureRequestOptions$0((b.a) this.f489u);
                return;
            case 1:
                SurfaceRequest.lambda$provideSurface$5((t0.a) this.f488t, (Surface) this.f489u);
                return;
            case 2:
                ((ConstantObservable) this.f488t).lambda$addObserver$0((Observable.Observer) this.f489u);
                return;
            case 3:
                ((DualSurfaceProcessor) this.f488t).lambda$onInputSurface$1((SurfaceRequest) this.f489u);
                return;
            case 4:
                x xVar = (x) this.f488t;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f489u;
                SurfaceRequest surfaceRequest2 = xVar.h;
                if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
                    xVar.h = null;
                    xVar.f736g = null;
                }
                j jVar = xVar.f740l;
                if (jVar != null) {
                    jVar.a();
                    xVar.f740l = null;
                    return;
                }
                return;
            case 5:
                WebViewActivity.saveBytesToDownloads$lambda$102((WebViewActivity) this.f488t, (String) this.f489u);
                return;
            default:
                f.c cVar = (f.c) this.f488t;
                Runnable runnable = (Runnable) this.f489u;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.a();
                }
        }
    }
}

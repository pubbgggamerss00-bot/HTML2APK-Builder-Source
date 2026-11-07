package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.htmltoapk.template.WebViewActivity;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import w2.n0;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements ImageReaderProxy.OnImageAvailableListener, b.c, p5.l {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f499t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f500u;

    public /* synthetic */ b0(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f499t = obj;
        this.f500u = obj2;
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 1:
                return SurfaceRequest.lambda$new$0((AtomicReference) this.f499t, (String) this.f500u, aVar);
            case 2:
                return ((InternalImageProcessor) this.f499t).lambda$safeProcess$1((ImageProcessor.Request) this.f500u, aVar);
            case 3:
                return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17((ProcessCameraProvider) this.f499t, (CameraX) this.f500u, aVar);
            default:
                androidx.camera.view.x xVar = (androidx.camera.view.x) this.f499t;
                Surface surface = (Surface) this.f500u;
                Logger.d("TextureViewImpl", "Surface set on Preview.");
                xVar.h.provideSurface(surface, CameraXExecutors.directExecutor(), new androidx.camera.view.v(0, aVar));
                return "provideSurface[request=" + xVar.h + " surface=" + surface + "]";
        }
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return WebViewActivity.onCreate$lambda$51((WebViewActivity) this.f499t, (n0) this.f500u, (File) obj);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ((SafeCloseImageReaderProxy) this.f499t).lambda$setOnImageAvailableListener$1((ImageReaderProxy.OnImageAvailableListener) this.f500u, imageReaderProxy);
    }
}

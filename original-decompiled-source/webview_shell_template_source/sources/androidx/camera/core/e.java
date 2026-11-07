package androidx.camera.core;

import android.graphics.drawable.Drawable;
import android.webkit.PermissionRequest;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import com.google.android.material.button.MaterialButton;
import com.htmltoapk.template.AndroidAPI;
import com.htmltoapk.template.WebViewActivity;
import org.json.JSONException;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f504t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f505u;

    public /* synthetic */ e(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f504t = obj;
        this.f505u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i6 = this.s;
        Object obj = this.f505u;
        Object obj2 = this.f504t;
        switch (i6) {
            case 0:
                ((CameraX) obj2).lambda$shutdownInternal$3((b.a) obj);
                break;
            case 1:
                ((MetadataImageReader) obj2).lambda$enqueueImageProxy$1((ImageReaderProxy.OnImageAvailableListener) obj);
                break;
            case 2:
                ((TakePictureRequest) obj2).lambda$onResult$1((ImageCapture.OutputFileResults) obj);
                break;
            case 3:
                ((DualSurfaceProcessor) obj2).lambda$onOutputSurface$3((SurfaceOutput) obj);
                break;
            case 4:
                int[] iArr = MaterialButton.f12105i0;
                ((MaterialButton) obj2).setIcon((Drawable) obj);
                break;
            case 5:
                AndroidAPI.emit$lambda$115((AndroidAPI) obj2, (String) obj);
                break;
            case 6:
                WebViewActivity.deliverPhotoFile$lambda$16$lambda$13((WebViewActivity) obj2, (String) obj);
                break;
            default:
                WebViewActivity.AnonymousClass14.onPermissionRequest$lambda$3((PermissionRequest) obj2, (WebViewActivity) obj);
                break;
        }
    }
}

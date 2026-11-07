package androidx.activity;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.htmltoapk.template.AdMobBridge;
import com.htmltoapk.template.WebViewActivity;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f82t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f83u;

    public /* synthetic */ p(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f82t = obj;
        this.f83u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                ((ComponentActivity) this.f82t).addObserverForBackInvoker((OnBackPressedDispatcher) this.f83u);
                break;
            case 1:
                ((SurfaceRequest.TransformationInfoListener) this.f82t).onTransformationInfoUpdate((SurfaceRequest.TransformationInfo) this.f83u);
                break;
            case 2:
                ((SurfaceProcessorWithExecutor) this.f82t).lambda$onOutputSurface$1((SurfaceOutput) this.f83u);
                break;
            case 3:
                AdMobBridge.initializeSdkOnce$lambda$11$lambda$10((AdMobBridge) this.f82t, (InitializationStatus) this.f83u);
                break;
            case 4:
                WebViewActivity.startCameraPreview$lambda$81((c5.a) this.f82t, (WebViewActivity) this.f83u);
                break;
            default:
                WebViewActivity.onCreate$lambda$56((WebViewActivity) this.f82t, (String) this.f83u);
                break;
        }
    }
}

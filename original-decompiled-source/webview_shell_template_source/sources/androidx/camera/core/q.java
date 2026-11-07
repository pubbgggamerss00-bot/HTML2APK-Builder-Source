package androidx.camera.core;

import android.webkit.WebView;
import androidx.camera.core.ImageCapture;
import com.htmltoapk.template.AndroidAPI;
import com.htmltoapk.template.WebViewActivity;
import java.io.File;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f639t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f641v;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f639t = obj;
        this.f640u = obj2;
        this.f641v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                ((ImageCapture) this.f639t).lambda$takePicture$1((Executor) this.f640u, (ImageCapture.OnImageCapturedCallback) this.f641v);
                break;
            case 1:
                AndroidAPI.getAudioFileBase64$lambda$74((AndroidAPI) this.f639t, (String) this.f640u, (String) this.f641v);
                break;
            case 2:
                AndroidAPI.downloadBlobUrlIn$lambda$132((WebView) this.f639t, (AndroidAPI) this.f640u, (String) this.f641v);
                break;
            default:
                WebViewActivity.deliverPhotoFile$lambda$16((File) this.f639t, (WebViewActivity) this.f640u, (String) this.f641v);
                break;
        }
    }
}

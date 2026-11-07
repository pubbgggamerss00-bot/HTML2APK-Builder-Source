package androidx.camera.core.processing;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.camera.core.ImageProcessor;
import com.htmltoapk.template.R;
import com.htmltoapk.template.WebViewActivity;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import w2.y;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f622t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f623u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f624v;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f622t = obj;
        this.f623u = obj2;
        this.f624v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                ((InternalImageProcessor) this.f622t).lambda$safeProcess$0((ImageProcessor.Request) this.f623u, (b.a) this.f624v);
                break;
            case 1:
                ((SurfaceProcessorNode) this.f622t).lambda$sendSurfaceOutputs$0((SurfaceEdge) this.f623u, (Map.Entry) this.f624v);
                break;
            case 2:
                WebViewActivity.createDocumentLauncher$lambda$26$lambda$25$lambda$24((WebViewActivity) this.f622t, (String) this.f623u, (Exception) this.f624v);
                break;
            default:
                ComponentActivity componentActivity = (ComponentActivity) this.f622t;
                Uri uri = (Uri) this.f623u;
                File file = (File) this.f624v;
                if (!componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("application/pdf");
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    intent.putExtra("android.intent.extra.TITLE", file.getName());
                    intent.setClipData(ClipData.newRawUri(file.getName(), uri));
                    intent.addFlags(1);
                    try {
                        componentActivity.startActivity(Intent.createChooser(intent, componentActivity.getString(R.string.pdf_document_share)));
                        break;
                    } catch (Exception e6) {
                        y.a(componentActivity, e6);
                    }
                }
                break;
        }
    }
}

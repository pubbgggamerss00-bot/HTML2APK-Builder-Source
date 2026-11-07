package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import com.htmltoapk.template.AndroidAPI;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f642t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f643u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f644v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f645w;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.s = i6;
        this.f642t = obj;
        this.f643u = obj2;
        this.f644v = obj3;
        this.f645w = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                ((ImageCapture) this.f642t).lambda$takePicture$2((ImageCapture.OutputFileOptions) this.f643u, (Executor) this.f644v, (ImageCapture.OnImageSavedCallback) this.f645w);
                break;
            default:
                AndroidAPI.shareFileFromBase64$lambda$85((String) this.f642t, (AndroidAPI) this.f643u, (String) this.f644v, (String) this.f645w);
                break;
        }
    }
}

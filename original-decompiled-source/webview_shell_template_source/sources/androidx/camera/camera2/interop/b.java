package androidx.camera.camera2.interop;

import androidx.camera.lifecycle.ProcessCameraProvider;
import com.htmltoapk.template.ConsentManager;
import p5.l;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements b.c, o.a, l {
    public final /* synthetic */ Object s;

    public /* synthetic */ b(Object obj) {
        this.s = obj;
    }

    @Override // o.a
    public Object apply(Object obj) {
        return ProcessCameraProvider.Companion.getInstance$lambda$0((l) this.s, obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return ((Camera2CameraControl) this.s).lambda$addCaptureRequestOptions$3(aVar);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return ConsentManager.showPrivacyOptions$lambda$2((ConsentManager) this.s, (String) obj);
    }
}

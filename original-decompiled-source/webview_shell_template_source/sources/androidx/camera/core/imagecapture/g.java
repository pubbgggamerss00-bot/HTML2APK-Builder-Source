package androidx.camera.core.imagecapture;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f523t;

    public /* synthetic */ g(int i6, Object obj) {
        this.s = i6;
        this.f523t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                CaptureNode.lambda$releaseInputResources$4((SafeCloseImageReaderProxy) this.f523t);
                break;
            default:
                ((TakePictureManager) this.f523t).lambda$trackCurrentRequests$0();
                break;
        }
    }
}

package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f532t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f533u;

    public /* synthetic */ n(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f532t = obj;
        this.f533u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((ProcessingRequest) this.f532t).onFinalResult((ImageProxy) this.f533u);
                break;
            default:
                ((TakePictureManager) this.f532t).lambda$trackCurrentRequests$1((RequestWithCallback) this.f533u);
                break;
        }
    }
}

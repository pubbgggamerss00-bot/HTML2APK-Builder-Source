package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImageCaptureException f530t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f531u;

    public /* synthetic */ m(Object obj, ImageCaptureException imageCaptureException, int i6) {
        this.s = i6;
        this.f531u = obj;
        this.f530t = imageCaptureException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((ProcessingRequest) this.f531u).onProcessFailure(this.f530t);
                break;
            default:
                ((TakePictureRequest) this.f531u).lambda$onError$0(this.f530t);
                break;
        }
    }
}

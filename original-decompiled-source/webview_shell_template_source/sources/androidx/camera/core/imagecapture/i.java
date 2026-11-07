package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.CaptureNode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f525t;

    public /* synthetic */ i(int i6, Object obj) {
        this.s = i6;
        this.f525t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((CaptureNode.AnonymousClass1) this.f525t).lambda$onCaptureStarted$0();
                break;
            default:
                ((TakePictureManager) this.f525t).issueNextRequest();
                break;
        }
    }
}

package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.processing.Node;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements t0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Node f522b;

    public /* synthetic */ e(Node node, int i6) {
        this.f521a = i6;
        this.f522b = node;
    }

    @Override // t0.a
    public final void accept(Object obj) {
        switch (this.f521a) {
            case 0:
                ((CaptureNode) this.f522b).sendCaptureError((TakePictureManager.CaptureError) obj);
                break;
            default:
                ((ProcessingNode) this.f522b).lambda$transform$1((ProcessingNode.InputPacket) obj);
                break;
        }
    }
}

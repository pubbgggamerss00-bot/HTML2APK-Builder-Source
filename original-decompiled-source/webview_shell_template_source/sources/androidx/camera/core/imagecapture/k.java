package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.ProcessingNode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f527t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f528u;

    public /* synthetic */ k(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f527t = obj;
        this.f528u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((ProcessingNode) this.f527t).lambda$transform$2((ProcessingNode.InputPacket) this.f528u);
                break;
            case 1:
                ((ProcessingNode) this.f527t).lambda$transform$0((ProcessingNode.InputPacket) this.f528u);
                break;
            default:
                ((TakePictureRequest) this.f527t).lambda$onPostviewBitmapAvailable$4((Bitmap) this.f528u);
                break;
        }
    }
}

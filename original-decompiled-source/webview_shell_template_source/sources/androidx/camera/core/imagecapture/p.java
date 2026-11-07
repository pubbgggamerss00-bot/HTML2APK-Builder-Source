package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f535t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f536u;

    public /* synthetic */ p(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f535t = obj;
        this.f536u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((ProcessingRequest) this.f535t).onPostviewBitmapAvailable((Bitmap) this.f536u);
                break;
            default:
                ((TakePictureRequest) this.f535t).lambda$onResult$2((ImageProxy) this.f536u);
                break;
        }
    }
}

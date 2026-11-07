package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageReaderProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f494t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f495u;

    public /* synthetic */ a(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f494t = obj;
        this.f495u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((AndroidImageReaderProxy) this.f494t).lambda$setOnImageAvailableListener$0((ImageReaderProxy.OnImageAvailableListener) this.f495u);
                break;
            case 1:
                ((Preview) this.f494t).lambda$createPipeline$0((CameraInternal) this.f495u);
                break;
            default:
                SurfaceRequest.lambda$provideSurface$4((t0.a) this.f494t, (Surface) this.f495u);
                break;
        }
    }
}

package androidx.camera.core.processing;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceEdge;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f632t;

    public /* synthetic */ o(int i6, Object obj) {
        this.s = i6;
        this.f632t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((SurfaceEdge.SettableSurface) this.f632t).decrementUseCount();
                break;
            default:
                ((SurfaceRequest) this.f632t).willNotProvideSurface();
                break;
        }
    }
}

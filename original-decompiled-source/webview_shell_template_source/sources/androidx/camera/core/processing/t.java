package androidx.camera.core.processing;

import androidx.camera.core.SurfaceRequest;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f635t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f636u;

    public /* synthetic */ t(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f635t = obj;
        this.f636u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((SurfaceOutputImpl) this.f635t).lambda$requestClose$1((AtomicReference) this.f636u);
                break;
            default:
                ((DefaultSurfaceProcessor) this.f635t).lambda$onInputSurface$2((SurfaceRequest) this.f636u);
                break;
        }
    }
}

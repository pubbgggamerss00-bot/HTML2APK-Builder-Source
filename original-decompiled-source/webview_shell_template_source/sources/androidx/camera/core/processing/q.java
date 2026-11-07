package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f634t;

    public /* synthetic */ q(int i6, Object obj) {
        this.s = i6;
        this.f634t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((SurfaceEdge.SettableSurface) this.f634t).lambda$close$1();
                break;
            case 1:
                ((DefaultSurfaceProcessor) this.f634t).lambda$release$5();
                break;
            default:
                ((SurfaceProcessorNode) this.f634t).lambda$release$2();
                break;
        }
    }
}

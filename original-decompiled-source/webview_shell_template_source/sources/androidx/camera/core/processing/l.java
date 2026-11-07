package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.SurfaceEdge;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f629t;

    public /* synthetic */ l(int i6, Object obj) {
        this.s = i6;
        this.f629t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((SurfaceEdge.SettableSurface) this.f629t).close();
                break;
            case 1:
                DefaultSurfaceProcessor.lambda$snapshot$7((b.a) this.f629t);
                break;
            default:
                ((SurfaceOutput) this.f629t).close();
                break;
        }
    }
}

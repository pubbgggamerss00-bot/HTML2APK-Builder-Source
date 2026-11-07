package androidx.camera.core.processing;

import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int s;

    public /* synthetic */ i(int i6) {
        this.s = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                DefaultSurfaceProcessor.lambda$executeSafely$11();
                break;
            default:
                DualSurfaceProcessor.lambda$executeSafely$7();
                break;
        }
    }
}

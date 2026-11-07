package d1;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable s;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.s.run();
    }
}

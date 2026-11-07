package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f479t;

    public /* synthetic */ y(int i6, Object obj) {
        this.s = i6;
        this.f479t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl) this.f479t).lambda$configAndCloseIfNeeded$0();
                break;
            case 1:
                ((Camera2CameraControlImpl) this.f479t).updateSessionConfigSynchronous();
                break;
            default:
                ((CameraDevice) this.f479t).close();
                break;
        }
    }
}

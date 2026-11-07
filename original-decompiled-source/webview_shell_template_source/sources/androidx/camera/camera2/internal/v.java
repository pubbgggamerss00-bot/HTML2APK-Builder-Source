package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f470t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f471u;

    public /* synthetic */ v(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f470t = obj;
        this.f471u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                Camera2CameraImpl.lambda$configAndClose$2((Surface) this.f470t, (SurfaceTexture) this.f471u);
                break;
            default:
                ((Camera2CameraImpl) this.f470t).lambda$attachUseCases$15((ArrayList) this.f471u);
                break;
        }
    }
}

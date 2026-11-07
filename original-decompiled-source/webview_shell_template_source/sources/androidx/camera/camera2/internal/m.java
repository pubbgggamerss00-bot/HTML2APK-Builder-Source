package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import java.util.ArrayList;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f426t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f427u;

    public /* synthetic */ m(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f426t = obj;
        this.f427u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraControlImpl.CameraControlSessionCallback) this.f426t).lambda$onCaptureCompleted$0((TotalCaptureResult) this.f427u);
                break;
            case 1:
                ((Camera2CameraImpl) this.f426t).lambda$detachUseCases$16((ArrayList) this.f427u);
                break;
            case 2:
                ((Camera2CameraImpl) this.f426t).lambda$isMeteringRepeatingAttached$13((b.a) this.f427u);
                break;
            default:
                ((FocusMeteringControl) this.f426t).lambda$cancelFocusAndMetering$12((b.a) this.f427u);
                break;
        }
    }
}

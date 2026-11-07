package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f464t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f465u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f466v;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f464t = obj;
        this.f465u = obj2;
        this.f466v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl) this.f464t).lambda$isUseCaseAttached$11((b.a) this.f465u, (String) this.f466v);
                break;
            default:
                ((Camera2CameraControlImpl) this.f464t).lambda$addSessionCameraCaptureCallback$8((Executor) this.f465u, (CameraCaptureCallback) this.f466v);
                break;
        }
    }
}

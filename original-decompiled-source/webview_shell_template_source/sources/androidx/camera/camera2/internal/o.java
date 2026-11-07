package androidx.camera.camera2.internal;

import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements b.c {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f442t;

    public /* synthetic */ o(Camera2CameraImpl camera2CameraImpl, int i6) {
        this.s = i6;
        this.f442t = camera2CameraImpl;
    }

    @Override // y.b.c
    public final Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return this.f442t.lambda$release$5(aVar);
            default:
                return this.f442t.lambda$openCameraConfigAndClose$1(aVar);
        }
    }
}

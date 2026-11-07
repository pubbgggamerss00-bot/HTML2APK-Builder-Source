package androidx.camera.camera2.interop;

import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraControl f485t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b.a f486u;

    public /* synthetic */ a(Camera2CameraControl camera2CameraControl, b.a aVar, int i6) {
        this.s = i6;
        this.f485t = camera2CameraControl;
        this.f486u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                this.f485t.lambda$clearCaptureRequestOptions$4(this.f486u);
                break;
            default:
                this.f485t.lambda$addCaptureRequestOptions$2(this.f486u);
                break;
        }
    }
}

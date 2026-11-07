package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f474t;

    public /* synthetic */ x(int i6, Object obj) {
        this.s = i6;
        this.f474t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl) this.f474t).openInternal();
                break;
            case 1:
                ((CaptureSession) this.f474t).lambda$issuePendingCaptureRequest$2();
                break;
            default:
                ((ProcessingCaptureSession) this.f474t).lambda$release$4();
                break;
        }
    }
}

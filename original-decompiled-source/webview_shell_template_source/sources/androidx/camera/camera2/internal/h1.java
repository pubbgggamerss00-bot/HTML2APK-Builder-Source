package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FocusMeteringControl f407t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f408u;

    public /* synthetic */ h1(int i6, long j6, FocusMeteringControl focusMeteringControl) {
        this.s = i6;
        this.f407t = focusMeteringControl;
        this.f408u = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                this.f407t.lambda$executeMeteringAction$10(this.f408u);
                break;
            default:
                this.f407t.lambda$executeMeteringAction$11(this.f408u);
                break;
        }
    }
}

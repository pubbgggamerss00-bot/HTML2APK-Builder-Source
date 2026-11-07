package androidx.camera.camera2.internal;

import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f414t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f415u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f416v;

    public /* synthetic */ j1(FocusMeteringControl focusMeteringControl, boolean z6, b.a aVar) {
        this.f416v = focusMeteringControl;
        this.f415u = z6;
        this.f414t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((FocusMeteringControl) this.f416v).lambda$enableExternalFlashAeMode$4(this.f415u, this.f414t);
                break;
            default:
                ((TorchControl) this.f416v).lambda$enableTorch$1(this.f414t, this.f415u);
                break;
        }
    }

    public /* synthetic */ j1(TorchControl torchControl, b.a aVar, boolean z6) {
        this.f416v = torchControl;
        this.f414t = aVar;
        this.f415u = z6;
    }
}

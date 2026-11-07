package androidx.camera.camera2.internal;

import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements b.c {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f410t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f411u;

    public /* synthetic */ i1(Object obj, boolean z6, int i6) {
        this.s = i6;
        this.f411u = obj;
        this.f410t = z6;
    }

    @Override // y.b.c
    public final Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((FocusMeteringControl) this.f411u).lambda$enableExternalFlashAeMode$5(this.f410t, aVar);
            default:
                return ((TorchControl) this.f411u).lambda$enableTorch$2(this.f410t, aVar);
        }
    }
}

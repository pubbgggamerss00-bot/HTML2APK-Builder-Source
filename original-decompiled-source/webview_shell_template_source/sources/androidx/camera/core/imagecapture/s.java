package androidx.camera.core.imagecapture;

import w2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f537t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f538u;

    public /* synthetic */ s(int i6, int i7, Object obj) {
        this.s = i7;
        this.f538u = obj;
        this.f537t = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((TakePictureRequest) this.f538u).lambda$onCaptureProcessProgressed$3(this.f537t);
                break;
            default:
                t.a aVar = (t.a) this.f538u;
                if (aVar.f15033w == this.f537t) {
                    aVar.f15035y = null;
                    break;
                }
                break;
        }
    }
}

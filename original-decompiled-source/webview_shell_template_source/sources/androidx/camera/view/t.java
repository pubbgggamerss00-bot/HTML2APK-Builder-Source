package androidx.camera.view;

import androidx.camera.core.Logger;
import androidx.camera.view.k;
import androidx.fragment.app.FragmentActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements t0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f721b;

    public /* synthetic */ t(int i6, Object obj) {
        this.f720a = i6;
        this.f721b = obj;
    }

    @Override // t0.a
    public final void accept(Object obj) {
        switch (this.f720a) {
            case 0:
                k.a aVar = (k.a) this.f721b;
                Logger.d("SurfaceViewImpl", "Safe to release surface.");
                if (aVar != null) {
                    ((j) aVar).a();
                    break;
                }
                break;
            default:
                ((FragmentActivity) this.f721b).s.a();
                break;
        }
    }
}

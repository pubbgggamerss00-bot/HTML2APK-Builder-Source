package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.fragment.app.y;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements t0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f732b;

    public /* synthetic */ v(int i6, Object obj) {
        this.f731a = i6;
        this.f732b = obj;
    }

    @Override // t0.a
    public final void accept(Object obj) {
        switch (this.f731a) {
            case 0:
                ((b.a) this.f732b).a((SurfaceRequest.Result) obj);
                break;
            default:
                y yVar = (y) this.f732b;
                i0.h hVar = (i0.h) obj;
                if (yVar.J()) {
                    boolean z6 = hVar.f13305a;
                    yVar.m(false);
                    break;
                }
                break;
        }
    }
}

package androidx.camera.core.processing;

import androidx.camera.core.SurfaceRequest;
import androidx.fragment.app.y;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements t0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f638b;

    public /* synthetic */ u(int i6, Object obj) {
        this.f637a = i6;
        this.f638b = obj;
    }

    @Override // t0.a
    public final void accept(Object obj) {
        switch (this.f637a) {
            case 0:
                SurfaceProcessorNode.lambda$setUpRotationUpdates$1((Map) this.f638b, (SurfaceRequest.TransformationInfo) obj);
                break;
            default:
                y yVar = (y) this.f638b;
                if (yVar.J()) {
                    yVar.h(false);
                    break;
                }
                break;
        }
    }
}

package androidx.camera.core.impl;

import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraFilter;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements CameraFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f540b;

    public /* synthetic */ d(int i6, Object obj) {
        this.f539a = i6;
        this.f540b = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        switch (this.f539a) {
            case 0:
                return ((CameraInfoInternal) this.f540b).lambda$getCameraSelector$0(list);
            default:
                return Camera2CameraCoordinator.lambda$createCameraSelectorById$0((String) this.f540b, list);
        }
    }
}

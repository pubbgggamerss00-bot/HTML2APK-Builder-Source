package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements CameraCharacteristicsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraCharacteristicsCompat f394a;

    public /* synthetic */ e0(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f394a = cameraCharacteristicsCompat;
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        return this.f394a.get(key);
    }
}

package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {
    private static final String TAG = "Camera2DeviceSurfaceManager";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final Map<String, SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap;

    public Camera2DeviceSurfaceManager(Context context, Object obj, Set<String> set) {
        this(context, new CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager.1
            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public CamcorderProfile get(int i6, int i7) {
                return CamcorderProfile.get(i6, i7);
            }

            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public boolean hasProfile(int i6, int i7) {
                return CamcorderProfile.hasProfile(i6, i7);
            }
        }, obj, set);
    }

    private void init(Context context, CameraManagerCompat cameraManagerCompat, Set<String> set) {
        context.getClass();
        for (String str : set) {
            this.mCameraSupportedSurfaceCombinationMap.put(str, new SupportedSurfaceCombination(context, str, cameraManagerCompat, this.mCamcorderProfileHelper));
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecs(int i6, String str, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, boolean z6, boolean z7) {
        androidx.work.j.a("No new use cases to be bound.", !map.isEmpty());
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.getSuggestedStreamSpecifications(i6, list, map, z6, z7);
        }
        throw new IllegalArgumentException(k0.a("No such camera id in supported combination list: ", str));
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public SurfaceConfig transformSurfaceConfig(int i6, String str, int i7, Size size) {
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.transformSurfaceConfig(i6, i7, size);
        }
        return null;
    }

    public Camera2DeviceSurfaceManager(Context context, CamcorderProfileHelper camcorderProfileHelper, Object obj, Set<String> set) {
        this.mCameraSupportedSurfaceCombinationMap = new HashMap();
        camcorderProfileHelper.getClass();
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        init(context, obj instanceof CameraManagerCompat ? (CameraManagerCompat) obj : CameraManagerCompat.from(context), set);
    }
}

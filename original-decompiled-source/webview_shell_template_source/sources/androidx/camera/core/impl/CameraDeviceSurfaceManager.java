package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraDeviceSurfaceManager {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Provider {
        CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set<String> set);
    }

    Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecs(int i6, String str, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, boolean z6, boolean z7);

    SurfaceConfig transformSurfaceConfig(int i6, String str, int i7, Size size);
}

package androidx.camera.core;

import androidx.camera.core.impl.Identifier;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraFilter {
    public static final Identifier DEFAULT_ID = Identifier.create(new Object());

    List<CameraInfo> filter(List<CameraInfo> list);

    default Identifier getIdentifier() {
        return DEFAULT_ID;
    }
}

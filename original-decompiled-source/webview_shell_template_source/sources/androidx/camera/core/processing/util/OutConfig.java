package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class OutConfig {
    public static OutConfig of(SurfaceEdge surfaceEdge) {
        return of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    public abstract Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract Size getSize();

    public abstract int getTargets();

    public abstract UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    public static OutConfig of(int i6, int i7, Rect rect, Size size, int i8, boolean z6) {
        return of(i6, i7, rect, size, i8, z6, false);
    }

    public static OutConfig of(int i6, int i7, Rect rect, Size size, int i8, boolean z6, boolean z7) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i6, i7, rect, size, i8, z6, z7);
    }
}

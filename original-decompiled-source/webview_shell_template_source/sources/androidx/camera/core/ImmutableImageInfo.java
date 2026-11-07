package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ImmutableImageInfo implements ImageInfo {
    public static ImageInfo create(TagBundle tagBundle, long j6, int i6, Matrix matrix) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j6, i6, matrix);
    }

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    public abstract Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    public abstract TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}

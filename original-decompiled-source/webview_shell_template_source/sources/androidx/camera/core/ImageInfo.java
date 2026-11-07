package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ImageInfo {
    int getRotationDegrees();

    default Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }

    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);
}

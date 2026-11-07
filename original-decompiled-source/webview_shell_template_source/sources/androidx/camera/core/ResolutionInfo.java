package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ResolutionInfo {
    private final ResolutionInfoInternal mResolutionInfoInternal;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class ResolutionInfoInternal {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static abstract class Builder {
            public abstract ResolutionInfoInternal build();

            public abstract Builder setCropRect(Rect rect);

            public abstract Builder setResolution(Size size);

            public abstract Builder setRotationDegrees(int i6);
        }

        public abstract Rect getCropRect();

        public abstract Size getResolution();

        public abstract int getRotationDegrees();
    }

    public ResolutionInfo(Size size, Rect rect, int i6) {
        this.mResolutionInfoInternal = new AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder().setResolution(size).setCropRect(rect).setRotationDegrees(i6).build();
    }

    public boolean equals(Object obj) {
        return this.mResolutionInfoInternal.equals(obj);
    }

    public Rect getCropRect() {
        return this.mResolutionInfoInternal.getCropRect();
    }

    public Size getResolution() {
        return this.mResolutionInfoInternal.getResolution();
    }

    public int getRotationDegrees() {
        return this.mResolutionInfoInternal.getRotationDegrees();
    }

    public int hashCode() {
        return this.mResolutionInfoInternal.hashCode();
    }

    public String toString() {
        return this.mResolutionInfoInternal.toString();
    }
}

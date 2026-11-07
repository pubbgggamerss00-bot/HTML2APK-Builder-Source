package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class CameraInputInfo {
        public static CameraInputInfo of(Size size, Rect rect, CameraInternal cameraInternal, int i6, boolean z6) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i6, z6);
        }

        public abstract CameraInternal getCameraInternal();

        public abstract Rect getInputCropRect();

        public abstract Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface EventCode {
        }

        public static Event of(int i6, SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i6, surfaceOutput);
        }

        public abstract int getEventCode();

        public abstract SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    default Matrix getSensorToBufferTransform() {
        return new Matrix();
    }

    Size getSize();

    Surface getSurface(Executor executor, t0.a<Event> aVar);

    int getTargets();

    void updateTransformMatrix(float[] fArr, float[] fArr2);

    default void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z6) {
    }
}

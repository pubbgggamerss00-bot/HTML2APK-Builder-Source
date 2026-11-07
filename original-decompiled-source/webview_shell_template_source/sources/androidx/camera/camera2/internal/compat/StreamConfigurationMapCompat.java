package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.camera.core.Logger;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class StreamConfigurationMapCompat {
    private static final String TAG = "StreamConfigurationMapCompat";
    private final StreamConfigurationMapCompatImpl mImpl;
    private final OutputSizesCorrector mOutputSizesCorrector;
    private final Map<Integer, Size[]> mCachedFormatOutputSizes = new HashMap();
    private final Map<Integer, Size[]> mCachedFormatHighResolutionOutputSizes = new HashMap();
    private final Map<Class<?>, Size[]> mCachedClassOutputSizes = new HashMap();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface StreamConfigurationMapCompatImpl {
        Size[] getHighResolutionOutputSizes(int i6);

        int[] getOutputFormats();

        Size[] getOutputSizes(int i6);

        <T> Size[] getOutputSizes(Class<T> cls);

        StreamConfigurationMap unwrap();
    }

    private StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        this.mImpl = new StreamConfigurationMapCompatApi23Impl(streamConfigurationMap);
        this.mOutputSizesCorrector = outputSizesCorrector;
    }

    public static StreamConfigurationMapCompat toStreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        return new StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }

    public Size[] getHighResolutionOutputSizes(int i6) {
        if (this.mCachedFormatHighResolutionOutputSizes.containsKey(Integer.valueOf(i6))) {
            if (this.mCachedFormatHighResolutionOutputSizes.get(Integer.valueOf(i6)) == null) {
                return null;
            }
            return (Size[]) this.mCachedFormatHighResolutionOutputSizes.get(Integer.valueOf(i6)).clone();
        }
        Size[] highResolutionOutputSizes = this.mImpl.getHighResolutionOutputSizes(i6);
        if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
            highResolutionOutputSizes = this.mOutputSizesCorrector.applyQuirks(highResolutionOutputSizes, i6);
        }
        this.mCachedFormatHighResolutionOutputSizes.put(Integer.valueOf(i6), highResolutionOutputSizes);
        if (highResolutionOutputSizes != null) {
            return (Size[]) highResolutionOutputSizes.clone();
        }
        return null;
    }

    public int[] getOutputFormats() {
        int[] outputFormats = this.mImpl.getOutputFormats();
        if (outputFormats == null) {
            return null;
        }
        return (int[]) outputFormats.clone();
    }

    public Size[] getOutputSizes(int i6) {
        if (this.mCachedFormatOutputSizes.containsKey(Integer.valueOf(i6))) {
            if (this.mCachedFormatOutputSizes.get(Integer.valueOf(i6)) == null) {
                return null;
            }
            return (Size[]) this.mCachedFormatOutputSizes.get(Integer.valueOf(i6)).clone();
        }
        Size[] outputSizes = this.mImpl.getOutputSizes(i6);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrApplyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, i6);
            this.mCachedFormatOutputSizes.put(Integer.valueOf(i6), sizeArrApplyQuirks);
            return (Size[]) sizeArrApplyQuirks.clone();
        }
        Logger.w(TAG, "Retrieved output sizes array is null or empty for format " + i6);
        return outputSizes;
    }

    public StreamConfigurationMap toStreamConfigurationMap() {
        return this.mImpl.unwrap();
    }

    public <T> Size[] getOutputSizes(Class<T> cls) {
        if (this.mCachedClassOutputSizes.containsKey(cls)) {
            if (this.mCachedClassOutputSizes.get(cls) == null) {
                return null;
            }
            return (Size[]) this.mCachedClassOutputSizes.get(cls).clone();
        }
        Size[] outputSizes = this.mImpl.getOutputSizes(cls);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrApplyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, cls);
            this.mCachedClassOutputSizes.put(cls, sizeArrApplyQuirks);
            return (Size[]) sizeArrApplyQuirks.clone();
        }
        Logger.w(TAG, "Retrieved output sizes array is null or empty for class " + cls);
        return outputSizes;
    }
}

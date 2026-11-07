package androidx.camera.core;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;
    public static final ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = new ImageCaptureLatencyEstimate(-1, -1);
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    private final long mCaptureLatencyMillis;
    private final long mProcessingLatencyMillis;
    private final long mTotalCaptureLatencyMillis;

    public ImageCaptureLatencyEstimate(long j6, long j7) {
        this.mCaptureLatencyMillis = j6;
        this.mProcessingLatencyMillis = j7;
        this.mTotalCaptureLatencyMillis = computeTotalCaptureLatencyMillis(j6, j7);
    }

    private long computeTotalCaptureLatencyMillis(long j6, long j7) {
        if (j6 == -1 || j7 == -1) {
            return -1L;
        }
        return j6 + j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCaptureLatencyEstimate)) {
            return false;
        }
        ImageCaptureLatencyEstimate imageCaptureLatencyEstimate = (ImageCaptureLatencyEstimate) obj;
        return this.mCaptureLatencyMillis == imageCaptureLatencyEstimate.getCaptureLatencyMillis() && this.mProcessingLatencyMillis == imageCaptureLatencyEstimate.getProcessingLatencyMillis() && this.mTotalCaptureLatencyMillis == imageCaptureLatencyEstimate.getTotalCaptureLatencyMillis();
    }

    public long getCaptureLatencyMillis() {
        return this.mCaptureLatencyMillis;
    }

    public long getProcessingLatencyMillis() {
        return this.mProcessingLatencyMillis;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.mTotalCaptureLatencyMillis;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mCaptureLatencyMillis), Long.valueOf(this.mProcessingLatencyMillis), Long.valueOf(this.mTotalCaptureLatencyMillis));
    }

    public String toString() {
        return "captureLatencyMillis=" + this.mCaptureLatencyMillis + ", processingLatencyMillis=" + this.mProcessingLatencyMillis + ", totalCaptureLatencyMillis=" + this.mTotalCaptureLatencyMillis;
    }
}

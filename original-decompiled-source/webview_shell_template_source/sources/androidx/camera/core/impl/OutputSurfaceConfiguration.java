package androidx.camera.core.impl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class OutputSurfaceConfiguration {
    public static OutputSurfaceConfiguration create(OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3, OutputSurface outputSurface4) {
        return new AutoValue_OutputSurfaceConfiguration(outputSurface, outputSurface2, outputSurface3, outputSurface4);
    }

    public abstract OutputSurface getImageAnalysisOutputSurface();

    public abstract OutputSurface getImageCaptureOutputSurface();

    public abstract OutputSurface getPostviewOutputSurface();

    public abstract OutputSurface getPreviewOutputSurface();
}

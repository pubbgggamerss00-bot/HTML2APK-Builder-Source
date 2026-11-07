package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.SurfaceCombination;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Camera2CapturePipeline.ResultListener.Checker {
    public static SurfaceCombination a(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        return Camera2CapturePipeline.TorchTask.lambda$preCapture$2(totalCaptureResult);
    }
}

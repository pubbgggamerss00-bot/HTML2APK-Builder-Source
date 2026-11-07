package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Camera2CapturePipeline.ResultListener.Checker, o.a {
    public static String a(StringBuilder sb, int i6, String str) {
        sb.append(i6);
        sb.append(str);
        return sb.toString();
    }

    @Override // o.a
    public Object apply(Object obj) {
        return Camera2CapturePipeline.TorchTask.lambda$preCapture$4((TotalCaptureResult) obj);
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        return Camera2CapturePipeline.Pipeline.lambda$executePreCapture$2(totalCaptureResult);
    }
}

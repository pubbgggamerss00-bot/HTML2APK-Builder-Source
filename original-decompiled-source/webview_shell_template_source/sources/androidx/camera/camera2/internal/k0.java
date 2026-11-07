package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements o.a {
    public final /* synthetic */ int s;

    public /* synthetic */ k0(int i6) {
        this.s = i6;
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    @Override // o.a
    public Object apply(Object obj) {
        switch (this.s) {
            case 0:
                return Camera2CapturePipeline.CameraCapturePipelineImpl.lambda$invokePreCapture$0((TotalCaptureResult) obj);
            default:
                return Camera2CapturePipeline.Pipeline.AnonymousClass1.lambda$preCapture$0((List) obj);
        }
    }
}

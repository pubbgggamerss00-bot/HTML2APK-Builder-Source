package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements o.a {
    public static String a(int i6, String str, String str2) {
        return str + i6 + str2;
    }

    @Override // o.a
    public Object apply(Object obj) {
        return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$11((TotalCaptureResult) obj);
    }
}

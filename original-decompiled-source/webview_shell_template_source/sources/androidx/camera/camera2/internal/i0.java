package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements o.a, RingBuffer.OnRemoveCallback {
    public static StringBuilder a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    @Override // o.a
    public Object apply(Object obj) {
        return Camera2CapturePipeline.AePreCaptureTask.lambda$preCapture$1((Void) obj);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}

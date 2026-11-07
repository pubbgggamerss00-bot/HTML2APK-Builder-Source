package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.ContextUtil;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import p5.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ProcessCameraProvider$Companion$getInstance$1 extends k implements l<CameraX, ProcessCameraProvider> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCameraProvider$Companion$getInstance$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // p5.l
    public final ProcessCameraProvider invoke(CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
        j.d("cameraX", cameraX);
        processCameraProvider.setCameraX(cameraX);
        ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
        Context applicationContext = ContextUtil.getApplicationContext(this.$context);
        j.d("getApplicationContext(context)", applicationContext);
        processCameraProvider2.setContext(applicationContext);
        return ProcessCameraProvider.sAppInstance;
    }
}

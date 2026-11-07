package androidx.camera.lifecycle;

import androidx.camera.core.CameraX;
import kotlin.jvm.internal.k;
import p5.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1 extends k implements l<Void, c5.a<Void>> {
    final /* synthetic */ CameraX $cameraX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1(CameraX cameraX) {
        super(1);
        this.$cameraX = cameraX;
    }

    @Override // p5.l
    public final c5.a<Void> invoke(Void r12) {
        return this.$cameraX.getInitializeFuture();
    }
}

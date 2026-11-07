package androidx.camera.core;

import com.htmltoapk.template.AndroidAPI;
import e2.f;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements o.a, p5.l, f.e {
    @Override // e2.f.e
    public void a(f.d dVar, e2.f fVar) {
        dVar.e();
    }

    @Override // o.a
    public Object apply(Object obj) {
        return ImageCapture.lambda$submitStillCaptureRequest$4((List) obj);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(AndroidAPI.listAppFiles$lambda$91((File) obj));
    }
}

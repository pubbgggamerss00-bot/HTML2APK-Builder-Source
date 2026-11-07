package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import d5.j;
import p5.l;
import u4.g;
import w2.l0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements AsyncFunction, g.d, l {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f653t;

    public /* synthetic */ c(int i6, Object obj) {
        this.s = i6;
        this.f653t = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        switch (this.s) {
            case 0:
                return VirtualCameraControl.lambda$submitStillCaptureRequests$0((c5.a) this.f653t, (CameraCapturePipeline) obj);
            default:
                return ((androidx.camera.view.d) this.f653t).f682d.h();
        }
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        l0 l0Var = (l0) this.f653t;
        int iIntValue = ((Integer) obj).intValue();
        if (l0Var.C) {
            l0Var.f14921v.l(iIntValue);
        }
        return j.f12745a;
    }
}

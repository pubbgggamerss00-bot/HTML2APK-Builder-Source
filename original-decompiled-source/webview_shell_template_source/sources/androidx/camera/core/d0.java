package androidx.camera.core;

import androidx.activity.ComponentActivity;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements b.c, p5.l {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f502t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f503u;

    public /* synthetic */ d0(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f502t = obj;
        this.f503u = obj2;
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((SurfaceRequest) this.f502t).lambda$initialSurfaceRecreationCompleter$6((AtomicReference) this.f503u, aVar);
            default:
                CameraInfo cameraInfo = (CameraInfo) this.f502t;
                ArrayList arrayList = (ArrayList) this.f503u;
                androidx.camera.view.c cVar = new androidx.camera.view.c(aVar, cameraInfo);
                arrayList.add(cVar);
                ((CameraInfoInternal) cameraInfo).addSessionCaptureCallback(CameraXExecutors.directExecutor(), cVar);
                return "waitForCaptureResult";
        }
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        ComponentActivity componentActivity = (ComponentActivity) this.f502t;
        w2.t tVar = (w2.t) this.f503u;
        float fFloatValue = ((Float) obj).floatValue();
        int i6 = tVar.f15016i0;
        int iP = 0;
        if (i6 > 1) {
            int i7 = i6 - 1;
            iP = u5.d.p((int) ((u5.d.o(fFloatValue, 0.0f, 1.0f) * i7) + 0.5f), 0, i7);
        }
        return componentActivity.getString(com.htmltoapk.template.R.string.pdf_document_page_short, Integer.valueOf(iP + 1), Integer.valueOf(tVar.f15016i0));
    }

    public /* synthetic */ d0(androidx.camera.view.d dVar, CameraInfo cameraInfo, ArrayList arrayList) {
        this.s = 1;
        this.f502t = cameraInfo;
        this.f503u = arrayList;
    }
}

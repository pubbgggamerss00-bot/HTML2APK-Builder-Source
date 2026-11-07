package androidx.camera.core.impl;

import android.net.Uri;
import android.view.View;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.streamsharing.VirtualCameraControl;
import androidx.camera.view.x;
import com.google.android.ump.ConsentInformation;
import com.htmltoapk.template.PdfActivity;
import com.htmltoapk.template.WebViewActivity;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import u0.r;
import u0.s0;
import x0.c;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements b.c, AsyncFunction, ConsentInformation.b, d.b, r {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f541t;

    public /* synthetic */ e(int i6, Object obj) {
        this.s = i6;
        this.f541t = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return VirtualCameraControl.lambda$submitStillCaptureRequests$2((c5.a) this.f541t, (Void) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((DeferrableSurface) this.f541t).lambda$new$0(aVar);
            default:
                ((x) this.f541t).f739k.set(aVar);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // d.b
    public void b(Object obj) throws JSONException {
        switch (this.s) {
            case 4:
                PdfActivity.saveLauncher$lambda$0((PdfActivity) this.f541t, (Uri) obj);
                break;
            default:
                WebViewActivity.multiplePermissionsLauncher$lambda$8((WebViewActivity) this.f541t, (Map) obj);
                break;
        }
    }

    @Override // com.google.android.ump.ConsentInformation.b
    public void c() {
        ((p5.a) this.f541t).a();
    }

    @Override // u0.r
    public s0 d(View view, s0 s0Var) {
        x0.c cVar = (x0.c) this.f541t;
        ArrayList<c.InterfaceC0101c> arrayList = cVar.f15114b;
        s0.l lVar = s0Var.f14553a;
        m0.b bVarB = m0.b.b(lVar.f(519), lVar.f(64));
        m0.b bVarB2 = m0.b.b(lVar.g(519), lVar.g(64));
        if (!bVarB.equals(cVar.f15115c) || !bVarB2.equals(cVar.f15116d)) {
            cVar.f15115c = bVarB;
            cVar.f15116d = bVarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(bVarB, bVarB2);
            }
        }
        return s0Var;
    }
}

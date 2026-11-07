package androidx.camera.core;

import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.lifecycle.h;
import com.htmltoapk.template.AdMobBridge;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f661t;

    public /* synthetic */ y(int i6, Object obj) {
        this.s = i6;
        this.f661t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Preview) this.f661t).notifyReset();
                break;
            case 1:
                ((SurfaceRequest) this.f661t).lambda$new$3();
                break;
            case 2:
                ((CameraStateRegistry.OnOpenAvailableListener) this.f661t).onOpenAvailable();
                break;
            case 3:
                ((ScheduledFuture) this.f661t).cancel(true);
                break;
            case 4:
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) this.f661t;
                androidx.lifecycle.n nVar = uVar.f1333x;
                if (uVar.f1329t == 0) {
                    uVar.f1330u = true;
                    nVar.f(h.a.ON_PAUSE);
                }
                if (uVar.s == 0 && uVar.f1330u) {
                    nVar.f(h.a.ON_STOP);
                    uVar.f1331v = true;
                    break;
                }
                break;
            case 5:
                AdMobBridge.resetConsent$lambda$5((AdMobBridge) this.f661t);
                break;
            case 6:
                Toolbar.f fVar = ((Toolbar) this.f661t).f280g0;
                androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f294t;
                if (hVar != null) {
                    hVar.collapseActionView();
                    break;
                }
                break;
            default:
                ((PrintDocumentAdapter.WriteResultCallback) this.f661t).onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                break;
        }
    }
}

package androidx.camera.camera2.interop;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import g.f;
import java.lang.ref.WeakReference;
import q0.i;
import w.b;
import y4.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f487t;

    public /* synthetic */ c(int i6, Object obj) {
        this.s = i6;
        this.f487t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        q0.g gVar;
        Object systemService;
        Context contextE;
        switch (this.s) {
            case 0:
                ((Camera2CameraControl) this.f487t).completeInFlightUpdate();
                break;
            case 1:
                ((CameraStateRegistry.OnConfigureAvailableListener) this.f487t).onConfigureAvailable();
                break;
            case 2:
                ((DualSurfaceProcessor) this.f487t).lambda$release$4();
                break;
            case 3:
                Context context = (Context) this.f487t;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i6 >= 33) {
                            w.b<WeakReference<g.f>> bVar = g.f.f13083y;
                            bVar.getClass();
                            b.a aVar = new b.a();
                            while (true) {
                                if (aVar.hasNext()) {
                                    g.f fVar = (g.f) ((WeakReference) aVar.next()).get();
                                    if (fVar != null && (contextE = fVar.e()) != null) {
                                        systemService = contextE.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            gVar = systemService != null ? new q0.g(new i(f.b.a(systemService))) : q0.g.f14099b;
                            if (gVar.f14100a.f14102a.isEmpty()) {
                                String strB = i0.f.b(context);
                                Object systemService2 = context.getSystemService("locale");
                                if (systemService2 != null) {
                                    f.b.b(systemService2, f.a.a(strB));
                                }
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            gVar = g.f.f13079u;
                            if (gVar == null) {
                            }
                            if (gVar.f14100a.f14102a.isEmpty()) {
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                g.f.f13082x = true;
                break;
            case 4:
                ((Toolbar) this.f487t).n();
                break;
            default:
                k kVar = (k) this.f487t;
                boolean zIsPopupShowing = kVar.h.isPopupShowing();
                kVar.s(zIsPopupShowing);
                kVar.f15264m = zIsPopupShowing;
                break;
        }
    }
}

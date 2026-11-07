package androidx.activity;

import android.print.PrintDocumentAdapter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.processing.SurfaceEdge;
import com.htmltoapk.template.AdMobBridge;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f80t;

    public /* synthetic */ o(int i6, Object obj) {
        this.s = i6;
        this.f80t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!kotlin.jvm.internal.j.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!kotlin.jvm.internal.j.a(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
            case 1:
                ((c5.a) this.f80t).cancel(true);
                return;
            case 2:
                ((SurfaceEdge) this.f80t).lambda$createSurfaceRequest$1();
                return;
            case 3:
                ((DeferrableSurface) this.f80t).decrementUseCount();
                return;
            case 4:
                AdMobBridge.initializeFromJs$lambda$3((AdMobBridge) this.f80t);
                return;
            case 5:
                View view = (View) this.f80t;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 6:
                w2.t tVar = (w2.t) this.f80t;
                tVar.t();
                tVar.i();
                tVar.j();
                return;
            default:
                ((PrintDocumentAdapter.WriteResultCallback) this.f80t).onWriteCancelled();
                return;
        }
    }
}

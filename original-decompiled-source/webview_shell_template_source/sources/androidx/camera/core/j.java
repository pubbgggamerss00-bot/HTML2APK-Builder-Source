package androidx.camera.core;

import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.core.impl.LiveDataObservable;
import com.google.android.material.button.MaterialButton;
import com.htmltoapk.template.WebViewActivity;
import w2.l0;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f568t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f569u;

    public /* synthetic */ j(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f568t = obj;
        this.f569u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.s;
        Object obj = this.f569u;
        Object obj2 = this.f568t;
        switch (i6) {
            case 0:
                ImageAnalysis.lambda$createPipeline$1((SafeCloseImageReaderProxy) obj2, (SafeCloseImageReaderProxy) obj);
                break;
            case 1:
                ((LiveDataObservable) obj2).lambda$fetchData$0((b.a) obj);
                break;
            case 2:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.f12105i0;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.U;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.U = null;
                    materialButton.R = -2.1474836E9f;
                }
                materialButton.requestLayout();
                break;
            case 3:
                WebViewActivity.hideSplash$lambda$109((View) obj2, (WebViewActivity) obj);
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                if (!((l0) obj2).D) {
                    linearLayout.setVisibility(4);
                    break;
                }
                break;
        }
    }
}

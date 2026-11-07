package androidx.camera.core;

import android.net.Uri;
import android.util.Size;
import android.view.View;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.htmltoapk.template.PdfActivity;
import com.htmltoapk.template.WebViewActivity;
import java.util.List;
import org.json.JSONException;
import u0.r;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ResolutionFilter, AsyncFunction, p5.l, d.b, r {
    public final /* synthetic */ Object s;

    public /* synthetic */ l(Object obj) {
        this.s = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15((p5.l) this.s, obj);
    }

    @Override // d.b
    public void b(Object obj) throws JSONException {
        WebViewActivity.pickFileLauncher$lambda$20((WebViewActivity) this.s, (Uri) obj);
    }

    @Override // u0.r
    public s0 d(View view, s0 s0Var) {
        w2.a0 a0Var = (w2.a0) this.s;
        kotlin.jvm.internal.j.e("<unused var>", view);
        a0Var.C.setPadding(a0Var.b(16), a0Var.b(8), a0Var.b(16), a0Var.b(24) + s0Var.f14553a.f(2).f13857d);
        return s0Var;
    }

    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
    public List filter(List list, int i6) {
        return ImageAnalysis.lambda$onMergeConfig$0((Size) this.s, list, i6);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return PdfActivity.onCreate$lambda$4((PdfActivity) this.s, (androidx.activity.f0) obj);
    }
}

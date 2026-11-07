package androidx.camera.core.impl.utils.futures;

import androidx.camera.view.PreviewView;
import com.google.android.material.internal.CheckableImageButton;
import y.b;
import y4.m;
import y4.s;
import y5.e0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements b.c, o.a, CheckableImageButton.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f553t;

    public /* synthetic */ b(int i6, Object obj) {
        this.s = i6;
        this.f553t = obj;
    }

    @Override // o.a
    public Object apply(Object obj) {
        ((androidx.camera.view.d) this.f553t).a(PreviewView.f.f672t);
        return null;
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return Futures.lambda$transformAsyncOnCompletion$8((c5.a) this.f553t, aVar);
            default:
                e0 e0Var = (e0) this.f553t;
                e0Var.f(false, true, new n1.a(aVar, e0Var));
                return "Deferred.asListenableFuture";
        }
    }

    @Override // com.google.android.material.internal.CheckableImageButton.a
    public void b() {
        s sVar = (s) this.f553t;
        CheckableImageButton checkableImageButton = sVar.f15314v;
        m.e(checkableImageButton, sVar.A, checkableImageButton.getContentDescription());
    }
}

package j2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import com.basitce.htmltoapk.R;
import j2.c3;

/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f14669a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.platform.i a(a aVar, x0.s sVar, f1.b bVar) {
        AndroidComposeView androidComposeView;
        androidx.compose.ui.platform.i iVar;
        if (v2.f14928a.compareAndSet(false, true)) {
            rh.c cVarA = rh.k.a(1, 6, null);
            ph.h.c(ph.j0.a((tg.h) h1.f14729n.getValue()), null, null, new t2(cVarA, null), 3);
            u2 u2Var = new u2(cVarA);
            synchronized (h1.n.f12160c) {
                h1.n.f12166i = qg.x.P(u2Var, h1.n.f12166i);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            h1.n.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(aVar.getContext(), sVar.i());
                aVar.addView(androidComposeView.getView(), f14669a);
            }
            c3.a aVar2 = c3.f14686a;
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            iVar = tag instanceof androidx.compose.ui.platform.i ? (androidx.compose.ui.platform.i) tag : null;
            if (iVar == null) {
                iVar = new androidx.compose.ui.platform.i(androidComposeView, new x0.v(sVar, new i2.r2(androidComposeView.getRoot())));
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, iVar);
            }
            iVar.d(bVar);
            if (!kotlin.jvm.internal.r.a(androidComposeView.getCoroutineContext(), sVar.i())) {
                androidComposeView.setCoroutineContext(sVar.i());
            }
            return iVar;
        }
        aVar.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        c3.a aVar22 = c3.f14686a;
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof androidx.compose.ui.platform.i) {
        }
        if (iVar == null) {
        }
        iVar.d(bVar);
        if (!kotlin.jvm.internal.r.a(androidComposeView.getCoroutineContext(), sVar.i())) {
        }
        return iVar;
    }
}

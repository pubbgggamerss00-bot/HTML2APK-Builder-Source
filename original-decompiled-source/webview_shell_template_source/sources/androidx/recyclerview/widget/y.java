package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y {
    public static int a(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z6) {
        if (mVar.v() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(RecyclerView.m.H(view) - RecyclerView.m.H(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int b(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z6, boolean z7) {
        if (mVar.v() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z7 ? Math.max(0, (xVar.b() - Math.max(RecyclerView.m.H(view), RecyclerView.m.H(view2))) - 1) : Math.max(0, Math.min(RecyclerView.m.H(view), RecyclerView.m.H(view2)));
        if (z6) {
            return Math.round((iMax * (Math.abs(sVar.b(view2) - sVar.e(view)) / (Math.abs(RecyclerView.m.H(view) - RecyclerView.m.H(view2)) + 1))) + (sVar.k() - sVar.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z6) {
        if (mVar.v() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return xVar.b();
        }
        return (int) (((sVar.b(view2) - sVar.e(view)) / (Math.abs(RecyclerView.m.H(view) - RecyclerView.m.H(view2)) + 1)) * xVar.b());
    }
}

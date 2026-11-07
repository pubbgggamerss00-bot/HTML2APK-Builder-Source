package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class z {
    public static int a(v.w wVar, s sVar, View view, View view2, v.l lVar, boolean z10) {
        if (lVar.v() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(v.l.H(view) - v.l.H(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int b(v.w wVar, s sVar, View view, View view2, v.l lVar, boolean z10, boolean z11) {
        if (lVar.v() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (wVar.b() - Math.max(v.l.H(view), v.l.H(view2))) - 1) : Math.max(0, Math.min(v.l.H(view), v.l.H(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(sVar.b(view2) - sVar.e(view)) / (Math.abs(v.l.H(view) - v.l.H(view2)) + 1))) + (sVar.k() - sVar.e(view)));
        }
        return iMax;
    }

    public static int c(v.w wVar, s sVar, View view, View view2, v.l lVar, boolean z10) {
        if (lVar.v() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return wVar.b();
        }
        return (int) (((sVar.b(view2) - sVar.e(view)) / (Math.abs(v.l.H(view) - v.l.H(view2)) + 1)) * wVar.b());
    }
}

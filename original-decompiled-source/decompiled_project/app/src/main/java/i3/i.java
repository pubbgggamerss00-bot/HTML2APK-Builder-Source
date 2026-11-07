package i3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.d;
import o1.q;

/* loaded from: classes.dex */
public final class i {
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(q qVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        p1.e eVarK = qVar.k();
        if (eVarK == null) {
            return null;
        }
        int i10 = (int) eVarK.f21131a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) eVarK.f21132b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) eVarK.f21133c) + i11) - i12, (((int) eVarK.f21134d) + i14) - i15);
    }

    public static final View c(d.c cVar) {
        l lVar = i2.k.f(cVar.f1144a).f13823q;
        View interopView = lVar != null ? lVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}

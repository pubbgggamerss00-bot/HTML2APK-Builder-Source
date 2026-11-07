package androidx.compose.ui.layout;

import g2.k0;
import g2.y;

/* loaded from: classes.dex */
public final class a {
    public static final Object a(k0 k0Var) {
        Object objW = k0Var.w();
        y yVar = objW instanceof y ? (y) objW : null;
        if (yVar != null) {
            return yVar.T();
        }
        return null;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, Object obj) {
        return dVar.h(new LayoutIdElement(obj));
    }
}

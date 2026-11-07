package i2;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class i1 {
    public static final d.c a(j jVar, int i10) {
        d.c cVar = jVar.B().f1149f;
        if (cVar == null || (cVar.f1147d & i10) == 0) {
            return null;
        }
        while (cVar != null) {
            int i11 = cVar.f1146c;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return cVar;
            }
            cVar = cVar.f1149f;
        }
        return null;
    }
}

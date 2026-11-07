package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import g2.j;
import j1.d;
import q1.c1;
import v1.c;

/* loaded from: classes.dex */
public final class b {
    public static d a(d dVar, c cVar, j1.d dVar2, j jVar, float f10, c1 c1Var, int i10) {
        if ((i10 & 4) != 0) {
            dVar2 = d.a.f14606e;
        }
        j1.d dVar3 = dVar2;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        return dVar.h(new PainterElement(cVar, dVar3, jVar, f10, c1Var));
    }
}

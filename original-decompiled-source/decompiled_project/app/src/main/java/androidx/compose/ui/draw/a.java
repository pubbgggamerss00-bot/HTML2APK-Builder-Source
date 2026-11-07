package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import eh.l;
import n1.g;
import n1.k;
import pg.f0;
import s1.c;
import s1.e;

/* loaded from: classes.dex */
public final class a {
    public static final d a(d dVar, l<? super e, f0> lVar) {
        return dVar.h(new DrawBehindElement(lVar));
    }

    public static final d b(d dVar, l<? super g, k> lVar) {
        return dVar.h(new DrawWithCacheElement(lVar));
    }

    public static final d c(d dVar, l<? super c, f0> lVar) {
        return dVar.h(new DrawWithContentElement(lVar));
    }
}

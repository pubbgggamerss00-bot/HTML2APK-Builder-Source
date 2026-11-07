package androidx.lifecycle;

import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class i0 {
    public static final Object a(l lVar, l.b bVar, eh.p pVar, vg.i iVar) {
        Object objC;
        if (bVar != l.b.f2320b) {
            return (lVar.b() != l.b.f2319a && (objC = ph.j0.c(new h0(lVar, bVar, pVar, null), iVar)) == ug.a.f29706a) ? objC : pg.f0.f21461a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}

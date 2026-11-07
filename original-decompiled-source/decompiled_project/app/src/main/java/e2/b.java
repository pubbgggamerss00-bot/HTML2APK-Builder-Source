package e2;

import androidx.compose.ui.d;
import eh.l;

/* loaded from: classes.dex */
public final class b extends d.c implements a {

    /* renamed from: q, reason: collision with root package name */
    public l<? super c, Boolean> f8340q;

    public b() {
        throw null;
    }

    @Override // e2.a
    public final boolean M0(c cVar) {
        return false;
    }

    @Override // e2.a
    public final boolean Z0(c cVar) {
        l<? super c, Boolean> lVar = this.f8340q;
        if (lVar != null) {
            return lVar.invoke(cVar).booleanValue();
        }
        return false;
    }
}

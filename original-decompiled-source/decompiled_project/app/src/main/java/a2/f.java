package a2;

import android.view.KeyEvent;
import androidx.compose.ui.d;
import eh.l;

/* loaded from: classes.dex */
public final class f extends d.c implements e {

    /* renamed from: q, reason: collision with root package name */
    public l<? super c, Boolean> f18q;

    /* renamed from: r, reason: collision with root package name */
    public l<? super c, Boolean> f19r;

    public f() {
        throw null;
    }

    @Override // a2.e
    public final boolean I(KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f19r;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // a2.e
    public final boolean j0(KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f18q;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }
}

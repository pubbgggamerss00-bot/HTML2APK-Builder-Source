package androidx.compose.foundation;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import t.j0;
import x.m;

/* loaded from: classes.dex */
final class FocusableElement extends a1<j0> {

    /* renamed from: b, reason: collision with root package name */
    public final m f788b;

    public FocusableElement(m mVar) {
        this.f788b = mVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new j0(this.f788b, 1, null);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((j0) cVar).Y1(this.f788b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return r.a(this.f788b, ((FocusableElement) obj).f788b);
        }
        return false;
    }

    public final int hashCode() {
        m mVar = this.f788b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }
}

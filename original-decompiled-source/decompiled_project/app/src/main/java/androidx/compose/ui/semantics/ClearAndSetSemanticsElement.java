package androidx.compose.ui.semantics;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import kotlin.jvm.internal.r;
import pg.f0;
import q2.d;
import q2.d0;
import q2.p;

/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends a1<d> implements p {

    /* renamed from: b, reason: collision with root package name */
    public final l<d0, f0> f1375b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(l<? super d0, f0> lVar) {
        this.f1375b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new q2.d(false, true, this.f1375b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((q2.d) cVar).f21763s = this.f1375b;
    }

    @Override // q2.p
    public final q2.l e() {
        q2.l lVar = new q2.l();
        lVar.f21801c = false;
        lVar.f21802d = true;
        this.f1375b.invoke(lVar);
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && r.a(this.f1375b, ((ClearAndSetSemanticsElement) obj).f1375b);
    }

    public final int hashCode() {
        return this.f1375b.hashCode();
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f1375b + ')';
    }
}

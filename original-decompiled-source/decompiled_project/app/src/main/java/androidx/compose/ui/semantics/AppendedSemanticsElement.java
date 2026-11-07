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
public final class AppendedSemanticsElement extends a1<d> implements p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1373b;

    /* renamed from: c, reason: collision with root package name */
    public final l<d0, f0> f1374c;

    public AppendedSemanticsElement(l lVar, boolean z10) {
        this.f1373b = z10;
        this.f1374c = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new q2.d(this.f1373b, false, this.f1374c);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        q2.d dVar = (q2.d) cVar;
        dVar.f21761q = this.f1373b;
        dVar.f21763s = this.f1374c;
    }

    @Override // q2.p
    public final q2.l e() {
        q2.l lVar = new q2.l();
        lVar.f21801c = this.f1373b;
        this.f1374c.invoke(lVar);
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f1373b == appendedSemanticsElement.f1373b && r.a(this.f1374c, appendedSemanticsElement.f1374c);
    }

    public final int hashCode() {
        return this.f1374c.hashCode() + (Boolean.hashCode(this.f1373b) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f1373b + ", properties=" + this.f1374c + ')';
    }
}

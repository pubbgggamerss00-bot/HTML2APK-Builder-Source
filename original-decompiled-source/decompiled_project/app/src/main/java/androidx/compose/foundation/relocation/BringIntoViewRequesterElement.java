package androidx.compose.foundation.relocation;

import androidx.compose.ui.d;
import f0.e;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends a1<e> {

    /* renamed from: b, reason: collision with root package name */
    public final f0.a f1020b;

    public BringIntoViewRequesterElement(f0.a aVar) {
        this.f1020b = aVar;
    }

    @Override // i2.a1
    public final d.c a() {
        e eVar = new e();
        eVar.f8756q = this.f1020b;
        return eVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        e eVar = (e) cVar;
        f0.a aVar = eVar.f8756q;
        if (aVar instanceof f0.d) {
            ((f0.d) aVar).f8755a.j(eVar);
        }
        f0.a aVar2 = this.f1020b;
        if (aVar2 instanceof f0.d) {
            ((f0.d) aVar2).f8755a.b(eVar);
        }
        eVar.f8756q = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return r.a(this.f1020b, ((BringIntoViewRequesterElement) obj).f1020b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1020b.hashCode();
    }
}

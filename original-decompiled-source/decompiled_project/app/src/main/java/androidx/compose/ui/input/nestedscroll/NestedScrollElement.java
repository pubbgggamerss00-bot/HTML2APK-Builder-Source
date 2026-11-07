package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.d;
import b2.b;
import b2.e;
import b2.f;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class NestedScrollElement extends a1<e> {

    /* renamed from: b, reason: collision with root package name */
    public final b2.a f1200b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1201c;

    public NestedScrollElement(b2.a aVar, b bVar) {
        this.f1200b = aVar;
        this.f1201c = bVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new e(this.f1200b, this.f1201c);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        e eVar = (e) cVar;
        eVar.f3518q = this.f1200b;
        b bVar = eVar.f3519r;
        if (bVar.f3507a == eVar) {
            bVar.f3507a = null;
        }
        b bVar2 = this.f1201c;
        if (bVar2 == null) {
            eVar.f3519r = new b();
        } else if (!bVar2.equals(bVar)) {
            eVar.f3519r = bVar2;
        }
        if (eVar.f1157p) {
            b bVar3 = eVar.f3519r;
            bVar3.f3507a = eVar;
            bVar3.f3508b = null;
            eVar.f3520s = null;
            bVar3.f3509c = new f(eVar);
            eVar.f3519r.f3510d = eVar.H1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return r.a(nestedScrollElement.f1200b, this.f1200b) && r.a(nestedScrollElement.f1201c, this.f1201c);
    }

    public final int hashCode() {
        int iHashCode = this.f1200b.hashCode() * 31;
        b bVar = this.f1201c;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}

package androidx.compose.ui.input.rotary;

import androidx.compose.ui.d;
import e2.b;
import e2.c;
import eh.l;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class RotaryInputElement extends a1<b> {

    /* renamed from: b, reason: collision with root package name */
    public final l<c, Boolean> f1208b;

    public RotaryInputElement(l lVar) {
        this.f1208b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        b bVar = new b();
        bVar.f8340q = this.f1208b;
        return bVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((b) cVar).f8340q = this.f1208b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RotaryInputElement) && r.a(this.f1208b, ((RotaryInputElement) obj).f1208b);
    }

    public final int hashCode() {
        l<c, Boolean> lVar = this.f1208b;
        return (lVar == null ? 0 : lVar.hashCode()) * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f1208b + ", onPreRotaryScrollEvent=null)";
    }
}

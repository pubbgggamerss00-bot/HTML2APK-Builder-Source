package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import kotlin.jvm.internal.r;
import n1.h;
import pg.f0;
import s1.e;

/* loaded from: classes.dex */
final class DrawBehindElement extends a1<h> {

    /* renamed from: b, reason: collision with root package name */
    public final l<e, f0> f1159b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(l<? super e, f0> lVar) {
        this.f1159b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        h hVar = new h();
        hVar.f18312q = this.f1159b;
        return hVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((h) cVar).f18312q = this.f1159b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && r.a(this.f1159b, ((DrawBehindElement) obj).f1159b);
    }

    public final int hashCode() {
        return this.f1159b.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f1159b + ')';
    }
}

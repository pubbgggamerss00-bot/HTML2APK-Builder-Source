package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import i2.a1;
import z.w;
import z.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends a1<y> {

    /* renamed from: b, reason: collision with root package name */
    public final w f928b;

    /* renamed from: c, reason: collision with root package name */
    public final float f929c;

    public FillElement(w wVar, float f10) {
        this.f928b = wVar;
        this.f929c = f10;
    }

    @Override // i2.a1
    public final d.c a() {
        y yVar = new y();
        yVar.f34688q = this.f928b;
        yVar.f34689r = this.f929c;
        return yVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        y yVar = (y) cVar;
        yVar.f34688q = this.f928b;
        yVar.f34689r = this.f929c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f928b == fillElement.f928b && this.f929c == fillElement.f929c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f929c) + (this.f928b.hashCode() * 31);
    }
}

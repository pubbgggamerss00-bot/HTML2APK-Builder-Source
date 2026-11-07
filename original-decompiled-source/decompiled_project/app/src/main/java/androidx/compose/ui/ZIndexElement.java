package androidx.compose.ui;

import androidx.compose.ui.d;
import i2.a1;

/* loaded from: classes.dex */
public final class ZIndexElement extends a1<e> {

    /* renamed from: b, reason: collision with root package name */
    public final float f1136b;

    public ZIndexElement(float f10) {
        this.f1136b = f10;
    }

    @Override // i2.a1
    public final d.c a() {
        e eVar = new e();
        eVar.f1173q = this.f1136b;
        return eVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((e) cVar).f1173q = this.f1136b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f1136b, ((ZIndexElement) obj).f1136b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1136b);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("ZIndexElement(zIndex="), this.f1136b, ')');
    }
}

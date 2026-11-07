package h0;

import f3.h;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f12081a;

    public c(float f10) {
        this.f12081a = f10;
    }

    @Override // h0.b
    public final float a(long j10, f3.d dVar) {
        return dVar.N0(this.f12081a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.a(this.f12081a, ((c) obj).f12081a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12081a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f12081a + ".dp)";
    }
}

package y2;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f33707a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33708b;

    public g(int i10, int i11) {
        this.f33707a = i10;
        this.f33708b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        z2.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // y2.i
    public final void a(k kVar) {
        int i10 = kVar.f33739c;
        w wVar = kVar.f33737a;
        int i11 = this.f33708b;
        int iA = i10 + i11;
        if (((i10 ^ iA) & (i11 ^ iA)) < 0) {
            iA = wVar.a();
        }
        kVar.a(kVar.f33739c, Math.min(iA, wVar.a()));
        int i12 = kVar.f33738b;
        int i13 = this.f33707a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        kVar.a(Math.max(0, i14), kVar.f33738b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f33707a == gVar.f33707a && this.f33708b == gVar.f33708b;
    }

    public final int hashCode() {
        return (this.f33707a * 31) + this.f33708b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f33707a);
        sb.append(", lengthAfterCursor=");
        return b.b.a(sb, this.f33708b, ')');
    }
}

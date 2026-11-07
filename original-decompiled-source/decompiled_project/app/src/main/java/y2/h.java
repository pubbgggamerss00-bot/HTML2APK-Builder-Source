package y2;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f33730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33731b;

    public h(int i10, int i11) {
        this.f33730a = i10;
        this.f33731b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        z2.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // y2.i
    public final void a(k kVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < this.f33730a) {
                int i13 = i12 + 1;
                int i14 = kVar.f33738b;
                if (i14 <= i13) {
                    i12 = i14;
                    break;
                } else {
                    i12 = (Character.isHighSurrogate(kVar.b((i14 - i13) + (-1))) && Character.isLowSurrogate(kVar.b(kVar.f33738b - i13))) ? i12 + 2 : i13;
                    i11++;
                }
            } else {
                break;
            }
        }
        int iA = 0;
        while (true) {
            if (i10 >= this.f33731b) {
                break;
            }
            int i15 = iA + 1;
            int i16 = kVar.f33739c;
            w wVar = kVar.f33737a;
            if (i16 + i15 >= wVar.a()) {
                iA = wVar.a() - kVar.f33739c;
                break;
            } else {
                iA = (Character.isHighSurrogate(kVar.b((kVar.f33739c + i15) + (-1))) && Character.isLowSurrogate(kVar.b(kVar.f33739c + i15))) ? iA + 2 : i15;
                i10++;
            }
        }
        int i17 = kVar.f33739c;
        kVar.a(i17, iA + i17);
        int i18 = kVar.f33738b;
        kVar.a(i18 - i12, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f33730a == hVar.f33730a && this.f33731b == hVar.f33731b;
    }

    public final int hashCode() {
        return (this.f33730a * 31) + this.f33731b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f33730a);
        sb.append(", lengthAfterCursor=");
        return b.b.a(sb, this.f33731b, ')');
    }
}

package y2;

/* loaded from: classes.dex */
public final class z implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f33782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33783b;

    public z(int i10, int i11) {
        this.f33782a = i10;
        this.f33783b = i11;
    }

    @Override // y2.i
    public final void a(k kVar) {
        boolean z10 = kVar.f33740d != -1;
        w wVar = kVar.f33737a;
        if (z10) {
            kVar.f33740d = -1;
            kVar.f33741e = -1;
        }
        int iM = jh.j.m(this.f33782a, 0, wVar.a());
        int iM2 = jh.j.m(this.f33783b, 0, wVar.a());
        if (iM != iM2) {
            if (iM < iM2) {
                kVar.e(iM, iM2);
            } else {
                kVar.e(iM2, iM);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f33782a == zVar.f33782a && this.f33783b == zVar.f33783b;
    }

    public final int hashCode() {
        return (this.f33782a * 31) + this.f33783b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f33782a);
        sb.append(", end=");
        return b.b.a(sb, this.f33783b, ')');
    }
}

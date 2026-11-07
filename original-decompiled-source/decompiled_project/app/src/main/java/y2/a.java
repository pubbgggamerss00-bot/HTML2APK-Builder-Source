package y2;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f33675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33676b;

    public a(t2.b bVar, int i10) {
        this.f33675a = bVar;
        this.f33676b = i10;
    }

    @Override // y2.i
    public final void a(k kVar) {
        int i10 = kVar.f33740d;
        t2.b bVar = this.f33675a;
        if (i10 != -1) {
            kVar.d(i10, kVar.f33741e, bVar.f27761b);
        } else {
            kVar.d(kVar.f33738b, kVar.f33739c, bVar.f27761b);
        }
        int i11 = kVar.f33738b;
        int i12 = kVar.f33739c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f33676b;
        int iM = jh.j.m(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - bVar.f27761b.length(), 0, kVar.f33737a.a());
        kVar.f(iM, iM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.r.a(this.f33675a.f27761b, aVar.f33675a.f27761b) && this.f33676b == aVar.f33676b;
    }

    public final int hashCode() {
        return (this.f33675a.f27761b.hashCode() * 31) + this.f33676b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f33675a.f27761b);
        sb.append("', newCursorPosition=");
        return b.b.a(sb, this.f33676b, ')');
    }

    public a(String str, int i10) {
        this(new t2.b(str), i10);
    }
}

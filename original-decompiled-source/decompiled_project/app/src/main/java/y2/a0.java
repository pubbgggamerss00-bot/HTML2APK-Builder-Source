package y2;

/* loaded from: classes.dex */
public final class a0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f33677a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33678b;

    public a0(String str, int i10) {
        this.f33677a = new t2.b(str);
        this.f33678b = i10;
    }

    @Override // y2.i
    public final void a(k kVar) {
        int i10 = kVar.f33740d;
        t2.b bVar = this.f33677a;
        if (i10 != -1) {
            int i11 = kVar.f33741e;
            String str = bVar.f27761b;
            String str2 = bVar.f27761b;
            kVar.d(i10, i11, str);
            if (str2.length() > 0) {
                kVar.e(i10, str2.length() + i10);
            }
        } else {
            int i12 = kVar.f33738b;
            int i13 = kVar.f33739c;
            String str3 = bVar.f27761b;
            String str4 = bVar.f27761b;
            kVar.d(i12, i13, str3);
            if (str4.length() > 0) {
                kVar.e(i12, str4.length() + i12);
            }
        }
        int i14 = kVar.f33738b;
        int i15 = kVar.f33739c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f33678b;
        int iM = jh.j.m(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - bVar.f27761b.length(), 0, kVar.f33737a.a());
        kVar.f(iM, iM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.r.a(this.f33677a.f27761b, a0Var.f33677a.f27761b) && this.f33678b == a0Var.f33678b;
    }

    public final int hashCode() {
        return (this.f33677a.f27761b.hashCode() * 31) + this.f33678b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f33677a.f27761b);
        sb.append("', newCursorPosition=");
        return b.b.a(sb, this.f33678b, ')');
    }
}

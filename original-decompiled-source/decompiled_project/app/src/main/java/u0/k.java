package u0;

import j1.f;

/* loaded from: classes.dex */
public final class k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final f.b f29043a;

    /* renamed from: b, reason: collision with root package name */
    public final f.b f29044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29045c;

    public k(f.b bVar, f.b bVar2, int i10) {
        this.f29043a = bVar;
        this.f29044b = bVar2;
        this.f29045c = i10;
    }

    @Override // u0.s0
    public final int a(f3.n nVar, long j10, int i10) {
        int iA = this.f29044b.a(0, nVar.b());
        return nVar.f8823b + iA + (-this.f29043a.a(0, i10)) + this.f29045c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f29043a.equals(kVar.f29043a) && this.f29044b.equals(kVar.f29044b) && this.f29045c == kVar.f29045c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29045c) + r.z1.a(this.f29044b.f14622a, Float.hashCode(this.f29043a.f14622a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.f29043a);
        sb.append(", anchorAlignment=");
        sb.append(this.f29044b);
        sb.append(", offset=");
        return b.b.a(sb, this.f29045c, ')');
    }
}

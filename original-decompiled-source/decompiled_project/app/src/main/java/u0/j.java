package u0;

import j1.f;

/* loaded from: classes.dex */
public final class j implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f29031a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f29032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29033c;

    public j(f.a aVar, f.a aVar2, int i10) {
        this.f29031a = aVar;
        this.f29032b = aVar2;
        this.f29033c = i10;
    }

    @Override // u0.r0
    public final int a(f3.n nVar, long j10, int i10, f3.r rVar) {
        int iA = this.f29032b.a(0, nVar.d(), rVar);
        int i11 = -this.f29031a.a(0, i10, rVar);
        f3.r rVar2 = f3.r.f8828a;
        int i12 = this.f29033c;
        if (rVar != rVar2) {
            i12 = -i12;
        }
        return m.a.a(nVar.f8822a, iA, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f29031a.equals(jVar.f29031a) && this.f29032b.equals(jVar.f29032b) && this.f29033c == jVar.f29033c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29033c) + r.z1.a(this.f29032b.f14621a, Float.hashCode(this.f29031a.f14621a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.f29031a);
        sb.append(", anchorAlignment=");
        sb.append(this.f29032b);
        sb.append(", offset=");
        return b.b.a(sb, this.f29033c, ')');
    }
}

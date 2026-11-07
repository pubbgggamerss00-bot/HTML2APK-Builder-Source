package mf;

/* loaded from: classes2.dex */
public final class m implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f18219a;

    public m(cf.d dVar) {
        this.f18219a = dVar;
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f18219a;
    }

    public final String a() {
        return this.f18219a.J0(cf.l.E1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        cf.l lVar = cf.l.V1;
        cf.d dVar = this.f18219a;
        sb.append(dVar.J0(lVar));
        sb.append("-");
        sb.append(a());
        sb.append("-");
        sb.append(dVar.G0(cf.l.f5513r2, null, -1));
        return sb.toString();
    }
}

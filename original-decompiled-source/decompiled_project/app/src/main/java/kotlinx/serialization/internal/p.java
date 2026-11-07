package kotlinx.serialization.internal;

import bi.l;
import bi.m;
import x0.s1;

/* loaded from: classes2.dex */
public final class p extends n0 {

    /* renamed from: l, reason: collision with root package name */
    public final l.b f16402l;

    /* renamed from: m, reason: collision with root package name */
    public final pg.s f16403m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(final String name, final int i10) {
        super(name, null, i10);
        kotlin.jvm.internal.r.e(name, "name");
        this.f16402l = l.b.f4277a;
        this.f16403m = e9.w0.b(new eh.a() { // from class: kotlinx.serialization.internal.o
            @Override // eh.a
            public final Object invoke() {
                int i11 = i10;
                bi.f[] fVarArr = new bi.f[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    fVarArr[i12] = bi.k.d(name + '.' + this.f16392e[i12], m.d.f4281a, new bi.f[0], new bi.j());
                }
                return fVarArr;
            }
        });
    }

    @Override // kotlinx.serialization.internal.n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bi.f)) {
            return false;
        }
        bi.f fVar = (bi.f) obj;
        return fVar.getKind() == l.b.f4277a && kotlin.jvm.internal.r.a(this.f16388a, fVar.a()) && kotlin.jvm.internal.r.a(l0.a(this), l0.a(fVar));
    }

    @Override // kotlinx.serialization.internal.n0, bi.f
    public final bi.l getKind() {
        return this.f16402l;
    }

    @Override // kotlinx.serialization.internal.n0, bi.f
    public final bi.f h(int i10) {
        return ((bi.f[]) this.f16403m.getValue())[i10];
    }

    @Override // kotlinx.serialization.internal.n0
    public final int hashCode() {
        int iHashCode = this.f16388a.hashCode();
        bi.h hVar = new bi.h(this);
        int iHashCode2 = 1;
        while (hVar.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) hVar.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.n0
    public final String toString() {
        return qg.x.I(new bi.i(this), ", ", s1.a(new StringBuilder(), this.f16388a, '('), ")", null, 56);
    }
}

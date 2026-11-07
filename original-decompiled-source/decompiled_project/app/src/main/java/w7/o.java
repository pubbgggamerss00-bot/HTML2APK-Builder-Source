package w7;

import r.o2;
import r7.c;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    public final g7.l f31411a;

    /* renamed from: b, reason: collision with root package name */
    public final f f31412b;

    /* renamed from: c, reason: collision with root package name */
    public final j7.f f31413c;

    /* renamed from: d, reason: collision with root package name */
    public final c.b f31414d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31415e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31416f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31417g;

    public o(g7.l lVar, f fVar, j7.f fVar2, c.b bVar, String str, boolean z10, boolean z11) {
        this.f31411a = lVar;
        this.f31412b = fVar;
        this.f31413c = fVar2;
        this.f31414d = bVar;
        this.f31415e = str;
        this.f31416f = z10;
        this.f31417g = z11;
    }

    @Override // w7.i
    public final f a() {
        return this.f31412b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.r.a(this.f31411a, oVar.f31411a) && kotlin.jvm.internal.r.a(this.f31412b, oVar.f31412b) && this.f31413c == oVar.f31413c && kotlin.jvm.internal.r.a(this.f31414d, oVar.f31414d) && kotlin.jvm.internal.r.a(this.f31415e, oVar.f31415e) && this.f31416f == oVar.f31416f && this.f31417g == oVar.f31417g;
    }

    public final int hashCode() {
        int iHashCode = (this.f31413c.hashCode() + ((this.f31412b.hashCode() + (this.f31411a.hashCode() * 31)) * 31)) * 31;
        c.b bVar = this.f31414d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f31415e;
        return Boolean.hashCode(this.f31417g) + o2.a((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f31416f);
    }

    public final String toString() {
        return "SuccessResult(image=" + this.f31411a + ", request=" + this.f31412b + ", dataSource=" + this.f31413c + ", memoryCacheKey=" + this.f31414d + ", diskCacheKey=" + this.f31415e + ", isSampled=" + this.f31416f + ", isPlaceholderCached=" + this.f31417g + ')';
    }
}

package v1;

import f3.m;
import f3.p;
import f3.q;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.c1;
import q1.n1;
import r.e2;
import s1.e;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: f, reason: collision with root package name */
    public final n1 f30532f;

    /* renamed from: g, reason: collision with root package name */
    public final long f30533g;

    /* renamed from: h, reason: collision with root package name */
    public int f30534h = 1;

    /* renamed from: j, reason: collision with root package name */
    public final long f30535j;

    /* renamed from: k, reason: collision with root package name */
    public float f30536k;

    /* renamed from: l, reason: collision with root package name */
    public c1 f30537l;

    public a(n1 n1Var, long j10) {
        int i10;
        int i11;
        this.f30532f = n1Var;
        this.f30533g = j10;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (j10 >> 32)) < 0 || (i11 = (int) (BodyPartID.bodyIdMax & j10)) < 0 || i10 > n1Var.a() || i11 > n1Var.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f30535j = j10;
        this.f30536k = 1.0f;
    }

    @Override // v1.c
    public final boolean a(float f10) {
        this.f30536k = f10;
        return true;
    }

    @Override // v1.c
    public final boolean e(c1 c1Var) {
        this.f30537l = c1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.a(this.f30532f, aVar.f30532f) && m.b(0L, 0L) && p.b(this.f30533g, aVar.f30533g) && this.f30534h == aVar.f30534h;
    }

    @Override // v1.c
    public final long h() {
        return q.e(this.f30535j);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30534h) + e2.a(e2.a(this.f30532f.hashCode() * 31, 31, 0L), 31, this.f30533g);
    }

    @Override // v1.c
    public final void i(e eVar) {
        e.e1(eVar, this.f30532f, 0L, this.f30533g, 0L, (Math.round(Float.intBitsToFloat((int) (eVar.i() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (eVar.i() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), this.f30536k, null, this.f30537l, 0, this.f30534h, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f30532f);
        sb.append(", srcOffset=");
        sb.append((Object) m.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) p.c(this.f30533g));
        sb.append(", filterQuality=");
        int i10 = this.f30534h;
        sb.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}

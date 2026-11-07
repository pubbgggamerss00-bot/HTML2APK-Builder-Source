package u0;

import com.yalantis.ucrop.view.CropImageView;
import j1.f;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class z1 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final f.b f29194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29195b;

    public z1(f.b bVar, int i10) {
        this.f29194a = bVar;
        this.f29195b = i10;
    }

    @Override // u0.s0
    public final int a(f3.n nVar, long j10, int i10) {
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        int i12 = this.f29195b;
        if (i10 < i11 - (i12 * 2)) {
            return jh.j.m(this.f29194a.a(i10, i11), i12, (i11 - i12) - i10);
        }
        return org.bouncycastle.asn1.x509.a.a(1, CropImageView.DEFAULT_ASPECT_RATIO, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f29194a.equals(z1Var.f29194a) && this.f29195b == z1Var.f29195b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29195b) + (Float.hashCode(this.f29194a.f14622a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.f29194a);
        sb.append(", margin=");
        return b.b.a(sb, this.f29195b, ')');
    }
}

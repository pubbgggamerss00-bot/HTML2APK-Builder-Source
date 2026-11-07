package u0;

import com.yalantis.ucrop.view.CropImageView;
import j1.e;

/* loaded from: classes.dex */
public final class y1 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f29184a;

    public y1(e.a aVar) {
        this.f29184a = aVar;
    }

    @Override // u0.r0
    public final int a(f3.n nVar, long j10, int i10, f3.r rVar) {
        int i11 = (int) (j10 >> 32);
        if (i10 < i11) {
            return jh.j.m(this.f29184a.a(i10, i11, rVar), 0, i11 - i10);
        }
        float f10 = (i11 - i10) / 2.0f;
        f3.r rVar2 = f3.r.f8828a;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (rVar != rVar2) {
            f11 = CropImageView.DEFAULT_ASPECT_RATIO * (-1);
        }
        return org.bouncycastle.asn1.x509.a.a(1, f11, f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && this.f29184a.equals(((y1) obj).f29184a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f29184a.f14618a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f29184a + ", margin=0)";
    }
}

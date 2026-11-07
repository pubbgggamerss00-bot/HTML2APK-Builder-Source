package p1;

import b8.n;
import com.yalantis.ucrop.view.CropImageView;
import j1.l;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r.e2;
import r.z1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f21135a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21136b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21137c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21138d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21139e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21140f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21141g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21142h;

    static {
        l.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0L);
    }

    public g(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f21135a = f10;
        this.f21136b = f11;
        this.f21137c = f12;
        this.f21138d = f13;
        this.f21139e = j10;
        this.f21140f = j11;
        this.f21141g = j12;
        this.f21142h = j13;
    }

    public final float a() {
        return this.f21138d - this.f21136b;
    }

    public final float b() {
        return this.f21137c - this.f21135a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f21135a, gVar.f21135a) == 0 && Float.compare(this.f21136b, gVar.f21136b) == 0 && Float.compare(this.f21137c, gVar.f21137c) == 0 && Float.compare(this.f21138d, gVar.f21138d) == 0 && b8.h.a(this.f21139e, gVar.f21139e) && b8.h.a(this.f21140f, gVar.f21140f) && b8.h.a(this.f21141g, gVar.f21141g) && b8.h.a(this.f21142h, gVar.f21142h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f21142h) + e2.a(e2.a(e2.a(z1.a(this.f21138d, z1.a(this.f21137c, z1.a(this.f21136b, Float.hashCode(this.f21135a) * 31, 31), 31), 31), 31, this.f21139e), 31, this.f21140f), 31, this.f21141g);
    }

    public final String toString() {
        String str = n.e(this.f21135a) + ", " + n.e(this.f21136b) + ", " + n.e(this.f21137c) + ", " + n.e(this.f21138d);
        long j10 = this.f21139e;
        long j11 = this.f21140f;
        boolean zA = b8.h.a(j10, j11);
        long j12 = this.f21141g;
        long j13 = this.f21142h;
        if (!zA || !b8.h.a(j11, j12) || !b8.h.a(j12, j13)) {
            StringBuilder sbA = e.e.a("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) b8.h.b(j10));
            sbA.append(", topRight=");
            sbA.append((Object) b8.h.b(j11));
            sbA.append(", bottomRight=");
            sbA.append((Object) b8.h.b(j12));
            sbA.append(", bottomLeft=");
            sbA.append((Object) b8.h.b(j13));
            sbA.append(')');
            return sbA.toString();
        }
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        if (fIntBitsToFloat == Float.intBitsToFloat(i11)) {
            StringBuilder sbA2 = e.e.a("RoundRect(rect=", str, ", radius=");
            sbA2.append(n.e(Float.intBitsToFloat(i10)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = e.e.a("RoundRect(rect=", str, ", x=");
        sbA3.append(n.e(Float.intBitsToFloat(i10)));
        sbA3.append(", y=");
        sbA3.append(n.e(Float.intBitsToFloat(i11)));
        sbA3.append(')');
        return sbA3.toString();
    }
}

package r1;

import c2.n0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r.e2;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23072a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23074c;

    public c(String str, long j10, int i10) {
        this.f23072a = str;
        this.f23073b = j10;
        this.f23074c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i10);

    public abstract float c(int i10);

    public boolean d() {
        return false;
    }

    public long e(float f10, float f11, float f12) {
        float[] fArrF = f(new float[]{f10, f11, f12});
        return (Float.floatToRawIntBits(fArrF[0]) << 32) | (Float.floatToRawIntBits(fArrF[1]) & BodyPartID.bodyIdMax);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23074c == cVar.f23074c && kotlin.jvm.internal.r.a(this.f23072a, cVar.f23072a)) {
            return b.a(this.f23073b, cVar.f23073b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f10, float f11, float f12) {
        return f(new float[]{f10, f11, f12})[2];
    }

    public long h(float f10, float f11, float f12, float f13, c cVar) {
        int i10 = b.f23069e;
        float[] fArr = new float[(int) (this.f23073b >> 32)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        float[] fArrA = a(fArr);
        return n0.a(fArrA[0], fArrA[1], fArrA[2], f13, cVar);
    }

    public int hashCode() {
        int iHashCode = this.f23072a.hashCode() * 31;
        int i10 = b.f23069e;
        return e2.a(iHashCode, 31, this.f23073b) + this.f23074c;
    }

    public final String toString() {
        return this.f23072a + " (id=" + this.f23074c + ", model=" + ((Object) b.b(this.f23073b)) + ')';
    }
}

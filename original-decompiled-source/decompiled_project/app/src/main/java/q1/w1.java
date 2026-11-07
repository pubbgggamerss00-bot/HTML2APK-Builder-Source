package q1;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class w1 extends d2 {

    /* renamed from: c, reason: collision with root package name */
    public final List<b1> f21743c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21744d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21745e;

    public w1(float f10, long j10, List list) {
        this.f21743c = list;
        this.f21744d = j10;
        this.f21745e = f10;
    }

    @Override // q1.d2
    public final Shader b(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.f21744d;
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            long jD = d0.h.d(j10);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & BodyPartID.bodyIdMax));
        } else {
            int i10 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j10 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j11 & BodyPartID.bodyIdMax);
            if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
                i11 = (int) (j10 & BodyPartID.bodyIdMax);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.f21745e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = p1.h.c(j10) / 2;
        }
        float f10 = fC;
        List<b1> list = this.f21743c;
        m0.a(list, null);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = c2.n0.j(list.get(i12).f21656a);
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f10, iArr, (float[]) null, n0.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return kotlin.jvm.internal.r.a(this.f21743c, w1Var.f21743c) && p1.c.b(this.f21744d, w1Var.f21744d) && this.f21745e == w1Var.f21745e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r.z1.a(this.f21745e, r.e2.a(this.f21743c.hashCode() * 961, 31, this.f21744d), 31);
    }

    public final String toString() {
        String str;
        long j10 = this.f21744d;
        String str2 = "";
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            str = "center=" + ((Object) p1.c.i(j10)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f21745e;
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f10 + ", ";
        }
        return "RadialGradient(colors=" + this.f21743c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) j2.a(0)) + ')';
    }
}

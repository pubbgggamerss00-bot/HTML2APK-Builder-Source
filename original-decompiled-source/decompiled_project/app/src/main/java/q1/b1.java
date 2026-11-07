package q1;

import com.yalantis.ucrop.view.CropImageView;
import i0.e4;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21648b = c2.n0.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f21649c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f21650d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f21651e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f21652f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f21653g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f21654h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f21655i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f21656a;

    public static final class a {
        public static long a() {
            return b1.f21653g;
        }

        public static long b() {
            return b1.f21650d;
        }
    }

    static {
        c2.n0.c(4282664004L);
        f21649c = c2.n0.c(4287137928L);
        c2.n0.c(4291611852L);
        f21650d = c2.n0.c(BodyPartID.bodyIdMax);
        f21651e = c2.n0.c(4294901760L);
        c2.n0.c(4278255360L);
        f21652f = c2.n0.c(4278190335L);
        c2.n0.c(4294967040L);
        c2.n0.c(4278255615L);
        c2.n0.c(4294902015L);
        f21653g = c2.n0.b(0);
        f21654h = c2.n0.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, r1.j.f23095u);
    }

    public /* synthetic */ b1(long j10) {
        this.f21656a = j10;
    }

    public static final /* synthetic */ b1 a(long j10) {
        return new b1(j10);
    }

    public static final long b(long j10, r1.c cVar) {
        r1.l lVarD;
        r1.c cVarG = g(j10);
        int i10 = cVarG.f23074c;
        int i11 = cVar.f23074c;
        if ((i10 | i11) < 0) {
            lVarD = r1.d.d(cVarG, cVar);
        } else {
            p.y<r1.l> yVar = r1.m.f23107a;
            int i12 = i10 | (i11 << 6);
            r1.l lVarB = yVar.b(i12);
            if (lVarB == null) {
                lVarB = r1.d.d(cVarG, cVar);
                yVar.h(i12, lVarB);
            }
            lVarD = lVarB;
        }
        return lVarD.a(j10);
    }

    public static long c(float f10, long j10) {
        return c2.n0.a(i(j10), h(j10), f(j10), f10, g(j10));
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final float e(long j10) {
        float fC;
        float f10;
        if ((63 & j10) == 0) {
            fC = (float) e4.c((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fC = (float) e4.c((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fC / f10;
    }

    public static final float f(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) e4.c((j10 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 16) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - j1.f21716a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final r1.c g(long j10) {
        float[] fArr = r1.j.f23075a;
        return r1.j.f23099y[(int) (j10 & 63)];
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) e4.c((j10 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 32) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - j1.f21716a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float i(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) e4.c((j10 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 48) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - j1.f21716a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String j(long j10) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(i(j10));
        sb.append(", ");
        sb.append(h(j10));
        sb.append(", ");
        sb.append(f(j10));
        sb.append(", ");
        sb.append(e(j10));
        sb.append(", ");
        return x0.s1.a(sb, g(j10).f23072a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            return this.f21656a == ((b1) obj).f21656a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21656a);
    }

    public final String toString() {
        return j(this.f21656a);
    }
}

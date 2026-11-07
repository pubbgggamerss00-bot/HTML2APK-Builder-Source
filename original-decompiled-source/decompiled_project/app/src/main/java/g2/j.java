package g2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface j {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0100a f11397a = new C0100a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f11398b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final c f11399c = new c();

        /* renamed from: d, reason: collision with root package name */
        public static final m f11400d = new m();

        /* renamed from: g2.j$a$a, reason: collision with other inner class name */
        public static final class C0100a implements j {
            @Override // g2.j
            public final long a(long j10, long j11) {
                float fMax = Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & BodyPartID.bodyIdMax);
                int i10 = m1.f11408a;
                return jFloatToRawIntBits;
            }
        }

        public static final class b implements j {
            @Override // g2.j
            public final long a(long j10, long j11) {
                float fA = k.a(j10, j11);
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fA) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fA));
                int i10 = m1.f11408a;
                return jFloatToRawIntBits;
            }
        }

        public static final class c implements j {
            @Override // g2.j
            public final long a(long j10, long j11) {
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax))) {
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                    int i10 = m1.f11408a;
                    return jFloatToRawIntBits;
                }
                float fA = k.a(j10, j11);
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA) & BodyPartID.bodyIdMax);
                int i11 = m1.f11408a;
                return jFloatToRawIntBits2;
            }
        }
    }

    long a(long j10, long j11);
}

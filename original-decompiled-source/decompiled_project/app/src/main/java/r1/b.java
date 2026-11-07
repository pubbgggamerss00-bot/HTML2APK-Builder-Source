package r1;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f23065a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f23066b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f23067c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f23068d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23069e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f23065a = (0 & BodyPartID.bodyIdMax) | j11;
        f23066b = (1 & BodyPartID.bodyIdMax) | j11;
        f23067c = j11 | (2 & BodyPartID.bodyIdMax);
        f23068d = (j10 & BodyPartID.bodyIdMax) | (4 << 32);
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return a(j10, f23065a) ? "Rgb" : a(j10, f23066b) ? "Xyz" : a(j10, f23067c) ? "Lab" : a(j10, f23068d) ? "Cmyk" : "Unknown";
    }
}

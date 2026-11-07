package m0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f17345a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f17346b;

    /* renamed from: c, reason: collision with root package name */
    public static final q2.c0<g1> f17347c = new q2.c0<>("SelectionHandleInfo");

    static {
        float f10 = 25;
        f17345a = f10;
        f17346b = f10;
    }

    public static final long a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - 1.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}

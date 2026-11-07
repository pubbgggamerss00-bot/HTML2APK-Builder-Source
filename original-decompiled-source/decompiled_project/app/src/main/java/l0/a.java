package l0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f16563a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16564b = 0;

    public static long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }
}

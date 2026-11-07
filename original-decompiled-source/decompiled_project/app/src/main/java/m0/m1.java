package m0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.p f17414a = new s.p(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final s.o2 f17415b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f17416c;

    /* renamed from: d, reason: collision with root package name */
    public static final s.l1<p1.c> f17417d;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<p1.c, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17418a = new a(1);

        @Override // eh.l
        public final s.p invoke(p1.c cVar) {
            long j10 = cVar.f21129a;
            return (9223372034707292159L & j10) != 9205357640488583168L ? new s.p(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) : m1.f17414a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<s.p, p1.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17419a = new b(1);

        @Override // eh.l
        public final p1.c invoke(s.p pVar) {
            s.p pVar2 = pVar;
            float f10 = pVar2.f23859a;
            float f11 = pVar2.f23860b;
            return new p1.c((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax));
        }
    }

    static {
        s.o2 o2Var = s.p2.f23868a;
        f17415b = new s.o2(a.f17418a, b.f17419a);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & BodyPartID.bodyIdMax);
        f17416c = jFloatToRawIntBits;
        f17417d = new s.l1<>(new p1.c(jFloatToRawIntBits), 3);
    }
}

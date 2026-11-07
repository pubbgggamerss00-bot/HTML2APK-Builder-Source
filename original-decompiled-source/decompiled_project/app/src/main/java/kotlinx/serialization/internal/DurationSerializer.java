package kotlinx.serialization.internal;

import bi.e;
import nh.b;

/* loaded from: classes2.dex */
public final class DurationSerializer implements zh.b<nh.b> {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    private static final bi.f descriptor = new s0("kotlin.time.Duration", e.i.f4260a);

    private DurationSerializer() {
    }

    @Override // zh.a
    public /* synthetic */ Object deserialize(ci.d dVar) {
        return new nh.b(m89deserialize5sfh64U(dVar));
    }

    /* renamed from: deserialize-5sfh64U, reason: not valid java name */
    public long m89deserialize5sfh64U(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        b.a aVar = nh.b.f18809b;
        String value = decoder.r();
        kotlin.jvm.internal.r.e(value, "value");
        try {
            return nh.d.a(value);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(i8.n.d("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* synthetic */ void serialize(ci.e eVar, Object obj) {
        m90serializeHG0u8IE(eVar, ((nh.b) obj).f18812a);
    }

    /* renamed from: serialize-HG0u8IE, reason: not valid java name */
    public void m90serializeHG0u8IE(ci.e encoder, long j10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        b.a aVar = nh.b.f18809b;
        StringBuilder sb = new StringBuilder();
        if (j10 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jI = j10 < 0 ? nh.b.i(j10) : j10;
        long jH = nh.b.h(jI, nh.e.f18818f);
        boolean z10 = false;
        int iH = nh.b.f(jI) ? 0 : (int) (nh.b.h(jI, nh.e.f18817e) % 60);
        int iH2 = nh.b.f(jI) ? 0 : (int) (nh.b.h(jI, nh.e.f18816d) % 60);
        int iE = nh.b.e(jI);
        if (nh.b.f(j10)) {
            jH = 9999999999999L;
        }
        boolean z11 = jH != 0;
        boolean z12 = (iH2 == 0 && iE == 0) ? false : true;
        if (iH != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb.append(jH);
            sb.append('H');
        }
        if (z10) {
            sb.append(iH);
            sb.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            nh.b.b(sb, iH2, iE, 9, kf.a.f16303b, true);
        }
        encoder.N(sb.toString());
    }
}

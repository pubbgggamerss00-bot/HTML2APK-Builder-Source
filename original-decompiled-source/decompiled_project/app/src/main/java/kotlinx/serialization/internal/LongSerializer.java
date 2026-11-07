package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class LongSerializer implements zh.b<Long> {
    public static final LongSerializer INSTANCE = new LongSerializer();
    private static final bi.f descriptor = new s0("kotlin.Long", e.g.f4258a);

    private LongSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).longValue());
    }

    @Override // zh.a
    public Long deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Long.valueOf(decoder.v());
    }

    public void serialize(ci.e encoder, long j10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.K(j10);
    }
}

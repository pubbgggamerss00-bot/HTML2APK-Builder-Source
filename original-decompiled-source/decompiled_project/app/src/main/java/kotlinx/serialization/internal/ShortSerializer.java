package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class ShortSerializer implements zh.b<Short> {
    public static final ShortSerializer INSTANCE = new ShortSerializer();
    private static final bi.f descriptor = new s0("kotlin.Short", e.h.f4259a);

    private ShortSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).shortValue());
    }

    @Override // zh.a
    public Short deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Short.valueOf(decoder.C());
    }

    public void serialize(ci.e encoder, short s10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.l(s10);
    }
}

package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class DoubleSerializer implements zh.b<Double> {
    public static final DoubleSerializer INSTANCE = new DoubleSerializer();
    private static final bi.f descriptor = new s0("kotlin.Double", e.d.f4255a);

    private DoubleSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).doubleValue());
    }

    @Override // zh.a
    public Double deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Double.valueOf(decoder.E());
    }

    public void serialize(ci.e encoder, double d10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.k(d10);
    }
}

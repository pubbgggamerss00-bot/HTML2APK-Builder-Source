package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class FloatSerializer implements zh.b<Float> {
    public static final FloatSerializer INSTANCE = new FloatSerializer();
    private static final bi.f descriptor = new s0("kotlin.Float", e.C0056e.f4256a);

    private FloatSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).floatValue());
    }

    @Override // zh.a
    public Float deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Float.valueOf(decoder.D());
    }

    public void serialize(ci.e encoder, float f10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.r(f10);
    }
}

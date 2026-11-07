package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class NothingSerializer implements zh.b {
    public static final NothingSerializer INSTANCE = new NothingSerializer();
    private static final bi.f descriptor = h0.f16371a;

    private NothingSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public Void deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        throw new zh.h("'kotlin.Nothing' does not have instances");
    }

    @Override // zh.i
    public void serialize(ci.e encoder, Void value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        throw new zh.h("'kotlin.Nothing' cannot be serialized");
    }
}

package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class StringSerializer implements zh.b<String> {
    public static final StringSerializer INSTANCE = new StringSerializer();
    private static final bi.f descriptor = new s0("kotlin.String", e.i.f4260a);

    private StringSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public String deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decoder.r();
    }

    @Override // zh.i
    public void serialize(ci.e encoder, String value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        encoder.N(value);
    }
}

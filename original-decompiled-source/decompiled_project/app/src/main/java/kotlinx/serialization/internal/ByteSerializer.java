package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class ByteSerializer implements zh.b<Byte> {
    public static final ByteSerializer INSTANCE = new ByteSerializer();
    private static final bi.f descriptor = new s0("kotlin.Byte", e.b.f4253a);

    private ByteSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).byteValue());
    }

    @Override // zh.a
    public Byte deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Byte.valueOf(decoder.B());
    }

    public void serialize(ci.e encoder, byte b10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.n(b10);
    }
}

package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class IntSerializer implements zh.b<Integer> {
    public static final IntSerializer INSTANCE = new IntSerializer();
    private static final bi.f descriptor = new s0("kotlin.Int", e.f.f4257a);

    private IntSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Number) obj).intValue());
    }

    @Override // zh.a
    public Integer deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Integer.valueOf(decoder.m());
    }

    public void serialize(ci.e encoder, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.H(i10);
    }
}

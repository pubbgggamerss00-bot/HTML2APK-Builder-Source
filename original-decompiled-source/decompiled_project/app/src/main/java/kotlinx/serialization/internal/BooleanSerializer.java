package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class BooleanSerializer implements zh.b<Boolean> {
    public static final BooleanSerializer INSTANCE = new BooleanSerializer();
    private static final bi.f descriptor = new s0("kotlin.Boolean", e.a.f4252a);

    private BooleanSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Boolean) obj).booleanValue());
    }

    @Override // zh.a
    public Boolean deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Boolean.valueOf(decoder.f());
    }

    public void serialize(ci.e encoder, boolean z10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.o(z10);
    }
}

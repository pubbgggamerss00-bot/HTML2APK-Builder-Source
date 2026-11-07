package kotlinx.serialization.internal;

import bi.e;

/* loaded from: classes2.dex */
public final class CharSerializer implements zh.b<Character> {
    public static final CharSerializer INSTANCE = new CharSerializer();
    private static final bi.f descriptor = new s0("kotlin.Char", e.c.f4254a);

    private CharSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* bridge */ /* synthetic */ void serialize(ci.e eVar, Object obj) {
        serialize(eVar, ((Character) obj).charValue());
    }

    @Override // zh.a
    public Character deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return Character.valueOf(decoder.h());
    }

    public void serialize(ci.e encoder, char c10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.t(c10);
    }
}

package kotlinx.serialization.json;

import bi.l;

/* loaded from: classes2.dex */
public final class JsonNullSerializer implements zh.b<t> {
    public static final JsonNullSerializer INSTANCE = new JsonNullSerializer();
    private static final bi.f descriptor = bi.k.d("kotlinx.serialization.json.JsonNull", l.b.f4277a, new bi.f[0], new bi.j());

    private JsonNullSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public t deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        f9.h.a(decoder);
        if (decoder.x()) {
            throw new di.p("Expected 'null' literal");
        }
        return t.INSTANCE;
    }

    @Override // zh.i
    public void serialize(ci.e encoder, t value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        f9.h.b(encoder);
        encoder.h();
    }
}

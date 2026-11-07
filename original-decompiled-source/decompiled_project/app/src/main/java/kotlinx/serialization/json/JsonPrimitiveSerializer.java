package kotlinx.serialization.json;

import bi.e;
import kotlin.jvm.internal.h0;

/* loaded from: classes2.dex */
public final class JsonPrimitiveSerializer implements zh.b<x> {
    public static final JsonPrimitiveSerializer INSTANCE = new JsonPrimitiveSerializer();
    private static final bi.f descriptor = bi.k.d("kotlinx.serialization.json.JsonPrimitive", e.i.f4260a, new bi.f[0], new bi.j());

    private JsonPrimitiveSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public x deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        h hVarL = f9.h.a(decoder).l();
        if (hVarL instanceof x) {
            return (x) hVarL;
        }
        throw di.t.c(-1, hVarL.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + h0.a(hVarL.getClass()));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, x value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        f9.h.b(encoder);
        if (value instanceof t) {
            encoder.J(JsonNullSerializer.INSTANCE, t.INSTANCE);
        } else {
            encoder.J(JsonLiteralSerializer.INSTANCE, (r) value);
        }
    }
}

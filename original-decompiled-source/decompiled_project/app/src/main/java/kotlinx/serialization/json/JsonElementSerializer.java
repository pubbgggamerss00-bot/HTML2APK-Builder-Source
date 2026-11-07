package kotlinx.serialization.json;

import bi.d;
import bi.m;
import h9.m1;
import pg.f0;

/* loaded from: classes2.dex */
public final class JsonElementSerializer implements zh.b<h> {
    public static final JsonElementSerializer INSTANCE = new JsonElementSerializer();
    private static final bi.f descriptor;

    static {
        d.b kind = d.b.f4251a;
        bi.f[] fVarArr = new bi.f[0];
        kotlin.jvm.internal.r.e(kind, "kind");
        if (mh.x.A("kotlinx.serialization.json.JsonElement")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(m.a.f4278a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        bi.a aVar = new bi.a("kotlinx.serialization.json.JsonElement");
        descriptor$lambda$5(aVar);
        descriptor = new bi.g("kotlinx.serialization.json.JsonElement", kind, aVar.f4242c.size(), qg.o.B(fVarArr), aVar);
    }

    private JsonElementSerializer() {
    }

    private static final f0 descriptor$lambda$5(bi.a buildSerialDescriptor) {
        kotlin.jvm.internal.r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        bi.a.a(buildSerialDescriptor, "JsonPrimitive", new m(new j9.p(1)));
        bi.a.a(buildSerialDescriptor, "JsonNull", new m(new j(0)));
        bi.a.a(buildSerialDescriptor, "JsonLiteral", new m(new k()));
        bi.a.a(buildSerialDescriptor, "JsonObject", new m(new m1(1)));
        bi.a.a(buildSerialDescriptor, "JsonArray", new m(new l()));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor$lambda$5$lambda$0() {
        return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor$lambda$5$lambda$1() {
        return JsonNullSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor$lambda$5$lambda$2() {
        return JsonLiteralSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor$lambda$5$lambda$3() {
        return JsonObjectSerializer.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor$lambda$5$lambda$4() {
        return JsonArraySerializer.INSTANCE.getDescriptor();
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public h deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return f9.h.a(decoder).l();
    }

    @Override // zh.i
    public void serialize(ci.e encoder, h value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        f9.h.b(encoder);
        if (value instanceof x) {
            encoder.J(JsonPrimitiveSerializer.INSTANCE, value);
        } else if (value instanceof v) {
            encoder.J(JsonObjectSerializer.INSTANCE, value);
        } else {
            if (!(value instanceof c)) {
                throw new pg.l();
            }
            encoder.J(JsonArraySerializer.INSTANCE, value);
        }
    }
}

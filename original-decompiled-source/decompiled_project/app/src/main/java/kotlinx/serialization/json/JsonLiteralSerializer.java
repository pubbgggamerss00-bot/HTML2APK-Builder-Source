package kotlinx.serialization.json;

import bi.e;
import d0.q1;
import kotlin.jvm.internal.h0;
import pg.z;

/* loaded from: classes2.dex */
final class JsonLiteralSerializer implements zh.b<r> {
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
    private static final bi.f descriptor = bi.k.a("kotlinx.serialization.json.JsonLiteral", e.i.f4260a);

    private JsonLiteralSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public r deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        h hVarL = f9.h.a(decoder).l();
        if (hVarL instanceof r) {
            return (r) hVarL;
        }
        throw di.t.c(-1, hVarL.toString(), "Unexpected JSON element, expected JsonLiteral, had " + h0.a(hVarL.getClass()));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, r value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        String str = value.f16454c;
        f9.h.b(encoder);
        if (value.f16452a) {
            encoder.N(str);
            return;
        }
        bi.f fVar = value.f16453b;
        if (fVar != null) {
            encoder.f(fVar).N(str);
            return;
        }
        Long lH = mh.s.h(str);
        if (lH != null) {
            encoder.K(lH.longValue());
            return;
        }
        z zVarD = q1.d(str);
        if (zVarD != null) {
            encoder.f(ai.a.serializer(z.f21492b).getDescriptor()).K(zVarD.f21493a);
            return;
        }
        Boolean bool = null;
        Double dValueOf = mh.s.e(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            encoder.k(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            encoder.o(bool.booleanValue());
        } else {
            encoder.N(str);
        }
    }
}

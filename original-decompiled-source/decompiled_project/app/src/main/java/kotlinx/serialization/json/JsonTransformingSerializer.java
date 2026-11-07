package kotlinx.serialization.json;

import di.b0;
import kotlin.jvm.internal.g0;

/* loaded from: classes2.dex */
public abstract class JsonTransformingSerializer<T> implements zh.b<T> {
    private final zh.b<T> tSerializer;

    public JsonTransformingSerializer(zh.b<T> tSerializer) {
        kotlin.jvm.internal.r.e(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // zh.a
    public final T deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        g gVarA = f9.h.a(decoder);
        return (T) gVarA.d().a(this.tSerializer, transformDeserialize(gVarA.l()));
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // zh.i
    public final void serialize(ci.e encoder, T t3) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        n nVarB = f9.h.b(encoder);
        b json = nVarB.d();
        zh.b<T> serializer = this.tSerializer;
        kotlin.jvm.internal.r.e(json, "json");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        final g0 g0Var = new g0();
        new b0(json, new eh.l() { // from class: di.q0
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, kotlinx.serialization.json.h] */
            @Override // eh.l
            public final Object invoke(Object obj) {
                ?? it = (kotlinx.serialization.json.h) obj;
                kotlin.jvm.internal.r.e(it, "it");
                g0Var.f16327a = it;
                return pg.f0.f21461a;
            }
        }).J(serializer, t3);
        T t10 = g0Var.f16327a;
        if (t10 != null) {
            nVarB.G(transformSerialize((h) t10));
        } else {
            kotlin.jvm.internal.r.h("result");
            throw null;
        }
    }

    public h transformDeserialize(h element) {
        kotlin.jvm.internal.r.e(element, "element");
        return element;
    }

    public h transformSerialize(h element) {
        kotlin.jvm.internal.r.e(element, "element");
        return element;
    }
}

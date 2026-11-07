package kotlinx.serialization.json;

import bi.d;
import kotlin.jvm.internal.h0;
import p5.g0;

/* loaded from: classes2.dex */
public abstract class JsonContentPolymorphicSerializer<T> implements zh.b<T> {
    private final kh.c<T> baseClass;
    private final bi.f descriptor;

    public JsonContentPolymorphicSerializer(kh.c<T> baseClass) {
        kotlin.jvm.internal.r.e(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = bi.k.d("JsonContentPolymorphicSerializer<" + baseClass.e() + '>', d.b.f4251a, new bi.f[0], new bi.j());
    }

    private final Void throwSubtypeNotRegistered(kh.c<?> cVar, kh.c<?> cVar2) {
        String strE = cVar.e();
        if (strE == null) {
            strE = String.valueOf(cVar);
        }
        throw new zh.h(g0.a("Class '", strE, "' is not registered for polymorphic serialization ", "in the scope of '" + cVar2.e() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    @Override // zh.a
    public final T deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        g gVarA = f9.h.a(decoder);
        h hVarL = gVarA.l();
        zh.a<T> aVarSelectDeserializer = selectDeserializer(hVarL);
        kotlin.jvm.internal.r.c(aVarSelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) gVarA.d().a((zh.b) aVarSelectDeserializer, hVarL);
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    public abstract zh.a<T> selectDeserializer(h hVar);

    @Override // zh.i
    public final void serialize(ci.e encoder, T value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        zh.b bVarE = encoder.a().e(this.baseClass, value);
        if (bVarE == null) {
            zh.b bVarC = zh.n.c(h0.a(value.getClass()));
            if (bVarC == null) {
                throwSubtypeNotRegistered(h0.a(value.getClass()), this.baseClass);
                throw new pg.g();
            }
            bVarE = bVarC;
        }
        ((zh.b) bVarE).serialize(encoder, value);
    }
}

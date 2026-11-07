package kotlinx.serialization;

import b9.q1;
import bi.a;
import bi.f;
import bi.k;
import bi.l;
import ci.d;
import ci.e;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.c;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.p0;
import pg.f0;
import qg.m;
import qg.z;
import zh.b;
import zh.h;

/* loaded from: classes2.dex */
public final class ContextualSerializer<T> implements b<T> {
    private final f descriptor;
    private final b<T> fallbackSerializer;
    private final c<T> serializableClass;
    private final List<b<?>> typeArgumentsSerializers;

    public ContextualSerializer(c<T> serializableClass, b<T> bVar, b<?>[] typeArgumentsSerializers) {
        r.e(serializableClass, "serializableClass");
        r.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = bVar;
        this.typeArgumentsSerializers = m.a(typeArgumentsSerializers);
        this.descriptor = new bi.c(k.d("kotlinx.serialization.ContextualSerializer", l.a.f4276a, new f[0], new q1(this, 2)), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 descriptor$lambda$0(ContextualSerializer contextualSerializer, a buildSerialDescriptor) {
        f descriptor;
        r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        b<T> bVar = contextualSerializer.fallbackSerializer;
        List<Annotation> annotations = (bVar == null || (descriptor = bVar.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = z.f22752a;
        }
        buildSerialDescriptor.f4241b = annotations;
        return f0.f21461a;
    }

    private final b<T> serializer(ei.b bVar) {
        b<T> bVarB = bVar.b(this.serializableClass, this.typeArgumentsSerializers);
        if (bVarB != null) {
            return bVarB;
        }
        b<T> bVar2 = this.fallbackSerializer;
        if (bVar2 != null) {
            return bVar2;
        }
        c<T> cVar = this.serializableClass;
        r.e(cVar, "<this>");
        throw new h(l0.d(cVar));
    }

    @Override // zh.a
    public T deserialize(d decoder) {
        r.e(decoder, "decoder");
        return (T) decoder.q(serializer(decoder.a()));
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.i
    public void serialize(e encoder, T value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        encoder.J(serializer(encoder.a()), value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(c<T> serializableClass) {
        this(serializableClass, null, p0.f16404a);
        r.e(serializableClass, "serializableClass");
    }
}

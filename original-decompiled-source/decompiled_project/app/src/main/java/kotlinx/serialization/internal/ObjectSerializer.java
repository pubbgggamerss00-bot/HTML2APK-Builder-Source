package kotlinx.serialization.internal;

import bi.m;
import f9.i7;
import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public final class ObjectSerializer<T> implements zh.b<T> {
    private List<? extends Annotation> _annotations;
    private final pg.j descriptor$delegate;
    private final T objectInstance;

    public ObjectSerializer(String serialName, T objectInstance) {
        kotlin.jvm.internal.r.e(serialName, "serialName");
        kotlin.jvm.internal.r.e(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = qg.z.f22752a;
        this.descriptor$delegate = e9.w0.a(pg.k.f21466a, new d9.f(1, serialName, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor_delegate$lambda$1(String str, ObjectSerializer objectSerializer) {
        return bi.k.d(str, m.d.f4281a, new bi.f[0], new i7(objectSerializer, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pg.f0 descriptor_delegate$lambda$1$lambda$0(ObjectSerializer objectSerializer, bi.a buildSerialDescriptor) {
        kotlin.jvm.internal.r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        List<? extends Annotation> list = objectSerializer._annotations;
        kotlin.jvm.internal.r.e(list, "<set-?>");
        buildSerialDescriptor.f4241b = list;
        return pg.f0.f21461a;
    }

    @Override // zh.a
    public T deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        bi.f descriptor = getDescriptor();
        ci.b bVarC = decoder.c(descriptor);
        int iG = bVarC.g(getDescriptor());
        if (iG != -1) {
            throw new zh.h(j2.y.a(iG, "Unexpected index "));
        }
        pg.f0 f0Var = pg.f0.f21461a;
        bVarC.b(descriptor);
        return this.objectInstance;
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return (bi.f) this.descriptor$delegate.getValue();
    }

    @Override // zh.i
    public void serialize(ci.e encoder, T value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        encoder.c(getDescriptor()).b(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        kotlin.jvm.internal.r.e(serialName, "serialName");
        kotlin.jvm.internal.r.e(objectInstance, "objectInstance");
        kotlin.jvm.internal.r.e(classAnnotations, "classAnnotations");
        this._annotations = qg.m.a(classAnnotations);
    }
}

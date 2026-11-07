package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public interface GeneratedSerializer<T> extends zh.b<T> {
    zh.b<?>[] childSerializers();

    /* synthetic */ Object deserialize(ci.d dVar);

    @Override // zh.i, zh.a
    /* synthetic */ bi.f getDescriptor();

    @Override // zh.i
    /* synthetic */ void serialize(ci.e eVar, Object obj);

    default zh.b<?>[] typeParametersSerializers() {
        return p0.f16404a;
    }
}

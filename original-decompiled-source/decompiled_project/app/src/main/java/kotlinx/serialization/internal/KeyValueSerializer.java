package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public abstract class KeyValueSerializer<K, V, R> implements zh.b<R> {
    private final zh.b<K> keySerializer;
    private final zh.b<V> valueSerializer;

    public /* synthetic */ KeyValueSerializer(zh.b bVar, zh.b bVar2, kotlin.jvm.internal.j jVar) {
        this(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zh.a
    public R deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        bi.f descriptor = getDescriptor();
        ci.b bVarC = decoder.c(descriptor);
        Object obj = y0.f16423a;
        Object objU = obj;
        Object objU2 = objU;
        while (true) {
            int iG = bVarC.g(getDescriptor());
            if (iG == -1) {
                if (objU == obj) {
                    throw new zh.h("Element 'key' is missing");
                }
                if (objU2 == obj) {
                    throw new zh.h("Element 'value' is missing");
                }
                R r10 = (R) toResult(objU, objU2);
                bVarC.b(descriptor);
                return r10;
            }
            if (iG == 0) {
                objU = bVarC.u(getDescriptor(), 0, getKeySerializer(), null);
            } else {
                if (iG != 1) {
                    throw new zh.h(j2.y.a(iG, "Invalid index: "));
                }
                objU2 = bVarC.u(getDescriptor(), 1, getValueSerializer(), null);
            }
        }
    }

    @Override // zh.i, zh.a
    public abstract /* synthetic */ bi.f getDescriptor();

    public abstract K getKey(R r10);

    public final zh.b<K> getKeySerializer() {
        return this.keySerializer;
    }

    public abstract V getValue(R r10);

    public final zh.b<V> getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // zh.i
    public void serialize(ci.e encoder, R r10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        ci.c cVarC = encoder.c(getDescriptor());
        cVarC.y(getDescriptor(), 0, this.keySerializer, getKey(r10));
        cVarC.y(getDescriptor(), 1, this.valueSerializer, getValue(r10));
        cVarC.b(getDescriptor());
    }

    public abstract R toResult(K k10, V v10);

    private KeyValueSerializer(zh.b<K> bVar, zh.b<V> bVar2) {
        this.keySerializer = bVar;
        this.valueSerializer = bVar2;
    }
}

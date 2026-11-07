package kotlinx.serialization.internal;

import bi.m;

/* loaded from: classes2.dex */
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, pg.n<? extends K, ? extends V>> {
    private final bi.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(zh.b<K> keySerializer, zh.b<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.r.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.r.e(valueSerializer, "valueSerializer");
        bi.f[] fVarArr = new bi.f[0];
        if (mh.x.A("kotlin.Pair")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        bi.a aVar = new bi.a("kotlin.Pair");
        descriptor$lambda$0(keySerializer, valueSerializer, aVar);
        this.descriptor = new bi.g("kotlin.Pair", m.a.f4278a, aVar.f4242c.size(), qg.o.B(fVarArr), aVar);
    }

    private static final pg.f0 descriptor$lambda$0(zh.b bVar, zh.b bVar2, bi.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.r.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        bi.a.a(buildClassSerialDescriptor, "first", bVar.getDescriptor());
        bi.a.a(buildClassSerialDescriptor, "second", bVar2.getDescriptor());
        return pg.f0.f21461a;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(pg.n<? extends K, ? extends V> nVar) {
        kotlin.jvm.internal.r.e(nVar, "<this>");
        return (K) nVar.f21469a;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(pg.n<? extends K, ? extends V> nVar) {
        kotlin.jvm.internal.r.e(nVar, "<this>");
        return (V) nVar.f21470b;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public pg.n<K, V> toResult(K k10, V v10) {
        return new pg.n<>(k10, v10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public /* bridge */ /* synthetic */ Object toResult(Object obj, Object obj2) {
        return toResult((PairSerializer<K, V>) obj, obj2);
    }
}

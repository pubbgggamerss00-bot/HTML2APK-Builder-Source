package kotlinx.serialization.internal;

import bi.m;
import f9.mf;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {
    private final bi.f descriptor;

    public static final class a<K, V> implements Map.Entry<K, V>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final K f16344a;

        /* renamed from: b, reason: collision with root package name */
        public final V f16345b;

        public a(K k10, V v10) {
            this.f16344a = k10;
            this.f16345b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f16344a, aVar.f16344a) && kotlin.jvm.internal.r.a(this.f16345b, aVar.f16345b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f16344a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f16345b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f16344a;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f16345b;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.f16344a + ", value=" + this.f16345b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(zh.b<K> keySerializer, zh.b<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.r.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.r.e(valueSerializer, "valueSerializer");
        this.descriptor = bi.k.d("kotlin.collections.Map.Entry", m.c.f4280a, new bi.f[0], new mf(1, keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pg.f0 descriptor$lambda$0(zh.b bVar, zh.b bVar2, bi.a buildSerialDescriptor) {
        kotlin.jvm.internal.r.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        bi.a.a(buildSerialDescriptor, "key", bVar.getDescriptor());
        bi.a.a(buildSerialDescriptor, "value", bVar2.getDescriptor());
        return pg.f0.f21461a;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public /* bridge */ /* synthetic */ Object toResult(Object obj, Object obj2) {
        return toResult((MapEntrySerializer<K, V>) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.r.e(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.r.e(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Map.Entry<K, V> toResult(K k10, V v10) {
        return new a(k10, v10);
    }
}

package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class LinkedHashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    private final bi.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedHashMapSerializer(zh.b<K> kSerializer, zh.b<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.r.e(kSerializer, "kSerializer");
        kotlin.jvm.internal.r.e(vSerializer, "vSerializer");
        bi.f keyDesc = kSerializer.getDescriptor();
        bi.f valueDesc = vSerializer.getDescriptor();
        kotlin.jvm.internal.r.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.r.e(valueDesc, "valueDesc");
        this.descriptor = new y("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(LinkedHashMap<K, V> linkedHashMap, int i10) {
        kotlin.jvm.internal.r.e(linkedHashMap, "<this>");
    }

    @Override // kotlinx.serialization.internal.MapLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.MapLikeSerializer
    public /* bridge */ /* synthetic */ void insertKeyValuePair(Map map, int i10, Object obj, Object obj2) {
        insertKeyValuePair((LinkedHashMap<int, Object>) map, i10, (int) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Map<K, V> toResult(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.r.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashMap<K, V> builder() {
        return new LinkedHashMap<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.r.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<Map.Entry<K, V>> collectionIterator(Map<K, ? extends V> map) {
        kotlin.jvm.internal.r.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Map<K, ? extends V> map) {
        kotlin.jvm.internal.r.e(map, "<this>");
        return map.size();
    }

    public void insertKeyValuePair(LinkedHashMap<K, V> linkedHashMap, int i10, K k10, V v10) {
        kotlin.jvm.internal.r.e(linkedHashMap, "<this>");
        linkedHashMap.put(k10, v10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashMap<K, V> toBuilder(Map<K, ? extends V> map) {
        kotlin.jvm.internal.r.e(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }
}

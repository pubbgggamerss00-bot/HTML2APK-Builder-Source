package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class HashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, HashSet<E>> {
    private final bi.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashSetSerializer(zh.b<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.r.e(eSerializer, "eSerializer");
        bi.f elementDesc = eSerializer.getDescriptor();
        kotlin.jvm.internal.r.e(elementDesc, "elementDesc");
        this.descriptor = new t(elementDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(HashSet<E> hashSet, int i10) {
        kotlin.jvm.internal.r.e(hashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i10, Object obj2) {
        insert((HashSet<int>) obj, i10, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Set<E> toResult(HashSet<E> hashSet) {
        kotlin.jvm.internal.r.e(hashSet, "<this>");
        return hashSet;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashSet<E> builder() {
        return new HashSet<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(HashSet<E> hashSet) {
        kotlin.jvm.internal.r.e(hashSet, "<this>");
        return hashSet.size();
    }

    public void insert(HashSet<E> hashSet, int i10, E e10) {
        kotlin.jvm.internal.r.e(hashSet, "<this>");
        hashSet.add(e10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashSet<E> toBuilder(Set<? extends E> set) {
        kotlin.jvm.internal.r.e(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }
}

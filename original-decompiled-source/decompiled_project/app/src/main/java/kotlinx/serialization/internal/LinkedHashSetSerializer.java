package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LinkedHashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, LinkedHashSet<E>> {
    private final bi.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedHashSetSerializer(zh.b<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.r.e(eSerializer, "eSerializer");
        bi.f elementDesc = eSerializer.getDescriptor();
        kotlin.jvm.internal.r.e(elementDesc, "elementDesc");
        this.descriptor = new z(elementDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(LinkedHashSet<E> linkedHashSet, int i10) {
        kotlin.jvm.internal.r.e(linkedHashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i10, Object obj2) {
        insert((LinkedHashSet<int>) obj, i10, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Set<E> toResult(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.r.e(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashSet<E> builder() {
        return new LinkedHashSet<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.r.e(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    public void insert(LinkedHashSet<E> linkedHashSet, int i10, E e10) {
        kotlin.jvm.internal.r.e(linkedHashSet, "<this>");
        linkedHashSet.add(e10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashSet<E> toBuilder(Set<? extends E> set) {
        kotlin.jvm.internal.r.e(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }
}

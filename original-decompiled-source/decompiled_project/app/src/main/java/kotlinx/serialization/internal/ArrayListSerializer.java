package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {
    private final bi.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayListSerializer(zh.b<E> element) {
        super(element);
        kotlin.jvm.internal.r.e(element, "element");
        bi.f elementDesc = element.getDescriptor();
        kotlin.jvm.internal.r.e(elementDesc, "elementDesc");
        this.descriptor = new b(elementDesc);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i10, Object obj2) {
        insert((ArrayList<int>) obj, i10, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public List<E> toResult(ArrayList<E> arrayList) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<E> builder() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(ArrayList<E> arrayList) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(ArrayList<E> arrayList, int i10) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    public void insert(ArrayList<E> arrayList, int i10, E e10) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<E> toBuilder(List<? extends E> list) {
        kotlin.jvm.internal.r.e(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }
}

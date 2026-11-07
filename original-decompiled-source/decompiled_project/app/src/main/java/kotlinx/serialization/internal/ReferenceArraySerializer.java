package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
    private final bi.f descriptor;
    private final kh.c<ElementKlass> kClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(kh.c<ElementKlass> kClass, zh.b<Element> eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.r.e(kClass, "kClass");
        kotlin.jvm.internal.r.e(eSerializer, "eSerializer");
        this.kClass = kClass;
        bi.f elementDesc = eSerializer.getDescriptor();
        kotlin.jvm.internal.r.e(elementDesc, "elementDesc");
        this.descriptor = new a(elementDesc);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i10, Object obj2) {
        insert((ArrayList<int>) obj, i10, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<Element> builder() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(ArrayList<Element> arrayList, int i10) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<Element> collectionIterator(Element[] elementArr) {
        kotlin.jvm.internal.r.e(elementArr, "<this>");
        return f3.f.e(elementArr);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Element[] elementArr) {
        kotlin.jvm.internal.r.e(elementArr, "<this>");
        return elementArr.length;
    }

    public void insert(ArrayList<Element> arrayList, int i10, Element element) {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<Element> toBuilder(Element[] elementArr) {
        kotlin.jvm.internal.r.e(elementArr, "<this>");
        return new ArrayList<>(qg.m.a(elementArr));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Element[] toResult(ArrayList<Element> arrayList) throws NegativeArraySizeException {
        kotlin.jvm.internal.r.e(arrayList, "<this>");
        kh.c<ElementKlass> eClass = this.kClass;
        kotlin.jvm.internal.r.e(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) b3.e.c(eClass), arrayList.size());
        kotlin.jvm.internal.r.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Element[] elementArr = (Element[]) arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.r.d(elementArr, "toArray(...)");
        return elementArr;
    }
}

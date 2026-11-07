package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSerializer(zh.b<E> element) {
        super(element, null);
        kotlin.jvm.internal.r.e(element, "element");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<E> collectionIterator(C c10) {
        kotlin.jvm.internal.r.e(c10, "<this>");
        return c10.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(C c10) {
        kotlin.jvm.internal.r.e(c10, "<this>");
        return c10.size();
    }
}

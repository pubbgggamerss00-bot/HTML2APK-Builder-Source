package kotlinx.serialization.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {
    private final zh.b<Element> elementSerializer;

    public /* synthetic */ CollectionLikeSerializer(zh.b bVar, kotlin.jvm.internal.j jVar) {
        this(bVar);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public abstract bi.f getDescriptor();

    public abstract void insert(Builder builder, int i10, Element element);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(ci.b decoder, Builder builder, int i10, int i11) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            readElement(decoder, i10 + i12, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(ci.b decoder, int i10, Builder builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        insert(builder, i10, decoder.u(getDescriptor(), i10, this.elementSerializer, null));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i
    public void serialize(ci.e encoder, Collection collection) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        int iCollectionSize = collectionSize(collection);
        bi.f descriptor = getDescriptor();
        ci.c cVarA = encoder.A(descriptor);
        Iterator<Element> itCollectionIterator = collectionIterator(collection);
        for (int i10 = 0; i10 < iCollectionSize; i10++) {
            cVarA.y(getDescriptor(), i10, this.elementSerializer, itCollectionIterator.next());
        }
        cVarA.b(descriptor);
    }

    private CollectionLikeSerializer(zh.b<Element> bVar) {
        super(null);
        this.elementSerializer = bVar;
    }
}

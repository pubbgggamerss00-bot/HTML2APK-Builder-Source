package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlinx.serialization.internal.q0;

/* loaded from: classes2.dex */
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends q0<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {
    private final bi.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(zh.b<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.r.e(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new r0(primitiveSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator<Element> collectionIterator(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, zh.a
    public final Array deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return merge(decoder, null);
    }

    public abstract Array empty();

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public final bi.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i10, Object obj2) {
        insert((PrimitiveArraySerializer<Element, Array, Builder>) obj, i10, (int) obj2);
    }

    public abstract void readElement(ci.b bVar, int i10, Builder builder, boolean z10);

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i
    public final void serialize(ci.e encoder, Array array) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        int iCollectionSize = collectionSize(array);
        bi.f fVar = this.descriptor;
        ci.c cVarA = encoder.A(fVar);
        writeContent(cVarA, array, iCollectionSize);
        cVarA.b(fVar);
    }

    public abstract void writeContent(ci.c cVar, Array array, int i10);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Builder builder() {
        return toBuilder(empty());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Builder builder) {
        kotlin.jvm.internal.r.e(builder, "<this>");
        return builder.d();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void checkCapacity(Builder builder, int i10) {
        kotlin.jvm.internal.r.e(builder, "<this>");
        builder.b(i10);
    }

    public final void insert(Builder builder, int i10, Element element) {
        kotlin.jvm.internal.r.e(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Array toResult(Builder builder) {
        kotlin.jvm.internal.r.e(builder, "<this>");
        return (Array) builder.a();
    }
}

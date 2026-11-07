package kotlinx.serialization.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements zh.b<Collection> {
    public /* synthetic */ AbstractCollectionSerializer(kotlin.jvm.internal.j jVar) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, ci.b bVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractCollectionSerializer.readElement(bVar, i10, obj, z10);
    }

    private final int readSize(ci.b bVar, Builder builder) {
        bi.f descriptor = getDescriptor();
        bVar.getClass();
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        checkCapacity(builder, -1);
        return -1;
    }

    public abstract Builder builder();

    public abstract int builderSize(Builder builder);

    public abstract void checkCapacity(Builder builder, int i10);

    public abstract Iterator<Element> collectionIterator(Collection collection);

    public abstract int collectionSize(Collection collection);

    @Override // zh.a
    public Collection deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return merge(decoder, null);
    }

    @Override // zh.i, zh.a
    public abstract /* synthetic */ bi.f getDescriptor();

    public final Collection merge(ci.d decoder, Collection collection) {
        Builder builder;
        kotlin.jvm.internal.r.e(decoder, "decoder");
        if (collection == null || (builder = toBuilder(collection)) == null) {
            builder = builder();
        }
        Builder builder2 = builder;
        int iBuilderSize = builderSize(builder2);
        ci.b bVarC = decoder.c(getDescriptor());
        while (true) {
            int iG = bVarC.g(getDescriptor());
            if (iG == -1) {
                bVarC.b(getDescriptor());
                return toResult(builder2);
            }
            readElement$default(this, bVarC, iBuilderSize + iG, builder2, false, 8, null);
        }
    }

    public abstract void readAll(ci.b bVar, Builder builder, int i10, int i11);

    public abstract void readElement(ci.b bVar, int i10, Builder builder, boolean z10);

    @Override // zh.i
    public abstract void serialize(ci.e eVar, Collection collection);

    public abstract Builder toBuilder(Collection collection);

    public abstract Collection toResult(Builder builder);

    private AbstractCollectionSerializer() {
    }
}

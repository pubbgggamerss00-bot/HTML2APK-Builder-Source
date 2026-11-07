package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final zh.b<Key> keySerializer;
    private final zh.b<Value> valueSerializer;

    public /* synthetic */ MapLikeSerializer(zh.b bVar, zh.b bVar2, kotlin.jvm.internal.j jVar) {
        this(bVar, bVar2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i, zh.a
    public abstract bi.f getDescriptor();

    public final zh.b<Key> getKeySerializer() {
        return this.keySerializer;
    }

    public final zh.b<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    public abstract void insertKeyValuePair(Builder builder, int i10, Key key, Value value);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, zh.i
    public void serialize(ci.e encoder, Collection collection) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        collectionSize(collection);
        bi.f descriptor = getDescriptor();
        ci.c cVarA = encoder.A(descriptor);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itCollectionIterator = collectionIterator(collection);
        int i10 = 0;
        while (itCollectionIterator.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itCollectionIterator.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            cVarA.y(getDescriptor(), i10, getKeySerializer(), key);
            i10 += 2;
            cVarA.y(getDescriptor(), i11, getValueSerializer(), value);
        }
        cVarA.b(descriptor);
    }

    private MapLikeSerializer(zh.b<Key> bVar, zh.b<Value> bVar2) {
        super(null);
        this.keySerializer = bVar;
        this.valueSerializer = bVar2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(ci.b decoder, Builder builder, int i10, int i11) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        jh.e eVarP = jh.j.p(jh.j.q(0, i11 * 2), 2);
        int i12 = eVarP.f15744a;
        int i13 = eVarP.f15745b;
        int i14 = eVarP.f15746c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return;
        }
        while (true) {
            readElement(decoder, i10 + i12, (int) builder, false);
            if (i12 == i13) {
                return;
            } else {
                i12 += i14;
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(ci.b decoder, int i10, Builder builder, boolean z10) {
        int iG;
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        Object objU = decoder.u(getDescriptor(), i10, this.keySerializer, null);
        if (z10) {
            iG = decoder.g(getDescriptor());
            if (iG != i10 + 1) {
                throw new IllegalArgumentException(e1.c.a(i10, iG, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            iG = i10 + 1;
        }
        builder.put(objU, (!builder.containsKey(objU) || (this.valueSerializer.getDescriptor().getKind() instanceof bi.e)) ? decoder.u(getDescriptor(), iG, this.valueSerializer, null) : decoder.u(getDescriptor(), iG, this.valueSerializer, qg.k0.c(objU, builder)));
    }
}

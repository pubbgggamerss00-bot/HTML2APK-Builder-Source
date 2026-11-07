package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class IntArraySerializer extends PrimitiveArraySerializer<Integer, int[], w> {
    public static final IntArraySerializer INSTANCE = new IntArraySerializer();

    private IntArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.q.f16340a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(int[] iArr) {
        kotlin.jvm.internal.r.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public int[] empty() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public w toBuilder(int[] iArr) {
        kotlin.jvm.internal.r.e(iArr, "<this>");
        w wVar = new w();
        wVar.f16418a = iArr;
        wVar.f16419b = iArr.length;
        wVar.b(10);
        return wVar;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, int[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.O(i11, content[i11], getDescriptor());
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, w builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        int iW = decoder.w(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f16418a;
        int i11 = builder.f16419b;
        builder.f16419b = i11 + 1;
        iArr[i11] = iW;
    }
}

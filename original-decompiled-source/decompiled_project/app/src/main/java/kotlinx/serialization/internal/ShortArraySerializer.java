package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class ShortArraySerializer extends PrimitiveArraySerializer<Short, short[], x0> {
    public static final ShortArraySerializer INSTANCE = new ShortArraySerializer();

    private ShortArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.j0.f16335a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(short[] sArr) {
        kotlin.jvm.internal.r.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public short[] empty() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public x0 toBuilder(short[] sArr) {
        kotlin.jvm.internal.r.e(sArr, "<this>");
        x0 x0Var = new x0();
        x0Var.f16421a = sArr;
        x0Var.f16422b = sArr.length;
        x0Var.b(10);
        return x0Var;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, short[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.q(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, x0 builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        short sN = decoder.n(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f16421a;
        int i11 = builder.f16422b;
        builder.f16422b = i11 + 1;
        sArr[i11] = sN;
    }
}

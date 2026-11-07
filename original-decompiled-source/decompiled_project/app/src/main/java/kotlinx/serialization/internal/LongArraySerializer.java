package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class LongArraySerializer extends PrimitiveArraySerializer<Long, long[], b0> {
    public static final LongArraySerializer INSTANCE = new LongArraySerializer();

    private LongArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.t.f16341a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(long[] jArr) {
        kotlin.jvm.internal.r.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public long[] empty() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public b0 toBuilder(long[] jArr) {
        kotlin.jvm.internal.r.e(jArr, "<this>");
        b0 b0Var = new b0();
        b0Var.f16349a = jArr;
        b0Var.f16350b = jArr.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, long[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, b0 builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        long jK = decoder.k(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f16349a;
        int i11 = builder.f16350b;
        builder.f16350b = i11 + 1;
        jArr[i11] = jK;
    }
}

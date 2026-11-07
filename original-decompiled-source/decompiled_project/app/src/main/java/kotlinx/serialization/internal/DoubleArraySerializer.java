package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class DoubleArraySerializer extends PrimitiveArraySerializer<Double, double[], m> {
    public static final DoubleArraySerializer INSTANCE = new DoubleArraySerializer();

    private DoubleArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.k.f16336a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(double[] dArr) {
        kotlin.jvm.internal.r.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public double[] empty() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public m toBuilder(double[] dArr) {
        kotlin.jvm.internal.r.e(dArr, "<this>");
        m mVar = new m();
        mVar.f16380a = dArr;
        mVar.f16381b = dArr.length;
        mVar.b(10);
        return mVar;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, double[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.p(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, m builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        double dJ = decoder.j(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f16380a;
        int i11 = builder.f16381b;
        builder.f16381b = i11 + 1;
        dArr[i11] = dJ;
    }
}

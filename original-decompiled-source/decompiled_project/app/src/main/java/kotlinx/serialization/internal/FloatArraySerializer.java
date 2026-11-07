package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class FloatArraySerializer extends PrimitiveArraySerializer<Float, float[], r> {
    public static final FloatArraySerializer INSTANCE = new FloatArraySerializer();

    private FloatArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.l.f16338a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(float[] fArr) {
        kotlin.jvm.internal.r.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public float[] empty() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public r toBuilder(float[] fArr) {
        kotlin.jvm.internal.r.e(fArr, "<this>");
        r rVar = new r();
        rVar.f16408a = fArr;
        rVar.f16409b = fArr.length;
        rVar.b(10);
        return rVar;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, float[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.D(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, r builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        float fT = decoder.t(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f16408a;
        int i11 = builder.f16409b;
        builder.f16409b = i11 + 1;
        fArr[i11] = fT;
    }
}

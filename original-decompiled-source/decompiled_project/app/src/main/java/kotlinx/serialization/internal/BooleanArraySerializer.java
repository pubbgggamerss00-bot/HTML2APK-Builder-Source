package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class BooleanArraySerializer extends PrimitiveArraySerializer<Boolean, boolean[], c> {
    public static final BooleanArraySerializer INSTANCE = new BooleanArraySerializer();

    private BooleanArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.c.f16319a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(boolean[] zArr) {
        kotlin.jvm.internal.r.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public boolean[] empty() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public c toBuilder(boolean[] zArr) {
        kotlin.jvm.internal.r.e(zArr, "<this>");
        c cVar = new c();
        cVar.f16353a = zArr;
        cVar.f16354b = zArr.length;
        cVar.b(10);
        return cVar;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, boolean[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.L(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, c builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        boolean zA = decoder.A(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f16353a;
        int i11 = builder.f16354b;
        builder.f16354b = i11 + 1;
        zArr[i11] = zA;
    }
}

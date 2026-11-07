package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class ByteArraySerializer extends PrimitiveArraySerializer<Byte, byte[], d> {
    public static final ByteArraySerializer INSTANCE = new ByteArraySerializer();

    private ByteArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.d.f16321a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(byte[] bArr) {
        kotlin.jvm.internal.r.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public byte[] empty() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public d toBuilder(byte[] bArr) {
        kotlin.jvm.internal.r.e(bArr, "<this>");
        d dVar = new d();
        dVar.f16360a = bArr;
        dVar.f16361b = bArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, byte[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.B(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, d builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        byte bO = decoder.o(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f16360a;
        int i11 = builder.f16361b;
        builder.f16361b = i11 + 1;
        bArr[i11] = bO;
    }
}

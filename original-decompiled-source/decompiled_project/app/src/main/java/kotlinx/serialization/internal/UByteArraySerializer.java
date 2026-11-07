package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UByteArraySerializer extends PrimitiveArraySerializer<pg.v, pg.w, z0> {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    private UByteArraySerializer() {
        super(ai.a.serializer(pg.v.f21482b));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m91collectionSizeGBYM_sE(((pg.w) obj).f21484a);
    }

    /* renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    public int m91collectionSizeGBYM_sE(byte[] collectionSize) {
        kotlin.jvm.internal.r.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ pg.w empty() {
        return new pg.w(m92emptyTcUX1vc());
    }

    /* renamed from: empty-TcUX1vc, reason: not valid java name */
    public byte[] m92emptyTcUX1vc() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m93toBuilderGBYM_sE(((pg.w) obj).f21484a);
    }

    /* renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    public z0 m93toBuilderGBYM_sE(byte[] toBuilder) {
        kotlin.jvm.internal.r.e(toBuilder, "$this$toBuilder");
        z0 z0Var = new z0();
        z0Var.f16424a = toBuilder;
        z0Var.f16425b = toBuilder.length;
        z0Var.b(10);
        return z0Var;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(ci.c cVar, pg.w wVar, int i10) {
        m94writeContentCoi6ktg(cVar, wVar.f21484a, i10);
    }

    /* renamed from: writeContent-Coi6ktg, reason: not valid java name */
    public void m94writeContentCoi6ktg(ci.c encoder, byte[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.I(getDescriptor(), i11).n(content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, z0 builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        byte B = decoder.p(getDescriptor(), i10).B();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f16424a;
        int i11 = builder.f16425b;
        builder.f16425b = i11 + 1;
        bArr[i11] = B;
    }
}

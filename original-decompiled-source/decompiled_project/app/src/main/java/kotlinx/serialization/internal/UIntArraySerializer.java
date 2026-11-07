package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UIntArraySerializer extends PrimitiveArraySerializer<pg.x, pg.y, a1> {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    private UIntArraySerializer() {
        super(ai.a.serializer(pg.x.f21487b));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m97collectionSizeajY9A(((pg.y) obj).f21489a);
    }

    /* renamed from: collectionSize--ajY-9A, reason: not valid java name */
    public int m97collectionSizeajY9A(int[] collectionSize) {
        kotlin.jvm.internal.r.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ pg.y empty() {
        return new pg.y(m98emptyhP7Qyg());
    }

    /* renamed from: empty--hP7Qyg, reason: not valid java name */
    public int[] m98emptyhP7Qyg() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m99toBuilderajY9A(((pg.y) obj).f21489a);
    }

    /* renamed from: toBuilder--ajY-9A, reason: not valid java name */
    public a1 m99toBuilderajY9A(int[] toBuilder) {
        kotlin.jvm.internal.r.e(toBuilder, "$this$toBuilder");
        a1 a1Var = new a1();
        a1Var.f16347a = toBuilder;
        a1Var.f16348b = toBuilder.length;
        a1Var.b(10);
        return a1Var;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(ci.c cVar, pg.y yVar, int i10) {
        m100writeContentCPlH8fI(cVar, yVar.f21489a, i10);
    }

    /* renamed from: writeContent-CPlH8fI, reason: not valid java name */
    public void m100writeContentCPlH8fI(ci.c encoder, int[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.I(getDescriptor(), i11).H(content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, a1 builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        int iM = decoder.p(getDescriptor(), i10).m();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f16347a;
        int i11 = builder.f16348b;
        builder.f16348b = i11 + 1;
        iArr[i11] = iM;
    }
}

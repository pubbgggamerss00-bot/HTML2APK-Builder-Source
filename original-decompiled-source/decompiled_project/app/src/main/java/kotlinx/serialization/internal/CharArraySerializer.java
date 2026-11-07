package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class CharArraySerializer extends PrimitiveArraySerializer<Character, char[], h> {
    public static final CharArraySerializer INSTANCE = new CharArraySerializer();

    private CharArraySerializer() {
        super(ai.a.serializer(kotlin.jvm.internal.f.f16325a));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(char[] cArr) {
        kotlin.jvm.internal.r.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public char[] empty() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public h toBuilder(char[] cArr) {
        kotlin.jvm.internal.r.e(cArr, "<this>");
        h hVar = new h();
        hVar.f16369a = cArr;
        hVar.f16370b = cArr.length;
        hVar.b(10);
        return hVar;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(ci.c encoder, char[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.z(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, h builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        char cY = decoder.y(getDescriptor(), i10);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f16369a;
        int i11 = builder.f16370b;
        builder.f16370b = i11 + 1;
        cArr[i11] = cY;
    }
}

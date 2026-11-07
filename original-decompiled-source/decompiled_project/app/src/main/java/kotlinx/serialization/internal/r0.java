package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class r0 extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f16410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(bi.f primitive) {
        super(primitive);
        kotlin.jvm.internal.r.e(primitive, "primitive");
        this.f16410b = primitive.a() + "Array";
    }

    @Override // bi.f
    public final String a() {
        return this.f16410b;
    }
}

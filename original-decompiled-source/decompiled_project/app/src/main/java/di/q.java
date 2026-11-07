package di;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.internal.n f8065a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8066b;

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements eh.p<bi.f, Integer, Boolean> {
        @Override // eh.p
        public final Boolean invoke(bi.f fVar, Integer num) {
            bi.f p02 = fVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(p02, "p0");
            q qVar = (q) this.receiver;
            qVar.getClass();
            boolean z10 = !p02.i(iIntValue) && p02.h(iIntValue).c();
            qVar.f8066b = z10;
            return Boolean.valueOf(z10);
        }
    }

    public q(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        this.f8065a = new kotlinx.serialization.internal.n(descriptor, new a(2, this, q.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}

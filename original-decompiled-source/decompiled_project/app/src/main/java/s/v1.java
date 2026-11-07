package s;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.s implements eh.l<Long, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f23953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1(eh.l<? super Long, Object> lVar) {
        super(1);
        this.f23953a = (kotlin.jvm.internal.s) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.l
    public final Object invoke(Long l10) {
        return this.f23953a.invoke(Long.valueOf(l10.longValue()));
    }
}

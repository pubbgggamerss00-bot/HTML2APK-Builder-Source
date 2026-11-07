package x0;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements eh.l<Long, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Long, Object> f31667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e1(eh.l<? super Long, Object> lVar) {
        super(1);
        this.f31667a = lVar;
    }

    @Override // eh.l
    public final Object invoke(Long l10) {
        return this.f31667a.invoke(Long.valueOf(l10.longValue() / 1000000));
    }
}

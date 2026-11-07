package c0;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements eh.p<x, Integer, c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<x, c> f4412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(eh.l<? super x, c> lVar) {
        super(2);
        this.f4412a = lVar;
    }

    @Override // eh.p
    public final c invoke(x xVar, Integer num) {
        num.intValue();
        return new c(this.f4412a.invoke(xVar).f4355a);
    }
}

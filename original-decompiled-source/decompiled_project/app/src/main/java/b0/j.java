package b0;

import v.s1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, int i10) {
        super(1);
        this.f3370a = i10;
        this.f3371b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3370a) {
            case 0:
                ((Number) obj).intValue();
                return this.f3371b;
            default:
                long j10 = ((p1.c) obj).f21129a;
                s1 s1Var = (s1) this.f3371b;
                return new p1.c(s1.a(s1Var, s1Var.f30076j, j10, s1Var.f30075i));
        }
    }
}

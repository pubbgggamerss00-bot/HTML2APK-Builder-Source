package m0;

/* loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.s implements eh.l<a2.c, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(r1 r1Var) {
        super(1);
        this.f17546a = r1Var;
    }

    @Override // eh.l
    public final Boolean invoke(a2.c cVar) {
        boolean z10;
        if (i0.d2.f13253a.a(cVar.f17a) == i0.a2.f13143t) {
            this.f17546a.b();
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}

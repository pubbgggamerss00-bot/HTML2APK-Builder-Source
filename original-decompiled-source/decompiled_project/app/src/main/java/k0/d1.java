package k0;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.s implements eh.l<mh.h, CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f15822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f15823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2) {
        super(1);
        this.f15822a = e0Var;
        this.f15823b = e0Var2;
    }

    @Override // eh.l
    public final CharSequence invoke(mh.h hVar) {
        mh.h hVar2 = hVar;
        kotlin.jvm.internal.e0 e0Var = this.f15822a;
        if (e0Var.f16324a == -1) {
            e0Var.f16324a = hVar2.b().f15744a;
        }
        this.f15823b.f16324a = hVar2.b().f15745b + 1;
        return "";
    }
}

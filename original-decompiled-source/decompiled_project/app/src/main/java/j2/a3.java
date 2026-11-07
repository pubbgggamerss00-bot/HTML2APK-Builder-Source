package j2;

/* loaded from: classes.dex */
public final class a3 extends kotlin.jvm.internal.s implements eh.l<y2.s, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f14645a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b3 b3Var) {
        super(1);
        this.f14645a = b3Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(y2.s sVar) {
        y2.s sVar2 = sVar;
        sVar2.a();
        b3 b3Var = this.f14645a;
        z0.b<i2.s2<y2.s>> bVar = b3Var.f14664d;
        i2.s2<y2.s>[] s2VarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (kotlin.jvm.internal.r.a(s2VarArr[i11], sVar2)) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            bVar.k(i11);
        }
        if (bVar.f34702c == 0) {
            b3Var.f14662b.invoke();
        }
        return pg.f0.f21461a;
    }
}

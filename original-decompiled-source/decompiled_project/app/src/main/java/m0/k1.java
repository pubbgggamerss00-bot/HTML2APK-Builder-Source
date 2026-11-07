package m0;

import t0.ic;
import t0.kc;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, int i10) {
        super(1);
        this.f17388a = i10;
        this.f17389b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f17388a;
        Object obj2 = this.f17389b;
        switch (i10) {
            case 0:
                if (((y) obj).f17579f.f27819a.f27809a.f27761b.length() > 0) {
                    ((kotlin.jvm.internal.b0) obj2).f16318a = false;
                }
                break;
            default:
                q2.d0 d0Var = (q2.d0) obj;
                kh.i<Object>[] iVarArr = q2.a0.f21754a;
                q2.c0<q2.g> c0Var = q2.w.f21829j;
                kh.i<Object> iVar = q2.a0.f21754a[3];
                q2.g gVar = new q2.g();
                c0Var.getClass();
                d0Var.c(c0Var, gVar);
                d0Var.c(q2.k.f21793u, new q2.a(null, new kc((ic) obj2)));
                break;
        }
        return pg.f0.f21461a;
    }
}

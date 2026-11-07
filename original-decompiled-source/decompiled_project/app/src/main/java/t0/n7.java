package t0;

import java.util.List;

/* loaded from: classes.dex */
public final class n7 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(int i10, Object obj, Object obj2) {
        super(1);
        this.f26507a = i10;
        this.f26508b = obj;
        this.f26509c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f26507a;
        Object obj2 = this.f26509c;
        Object obj3 = this.f26508b;
        switch (i10) {
            case 0:
                q2.d0 d0Var = (q2.d0) obj;
                kh.i<Object>[] iVarArr = q2.a0.f21754a;
                q2.c0<Float> c0Var = q2.w.f21837r;
                kh.i<Object> iVar = q2.a0.f21754a[9];
                Float fValueOf = Float.valueOf(1.0f);
                c0Var.getClass();
                d0Var.c(c0Var, fValueOf);
                q2.a0.d(d0Var, (String) obj3);
                d0Var.c(q2.k.f21774b, new q2.a(null, new m7((eh.a) obj2)));
                return pg.f0.f21461a;
            default:
                return ((q5.z) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}

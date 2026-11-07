package c2;

import x0.n1;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i10) {
        super(1);
        this.f4644a = i10;
        this.f4645b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, c2.h, java.lang.Object] */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f4644a) {
            case 0:
                ?? r42 = (h) obj;
                kotlin.jvm.internal.g0 g0Var = (kotlin.jvm.internal.g0) this.f4645b;
                T t3 = g0Var.f16327a;
                if (t3 == 0 && r42.f4649s) {
                    g0Var.f16327a = r42;
                } else if (t3 != 0) {
                    r42.getClass();
                }
                return Boolean.TRUE;
            default:
                return (Float) ((eh.l) ((n1) this.f4645b).getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
        }
    }
}

package j3;

import java.util.List;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(1);
        this.f15025a = i10;
        this.f15026b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f15025a) {
            case 0:
                e0 e0Var = (e0) this.f15026b;
                e0Var.show();
                return new a(e0Var);
            default:
                ((List) this.f15026b).get(((Number) obj).intValue());
                return null;
        }
    }
}

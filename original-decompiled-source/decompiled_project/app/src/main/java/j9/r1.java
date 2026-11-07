package j9;

import java.util.List;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f15516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(k1 k1Var, List list) {
        super(1);
        this.f15516a = k1Var;
        this.f15517b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f15516a.invoke(this.f15517b.get(num.intValue()));
    }
}

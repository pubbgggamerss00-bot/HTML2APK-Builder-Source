package b9;

import java.util.List;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f3786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(w0 w0Var, List list) {
        super(1);
        this.f3786a = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        Integer num2 = (Integer) this.f3786a.get(num.intValue());
        num2.intValue();
        return num2;
    }
}

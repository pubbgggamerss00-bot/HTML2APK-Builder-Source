package h9;

import java.util.List;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f12650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(b1 b1Var, List list) {
        super(1);
        this.f12650a = b1Var;
        this.f12651b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f12650a.invoke(this.f12651b.get(num.intValue()));
    }
}

package b9;

import java.util.List;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f3794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(eh.l lVar, List list) {
        super(1);
        this.f3794a = lVar;
        this.f3795b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f3794a.invoke(this.f3795b.get(num.intValue()));
    }
}

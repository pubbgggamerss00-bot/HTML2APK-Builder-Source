package f9;

import java.util.List;

/* loaded from: classes.dex */
public final class p4 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(eh.l lVar, List list) {
        super(1);
        this.f10234a = lVar;
        this.f10235b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f10234a.invoke(this.f10235b.get(num.intValue()));
    }
}

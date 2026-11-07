package f9;

import java.util.List;

/* loaded from: classes.dex */
public final class i4 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f9785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f9786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(eh.l lVar, List list) {
        super(1);
        this.f9785a = lVar;
        this.f9786b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f9785a.invoke(this.f9786b.get(num.intValue()));
    }
}

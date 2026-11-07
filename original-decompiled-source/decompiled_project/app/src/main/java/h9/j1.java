package h9;

import java.util.List;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f12672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(eh.l lVar, List list) {
        super(1);
        this.f12672a = lVar;
        this.f12673b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f12672a.invoke(this.f12673b.get(num.intValue()));
    }
}

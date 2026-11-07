package f9;

import java.util.List;

/* loaded from: classes.dex */
public final class m4 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f10021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(eh.l lVar, List list) {
        super(1);
        this.f10021a = lVar;
        this.f10022b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f10021a.invoke(this.f10022b.get(num.intValue()));
    }
}

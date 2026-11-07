package t8;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f28240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f28241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(eh.l lVar, List list) {
        super(1);
        this.f28240a = lVar;
        this.f28241b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f28240a.invoke(this.f28241b.get(num.intValue()));
    }
}

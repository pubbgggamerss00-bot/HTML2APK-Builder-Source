package j9;

import java.util.List;

/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f15531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(eh.l lVar, List list) {
        super(1);
        this.f15531a = lVar;
        this.f15532b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f15531a.invoke(this.f15532b.get(num.intValue()));
    }
}

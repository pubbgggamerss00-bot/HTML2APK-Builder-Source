package e0;

import java.util.List;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.s implements eh.a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Object> f8123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<? extends Object> list) {
        super(0);
        this.f8123a = list;
    }

    @Override // eh.a
    public final Integer invoke() {
        Object obj = this.f8123a.get(2);
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) obj;
    }
}

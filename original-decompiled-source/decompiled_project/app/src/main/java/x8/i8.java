package x8;

import java.util.List;

/* loaded from: classes.dex */
public final class i8 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l f32751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(eh.l lVar, List list) {
        super(1);
        this.f32751a = lVar;
        this.f32752b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f32751a.invoke(this.f32752b.get(num.intValue()));
    }
}

package x8;

import java.util.List;

/* loaded from: classes.dex */
public final class h8 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s5.j f32731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(s5.j jVar, List list) {
        super(1);
        this.f32731a = jVar;
        this.f32732b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        return this.f32731a.invoke(this.f32732b.get(num.intValue()));
    }
}

package x8;

import java.util.List;

/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.y f32929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(c9.y yVar, List list) {
        super(1);
        this.f32929a = yVar;
        this.f32930b = list;
    }

    @Override // eh.l
    public final Object invoke(Integer num) {
        int iIntValue = num.intValue();
        return this.f32929a.invoke(Integer.valueOf(iIntValue), this.f32930b.get(iIntValue));
    }
}

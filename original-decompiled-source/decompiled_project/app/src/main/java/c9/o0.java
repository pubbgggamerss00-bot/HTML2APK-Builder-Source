package c9;

import kotlinx.serialization.PolymorphicSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5153b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f5152a = i10;
        this.f5153b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f5152a) {
            case 0:
                r0.m((x0.n1) this.f5153b, false);
                return pg.f0.f21461a;
            default:
                return PolymorphicSerializer.descriptor_delegate$lambda$1((PolymorphicSerializer) this.f5153b);
        }
    }
}

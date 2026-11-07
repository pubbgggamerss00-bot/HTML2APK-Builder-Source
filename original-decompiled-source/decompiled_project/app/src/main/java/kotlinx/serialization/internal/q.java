package kotlinx.serialization.internal;

import x0.n1;
import x8.g5;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16407c;

    public /* synthetic */ q(int i10, Object obj, Object obj2) {
        this.f16405a = i10;
        this.f16406b = obj;
        this.f16407c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16405a) {
            case 0:
                return EnumSerializer.descriptor_delegate$lambda$0((EnumSerializer) this.f16406b, (String) this.f16407c);
            default:
                eh.a aVar = (eh.a) this.f16406b;
                g5.F((n1) this.f16407c, false);
                aVar.invoke();
                return pg.f0.f21461a;
        }
    }
}

package e9;

import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l f8462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(eh.l lVar, Object obj, int i10) {
        super(1);
        this.f8461a = i10;
        this.f8462b = lVar;
        this.f8463c = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f8461a) {
            case 0:
                return this.f8462b.invoke(((List) this.f8463c).get(((Number) obj).intValue()));
            default:
                this.f8462b.invoke(obj);
                ((eh.l) this.f8463c).invoke(obj);
                return pg.f0.f21461a;
        }
    }
}

package q2;

import d0.n1;
import java.util.List;
import pg.f0;
import q1.l1;
import x0.r3;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, int i10) {
        super(1);
        this.f21862a = i10;
        this.f21863b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f21862a) {
            case 0:
                ((List) obj).add((Float) ((n1.a) this.f21863b).invoke());
                return true;
            default:
                ((l1) obj).f(((Number) ((r3) this.f21863b).getValue()).floatValue());
                return f0.f21461a;
        }
    }
}

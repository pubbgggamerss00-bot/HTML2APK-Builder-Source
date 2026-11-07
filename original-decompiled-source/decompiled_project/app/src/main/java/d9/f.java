package d9;

import kotlinx.serialization.internal.ObjectSerializer;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7603c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f7601a = i10;
        this.f7602b = obj;
        this.f7603c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f7601a) {
            case 0:
                n1 n1Var = (n1) this.f7602b;
                n1 n1Var2 = (n1) this.f7603c;
                if (!((Boolean) n1Var.getValue()).booleanValue()) {
                    n1Var2.setValue(Boolean.FALSE);
                }
                return f0.f21461a;
            default:
                return ObjectSerializer.descriptor_delegate$lambda$1((String) this.f7602b, (ObjectSerializer) this.f7603c);
        }
    }
}

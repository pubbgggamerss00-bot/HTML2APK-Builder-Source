package b2;

import eh.l;
import i2.o2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends s implements l<Object, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0<Object> f3534a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g0<Object> g0Var) {
        super(1);
        this.f3534a = g0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, i2.j, i2.o2] */
    @Override // eh.l
    public final Boolean invoke(Object obj) {
        boolean z10;
        ?? r22 = (o2) obj;
        if (r22.B().f1157p) {
            this.f3534a.f16327a = r22;
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}

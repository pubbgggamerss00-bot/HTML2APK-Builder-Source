package k3;

import eh.l;
import kotlin.jvm.internal.s;
import pg.f0;
import qc.m;

/* loaded from: classes.dex */
public final class f extends s implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i10) {
        super(1);
        this.f15975a = i10;
        this.f15976b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f15975a) {
            case 0:
                ((m) this.f15976b).cancel(false);
                return f0.f21461a;
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(((f3.d) this.f15976b).N0(56));
        }
    }
}

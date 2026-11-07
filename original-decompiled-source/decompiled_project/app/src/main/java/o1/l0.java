package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.ArrayList;
import x0.w0;
import x0.x0;
import x0.z1;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, int i10) {
        super(0);
        this.f18875a = i10;
        this.f18876b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f18875a) {
            case 0:
                ((FocusTargetNode) this.f18876b).U1();
                return pg.f0.f21461a;
            default:
                ArrayList arrayList = ((z1) this.f18876b).f31984a;
                p.l0 l0Var = new p.l0(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    x0 x0Var = (x0) arrayList.get(i10);
                    Object obj = x0Var.f31959b;
                    int i11 = x0Var.f31958a;
                    z0.a.a(l0Var, obj != null ? new w0(Integer.valueOf(i11), x0Var.f31959b) : Integer.valueOf(i11), x0Var);
                }
                return new z0.a(l0Var);
        }
    }
}

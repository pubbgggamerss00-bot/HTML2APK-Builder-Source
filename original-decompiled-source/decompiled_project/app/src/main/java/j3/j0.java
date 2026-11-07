package j3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.s implements eh.l<eh.a<? extends pg.f0>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15086a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g0 g0Var) {
        super(1);
        this.f15086a = g0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(eh.a<? extends pg.f0> aVar) {
        final eh.a<? extends pg.f0> aVar2 = aVar;
        g0 g0Var = this.f15086a;
        Handler handler = g0Var.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar2.invoke();
        } else {
            Handler handler2 = g0Var.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: j3.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar2.invoke();
                    }
                });
            }
        }
        return pg.f0.f21461a;
    }
}

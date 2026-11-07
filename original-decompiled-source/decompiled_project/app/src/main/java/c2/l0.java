package c2;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements eh.l<MotionEvent, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f4673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var) {
        super(1);
        this.f4673a = k0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m0 m0Var = this.f4673a.f4654b;
        if (m0Var != null) {
            m0Var.invoke(motionEvent2);
            return pg.f0.f21461a;
        }
        kotlin.jvm.internal.r.h("onTouchEvent");
        throw null;
    }
}

package z;

import android.view.View;
import java.lang.reflect.Field;
import y3.q0;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f34661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f34662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, View view) {
        super(1);
        this.f34661a = x1Var;
        this.f34662b = view;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        x1 x1Var = this.f34661a;
        r0 r0Var = x1Var.f34687u;
        int i10 = x1Var.f34686t;
        View view = this.f34662b;
        if (i10 == 0) {
            Field field = y3.q0.f33885a;
            q0.c.b(view, r0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(r0Var);
            y3.q0.i(view, r0Var);
        }
        x1Var.f34686t++;
        return new v1(x1Var, view);
    }
}

package z;

import android.view.View;
import java.lang.reflect.Field;
import y3.q0;

/* loaded from: classes.dex */
public final class v1 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f34652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f34653b;

    public v1(x1 x1Var, View view) {
        this.f34652a = x1Var;
        this.f34653b = view;
    }

    @Override // x0.k0
    public final void a() {
        x1 x1Var = this.f34652a;
        int i10 = x1Var.f34686t - 1;
        x1Var.f34686t = i10;
        if (i10 == 0) {
            Field field = y3.q0.f33885a;
            View view = this.f34653b;
            q0.c.b(view, null);
            y3.q0.i(view, null);
            view.removeOnAttachStateChangeListener(x1Var.f34687u);
        }
    }
}

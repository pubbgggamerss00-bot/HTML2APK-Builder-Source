package z;

import android.os.Build;
import android.view.View;
import java.util.List;
import y3.i1;
import y3.x0;

/* loaded from: classes.dex */
public final class r0 extends x0.b implements Runnable, y3.u, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final x1 f34618c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34619d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34620e;

    /* renamed from: f, reason: collision with root package name */
    public y3.i1 f34621f;

    public r0(x1 x1Var) {
        super(!x1Var.f34685s ? 1 : 0);
        this.f34618c = x1Var;
    }

    @Override // y3.x0.b
    public final void a(y3.x0 x0Var) {
        this.f34619d = false;
        this.f34620e = false;
        y3.i1 i1Var = this.f34621f;
        if (x0Var.f33904a.a() != 0 && i1Var != null) {
            i1.q qVar = i1Var.f33825a;
            x1 x1Var = this.f34618c;
            x1Var.f34684r.f(f2.a(qVar.i(8)));
            x1Var.f34683q.f(f2.a(qVar.i(8)));
            x1.a(x1Var, i1Var);
        }
        this.f34621f = null;
    }

    @Override // y3.x0.b
    public final void b() {
        this.f34619d = true;
        this.f34620e = true;
    }

    @Override // y3.u
    public final y3.i1 c(View view, y3.i1 i1Var) {
        this.f34621f = i1Var;
        x1 x1Var = this.f34618c;
        t1 t1Var = x1Var.f34683q;
        i1.q qVar = i1Var.f33825a;
        t1Var.f(f2.a(qVar.i(8)));
        if (this.f34619d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f34620e) {
            x1Var.f34684r.f(f2.a(qVar.i(8)));
            x1.a(x1Var, i1Var);
        }
        return x1Var.f34685s ? y3.i1.f33824b : i1Var;
    }

    @Override // y3.x0.b
    public final y3.i1 d(y3.i1 i1Var, List<y3.x0> list) {
        x1 x1Var = this.f34618c;
        x1.a(x1Var, i1Var);
        return x1Var.f34685s ? y3.i1.f33824b : i1Var;
    }

    @Override // y3.x0.b
    public final x0.a e(x0.a aVar) {
        this.f34619d = false;
        return aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f34619d) {
            this.f34619d = false;
            this.f34620e = false;
            y3.i1 i1Var = this.f34621f;
            if (i1Var != null) {
                x1 x1Var = this.f34618c;
                x1Var.f34684r.f(f2.a(i1Var.f33825a.i(8)));
                x1.a(x1Var, i1Var);
                this.f34621f = null;
            }
        }
    }
}

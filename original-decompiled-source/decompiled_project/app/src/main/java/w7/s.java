package w7;

import android.view.View;
import g7.d0;
import g7.u;
import ph.l2;
import ph.z0;

/* loaded from: classes.dex */
public final class s implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public p f31424a;

    /* renamed from: b, reason: collision with root package name */
    public l2 f31425b;

    /* renamed from: c, reason: collision with root package name */
    public q f31426c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31427d;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q qVar = this.f31426c;
        if (qVar == null) {
            return;
        }
        this.f31427d = true;
        g7.t tVar = qVar.f31419a;
        f fVar = qVar.f31420b;
        uh.c cVar = tVar.f11526b;
        wh.c cVar2 = z0.f21632a;
        d0.a(fVar, ph.h.a(cVar, uh.o.f29764a.H0(), new u(tVar, null, fVar), 2));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        q qVar = this.f31426c;
        if (qVar != null) {
            qVar.d();
        }
    }
}

package t;

import android.view.KeyEvent;
import v.t1;

/* loaded from: classes.dex */
public class b0 extends a {
    public b0() {
        throw null;
    }

    @Override // t.a
    public final Object X1(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        z zVar = new z(this, null);
        a0 a0Var = new a0(this);
        t1.a aVar = v.t1.f30086a;
        Object objC = ph.j0.c(new v.y1(j0Var, zVar, a0Var, new v.x0(j0Var), null), eVar);
        ug.a aVar2 = ug.a.f29706a;
        if (objC != aVar2) {
            objC = pg.f0.f21461a;
        }
        return objC == aVar2 ? objC : pg.f0.f21461a;
    }

    @Override // t.a
    public final boolean b2(KeyEvent keyEvent) {
        return false;
    }

    @Override // t.a
    public final void c2(KeyEvent keyEvent) {
        this.f25147y.invoke();
    }
}

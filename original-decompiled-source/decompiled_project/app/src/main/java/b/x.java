package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.s implements eh.l<c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f3280a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var) {
        super(1);
        this.f3280a = d0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(c cVar) {
        w wVarPrevious;
        c backEvent = cVar;
        kotlin.jvm.internal.r.e(backEvent, "backEvent");
        d0 d0Var = this.f3280a;
        qg.l<w> lVar = d0Var.f3223b;
        ListIterator<w> listIterator = lVar.listIterator(lVar.c());
        while (true) {
            if (!listIterator.hasPrevious()) {
                wVarPrevious = null;
                break;
            }
            wVarPrevious = listIterator.previous();
            if (wVarPrevious.f3277a) {
                break;
            }
        }
        w wVar = wVarPrevious;
        if (d0Var.f3224c != null) {
            d0Var.b();
        }
        d0Var.f3224c = wVar;
        if (wVar != null) {
            wVar.d(backEvent);
        }
        return pg.f0.f21461a;
    }
}

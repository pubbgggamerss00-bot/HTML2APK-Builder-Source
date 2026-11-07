package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements eh.l<c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f3281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var) {
        super(1);
        this.f3281a = d0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(c cVar) {
        w wVarPrevious;
        c backEvent = cVar;
        kotlin.jvm.internal.r.e(backEvent, "backEvent");
        d0 d0Var = this.f3281a;
        w wVar = d0Var.f3224c;
        if (wVar == null) {
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
            wVar = wVarPrevious;
        }
        if (wVar != null) {
            wVar.c(backEvent);
        }
        return pg.f0.f21461a;
    }
}

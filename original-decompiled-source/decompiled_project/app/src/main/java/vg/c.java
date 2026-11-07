package vg;

import kotlin.jvm.internal.r;
import tg.f;
import tg.h;

/* loaded from: classes2.dex */
public abstract class c extends a {
    private final tg.h _context;
    private transient tg.e<Object> intercepted;

    public c(tg.e<Object> eVar, tg.h hVar) {
        super(eVar);
        this._context = hVar;
    }

    @Override // tg.e
    public tg.h getContext() {
        tg.h hVar = this._context;
        r.b(hVar);
        return hVar;
    }

    public final tg.e<Object> intercepted() {
        tg.e<Object> eVarV0 = this.intercepted;
        if (eVarV0 == null) {
            tg.f fVar = (tg.f) getContext().get(f.a.f28767a);
            eVarV0 = fVar != null ? fVar.v0(this) : this;
            this.intercepted = eVarV0;
        }
        return eVarV0;
    }

    @Override // vg.a
    public void releaseIntercepted() {
        tg.e<?> eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            h.a aVar = getContext().get(f.a.f28767a);
            r.b(aVar);
            ((tg.f) aVar).y0(eVar);
        }
        this.intercepted = b.f30976a;
    }

    public c(tg.e<Object> eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}

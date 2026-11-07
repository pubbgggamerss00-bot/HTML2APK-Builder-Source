package vg;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(tg.e<Object> eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != tg.i.f28768a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // tg.e
    public tg.h getContext() {
        return tg.i.f28768a;
    }
}

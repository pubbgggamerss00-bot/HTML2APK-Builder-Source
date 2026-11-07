package b8;

import w7.f;

/* loaded from: classes.dex */
public final class s {

    public static final class a implements eh.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3681a = new a();

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final w7.e a(w7.f fVar, Throwable th2) {
        g7.l lVarInvoke;
        if (th2 instanceof w7.l) {
            eh.l<w7.f, g7.l> lVar = fVar.f31341n;
            f.b bVar = fVar.f31347t;
            lVarInvoke = lVar.invoke(fVar);
            if (lVarInvoke == null) {
                lVarInvoke = bVar.f31373j.invoke(fVar);
            }
            if (lVarInvoke == null && (lVarInvoke = fVar.f31340m.invoke(fVar)) == null) {
                lVarInvoke = bVar.f31372i.invoke(fVar);
            }
        } else {
            lVarInvoke = fVar.f31340m.invoke(fVar);
            if (lVarInvoke == null) {
                lVarInvoke = fVar.f31347t.f31372i.invoke(fVar);
            }
        }
        return new w7.e(lVarInvoke, fVar, th2);
    }
}

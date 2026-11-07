package f9;

/* loaded from: classes.dex */
public final class nh {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10144a = 0;

    public static final Object a(tg.h hVar, Object obj, Object obj2, eh.p pVar, tg.e frame) {
        Object objInvoke;
        Object objC = uh.b0.c(hVar, obj2);
        try {
            th.z zVar = new th.z(frame, hVar);
            if (pVar == null) {
                objInvoke = ah.p.f(pVar, obj, zVar);
            } else {
                kotlin.jvm.internal.m0.b(2, pVar);
                objInvoke = pVar.invoke(obj, zVar);
            }
            uh.b0.a(hVar, objC);
            if (objInvoke == ug.a.f29706a) {
                kotlin.jvm.internal.r.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            uh.b0.a(hVar, objC);
            throw th2;
        }
    }
}

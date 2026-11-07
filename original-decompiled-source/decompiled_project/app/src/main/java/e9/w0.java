package e9;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8592a = 0;

    public static pg.j a(pg.k kVar, eh.a initializer) {
        pg.b0 b0Var = pg.b0.f21449a;
        kotlin.jvm.internal.r.e(initializer, "initializer");
        int iOrdinal = kVar.ordinal();
        if (iOrdinal == 0) {
            return new pg.s(initializer);
        }
        if (iOrdinal == 1) {
            pg.r rVar = new pg.r();
            rVar.f21474a = initializer;
            rVar.f21475b = b0Var;
            return rVar;
        }
        if (iOrdinal != 2) {
            throw new pg.l();
        }
        pg.g0 g0Var = new pg.g0();
        g0Var.f21462a = initializer;
        g0Var.f21463b = b0Var;
        return g0Var;
    }

    public static pg.s b(eh.a initializer) {
        kotlin.jvm.internal.r.e(initializer, "initializer");
        return new pg.s(initializer);
    }
}

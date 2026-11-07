package d0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7121a = 0;

    public static final void a(g0 g0Var, Object obj, int i10, Object obj2, x0.j jVar, int i11) {
        int i12;
        x0.k kVarP = jVar.p(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (kVarP.K(g0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= kVarP.K(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= kVarP.i(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= kVarP.K(obj2) ? 2048 : 1024;
        }
        if (kVarP.A(i12 & 1, (i12 & 1171) != 1170)) {
            ((g1.d) obj).e(obj2, f1.c.b(980966366, new d0(i10, g0Var, obj2), kVarP), kVarP, 48);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new e0(g0Var, obj, i10, obj2, i11);
        }
    }

    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (kotlin.jvm.internal.r.f(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}

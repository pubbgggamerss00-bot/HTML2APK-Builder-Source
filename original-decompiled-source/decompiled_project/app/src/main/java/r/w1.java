package r;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f22979a = new x1(new p2((y1) null, (l2) null, (j0) null, (f2) null, (LinkedHashMap) null, 63));

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f22980b = new x1(new p2((y1) null, (l2) null, (j0) null, (f2) null, (LinkedHashMap) null, 47));

    public abstract p2 a();

    public final x1 b(w1 w1Var) {
        y1 y1Var = w1Var.a().f22902a;
        if (y1Var == null) {
            y1Var = a().f22902a;
        }
        l2 l2Var = w1Var.a().f22903b;
        if (l2Var == null) {
            l2Var = a().f22903b;
        }
        j0 j0Var = w1Var.a().f22904c;
        if (j0Var == null) {
            j0Var = a().f22904c;
        }
        f2 f2Var = w1Var.a().f22905d;
        if (f2Var == null) {
            f2Var = a().f22905d;
        }
        return new x1(new p2(y1Var, l2Var, j0Var, f2Var, w1Var.a().f22906e || a().f22906e, qg.k0.f(a().f22907f, w1Var.a().f22907f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w1) && kotlin.jvm.internal.r.a(((w1) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(f22979a)) {
            return "ExitTransition.None";
        }
        if (equals(f22980b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        p2 p2VarA = a();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        y1 y1Var = p2VarA.f22902a;
        sb.append(y1Var != null ? y1Var.toString() : null);
        sb.append(",\nSlide - ");
        l2 l2Var = p2VarA.f22903b;
        sb.append(l2Var != null ? l2Var.toString() : null);
        sb.append(",\nShrink - ");
        j0 j0Var = p2VarA.f22904c;
        sb.append(j0Var != null ? j0Var.toString() : null);
        sb.append(",\nScale - ");
        f2 f2Var = p2VarA.f22905d;
        sb.append(f2Var != null ? f2Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(p2VarA.f22906e);
        return sb.toString();
    }
}

package y2;

/* loaded from: classes.dex */
public final class d0 {
    public static final t2.b a(c0 c0Var) {
        t2.b bVar = c0Var.f33682a;
        long j10 = c0Var.f33683b;
        bVar.getClass();
        return bVar.subSequence(t2.j0.e(j10), t2.j0.d(j10));
    }

    public static final t2.b b(c0 c0Var, int i10) {
        t2.b bVar = c0Var.f33682a;
        long j10 = c0Var.f33683b;
        return bVar.subSequence(t2.j0.d(j10), Math.min(t2.j0.d(j10) + i10, c0Var.f33682a.f27761b.length()));
    }

    public static final t2.b c(c0 c0Var, int i10) {
        t2.b bVar = c0Var.f33682a;
        long j10 = c0Var.f33683b;
        return bVar.subSequence(Math.max(0, t2.j0.e(j10) - i10), t2.j0.e(j10));
    }
}

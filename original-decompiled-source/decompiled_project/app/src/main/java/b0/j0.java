package b0;

/* loaded from: classes.dex */
public interface j0 {
    static /* synthetic */ void b(j0 j0Var, String str, f1.b bVar, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        j0Var.a(str, bVar);
    }

    default void a(Object obj, f1.b bVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void d(int i10, eh.l lVar, eh.l lVar2, f1.b bVar) {
        throw new IllegalStateException("The method is not implemented");
    }
}

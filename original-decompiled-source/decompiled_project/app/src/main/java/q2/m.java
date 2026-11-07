package q2;

/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends kotlin.jvm.internal.s implements eh.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21803a = new a(0);

        @Override // eh.a
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(l lVar, c0<T> c0Var) {
        T t3 = (T) lVar.f21799a.d(c0Var);
        return t3 == null ? a.f21803a.invoke() : t3;
    }
}

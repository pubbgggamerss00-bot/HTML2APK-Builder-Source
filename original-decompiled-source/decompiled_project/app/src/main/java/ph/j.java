package ph;

/* loaded from: classes2.dex */
public interface j extends g2 {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final eh.l<Throwable, pg.f0> f21551a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.l<? super Throwable, pg.f0> lVar) {
            this.f21551a = lVar;
        }

        @Override // ph.j
        public final void d(Throwable th2) {
            this.f21551a.invoke(th2);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f21551a.getClass().getSimpleName() + '@' + m0.a(this) + ']';
        }
    }

    void d(Throwable th2);
}

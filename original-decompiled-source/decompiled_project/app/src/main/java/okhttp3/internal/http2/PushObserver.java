package okhttp3.internal.http2;

/* loaded from: classes2.dex */
public interface PushObserver {

    /* renamed from: a, reason: collision with root package name */
    public static final PushObserver f19733a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19734a = 0;

        public static final class PushObserverCancel implements PushObserver {
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f19734a;
        f19733a = new Companion.PushObserverCancel();
    }
}

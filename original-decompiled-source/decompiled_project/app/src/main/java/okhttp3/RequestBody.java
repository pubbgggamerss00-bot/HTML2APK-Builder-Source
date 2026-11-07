package okhttp3;

import hi.d0;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19348a = new Companion(0);

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public long a() throws IOException {
        return -1L;
    }

    public abstract MediaType b();

    public abstract void c(d0 d0Var) throws IOException;
}

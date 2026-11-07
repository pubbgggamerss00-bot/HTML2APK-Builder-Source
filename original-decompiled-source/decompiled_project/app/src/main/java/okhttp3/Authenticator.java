package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.r;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* loaded from: classes2.dex */
public interface Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public static final Authenticator f19160a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19161a = 0;

        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public final Request a(Route route, Response response) {
                r.e(response, "response");
                return null;
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f19161a;
        f19160a = new Companion.AuthenticatorNone();
        new JavaNetAuthenticator(0);
    }

    Request a(Route route, Response response) throws IOException;
}

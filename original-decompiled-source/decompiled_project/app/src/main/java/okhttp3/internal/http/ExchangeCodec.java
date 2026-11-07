package okhttp3.internal.http;

import hi.j0;
import hi.l0;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public interface ExchangeCodec {

    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    void a() throws IOException;

    void b(Request request) throws IOException;

    l0 c(Response response) throws IOException;

    void cancel();

    Response.Builder d(boolean z10) throws IOException;

    RealConnection e();

    void f() throws IOException;

    long g(Response response) throws IOException;

    j0 h(Request request, long j10) throws IOException;
}

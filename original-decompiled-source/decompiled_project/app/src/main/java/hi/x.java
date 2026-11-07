package hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class x {
    public static final d0 a(j0 j0Var) {
        kotlin.jvm.internal.r.e(j0Var, "<this>");
        return new d0(j0Var);
    }

    public static final f0 b(l0 l0Var) {
        kotlin.jvm.internal.r.e(l0Var, "<this>");
        return new f0(l0Var);
    }

    public static final boolean c(AssertionError assertionError) {
        Logger logger = y.f13119a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? mh.x.r(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final d d(Socket socket) throws IOException {
        Logger logger = y.f13119a;
        k0 k0Var = new k0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.r.d(outputStream, "getOutputStream(...)");
        return new d(k0Var, new a0(outputStream, k0Var));
    }

    public static final a0 e(OutputStream outputStream) {
        Logger logger = y.f13119a;
        return new a0(outputStream, new m0());
    }

    public static final e f(Socket socket) throws IOException {
        Logger logger = y.f13119a;
        k0 k0Var = new k0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.r.d(inputStream, "getInputStream(...)");
        return new e(k0Var, new t(inputStream, k0Var));
    }

    public static final t g(File file) throws FileNotFoundException {
        Logger logger = y.f13119a;
        kotlin.jvm.internal.r.e(file, "<this>");
        return new t(new FileInputStream(file), m0.f13094d);
    }

    public static final t h(InputStream inputStream) {
        Logger logger = y.f13119a;
        kotlin.jvm.internal.r.e(inputStream, "<this>");
        return new t(inputStream, new m0());
    }
}

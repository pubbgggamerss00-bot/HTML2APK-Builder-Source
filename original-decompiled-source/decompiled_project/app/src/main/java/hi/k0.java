package hi;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class k0 extends c {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f13079m;

    public k0(Socket socket) {
        this.f13079m = socket;
    }

    @Override // hi.c
    public final void j() throws IOException {
        Socket socket = this.f13079m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!x.c(e10)) {
                throw e10;
            }
            y.f13119a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            y.f13119a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}

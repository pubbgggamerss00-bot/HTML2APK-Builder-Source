package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public interface SocketAdapter {

    public static final class DefaultImpls {
    }

    boolean a();

    boolean b(SSLSocket sSLSocket);

    String c(SSLSocket sSLSocket);

    void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list);
}

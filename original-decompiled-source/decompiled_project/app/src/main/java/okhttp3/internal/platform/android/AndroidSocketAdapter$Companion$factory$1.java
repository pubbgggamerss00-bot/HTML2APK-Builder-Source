package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import mh.t;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* loaded from: classes2.dex */
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final boolean b(SSLSocket sSLSocket) {
        return t.p(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final SocketAdapter c(SSLSocket sSLSocket) {
        AndroidSocketAdapter.Companion companion = AndroidSocketAdapter.f19779f;
        Class<?> cls = sSLSocket.getClass();
        companion.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new AndroidSocketAdapter(superclass);
    }
}

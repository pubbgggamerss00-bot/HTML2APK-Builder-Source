package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import mh.a;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f19779f = new Companion(0);

    /* renamed from: g, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f19780g = new AndroidSocketAdapter$Companion$factory$1();

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super SSLSocket> f19781a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f19782b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f19783c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f19784d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f19785e;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) throws NoSuchMethodException, SecurityException {
        this.f19781a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        r.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f19782b = declaredMethod;
        this.f19783c = cls.getMethod("setHostname", String.class);
        this.f19784d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f19785e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        AndroidPlatform.f19741f.getClass();
        return AndroidPlatform.f19742g;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.f19781a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (this.f19781a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f19784d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, a.f18238b);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !r.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e11);
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        r.e(protocols, "protocols");
        if (this.f19781a.isInstance(sSLSocket)) {
            try {
                this.f19782b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f19783c.invoke(sSLSocket, str);
                }
                Method method = this.f19785e;
                Platform.f19768a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}

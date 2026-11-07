package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f19754i = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public final Method f19755d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f19756e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f19757f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f19758g;

    /* renamed from: h, reason: collision with root package name */
    public final Class<?> f19759h;

    public static final class AlpnProvider implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19760a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19761b;

        /* renamed from: c, reason: collision with root package name */
        public String f19762c;

        public AlpnProvider(ArrayList arrayList) {
            this.f19760a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            r.e(proxy, "proxy");
            r.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (r.a(name, "supports") && r.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (r.a(name, "unsupported") && r.a(Void.TYPE, returnType)) {
                this.f19761b = true;
                return null;
            }
            boolean zA = r.a(name, "protocols");
            ArrayList arrayList = this.f19760a;
            if (zA && objArr.length == 0) {
                return arrayList;
            }
            if ((r.a(name, "selectProtocol") || r.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            r.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!arrayList.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f19762c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f19762c = str2;
                    return str2;
                }
            }
            if ((!r.a(name, "protocolSelected") && !r.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            r.c(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f19762c = (String) obj3;
            return null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f19755d = method;
        this.f19756e = method2;
        this.f19757f = method3;
        this.f19758g = cls;
        this.f19759h = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f19757f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        r.e(protocols, "protocols");
        Platform.f19768a.getClass();
        try {
            this.f19755d.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f19758g, this.f19759h}, new AlpnProvider(Platform.Companion.a(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f19756e.invoke(null, sSLSocket));
            r.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z10 = alpnProvider.f19761b;
            if (!z10 && alpnProvider.f19762c == null) {
                Platform.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z10) {
                return null;
            }
            return alpnProvider.f19762c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}

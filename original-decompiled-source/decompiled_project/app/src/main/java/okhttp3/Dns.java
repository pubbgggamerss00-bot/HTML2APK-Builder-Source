package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.r;
import qg.o;

/* loaded from: classes2.dex */
public interface Dns {

    /* renamed from: a, reason: collision with root package name */
    public static final Dns f19239a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19240a = 0;

        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public final List<InetAddress> a(String hostname) throws UnknownHostException {
                r.e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    r.d(allByName, "getAllByName(hostname)");
                    return o.B(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f19240a;
        f19239a = new Companion.DnsSystem();
    }

    List<InetAddress> a(String str) throws UnknownHostException;
}

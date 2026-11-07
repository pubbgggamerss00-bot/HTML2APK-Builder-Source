package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes2.dex */
public abstract class CertificateChainCleaner {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19808a = new Companion(0);

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public abstract List a(String str, List list) throws SSLPeerUnverifiedException;
}

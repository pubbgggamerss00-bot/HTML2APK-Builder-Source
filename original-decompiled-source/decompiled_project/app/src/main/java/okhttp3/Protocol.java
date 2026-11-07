package okhttp3;

import java.io.IOException;

/* loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: b, reason: collision with root package name */
    public static final Companion f19328b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f19336a;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static Protocol a(String str) throws IOException {
            Protocol protocol = Protocol.HTTP_1_0;
            if (str.equals("http/1.0")) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (str.equals("http/1.1")) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (str.equals("h2_prior_knowledge")) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (str.equals("h2")) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (str.equals("spdy/3.1")) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (str.equals("quic")) {
                return protocol6;
            }
            throw new IOException("Unexpected protocol: ".concat(str));
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.f19336a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f19336a;
    }
}

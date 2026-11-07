package okhttp3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.r;
import mh.t;

/* loaded from: classes2.dex */
public final class CipherSuite {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f19187b;

    /* renamed from: c, reason: collision with root package name */
    public static final CipherSuite$Companion$ORDER_BY_NAME$1 f19188c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f19189d;

    /* renamed from: e, reason: collision with root package name */
    public static final CipherSuite f19190e;

    /* renamed from: f, reason: collision with root package name */
    public static final CipherSuite f19191f;

    /* renamed from: g, reason: collision with root package name */
    public static final CipherSuite f19192g;

    /* renamed from: h, reason: collision with root package name */
    public static final CipherSuite f19193h;

    /* renamed from: i, reason: collision with root package name */
    public static final CipherSuite f19194i;

    /* renamed from: j, reason: collision with root package name */
    public static final CipherSuite f19195j;

    /* renamed from: k, reason: collision with root package name */
    public static final CipherSuite f19196k;

    /* renamed from: l, reason: collision with root package name */
    public static final CipherSuite f19197l;

    /* renamed from: m, reason: collision with root package name */
    public static final CipherSuite f19198m;

    /* renamed from: n, reason: collision with root package name */
    public static final CipherSuite f19199n;

    /* renamed from: o, reason: collision with root package name */
    public static final CipherSuite f19200o;

    /* renamed from: p, reason: collision with root package name */
    public static final CipherSuite f19201p;

    /* renamed from: q, reason: collision with root package name */
    public static final CipherSuite f19202q;

    /* renamed from: r, reason: collision with root package name */
    public static final CipherSuite f19203r;

    /* renamed from: s, reason: collision with root package name */
    public static final CipherSuite f19204s;

    /* renamed from: t, reason: collision with root package name */
    public static final CipherSuite f19205t;

    /* renamed from: a, reason: collision with root package name */
    public final String f19206a;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final CipherSuite a(Companion companion, String str) {
            CipherSuite cipherSuite = new CipherSuite(str);
            CipherSuite.f19189d.put(str, cipherSuite);
            return cipherSuite;
        }

        public final synchronized CipherSuite b(String javaName) {
            CipherSuite cipherSuite;
            String strConcat;
            try {
                r.e(javaName, "javaName");
                LinkedHashMap linkedHashMap = CipherSuite.f19189d;
                cipherSuite = (CipherSuite) linkedHashMap.get(javaName);
                if (cipherSuite == null) {
                    if (t.p(javaName, "TLS_", false)) {
                        String strSubstring = javaName.substring(4);
                        r.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                        strConcat = "SSL_".concat(strSubstring);
                    } else if (t.p(javaName, "SSL_", false)) {
                        String strSubstring2 = javaName.substring(4);
                        r.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        strConcat = "TLS_".concat(strSubstring2);
                    } else {
                        strConcat = javaName;
                    }
                    cipherSuite = (CipherSuite) linkedHashMap.get(strConcat);
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(javaName);
                    }
                    linkedHashMap.put(javaName, cipherSuite);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return cipherSuite;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(0);
        f19187b = companion;
        f19188c = new CipherSuite$Companion$ORDER_BY_NAME$1();
        f19189d = new LinkedHashMap();
        Companion.a(companion, "SSL_RSA_WITH_NULL_MD5");
        Companion.a(companion, "SSL_RSA_WITH_NULL_SHA");
        Companion.a(companion, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        Companion.a(companion, "SSL_RSA_WITH_RC4_128_MD5");
        Companion.a(companion, "SSL_RSA_WITH_RC4_128_SHA");
        Companion.a(companion, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_RSA_WITH_DES_CBC_SHA");
        f19190e = Companion.a(companion, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        Companion.a(companion, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        Companion.a(companion, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        Companion.a(companion, "SSL_DH_anon_WITH_RC4_128_MD5");
        Companion.a(companion, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_DH_anon_WITH_DES_CBC_SHA");
        Companion.a(companion, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_DES_CBC_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_DES_CBC_MD5");
        Companion.a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        Companion.a(companion, "TLS_KRB5_WITH_RC4_128_MD5");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f19191f = Companion.a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f19192g = Companion.a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_RSA_WITH_NULL_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        Companion.a(companion, "TLS_PSK_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_PSK_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_PSK_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_RSA_WITH_SEED_CBC_SHA");
        f19193h = Companion.a(companion, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f19194i = Companion.a(companion, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        Companion.a(companion, "TLS_FALLBACK_SCSV");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f19195j = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f19196k = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f19197l = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f19198m = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f19199n = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f19200o = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f19201p = Companion.a(companion, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f19202q = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        Companion.a(companion, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        Companion.a(companion, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f19203r = Companion.a(companion, "TLS_AES_128_GCM_SHA256");
        f19204s = Companion.a(companion, "TLS_AES_256_GCM_SHA384");
        f19205t = Companion.a(companion, "TLS_CHACHA20_POLY1305_SHA256");
        Companion.a(companion, "TLS_AES_128_CCM_SHA256");
        Companion.a(companion, "TLS_AES_128_CCM_8_SHA256");
    }

    public CipherSuite(String str) {
        this.f19206a = str;
    }

    public final String toString() {
        return this.f19206a;
    }
}

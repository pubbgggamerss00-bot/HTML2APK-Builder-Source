package com.htmltoapk.template;

import com.google.android.gms.ads.RequestConfiguration;
import java.net.IDN;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import x5.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class TrustedOrigins {
    public static final String LOCAL_HOST = "appassets.androidplatform.net";
    private final List<Rule> rules;
    public static final Companion Companion = new Companion(null);
    private static final x5.e ORIGIN_PATTERN = new x5.e("^([a-zA-Z][a-zA-Z0-9+.-]*)://(?:[^/?#@]*@)?(\\[[^\\]]+\\]|[^/?#:]+)(?::(\\d+))?");

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int defaultPort(String str) {
            return kotlin.jvm.internal.j.a(str, "http") ? 80 : 443;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Origin parseOrigin(String str) {
            CharSequence charSequenceSubSequence;
            Integer numI;
            x5.d dVarA = x5.e.a(TrustedOrigins.ORIGIN_PATTERN, str);
            if (dVarA == null) {
                return null;
            }
            String str2 = (String) ((d.a) dVarA.a()).get(1);
            Locale locale = Locale.ROOT;
            kotlin.jvm.internal.j.d("ROOT", locale);
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
            if (!lowerCase.equals("http") && !lowerCase.equals("https")) {
                return null;
            }
            String lowerCase2 = ((String) ((d.a) dVarA.a()).get(2)).toLowerCase(locale);
            kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase2);
            char[] cArr = {'.'};
            int length = lowerCase2.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (!e5.j.u(cArr, lowerCase2.charAt(length))) {
                        charSequenceSubSequence = lowerCase2.subSequence(0, length + 1);
                        break;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    length = i6;
                }
                charSequenceSubSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                charSequenceSubSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            String string = charSequenceSubSequence.toString();
            if (string.length() == 0) {
                return null;
            }
            if (!x5.l.n(string, "[", false)) {
                try {
                    String ascii = IDN.toASCII(string);
                    kotlin.jvm.internal.j.d("toASCII(...)", ascii);
                    Locale locale2 = Locale.ROOT;
                    kotlin.jvm.internal.j.d("ROOT", locale2);
                    string = ascii.toLowerCase(locale2);
                    kotlin.jvm.internal.j.d("toLowerCase(...)", string);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            Object obj = ((d.a) dVarA.a()).get(3);
            String str3 = (String) (((String) obj).length() > 0 ? obj : null);
            return new Origin(lowerCase, string, (str3 == null || (numI = x5.k.i(str3)) == null) ? defaultPort(lowerCase) : numI.intValue());
        }

        public final TrustedOrigins forUrl(String str) {
            boolean z6;
            kotlin.jvm.internal.j.e("startUrl", str);
            Origin origin = parseOrigin(x5.o.G(str).toString());
            kotlin.jvm.internal.f fVar = null;
            if (origin == null) {
                return new TrustedOrigins(e5.s.s, fVar);
            }
            String host = origin.getHost();
            if (!x5.o.p(host, '.') || x5.l.n(host, "[", false)) {
                z6 = false;
            } else {
                for (int i6 = 0; i6 < host.length(); i6++) {
                    char cCharAt = host.charAt(i6);
                    if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
            }
            if (z6 && x5.l.n(host, "www.", false)) {
                int i7 = 0;
                for (int i8 = 0; i8 < host.length(); i8++) {
                    if (host.charAt(i8) == '.') {
                        i7++;
                    }
                }
                if (i7 >= 2) {
                    host = x5.o.z(host, "www.");
                }
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new Rule("https", host, kotlin.jvm.internal.j.a(origin.getScheme(), "https") ? origin.getPort() : 443, z6));
            if (kotlin.jvm.internal.j.a(origin.getScheme(), "http")) {
                arrayList.add(new Rule("http", host, origin.getPort(), z6));
            }
            return new TrustedOrigins(arrayList, fVar);
        }

        public final TrustedOrigins local() {
            return new TrustedOrigins(e5.k.a(new Rule("https", TrustedOrigins.LOCAL_HOST, 443, false)), null);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Origin {
        private final String host;
        private final int port;
        private final String scheme;

        public Origin(String str, String str2, int i6) {
            kotlin.jvm.internal.j.e("scheme", str);
            kotlin.jvm.internal.j.e("host", str2);
            this.scheme = str;
            this.host = str2;
            this.port = i6;
        }

        public static /* synthetic */ Origin copy$default(Origin origin, String str, String str2, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = origin.scheme;
            }
            if ((i7 & 2) != 0) {
                str2 = origin.host;
            }
            if ((i7 & 4) != 0) {
                i6 = origin.port;
            }
            return origin.copy(str, str2, i6);
        }

        public final String component1() {
            return this.scheme;
        }

        public final String component2() {
            return this.host;
        }

        public final int component3() {
            return this.port;
        }

        public final Origin copy(String str, String str2, int i6) {
            kotlin.jvm.internal.j.e("scheme", str);
            kotlin.jvm.internal.j.e("host", str2);
            return new Origin(str, str2, i6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Origin)) {
                return false;
            }
            Origin origin = (Origin) obj;
            return kotlin.jvm.internal.j.a(this.scheme, origin.scheme) && kotlin.jvm.internal.j.a(this.host, origin.host) && this.port == origin.port;
        }

        public final String getHost() {
            return this.host;
        }

        public final int getPort() {
            return this.port;
        }

        public final String getScheme() {
            return this.scheme;
        }

        public int hashCode() {
            return Integer.hashCode(this.port) + androidx.camera.view.g.d(this.scheme.hashCode() * 31, 31, this.host);
        }

        public String toString() {
            String str = this.scheme;
            String str2 = this.host;
            return androidx.camera.camera2.internal.p0.a(androidx.camera.camera2.internal.i0.a("Origin(scheme=", str, ", host=", str2, ", port="), this.port, ")");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Rule {
        private final String host;
        private final int port;
        private final String scheme;
        private final boolean subdomains;

        public Rule(String str, String str2, int i6, boolean z6) {
            kotlin.jvm.internal.j.e("scheme", str);
            kotlin.jvm.internal.j.e("host", str2);
            this.scheme = str;
            this.host = str2;
            this.port = i6;
            this.subdomains = z6;
        }

        public static /* synthetic */ Rule copy$default(Rule rule, String str, String str2, int i6, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = rule.scheme;
            }
            if ((i7 & 2) != 0) {
                str2 = rule.host;
            }
            if ((i7 & 4) != 0) {
                i6 = rule.port;
            }
            if ((i7 & 8) != 0) {
                z6 = rule.subdomains;
            }
            return rule.copy(str, str2, i6, z6);
        }

        public final String component1() {
            return this.scheme;
        }

        public final String component2() {
            return this.host;
        }

        public final int component3() {
            return this.port;
        }

        public final boolean component4() {
            return this.subdomains;
        }

        public final Rule copy(String str, String str2, int i6, boolean z6) {
            kotlin.jvm.internal.j.e("scheme", str);
            kotlin.jvm.internal.j.e("host", str2);
            return new Rule(str, str2, i6, z6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return kotlin.jvm.internal.j.a(this.scheme, rule.scheme) && kotlin.jvm.internal.j.a(this.host, rule.host) && this.port == rule.port && this.subdomains == rule.subdomains;
        }

        public final String getHost() {
            return this.host;
        }

        public final int getPort() {
            return this.port;
        }

        public final String getScheme() {
            return this.scheme;
        }

        public final boolean getSubdomains() {
            return this.subdomains;
        }

        public int hashCode() {
            return Boolean.hashCode(this.subdomains) + ((Integer.hashCode(this.port) + androidx.camera.view.g.d(this.scheme.hashCode() * 31, 31, this.host)) * 31);
        }

        public String toString() {
            String str = this.scheme;
            String str2 = this.host;
            int i6 = this.port;
            boolean z6 = this.subdomains;
            StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Rule(scheme=", str, ", host=", str2, ", port=");
            sbA.append(i6);
            sbA.append(", subdomains=");
            sbA.append(z6);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public /* synthetic */ TrustedOrigins(List list, kotlin.jvm.internal.f fVar) {
        this(list);
    }

    public final Set<String> documentStartRules() {
        List<Rule> list = this.rules;
        ArrayList arrayList = new ArrayList();
        for (Rule rule : list) {
            String strD = rule.getPort() == Companion.defaultPort(rule.getScheme()) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : androidx.camera.camera2.internal.compat.workaround.c.d(rule.getPort(), ":");
            String str = rule.getScheme() + "://" + rule.getHost() + strD;
            e5.p.e(arrayList, rule.getSubdomains() ? e5.l.c(str, rule.getScheme() + "://*." + rule.getHost() + strD) : e5.k.a(str));
        }
        return e5.q.l(arrayList);
    }

    public final boolean isEmpty() {
        return this.rules.isEmpty();
    }

    public final boolean matches(String str) {
        Origin origin;
        List<Rule> list;
        Companion companion = Companion;
        if (str != null && (origin = companion.parseOrigin(str)) != null && ((list = this.rules) == null || !list.isEmpty())) {
            for (Rule rule : list) {
                if (kotlin.jvm.internal.j.a(rule.getScheme(), origin.getScheme()) && rule.getPort() == origin.getPort()) {
                    if (kotlin.jvm.internal.j.a(origin.getHost(), rule.getHost())) {
                        return true;
                    }
                    if (rule.getSubdomains()) {
                        if (x5.l.j(origin.getHost(), "." + rule.getHost(), false)) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    private TrustedOrigins(List<Rule> list) {
        this.rules = list;
    }
}

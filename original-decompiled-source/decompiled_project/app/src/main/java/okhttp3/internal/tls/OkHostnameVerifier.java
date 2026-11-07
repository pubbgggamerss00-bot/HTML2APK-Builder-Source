package okhttp3.internal.tls;

import ad.b;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import p.i0;
import qg.z;

/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f19809a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static List a(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return z.f22752a;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && r.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(b.b(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbB = i0.b(length2, "endIndex > string.length: ", " > ");
            sbB.append(str.length());
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i11 = i12;
                    } else {
                        j10 += 4;
                        i11 += 2;
                    }
                }
                j10 += i10;
            }
            i11++;
        }
        return length == ((int) j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String host, X509Certificate x509Certificate) throws CertificateParsingException {
        boolean zA;
        int length;
        r.e(host, "host");
        byte[] bArr = Util.f19393a;
        if (Util.f19398f.e(host)) {
            String strB = HostnamesKt.b(host);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (r.a(strB, HostnamesKt.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale US = Locale.US;
            r.d(US, "US");
            host = host.toLowerCase(US);
            r.d(host, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                f19809a.getClass();
                if (host.length() != 0 && !t.p(host, ".", false) && !t.i(host, "..", false) && lowerCase != null && lowerCase.length() != 0 && !t.p(lowerCase, ".", false) && !t.i(lowerCase, "..", false)) {
                    String strConcat = !t.i(host, ".", false) ? host.concat(".") : host;
                    if (!t.i(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (b(lowerCase)) {
                        Locale US2 = Locale.US;
                        r.d(US2, "US");
                        lowerCase = lowerCase.toLowerCase(US2);
                        r.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!x.r(lowerCase, "*", false)) {
                        zA = r.a(strConcat, lowerCase);
                    } else if (!t.p(lowerCase, "*.", false) || x.x(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        r.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (t.i(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || x.C(strConcat, '.', length - 1, 4) == -1)) {
                            zA = true;
                        }
                    }
                    if (zA) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        r.e(host, "host");
        r.e(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                r.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}

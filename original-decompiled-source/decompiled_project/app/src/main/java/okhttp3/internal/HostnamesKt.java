package okhttp3.internal;

import hi.g;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes2.dex */
public final class HostnamesKt {
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress a(int i10, int i11, String str) {
        int i12;
        byte[] bArr = new byte[16];
        int i13 = i10;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (true) {
            if (i13 >= i11) {
                break;
            }
            if (i14 == 16) {
                return null;
            }
            int i17 = i13 + 2;
            if (i17 <= i11 && t.o(str, "::", i13, false)) {
                if (i15 != -1) {
                    return null;
                }
                i14 += 2;
                i15 = i14;
                if (i17 == i11) {
                    break;
                }
                i16 = i17;
                int i18 = 0;
                i13 = i16;
                while (i13 < i11) {
                }
                i12 = i13 - i16;
                return i12 == 0 ? null : null;
            }
            if (i14 != 0) {
                if (t.o(str, ":", i13, false)) {
                    i13++;
                } else {
                    if (!t.o(str, ".", i13, false)) {
                        return null;
                    }
                    int i19 = i14 - 2;
                    int i20 = i19;
                    while (i16 < i11) {
                        if (i20 == 16) {
                            return null;
                        }
                        if (i20 != i19) {
                            if (str.charAt(i16) != '.') {
                                return null;
                            }
                            i16++;
                        }
                        int i21 = 0;
                        int i22 = i16;
                        while (i22 < i11) {
                            char cCharAt = str.charAt(i22);
                            if (r.f(cCharAt, 48) < 0 || r.f(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i21 == 0 && i16 != i22) || ((i21 * 10) + cCharAt) - 48 > 255) {
                                return null;
                            }
                            i22++;
                        }
                        if (i22 - i16 == 0) {
                            return null;
                        }
                        bArr[i20] = (byte) i21;
                        i20++;
                        i16 = i22;
                    }
                    if (i20 != i14 + 2) {
                        return null;
                    }
                    i14 += 2;
                }
            }
            i16 = i13;
            int i182 = 0;
            i13 = i16;
            while (i13 < i11) {
                int iQ = Util.q(str.charAt(i13));
                if (iQ == -1) {
                    break;
                }
                i182 = (i182 << 4) + iQ;
                i13++;
            }
            i12 = i13 - i16;
            if (i12 == 0 && i12 <= 4) {
                int i23 = i14 + 1;
                bArr[i14] = (byte) (255 & (i182 >>> 8));
                i14 += 2;
                bArr[i23] = (byte) (i182 & 255);
            }
        }
    }

    public static final String b(String str) {
        r.e(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!x.r(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                r.d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                r.d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                r.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (r.f(cCharAt, 31) <= 0 || r.f(cCharAt, CertificateBody.profileType) >= 0 || x.x(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressA = (t.p(str, "[", false) && t.i(str, "]", false)) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        g gVar = new g();
        while (i10 < address.length) {
            if (i10 == i11) {
                gVar.q0(58);
                i10 += i14;
                if (i10 == 16) {
                    gVar.q0(58);
                }
            } else {
                if (i10 > 0) {
                    gVar.q0(58);
                }
                byte b10 = address[i10];
                byte[] bArr = Util.f19393a;
                gVar.v0(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return gVar.e0();
    }
}

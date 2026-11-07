package cf;

import java.util.HashMap;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5566a = new int[256];

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5567b = new HashMap(256);

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            if ((i10 <= 23 || i10 >= 32) && ((i10 <= 126 || i10 >= 161) && i10 != 173)) {
                a(i10, (char) i10);
            }
        }
        a(24, (char) 728);
        a(25, (char) 711);
        a(26, (char) 710);
        a(27, (char) 729);
        a(28, (char) 733);
        a(29, (char) 731);
        a(30, (char) 730);
        a(31, (char) 732);
        a(CertificateBody.profileType, (char) 65533);
        a(128, (char) 8226);
        a(129, (char) 8224);
        a(130, (char) 8225);
        a(131, (char) 8230);
        a(132, (char) 8212);
        a(133, (char) 8211);
        a(134, (char) 402);
        a(135, (char) 8260);
        a(136, (char) 8249);
        a(137, (char) 8250);
        a(138, (char) 8722);
        a(139, (char) 8240);
        a(140, (char) 8222);
        a(141, (char) 8220);
        a(142, (char) 8221);
        a(143, (char) 8216);
        a(144, (char) 8217);
        a(145, (char) 8218);
        a(146, (char) 8482);
        a(147, (char) 64257);
        a(148, (char) 64258);
        a(149, (char) 321);
        a(150, (char) 338);
        a(151, (char) 352);
        a(152, (char) 376);
        a(153, (char) 381);
        a(154, (char) 305);
        a(155, (char) 322);
        a(156, (char) 339);
        a(157, (char) 353);
        a(158, (char) 382);
        a(159, (char) 65533);
        a(160, (char) 8364);
    }

    public static void a(int i10, char c10) {
        f5566a[i10] = c10;
        f5567b.put(Character.valueOf(c10), Integer.valueOf(i10));
    }
}

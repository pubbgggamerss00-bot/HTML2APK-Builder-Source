package okhttp3;

import b6.n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;
import mh.t;
import x0.s1;

/* loaded from: classes2.dex */
public final class MediaType {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f19273c = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19274d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f19275e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f19276a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f19277b;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static MediaType a(String str) {
            r.e(str, "<this>");
            Matcher matcher = MediaType.f19274d.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            r.d(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            r.d(US, "US");
            r.d(strGroup.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            r.d(strGroup2, "typeSubtype.group(2)");
            r.d(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f19275e.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    r.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(s1.a(sb, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (t.p(strGroup4, "'", false) && t.i(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        r.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, (String[]) arrayList.toArray(new String[0]));
        }

        private Companion() {
        }
    }

    public MediaType(String str, String[] strArr) {
        this.f19276a = str;
        this.f19277b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f19277b;
        int i10 = 0;
        int iD = n.d(0, strArr.length - 1, 2);
        if (iD < 0) {
            str = null;
            break;
        }
        while (!t.j(strArr[i10], "charset", true)) {
            if (i10 == iD) {
                str = null;
                break;
            }
            i10 += 2;
        }
        str = strArr[i10 + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && r.a(((MediaType) obj).f19276a, this.f19276a);
    }

    public final int hashCode() {
        return this.f19276a.hashCode();
    }

    public final String toString() {
        return this.f19276a;
    }
}

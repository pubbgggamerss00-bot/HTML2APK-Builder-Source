package p9;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import r9.l;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final String f21356c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<o9.b> f21357d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f21358e;

    /* renamed from: a, reason: collision with root package name */
    public final String f21359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21360b;

    static {
        String strD = d.d("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f21356c = strD;
        d.d("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d.d("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f21357d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new o9.b("proto"), new o9.b("json"))));
        f21358e = new a(strD, null);
    }

    public a(String str, String str2) {
        this.f21359a = str;
        this.f21360b = str2;
    }

    public static a b(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // r9.l
    public final Set<o9.b> a() {
        return f21357d;
    }

    @Override // r9.l
    public final byte[] getExtras() {
        String str = this.f21359a;
        String str2 = this.f21360b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return b6.a.b("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
    }
}

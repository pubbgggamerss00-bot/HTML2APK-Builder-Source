package q0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f14099b = new g(new i(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final i f14100a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f14101a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    public g(i iVar) {
        this.f14100a = iVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f14099b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = strArrSplit[i6];
            int i7 = a.f14101a;
            localeArr[i6] = Locale.forLanguageTag(str2);
        }
        return new g(new i(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f14100a.equals(((g) obj).f14100a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14100a.f14102a.hashCode();
    }

    public final String toString() {
        return this.f14100a.f14102a.toString();
    }
}

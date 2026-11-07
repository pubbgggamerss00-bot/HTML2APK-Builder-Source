package m8;

import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import i0.x1;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        String str = ((OpenSourceLicenses.a) t3).f5694b;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        r.d(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((OpenSourceLicenses.a) t10).f5694b.toLowerCase(locale);
        r.d(lowerCase2, "toLowerCase(...)");
        return x1.b(lowerCase, lowerCase2);
    }
}

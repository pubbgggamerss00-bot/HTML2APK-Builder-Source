package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.util.Longs;

/* loaded from: classes2.dex */
public class LocaleUtil {
    private static final Map localeCache = new HashMap();
    public static Locale EN_Locale = forEN();

    public static Date epochAdjust(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = localeCache;
        synchronized (map) {
            try {
                Long lLongValueOf = (Long) map.get(locale);
                if (lLongValueOf == null) {
                    lLongValueOf = longValueOf(new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime());
                    map.put(locale, lLongValueOf);
                }
                if (lLongValueOf.longValue() == 0) {
                    return date;
                }
                return new Date(date.getTime() - lLongValueOf.longValue());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Locale forEN() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i10 = 0; i10 != availableLocales.length; i10++) {
            if ("en".equalsIgnoreCase(availableLocales[i10].getLanguage())) {
                return availableLocales[i10];
            }
        }
        return Locale.getDefault();
    }

    private static Long longValueOf(long j10) {
        return Longs.valueOf(j10);
    }
}

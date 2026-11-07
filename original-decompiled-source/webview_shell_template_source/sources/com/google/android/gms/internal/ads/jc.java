package com.google.android.gms.internal.ads;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jc {
    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e6) {
            if ("0".equals(str) || "-1".equals(str)) {
                ac.c("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", ac.d("Unable to parse dateStr: %s, falling back to 0", str), e6);
            return 0L;
        }
    }

    public static za b(lb lbVar) throws NumberFormatException {
        long j6;
        boolean z6;
        long j7;
        long j8;
        long j9;
        long jA;
        long j10;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = lbVar.f6647c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA2 = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i6 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z6 = false;
            j7 = 0;
            j8 = 0;
            while (i6 < strArrSplit.length) {
                String strTrim = strArrSplit[i6].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j8 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j7 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z6 = true;
                }
                i6++;
            }
            j6 = 0;
            i6 = 1;
        } else {
            j6 = 0;
            z6 = false;
            j7 = 0;
            j8 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA3 = str3 != null ? a(str3) : j6;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j9 = jCurrentTimeMillis;
            jA = a(str4);
        } else {
            j9 = jCurrentTimeMillis;
            jA = j6;
        }
        String str5 = (String) map.get("ETag");
        if (i6 != 0) {
            long j12 = (j8 * 1000) + j9;
            j11 = z6 ? j12 : (j7 * 1000) + j12;
            j10 = j12;
        } else {
            j10 = (jA2 <= j6 || jA3 < jA2) ? j6 : (jA3 - jA2) + j9;
            j11 = j10;
        }
        za zaVar = new za();
        zaVar.f11233a = lbVar.f6646b;
        zaVar.f11234b = str5;
        zaVar.f11238f = j10;
        zaVar.f11237e = j11;
        zaVar.f11235c = jA2;
        zaVar.f11236d = jA;
        zaVar.f11239g = map;
        zaVar.h = lbVar.f6648d;
        return zaVar;
    }
}

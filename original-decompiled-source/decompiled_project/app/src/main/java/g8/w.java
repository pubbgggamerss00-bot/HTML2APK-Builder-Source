package g8;

import com.basitce.htmltoapk.R;
import d0.h0;
import java.util.Locale;
import p.i0;

/* loaded from: classes.dex */
public final class w {
    public static final int a(String str) {
        if (str == null) {
            return R.string.ai_error_unavailable;
        }
        switch (str.hashCode()) {
            case -1625724613:
                return !str.equals("rate_limited") ? R.string.ai_error_unavailable : R.string.ai_error_rate_limited;
            case -1313911455:
                return !str.equals("timeout") ? R.string.ai_error_unavailable : R.string.ai_error_timeout;
            case -1127466210:
                return !str.equals("purchase_account_mismatch") ? R.string.ai_error_unavailable : R.string.credits_error_account_mismatch;
            case -1120361383:
                return !str.equals("purchase_pending") ? R.string.ai_error_unavailable : R.string.credits_error_purchase_pending;
            case -919326353:
                return !str.equals("integrity_failed") ? R.string.ai_error_unavailable : R.string.ai_error_integrity_failed;
            case -260601762:
                return !str.equals("insufficient_credits") ? R.string.ai_error_unavailable : R.string.ai_error_insufficient_credits;
            case 3035641:
                return !str.equals("busy") ? R.string.ai_error_unavailable : R.string.ai_error_busy;
            case 215197034:
                return !str.equals("free_trial_paused") ? R.string.ai_error_unavailable : R.string.ai_error_free_trial_paused;
            case 262473438:
                return !str.equals("purchase_already_linked") ? R.string.ai_error_unavailable : R.string.credits_error_already_linked;
            case 476588369:
                return !str.equals("cancelled") ? R.string.ai_error_unavailable : R.string.ai_error_cancelled;
            case 756960357:
                return !str.equals("no_google_account") ? R.string.ai_error_unavailable : R.string.account_error_no_google_account;
            case 777307076:
                return !str.equals("ai_temporarily_disabled") ? R.string.ai_error_unavailable : R.string.ai_error_temporarily_disabled;
            case 828626620:
                return !str.equals("not_signed_in") ? R.string.ai_error_unavailable : R.string.ai_error_not_signed_in;
            case 1027181290:
                return !str.equals("project_too_large") ? R.string.ai_error_unavailable : R.string.ai_error_project_too_large;
            case 1503623046:
                return !str.equals("background_pending") ? R.string.ai_error_unavailable : R.string.ai_error_background_pending;
            case 1522011321:
                return !str.equals("purchase_invalid") ? R.string.ai_error_unavailable : R.string.credits_error_invalid;
            case 1729671978:
                return !str.equals("not_configured") ? R.string.ai_error_unavailable : R.string.account_error_not_configured;
            case 1737236665:
                return !str.equals("output_invalid") ? R.string.ai_error_unavailable : R.string.ai_error_output_invalid;
            default:
                return R.string.ai_error_unavailable;
        }
    }

    public static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return h0.b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return h0.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(j2.y.a(i11, "negative size: "));
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i10, int i11) {
        String strB;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strB = h0.b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(j2.y.a(i11, "negative size: "));
                }
                strB = h0.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, "index"));
        }
    }

    public static void g(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? b(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? b(i11, i12, "end index") : h0.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void h(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbB = i0.b(i10, "radix ", " was not in valid range ");
            sbB.append(new jh.g(2, 36, 1));
            throw new IllegalArgumentException(sbB.toString());
        }
    }

    public static final boolean i(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean j(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String k(char c10, Locale locale) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.r.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.r.d(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c10);
            kotlin.jvm.internal.r.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(upperCase2, "toUpperCase(...)");
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = upperCase.charAt(0);
            String strSubstring = upperCase.substring(1);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return upperCase;
    }
}

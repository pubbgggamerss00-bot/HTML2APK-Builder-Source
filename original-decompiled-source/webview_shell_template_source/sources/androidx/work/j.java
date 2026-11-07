package androidx.work;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class j implements RewardItem {
    public static void a(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(String str, int i6, int i7, int i8) {
        if (i6 < i7) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i7 + ", " + i8 + "] (too low)");
        }
        if (i6 <= i8) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i7 + ", " + i8 + "] (too high)");
    }

    public static void d(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    public static Integer g(Context context, int i6) {
        TypedValue typedValueA = q4.b.a(context.getTheme(), i6);
        if (typedValueA != null) {
            return Integer.valueOf(j(context, typedValueA));
        }
        return null;
    }

    public static int i(float f6, int i6, int i7) {
        return m0.a.c(m0.a.e(i7, Math.round(Color.alpha(i7) * f6)), i6);
    }

    public static int j(Context context, TypedValue typedValue) {
        int i6 = typedValue.resourceId;
        return i6 != 0 ? context.getColor(i6) : typedValue.data;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public void h(int i6) {
        throw null;
    }

    public void l(boolean z6) {
        throw null;
    }

    public void m() {
        throw null;
    }

    public void n(int i6) {
        throw null;
    }

    public void k(boolean z6) {
    }
}

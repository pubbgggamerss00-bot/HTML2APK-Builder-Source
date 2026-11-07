package ec;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a extends com.google.android.gms.common.api.b {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i10) {
        String str;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = fc.a.f11172a;
        Integer numValueOf2 = Integer.valueOf(i10);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = fc.a.f11173b;
            if (map2.containsKey(numValueOf2)) {
                str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) map2.get(numValueOf2)) + ")";
            } else {
                str = "";
            }
        }
        super(new Status(i10, String.format(locale, "Install Error(%d): %s", numValueOf, str), null, null));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}

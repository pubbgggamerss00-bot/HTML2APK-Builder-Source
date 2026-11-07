package ga;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.internal.p000authapi.zbaq;

/* loaded from: classes2.dex */
public final class g {
    public static Integer a(Context context, int i10) {
        TypedValue typedValueA = xb.a.a(context.getTheme(), i10);
        if (typedValueA == null) {
            return null;
        }
        int i11 = typedValueA.resourceId;
        return Integer.valueOf(i11 != 0 ? p3.b.getColor(context, i11) : typedValueA.data);
    }

    public static zbaq b(Context context) {
        com.google.android.gms.common.internal.p.f(context);
        return new zbaq(context, new f0());
    }
}

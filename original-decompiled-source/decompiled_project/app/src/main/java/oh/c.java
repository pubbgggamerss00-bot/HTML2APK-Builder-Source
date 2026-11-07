package oh;

import p.i0;

/* loaded from: classes2.dex */
public class c extends b {
    public static final void b(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbB = i0.b(i10, "Expected '-' (hyphen) at index ", ", but was '");
        sbB.append(str.charAt(i10));
        sbB.append('\'');
        throw new IllegalArgumentException(sbB.toString().toString());
    }
}

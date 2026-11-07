package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
public class v0 extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Bundle data, String type) {
        super(data, type);
        kotlin.jvm.internal.r.e(type, "type");
        kotlin.jvm.internal.r.e(data, "data");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}

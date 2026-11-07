package id;

import com.google.android.gms.common.internal.p;

/* loaded from: classes2.dex */
public class j extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        p.e(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Exception exc) {
        super(str, exc);
        p.e(str, "Detail message must not be empty");
    }
}

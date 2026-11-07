package y3;

import android.view.View;
import android.view.Window;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class a2 extends z1 {
    @Override // e9.x0
    public final void b(boolean z10) {
        Window window = this.f33934c;
        if (!z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(PKIFailureInfo.systemUnavail);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}

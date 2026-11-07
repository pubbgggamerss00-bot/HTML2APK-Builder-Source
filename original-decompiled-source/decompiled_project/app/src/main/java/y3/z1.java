package y3;

import android.view.View;
import android.view.Window;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class z1 extends y1 {
    @Override // e9.x0
    public final void c(boolean z10) {
        Window window = this.f33934c;
        if (!z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(PKIFailureInfo.systemUnavail);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}

package n4;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class o extends ImageButton {
    public int s;

    public final int getUserSetVisibility() {
        return this.s;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        this.s = i6;
    }
}

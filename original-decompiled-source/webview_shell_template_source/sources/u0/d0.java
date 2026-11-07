package u0;

import android.text.TextUtils;
import android.view.View;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d0 extends f0.b<CharSequence> {
    @Override // u0.f0.b
    public final CharSequence a(View view) {
        return f0.g.a(view);
    }

    @Override // u0.f0.b
    public final void b(View view, CharSequence charSequence) {
        f0.g.e(view, charSequence);
    }

    @Override // u0.f0.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}

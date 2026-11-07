package f1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements TransformationMethod {
    public final TransformationMethod s;

    public h(TransformationMethod transformationMethod) {
        this.s = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.s;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.g.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
        gVarA.getClass();
        return gVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i6, Rect rect) {
        TransformationMethod transformationMethod = this.s;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i6, rect);
        }
    }
}

package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13694a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.f f13695b;

    public l(TextView textView) {
        this.f13694a = textView;
        this.f13695b = new f1.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = this.f13694a.getContext().obtainStyledAttributes(attributeSet, f.a.f12941i, i6, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z6) {
        this.f13695b.f12974a.b(z6);
    }

    public final void c(boolean z6) {
        this.f13695b.f12974a.c(z6);
    }
}

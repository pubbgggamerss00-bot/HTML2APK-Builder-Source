package y4;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f15270a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.textfield.a f15271b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15272c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f15273d;

    public l(com.google.android.material.textfield.a aVar) {
        this.f15270a = aVar.s;
        this.f15271b = aVar;
        this.f15272c = aVar.getContext();
        this.f15273d = aVar.f12494y;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i6) {
        return true;
    }

    public boolean j() {
        return this instanceof k;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f15271b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(v0.b bVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z6) {
    }
}

package g;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.htmltoapk.template.R;
import g.f;
import u0.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class n extends androidx.activity.r implements e {

    /* renamed from: v, reason: collision with root package name */
    public g f13143v;

    /* renamed from: w, reason: collision with root package name */
    public final m f13144w;

    /* JADX WARN: Type inference failed for: r2v2, types: [g.m] */
    public n(ContextThemeWrapper contextThemeWrapper, int i6) {
        int i7;
        if (i6 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i7 = typedValue.resourceId;
        } else {
            i7 = i6;
        }
        super(contextThemeWrapper, i7);
        final androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) this;
        this.f13144w = new f.a() { // from class: g.m
            @Override // u0.f.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return bVar.d(keyEvent);
            }
        };
        f fVarC = c();
        if (i6 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i6 = typedValue2.resourceId;
        }
        ((g) fVarC).f13100m0 = i6;
        fVarC.j();
    }

    @Override // androidx.activity.r, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().c(view, layoutParams);
    }

    public final f c() {
        if (this.f13143v == null) {
            f.c cVar = f.s;
            this.f13143v = new g(getContext(), getWindow(), this, this);
        }
        return this.f13143v;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().k();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return u0.f.b(this.f13144w, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i6) {
        return (T) c().d(i6);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().h();
    }

    @Override // androidx.activity.r, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().g();
        super.onCreate(bundle);
        c().j();
    }

    @Override // androidx.activity.r, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().l();
    }

    @Override // androidx.activity.r, android.app.Dialog
    public final void setContentView(int i6) {
        b();
        c().o(i6);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().r(charSequence);
    }

    @Override // androidx.activity.r, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().p(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i6) {
        super.setTitle(i6);
        c().r(getContext().getString(i6));
    }

    @Override // androidx.activity.r, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().q(view, layoutParams);
    }
}

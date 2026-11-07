package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import g.g;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends a implements f.a {

    /* renamed from: u, reason: collision with root package name */
    public Context f13388u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f13389v;

    /* renamed from: w, reason: collision with root package name */
    public g.c f13390w;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference<View> f13391x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13392y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.appcompat.view.menu.f f13393z;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f13390w.f13113a.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.a aVar = this.f13389v.f13556v;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // j.a
    public final void c() {
        if (this.f13392y) {
            return;
        }
        this.f13392y = true;
        this.f13390w.a(this);
    }

    @Override // j.a
    public final View d() {
        WeakReference<View> weakReference = this.f13391x;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final androidx.appcompat.view.menu.f e() {
        return this.f13393z;
    }

    @Override // j.a
    public final MenuInflater f() {
        return new f(this.f13389v.getContext());
    }

    @Override // j.a
    public final CharSequence g() {
        return this.f13389v.getSubtitle();
    }

    @Override // j.a
    public final CharSequence h() {
        return this.f13389v.getTitle();
    }

    @Override // j.a
    public final void i() {
        this.f13390w.b(this, this.f13393z);
    }

    @Override // j.a
    public final boolean j() {
        return this.f13389v.K;
    }

    @Override // j.a
    public final void k(View view) {
        this.f13389v.setCustomView(view);
        this.f13391x = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.a
    public final void l(int i6) {
        m(this.f13388u.getString(i6));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.f13389v.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void n(int i6) {
        o(this.f13388u.getString(i6));
    }

    @Override // j.a
    public final void o(CharSequence charSequence) {
        this.f13389v.setTitle(charSequence);
    }

    @Override // j.a
    public final void p(boolean z6) {
        this.f13381t = z6;
        this.f13389v.setTitleOptional(z6);
    }
}

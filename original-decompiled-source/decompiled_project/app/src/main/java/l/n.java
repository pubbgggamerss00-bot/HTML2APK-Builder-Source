package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class n extends androidx.appcompat.view.menu.a implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f16561v;

    /* renamed from: w, reason: collision with root package name */
    public final f f16562w;

    public n(Context context, androidx.appcompat.view.menu.a aVar, f fVar) {
        super(context);
        this.f16561v = aVar;
        this.f16562w = fVar;
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean d(f fVar) {
        return this.f16561v.d(fVar);
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean e(androidx.appcompat.view.menu.a aVar, MenuItem menuItem) {
        return this.f16561v.e(aVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean f(f fVar) {
        return this.f16561v.f(fVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f16562w;
    }

    @Override // androidx.appcompat.view.menu.a
    public final androidx.appcompat.view.menu.a j() {
        return this.f16561v.j();
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean l() {
        return this.f16561v.l();
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean m() {
        return this.f16561v.m();
    }

    @Override // androidx.appcompat.view.menu.a
    public final boolean n() {
        return this.f16561v.n();
    }

    @Override // androidx.appcompat.view.menu.a, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f16561v.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f16562w.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.a, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f16561v.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        q(0, null, i10, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        q(i10, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f16562w.setIcon(i10);
        return this;
    }
}

package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements o0.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f13505a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f13506b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f13507c;

    /* renamed from: d, reason: collision with root package name */
    public char f13508d;

    /* renamed from: e, reason: collision with root package name */
    public int f13509e;

    /* renamed from: f, reason: collision with root package name */
    public char f13510f;

    /* renamed from: g, reason: collision with root package name */
    public int f13511g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public Context f13512i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f13513j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f13514k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f13515l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f13516m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13517n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13518o;

    /* renamed from: p, reason: collision with root package name */
    public int f13519p;

    @Override // o0.b
    public final u0.b a() {
        return null;
    }

    @Override // o0.b
    public final o0.b b(u0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f13517n || this.f13518o) {
                this.h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.h = drawableMutate;
                if (this.f13517n) {
                    drawableMutate.setTintList(this.f13515l);
                }
                if (this.f13518o) {
                    this.h.setTintMode(this.f13516m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // o0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13511g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13510f;
    }

    @Override // o0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13513j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // o0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13515l;
    }

    @Override // o0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13516m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13507c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13509e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13508d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13505a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13506b;
        return charSequence != null ? charSequence : this.f13505a;
    }

    @Override // o0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13514k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13519p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13519p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13519p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f13519p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f13510f = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f13519p = (z6 ? 1 : 0) | (this.f13519p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f13519p = (z6 ? 2 : 0) | (this.f13519p & (-3));
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13513j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f13519p = (z6 ? 16 : 0) | (this.f13519p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13515l = colorStateList;
        this.f13517n = true;
        c();
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13516m = mode;
        this.f13518o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13507c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f13508d = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f13508d = c7;
        this.f13510f = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13505a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13506b = charSequence;
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13514k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f13519p = (this.f13519p & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i6) {
        this.f13510f = Character.toLowerCase(c7);
        this.f13511g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final o0.b setContentDescription(CharSequence charSequence) {
        this.f13513j = charSequence;
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i6) {
        this.f13508d = c7;
        this.f13509e = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        this.f13505a = this.f13512i.getResources().getString(i6);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final o0.b setTooltipText(CharSequence charSequence) {
        this.f13514k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.h = this.f13512i.getDrawable(i6);
        c();
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i6, int i7) {
        this.f13508d = c7;
        this.f13509e = KeyEvent.normalizeMetaState(i6);
        this.f13510f = Character.toLowerCase(c8);
        this.f13511g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        return this;
    }
}

package l;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import c5.p;

/* loaded from: classes.dex */
public final class g extends p implements MenuItem {

    public static class a extends FrameLayout {
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            new a(view.getContext()).addView(view);
        }
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        throw null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw null;
    }
}

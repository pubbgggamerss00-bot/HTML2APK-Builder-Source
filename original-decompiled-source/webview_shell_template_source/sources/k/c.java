package k;

import android.content.Context;
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
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends k.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final o0.b f13523d;

    /* renamed from: e, reason: collision with root package name */
    public Method f13524e;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends u0.b implements ActionProvider.VisibilityListener {

        /* renamed from: b, reason: collision with root package name */
        public h.a f13525b;

        /* renamed from: c, reason: collision with root package name */
        public final ActionProvider f13526c;

        public a(ActionProvider actionProvider) {
            this.f13526c = actionProvider;
        }

        @Override // u0.b
        public final boolean a() {
            return this.f13526c.hasSubMenu();
        }

        @Override // u0.b
        public final boolean b() {
            return this.f13526c.isVisible();
        }

        @Override // u0.b
        public final View c() {
            return this.f13526c.onCreateActionView();
        }

        @Override // u0.b
        public final View d(h hVar) {
            return this.f13526c.onCreateActionView(hVar);
        }

        @Override // u0.b
        public final boolean e() {
            return this.f13526c.onPerformDefaultAction();
        }

        @Override // u0.b
        public final void f(m mVar) {
            this.f13526c.onPrepareSubMenu(c.this.d(mVar));
        }

        @Override // u0.b
        public final boolean g() {
            return this.f13526c.overridesItemVisibility();
        }

        @Override // u0.b
        public final void h(h.a aVar) {
            this.f13525b = aVar;
            this.f13526c.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z6) {
            h.a aVar = this.f13525b;
            if (aVar != null) {
                androidx.appcompat.view.menu.f fVar = h.this.f206n;
                fVar.h = true;
                fVar.p(true);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends FrameLayout implements j.b {
        public final CollapsibleActionView s;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.s = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // j.b
        public final void onActionViewCollapsed() {
            this.s.onActionViewCollapsed();
        }

        @Override // j.b
        public final void onActionViewExpanded() {
            this.s.onActionViewExpanded();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: k.c$c, reason: collision with other inner class name */
    public class MenuItemOnActionExpandListenerC0070c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f13528a;

        public MenuItemOnActionExpandListenerC0070c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f13528a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f13528a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f13528a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f13530a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f13530a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f13530a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, o0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f13523d = bVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f13523d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f13523d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        u0.b bVarA = this.f13523d.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f13526c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f13523d.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).s : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13523d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13523d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13523d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f13523d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f13523d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13523d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13523d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13523d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f13523d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13523d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13523d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13523d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f13523d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return d(this.f13523d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13523d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f13523d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13523d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f13523d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f13523d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f13523d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f13523d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f13523d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f13523d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(actionProvider);
        if (actionProvider == null) {
            aVar = null;
        }
        this.f13523d.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f13523d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f13523d.setAlphabeticShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f13523d.setCheckable(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f13523d.setChecked(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13523d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f13523d.setEnabled(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13523d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13523d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13523d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13523d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f13523d.setNumericShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13523d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0070c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13523d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f13523d.setShortcut(c7, c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
        this.f13523d.setShowAsAction(i6);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        this.f13523d.setShowAsActionFlags(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13523d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13523d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13523d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        return this.f13523d.setVisible(z6);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i6) {
        this.f13523d.setAlphabeticShortcut(c7, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f13523d.setIcon(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i6) {
        this.f13523d.setNumericShortcut(c7, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i6, int i7) {
        this.f13523d.setShortcut(c7, c8, i6, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        this.f13523d.setTitle(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        o0.b bVar = this.f13523d;
        bVar.setActionView(i6);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new b(actionView));
        }
        return this;
    }
}

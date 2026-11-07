package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements s3.b {
    public View C;
    public y3.b D;
    public MenuItem.OnActionExpandListener E;

    /* renamed from: a, reason: collision with root package name */
    public final int f16504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16505b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16506c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16507d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16508e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16509f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f16510g;

    /* renamed from: h, reason: collision with root package name */
    public char f16511h;

    /* renamed from: k, reason: collision with root package name */
    public char f16513k;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f16515m;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f16517p;

    /* renamed from: q, reason: collision with root package name */
    public n f16518q;

    /* renamed from: r, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f16519r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f16520s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f16521t;

    /* renamed from: j, reason: collision with root package name */
    public int f16512j = 4096;

    /* renamed from: l, reason: collision with root package name */
    public int f16514l = 4096;

    /* renamed from: n, reason: collision with root package name */
    public int f16516n = 0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f16522v = null;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f16523w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16524x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16525y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16526z = false;
    public int A = 16;
    public final boolean F = false;
    public int B = 0;

    public class a {
    }

    public f(androidx.appcompat.view.menu.a aVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f16517p = aVar;
        this.f16504a = i11;
        this.f16505b = i10;
        this.f16506c = i12;
        this.f16507d = i13;
        this.f16508e = charSequence;
    }

    public static void a(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f16526z && (this.f16524x || this.f16525y)) {
            drawable = drawable.mutate();
            if (this.f16524x) {
                drawable.setTintList(this.f16522v);
            }
            if (this.f16525y) {
                drawable.setTintMode(this.f16523w);
            }
            this.f16526z = false;
        }
        return drawable;
    }

    public final boolean c() {
        y3.b bVar;
        if ((this.B & 8) == 0) {
            return false;
        }
        if (this.C == null && (bVar = this.D) != null) {
            this.C = bVar.c(this);
        }
        return this.C != null;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.B & 8) == 0) {
            return false;
        }
        if (this.C == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.E;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f16517p.d(this);
        }
        return false;
    }

    public final void d(boolean z10) {
        if (z10) {
            this.A |= 32;
        } else {
            this.A &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.E;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f16517p.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.C;
        if (view != null) {
            return view;
        }
        y3.b bVar = this.D;
        if (bVar == null) {
            return null;
        }
        View viewC = bVar.c(this);
        this.C = viewC;
        return viewC;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f16514l;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f16513k;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f16520s;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f16505b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f16515m;
        if (drawable != null) {
            return b(drawable);
        }
        int i10 = this.f16516n;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableC = i.a.c(this.f16517p.f620a, i10);
        this.f16516n = 0;
        this.f16515m = drawableC;
        return b(drawableC);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f16522v;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16523w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16510g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f16504a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16512j;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16511h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f16506c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f16518q;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f16508e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16509f;
        return charSequence != null ? charSequence : this.f16508e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f16521t;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f16518q != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        y3.b bVar = this.D;
        if (bVar != null) {
            bVar.getClass();
        }
        return (this.A & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.C = view;
        this.D = null;
        if (view != null && view.getId() == -1 && (i10 = this.f16504a) > 0) {
            view.setId(i10);
        }
        androidx.appcompat.view.menu.a aVar = this.f16517p;
        aVar.f630k = true;
        aVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f16513k == c10) {
            return this;
        }
        this.f16513k = Character.toLowerCase(c10);
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.A;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.A = i11;
        if (i10 != i11) {
            this.f16517p.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.A;
        int i11 = i10 & 4;
        androidx.appcompat.view.menu.a aVar = this.f16517p;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.A = i12;
            if (i10 != i12) {
                aVar.o(false);
            }
            return this;
        }
        ArrayList<f> arrayList = aVar.f625f;
        int size = arrayList.size();
        aVar.s();
        for (int i13 = 0; i13 < size; i13++) {
            f fVar = arrayList.get(i13);
            if (fVar.f16505b == this.f16505b && (fVar.A & 4) != 0 && fVar.isCheckable()) {
                boolean z11 = fVar == this;
                int i14 = fVar.A;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                fVar.A = i15;
                if (i14 != i15) {
                    fVar.f16517p.o(false);
                }
            }
        }
        aVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.A |= 16;
        } else {
            this.A &= -17;
        }
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f16516n = 0;
        this.f16515m = drawable;
        this.f16526z = true;
        this.f16517p.o(false);
        return this;
    }

    @Override // s3.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16522v = colorStateList;
        this.f16524x = true;
        this.f16526z = true;
        this.f16517p.o(false);
        return this;
    }

    @Override // s3.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16523w = mode;
        this.f16525y = true;
        this.f16526z = true;
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f16510g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f16511h == c10) {
            return this;
        }
        this.f16511h = c10;
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.E = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16519r = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f16511h = c10;
        this.f16513k = Character.toLowerCase(c11);
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.B = i10;
        androidx.appcompat.view.menu.a aVar = this.f16517p;
        aVar.f630k = true;
        aVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16508e = charSequence;
        this.f16517p.o(false);
        n nVar = this.f16518q;
        if (nVar != null) {
            nVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16509f = charSequence;
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.A;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.A = i11;
        if (i10 != i11) {
            androidx.appcompat.view.menu.a aVar = this.f16517p;
            aVar.f627h = true;
            aVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f16508e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // s3.b
    public final s3.b u(y3.b bVar) {
        y3.b bVar2 = this.D;
        if (bVar2 != null) {
            bVar2.f33788a = null;
        }
        this.C = null;
        this.D = bVar;
        this.f16517p.o(true);
        y3.b bVar3 = this.D;
        if (bVar3 != null) {
            a aVar = new a();
            if (bVar3.f33788a != null) {
                Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + bVar3.getClass().getSimpleName() + " instance while it is still in use somewhere else?");
            }
            bVar3.f33788a = aVar;
        }
        return this;
    }

    @Override // s3.b, android.view.MenuItem
    public final s3.b setContentDescription(CharSequence charSequence) {
        this.f16520s = charSequence;
        this.f16517p.o(false);
        return this;
    }

    @Override // s3.b, android.view.MenuItem
    public final s3.b setTooltipText(CharSequence charSequence) {
        this.f16521t = charSequence;
        this.f16517p.o(false);
        return this;
    }

    @Override // s3.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f16513k == c10 && this.f16514l == i10) {
            return this;
        }
        this.f16513k = Character.toLowerCase(c10);
        this.f16514l = KeyEvent.normalizeMetaState(i10);
        this.f16517p.o(false);
        return this;
    }

    @Override // s3.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f16511h == c10 && this.f16512j == i10) {
            return this;
        }
        this.f16511h = c10;
        this.f16512j = KeyEvent.normalizeMetaState(i10);
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f16511h = c10;
        this.f16512j = KeyEvent.normalizeMetaState(i10);
        this.f16513k = Character.toLowerCase(c11);
        this.f16514l = KeyEvent.normalizeMetaState(i11);
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f16515m = null;
        this.f16516n = i10;
        this.f16526z = true;
        this.f16517p.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f16517p.f620a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        androidx.appcompat.view.menu.a aVar = this.f16517p;
        Context context = aVar.f620a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.C = viewInflate;
        this.D = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f16504a) > 0) {
            viewInflate.setId(i11);
        }
        aVar.f630k = true;
        aVar.o(true);
        return this;
    }
}

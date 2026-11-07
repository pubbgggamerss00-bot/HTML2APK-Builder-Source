package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements o0.b {
    public u0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196c;

    /* renamed from: d, reason: collision with root package name */
    public final int f197d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f198e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f199f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f200g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f202j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f204l;

    /* renamed from: n, reason: collision with root package name */
    public final f f206n;

    /* renamed from: o, reason: collision with root package name */
    public m f207o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f208p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f209q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f210r;

    /* renamed from: y, reason: collision with root package name */
    public int f216y;

    /* renamed from: z, reason: collision with root package name */
    public View f217z;

    /* renamed from: i, reason: collision with root package name */
    public int f201i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f203k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f205m = 0;
    public ColorStateList s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f211t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f212u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f213v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f214w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f215x = 16;
    public boolean C = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a {
        public a() {
        }
    }

    public h(f fVar, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        this.f206n = fVar;
        this.f194a = i7;
        this.f195b = i6;
        this.f196c = i8;
        this.f197d = i9;
        this.f198e = charSequence;
        this.f216y = i10;
    }

    public static void c(int i6, int i7, String str, StringBuilder sb) {
        if ((i6 & i7) == i7) {
            sb.append(str);
        }
    }

    @Override // o0.b
    public final u0.b a() {
        return this.A;
    }

    @Override // o0.b
    public final o0.b b(u0.b bVar) {
        u0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f14454a = null;
        }
        this.f217z = null;
        this.A = bVar;
        this.f206n.p(true);
        u0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f216y & 8) == 0) {
            return false;
        }
        if (this.f217z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f206n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f214w && (this.f212u || this.f213v)) {
            drawable = drawable.mutate();
            if (this.f212u) {
                drawable.setTintList(this.s);
            }
            if (this.f213v) {
                drawable.setTintMode(this.f211t);
            }
            this.f214w = false;
        }
        return drawable;
    }

    public final boolean e() {
        u0.b bVar;
        if ((this.f216y & 8) == 0) {
            return false;
        }
        if (this.f217z == null && (bVar = this.A) != null) {
            this.f217z = bVar.d(this);
        }
        return this.f217z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f206n.f(this);
        }
        return false;
    }

    public final void f(boolean z6) {
        if (z6) {
            this.f215x |= 32;
        } else {
            this.f215x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f217z;
        if (view != null) {
            return view;
        }
        u0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.f217z = viewD;
        return viewD;
    }

    @Override // o0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f203k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f202j;
    }

    @Override // o0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f209q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f195b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f204l;
        if (drawable != null) {
            return d(drawable);
        }
        int i6 = this.f205m;
        if (i6 == 0) {
            return null;
        }
        Drawable drawableD = b0.d(this.f206n.f170a, i6);
        this.f205m = 0;
        this.f204l = drawableD;
        return d(drawableD);
    }

    @Override // o0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // o0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f211t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f200g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f194a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f201i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f196c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f207o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f198e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f199f;
        return charSequence != null ? charSequence : this.f198e;
    }

    @Override // o0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f210r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f207o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f215x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f215x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f215x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        u0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f215x & 8) == 0 : (this.f215x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i6;
        this.f217z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i6 = this.f194a) > 0) {
            view.setId(i6);
        }
        f fVar = this.f206n;
        fVar.f179k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        if (this.f202j == c7) {
            return this;
        }
        this.f202j = Character.toLowerCase(c7);
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i6 = this.f215x;
        int i7 = (z6 ? 1 : 0) | (i6 & (-2));
        this.f215x = i7;
        if (i6 != i7) {
            this.f206n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i6 = this.f215x;
        int i7 = i6 & 4;
        f fVar = this.f206n;
        if (i7 == 0) {
            int i8 = (i6 & (-3)) | (z6 ? 2 : 0);
            this.f215x = i8;
            if (i6 != i8) {
                fVar.p(false);
            }
            return this;
        }
        ArrayList<h> arrayList = fVar.f175f;
        int size = arrayList.size();
        fVar.w();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = arrayList.get(i9);
            if (hVar.f195b == this.f195b && (hVar.f215x & 4) != 0 && hVar.isCheckable()) {
                boolean z7 = hVar == this;
                int i10 = hVar.f215x;
                int i11 = (z7 ? 2 : 0) | (i10 & (-3));
                hVar.f215x = i11;
                if (i10 != i11) {
                    hVar.f206n.p(false);
                }
            }
        }
        fVar.v();
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f215x |= 16;
        } else {
            this.f215x &= -17;
        }
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f205m = 0;
        this.f204l = drawable;
        this.f214w = true;
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.f212u = true;
        this.f214w = true;
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f211t = mode;
        this.f213v = true;
        this.f214w = true;
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f200g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        if (this.h == c7) {
            return this;
        }
        this.h = c7;
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f208p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.h = c7;
        this.f202j = Character.toLowerCase(c8);
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
        int i7 = i6 & 3;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f216y = i6;
        f fVar = this.f206n;
        fVar.f179k = true;
        fVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f198e = charSequence;
        this.f206n.p(false);
        m mVar = this.f207o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f199f = charSequence;
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i6 = this.f215x;
        int i7 = (z6 ? 0 : 8) | (i6 & (-9));
        this.f215x = i7;
        if (i6 != i7) {
            f fVar = this.f206n;
            fVar.h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f198e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // o0.b, android.view.MenuItem
    public final o0.b setContentDescription(CharSequence charSequence) {
        this.f209q = charSequence;
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final o0.b setTooltipText(CharSequence charSequence) {
        this.f210r = charSequence;
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i6) {
        if (this.f202j == c7 && this.f203k == i6) {
            return this;
        }
        this.f202j = Character.toLowerCase(c7);
        this.f203k = KeyEvent.normalizeMetaState(i6);
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i6) {
        if (this.h == c7 && this.f201i == i6) {
            return this;
        }
        this.h = c7;
        this.f201i = KeyEvent.normalizeMetaState(i6);
        this.f206n.p(false);
        return this;
    }

    @Override // o0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i6, int i7) {
        this.h = c7;
        this.f201i = KeyEvent.normalizeMetaState(i6);
        this.f202j = Character.toLowerCase(c8);
        this.f203k = KeyEvent.normalizeMetaState(i7);
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f204l = null;
        this.f205m = i6;
        this.f214w = true;
        this.f206n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        setTitle(this.f206n.f170a.getString(i6));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        int i7;
        f fVar = this.f206n;
        Context context = fVar.f170a;
        View viewInflate = LayoutInflater.from(context).inflate(i6, (ViewGroup) new LinearLayout(context), false);
        this.f217z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i7 = this.f194a) > 0) {
            viewInflate.setId(i7);
        }
        fVar.f179k = true;
        fVar.p(true);
        return this;
    }
}

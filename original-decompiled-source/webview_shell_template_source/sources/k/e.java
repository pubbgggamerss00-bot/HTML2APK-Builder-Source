package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e extends b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final o0.a f13532d;

    public e(Context context, o0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f13532d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f13532d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f13532d.addIntentOptions(i6, i7, i8, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = c(menuItemArr2[i10]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f13532d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        w.g<o0.b, MenuItem> gVar = this.f13521b;
        if (gVar != null) {
            gVar.clear();
        }
        w.g<o0.c, SubMenu> gVar2 = this.f13522c;
        if (gVar2 != null) {
            gVar2.clear();
        }
        this.f13532d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f13532d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        return c(this.f13532d.findItem(i6));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return c(this.f13532d.getItem(i6));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f13532d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return this.f13532d.isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i7) {
        return this.f13532d.performIdentifierAction(i6, i7);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        return this.f13532d.performShortcut(i6, keyEvent, i7);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        if (this.f13521b != null) {
            int i7 = 0;
            while (true) {
                w.g<o0.b, MenuItem> gVar = this.f13521b;
                if (i7 >= gVar.f14850u) {
                    break;
                }
                if (gVar.f(i7).getGroupId() == i6) {
                    this.f13521b.g(i7);
                    i7--;
                }
                i7++;
            }
        }
        this.f13532d.removeGroup(i6);
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        if (this.f13521b != null) {
            int i7 = 0;
            while (true) {
                w.g<o0.b, MenuItem> gVar = this.f13521b;
                if (i7 >= gVar.f14850u) {
                    break;
                }
                if (gVar.f(i7).getItemId() == i6) {
                    this.f13521b.g(i7);
                    break;
                }
                i7++;
            }
        }
        this.f13532d.removeItem(i6);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z6, boolean z7) {
        this.f13532d.setGroupCheckable(i6, z6, z7);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z6) {
        this.f13532d.setGroupEnabled(i6, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z6) {
        this.f13532d.setGroupVisible(i6, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f13532d.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13532d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return c(this.f13532d.add(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return d(this.f13532d.addSubMenu(i6));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return c(this.f13532d.add(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        return d(this.f13532d.addSubMenu(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, int i9) {
        return c(this.f13532d.add(i6, i7, i8, i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return d(this.f13532d.addSubMenu(i6, i7, i8, i9));
    }
}

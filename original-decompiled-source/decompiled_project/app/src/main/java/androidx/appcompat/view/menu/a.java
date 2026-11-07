package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l.f;
import l.h;
import l.j;
import l.n;

/* loaded from: classes.dex */
public class a implements s3.a {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f619u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f620a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f621b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f622c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f623d;

    /* renamed from: e, reason: collision with root package name */
    public b.d f624e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<f> f625f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<f> f626g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f627h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<f> f628i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<f> f629j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f630k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f631l;

    /* renamed from: s, reason: collision with root package name */
    public f f638s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f632m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f633n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f634o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f635p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<f> f636q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f637r = new CopyOnWriteArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    public boolean f639t = false;

    /* renamed from: androidx.appcompat.view.menu.a$a, reason: collision with other inner class name */
    public interface InterfaceC0007a {
    }

    public a(Context context) {
        boolean z10 = false;
        this.f620a = context;
        Resources resources = context.getResources();
        this.f621b = resources;
        this.f625f = new ArrayList<>();
        this.f626g = new ArrayList<>();
        this.f627h = true;
        this.f628i = new ArrayList<>();
        this.f629j = new ArrayList<>();
        this.f630k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z10 = true;
        }
        this.f623d = z10;
    }

    public final f a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f619u[i14] << 16) | (65535 & i12);
        f fVar = new f(this, i10, i11, i12, i15, charSequence);
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (arrayList.get(size).f16507d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, fVar);
        o(true);
        return fVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f620a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            f fVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            fVarA.setIcon(resolveInfo.loadIcon(packageManager));
            fVarA.f16510g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = fVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f637r.add(new WeakReference<>(jVar));
        jVar.f(context, this);
        this.f630k = true;
    }

    public final void c(boolean z10) {
        if (this.f635p) {
            return;
        }
        this.f635p = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f637r;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.b(this, z10);
            }
        }
        this.f635p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        f fVar = this.f638s;
        if (fVar != null) {
            d(fVar);
        }
        this.f625f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f631l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(f fVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f637r;
        boolean zJ = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f638s == fVar) {
            s();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zJ = jVar.j();
                    if (zJ) {
                        break;
                    }
                }
            }
            r();
            if (zJ) {
                this.f638s = null;
            }
        }
        return zJ;
    }

    public boolean e(a aVar, MenuItem menuItem) {
        return false;
    }

    public boolean f(f fVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f637r;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                zC = jVar.c(fVar);
                if (zC) {
                    break;
                }
            }
        }
        r();
        if (zC) {
            this.f638s = fVar;
        }
        return zC;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = arrayList.get(i11);
            if (fVar.f16504a == i10) {
                return fVar;
            }
            if (fVar.hasSubMenu() && (menuItemFindItem = fVar.f16518q.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final f g(int i10, KeyEvent keyEvent) {
        ArrayList<f> arrayList = this.f636q;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zM = m();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = arrayList.get(i11);
            char c10 = zM ? fVar.f16513k : fVar.f16511h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zM && c10 == '\b' && i10 == 67))) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f625f.get(i10);
    }

    public final void h(List<f> list, int i10, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList<f> arrayList = this.f625f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = arrayList.get(i11);
                if (fVar.hasSubMenu()) {
                    fVar.f16518q.h(list, i10, keyEvent);
                }
                char c10 = zM ? fVar.f16513k : fVar.f16511h;
                if ((modifiers & 69647) == ((zM ? fVar.f16514l : fVar.f16512j) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zM && c10 == '\b' && i10 == 67)) && fVar.isEnabled()) {
                        list.add(fVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (arrayList.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<f> arrayListK = k();
        if (this.f630k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f637r;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            boolean zD = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zD |= jVar.d();
                }
            }
            ArrayList<f> arrayList = this.f628i;
            ArrayList<f> arrayList2 = this.f629j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f fVar = arrayListK.get(i10);
                    if ((fVar.A & 32) == 32) {
                        arrayList.add(fVar);
                    } else {
                        arrayList2.add(fVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f630k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public a j() {
        return this;
    }

    public final ArrayList<f> k() {
        boolean z10 = this.f627h;
        ArrayList<f> arrayList = this.f626g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<f> arrayList2 = this.f625f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = arrayList2.get(i10);
            if (fVar.isVisible()) {
                arrayList.add(fVar);
            }
        }
        this.f627h = false;
        this.f630k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f639t;
    }

    public boolean m() {
        return this.f622c;
    }

    public boolean n() {
        return this.f623d;
    }

    public final void o(boolean z10) {
        if (this.f632m) {
            this.f633n = true;
            if (z10) {
                this.f634o = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f627h = true;
            this.f630k = true;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f637r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.g();
            }
        }
        r();
    }

    public final boolean p(MenuItem menuItem, h hVar, int i10) {
        boolean zExpandActionView;
        f fVar = (f) menuItem;
        if (fVar == null || !fVar.isEnabled()) {
            return false;
        }
        a aVar = fVar.f16517p;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = fVar.f16519r;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(fVar)) && !aVar.e(aVar, fVar)) {
            Intent intent = fVar.f16510g;
            if (intent != null) {
                try {
                    aVar.f620a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            y3.b bVar = fVar.D;
            if (bVar != null) {
                bVar.getClass();
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        y3.b bVar2 = fVar.D;
        boolean z10 = bVar2 != null && bVar2.a();
        if (fVar.c()) {
            zExpandActionView |= fVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (fVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!fVar.hasSubMenu()) {
                n nVar = new n(this.f620a, this, fVar);
                fVar.f16518q = nVar;
                nVar.setHeaderTitle(fVar.f16508e);
            }
            n nVar2 = fVar.f16518q;
            if (z10) {
                bVar2.getClass();
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f637r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zK = hVar != null ? hVar.k(nVar2) : false;
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else if (!zK) {
                        zK = jVar.k(nVar2);
                    }
                }
            }
            zExpandActionView |= zK;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return p(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        f fVarG = g(i10, keyEvent);
        boolean zP = fVarG != null ? p(fVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i10, CharSequence charSequence, int i11, View view) {
        if (view != null) {
            this.f631l = null;
        } else {
            if (i10 > 0) {
                this.f631l = this.f621b.getText(i10);
            } else if (charSequence != null) {
                this.f631l = charSequence;
            }
            if (i11 > 0) {
                p3.b.getDrawable(this.f620a, i11);
            }
        }
        o(false);
    }

    public final void r() {
        this.f632m = false;
        if (this.f633n) {
            this.f633n = false;
            o(this.f634o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (arrayList.get(i12).f16505b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f16505b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11).f16504a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        o(true);
    }

    public final void s() {
        if (this.f632m) {
            return;
        }
        this.f632m = true;
        this.f633n = false;
        this.f634o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = arrayList.get(i11);
            if (fVar.f16505b == i10) {
                fVar.A = (fVar.A & (-5)) | (z11 ? 4 : 0);
                fVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f639t = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = arrayList.get(i11);
            if (fVar.f16505b == i10) {
                fVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList<f> arrayList = this.f625f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = arrayList.get(i11);
            if (fVar.f16505b == i10) {
                int i12 = fVar.A;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                fVar.A = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f622c = z10;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f625f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f621b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f621b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        f fVarA = a(i10, i11, i12, charSequence);
        n nVar = new n(this.f620a, this, fVarA);
        fVarA.f16518q = nVar;
        nVar.setHeaderTitle(fVarA.f16508e);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f621b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f621b.getString(i13));
    }
}

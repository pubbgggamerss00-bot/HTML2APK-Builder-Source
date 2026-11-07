package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u0.g0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f implements o0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f169y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f170a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f171b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f172c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f173d;

    /* renamed from: e, reason: collision with root package name */
    public a f174e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<h> f175f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<h> f176g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<h> f177i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<h> f178j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f179k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f181m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f182n;

    /* renamed from: o, reason: collision with root package name */
    public View f183o;

    /* renamed from: v, reason: collision with root package name */
    public h f189v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f191x;

    /* renamed from: l, reason: collision with root package name */
    public int f180l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f184p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f185q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f186r = false;
    public boolean s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<h> f187t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f188u = new CopyOnWriteArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    public boolean f190w = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean zB;
        boolean z6 = false;
        this.f170a = context;
        Resources resources = context.getResources();
        this.f171b = resources;
        this.f175f = new ArrayList<>();
        this.f176g = new ArrayList<>();
        this.h = true;
        this.f177i = new ArrayList<>();
        this.f178j = new ArrayList<>();
        this.f179k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = g0.f14497a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = g0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z6 = true;
            }
        }
        this.f173d = z6;
    }

    public final h a(int i6, int i7, int i8, CharSequence charSequence) {
        int i9;
        int i10 = ((-65536) & i8) >> 16;
        if (i10 < 0 || i10 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i11 = (f169y[i10] << 16) | (65535 & i8);
        h hVar = new h(this, i6, i7, i8, i11, charSequence, this.f180l);
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i9 = 0;
                break;
            }
            if (arrayList.get(size).f197d <= i11) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i9, hVar);
        p(true);
        return hVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f170a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h hVarA = a(i6, i7, i8, resolveInfo.loadLabel(packageManager));
            hVarA.setIcon(resolveInfo.loadIcon(packageManager));
            hVarA.f200g = intent2;
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = hVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f188u.add(new WeakReference<>(jVar));
        jVar.g(context, this);
        this.f179k = true;
    }

    public final void c(boolean z6) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.b(this, z6);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f189v;
        if (hVar != null) {
            d(hVar);
        }
        this.f175f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f182n = null;
        this.f181m = null;
        this.f183o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f189v == hVar) {
            w();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zE = jVar.e(hVar);
                    if (zE) {
                        break;
                    }
                }
            }
            v();
            if (zE) {
                this.f189v = null;
            }
        }
        return zE;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f174e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
        boolean zK = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                zK = jVar.k(hVar);
                if (zK) {
                    break;
                }
            }
        }
        v();
        if (zK) {
            this.f189v = hVar;
        }
        return zK;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        MenuItem menuItemFindItem;
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            if (hVar.f194a == i6) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.f207o.findItem(i6)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final h g(int i6, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f187t;
        arrayList.clear();
        h(arrayList, i6, keyEvent);
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
        boolean zN = n();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            char c7 = zN ? hVar.f202j : hVar.h;
            char[] cArr = keyData.meta;
            if ((c7 == cArr[0] && (metaState & 2) == 0) || ((c7 == cArr[2] && (metaState & 2) != 0) || (zN && c7 == '\b' && i6 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return this.f175f.get(i6);
    }

    public final void h(List<h> list, int i6, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i6 == 67) {
            ArrayList<h> arrayList = this.f175f;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                h hVar = arrayList.get(i7);
                if (hVar.hasSubMenu()) {
                    hVar.f207o.h(list, i6, keyEvent);
                }
                char c7 = zN ? hVar.f202j : hVar.h;
                if ((modifiers & 69647) == ((zN ? hVar.f203k : hVar.f201i) & 69647) && c7 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c7 == cArr[0] || c7 == cArr[2] || (zN && c7 == '\b' && i6 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f191x) {
            return true;
        }
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (arrayList.get(i6).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<h> arrayListL = l();
        if (this.f179k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            boolean zC = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zC |= jVar.c();
                }
            }
            ArrayList<h> arrayList = this.f177i;
            ArrayList<h> arrayList2 = this.f178j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i6 = 0; i6 < size; i6++) {
                    h hVar = arrayListL.get(i6);
                    if ((hVar.f215x & 32) == 32) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f179k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return g(i6, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<h> l() {
        boolean z6 = this.h;
        ArrayList<h> arrayList = this.f176g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f175f;
        int size = arrayList2.size();
        for (int i6 = 0; i6 < size; i6++) {
            h hVar = arrayList2.get(i6);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.h = false;
        this.f179k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f190w;
    }

    public boolean n() {
        return this.f172c;
    }

    public boolean o() {
        return this.f173d;
    }

    public final void p(boolean z6) {
        if (this.f184p) {
            this.f185q = true;
            if (z6) {
                this.f186r = true;
                return;
            }
            return;
        }
        if (z6) {
            this.h = true;
            this.f179k = true;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i7) {
        return q(findItem(i6), null, i7);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        h hVarG = g(i6, keyEvent);
        boolean zQ = hVarG != null ? q(hVarG, null, i7) : false;
        if ((i7 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, j jVar, int i6) {
        boolean zExpandActionView;
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        f fVar = hVar.f206n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = hVar.f208p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(hVar)) && !fVar.e(fVar, hVar)) {
            Intent intent = hVar.f200g;
            if (intent != null) {
                try {
                    fVar.f170a.startActivity(intent);
                } catch (ActivityNotFoundException e6) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e6);
                }
            } else {
                u0.b bVar = hVar.A;
                zExpandActionView = bVar != null && bVar.e();
            }
        }
        u0.b bVar2 = hVar.A;
        boolean z6 = bVar2 != null && bVar2.a();
        if (hVar.e()) {
            zExpandActionView |= hVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (hVar.hasSubMenu() || z6) {
            if ((i6 & 4) == 0) {
                c(false);
            }
            if (!hVar.hasSubMenu()) {
                m mVar = new m(this.f170a, this, hVar);
                hVar.f207o = mVar;
                mVar.setHeaderTitle(hVar.f198e);
            }
            m mVar2 = hVar.f207o;
            if (z6) {
                bVar2.f(mVar2);
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zJ = jVar != null ? jVar.j(mVar2) : false;
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar2 = next.get();
                    if (jVar2 == null) {
                        copyOnWriteArrayList.remove(next);
                    } else if (!zJ) {
                        zJ = jVar2.j(mVar2);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i6 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f188u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (arrayList.get(i8).f195b == i6) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            int size2 = arrayList.size() - i8;
            while (true) {
                int i9 = i7 + 1;
                if (i7 >= size2 || arrayList.get(i8).f195b != i6) {
                    break;
                }
                if (i8 >= 0 && i8 < arrayList.size()) {
                    arrayList.remove(i8);
                }
                i7 = i9;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (arrayList.get(i7).f194a == i6) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i7);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f175f.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i7 = bundle.getInt("android:menu:expandedactionview");
        if (i7 <= 0 || (menuItemFindItem = findItem(i7)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z6, boolean z7) {
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            if (hVar.f195b == i6) {
                hVar.f215x = (hVar.f215x & (-5)) | (z7 ? 4 : 0);
                hVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f190w = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z6) {
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            if (hVar.f195b == i6) {
                hVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z6) {
        ArrayList<h> arrayList = this.f175f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            if (hVar.f195b == i6) {
                int i8 = hVar.f215x;
                int i9 = (i8 & (-9)) | (z6 ? 0 : 8);
                hVar.f215x = i9;
                if (i8 != i9) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f172c = z6;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f175f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f175f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i6, CharSequence charSequence, int i7, Drawable drawable, View view) {
        if (view != null) {
            this.f183o = view;
            this.f181m = null;
            this.f182n = null;
        } else {
            if (i6 > 0) {
                this.f181m = this.f171b.getText(i6);
            } else if (charSequence != null) {
                this.f181m = charSequence;
            }
            if (i7 > 0) {
                this.f182n = this.f170a.getDrawable(i7);
            } else if (drawable != null) {
                this.f182n = drawable;
            }
            this.f183o = null;
        }
        p(false);
    }

    public final void v() {
        this.f184p = false;
        if (this.f185q) {
            this.f185q = false;
            p(this.f186r);
        }
    }

    public final void w() {
        if (this.f184p) {
            return;
        }
        this.f184p = true;
        this.f185q = false;
        this.f186r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return a(0, 0, 0, this.f171b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f171b.getString(i6));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return a(i6, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        h hVarA = a(i6, i7, i8, charSequence);
        m mVar = new m(this.f170a, this, hVarA);
        hVarA.f207o = mVar;
        mVar.setHeaderTitle(hVarA.f198e);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, int i9) {
        return a(i6, i7, i8, this.f171b.getString(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return addSubMenu(i6, i7, i8, this.f171b.getString(i9));
    }

    public f k() {
        return this;
    }
}

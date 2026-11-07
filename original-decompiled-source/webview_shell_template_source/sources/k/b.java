package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13520a;

    /* renamed from: b, reason: collision with root package name */
    public w.g<o0.b, MenuItem> f13521b;

    /* renamed from: c, reason: collision with root package name */
    public w.g<o0.c, SubMenu> f13522c;

    public b(Context context) {
        this.f13520a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof o0.b)) {
            return menuItem;
        }
        o0.b bVar = (o0.b) menuItem;
        if (this.f13521b == null) {
            this.f13521b = new w.g<>();
        }
        MenuItem menuItem2 = this.f13521b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f13520a, bVar);
        this.f13521b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof o0.c)) {
            return subMenu;
        }
        o0.c cVar = (o0.c) subMenu;
        if (this.f13522c == null) {
            this.f13522c = new w.g<>();
        }
        SubMenu subMenu2 = this.f13522c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f13520a, cVar);
        this.f13522c.put(cVar, gVar);
        return gVar;
    }
}

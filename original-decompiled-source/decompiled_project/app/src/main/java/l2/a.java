package l2;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j2.e1;
import kotlin.jvm.internal.r;
import p1.e;
import pg.f0;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final c f16683a;

    public a(c cVar) {
        this.f16683a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        c cVar = this.f16683a;
        cVar.getClass();
        r.b(menuItem);
        int itemId = menuItem.getItemId();
        b bVar = b.f16684c;
        if (itemId == 0) {
            eh.a<f0> aVar = cVar.f16694c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            eh.a<f0> aVar2 = cVar.f16695d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            eh.a<f0> aVar3 = cVar.f16696e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == 3) {
            eh.a<f0> aVar4 = cVar.f16697f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != 4) {
                return false;
            }
            eh.a<f0> aVar5 = cVar.f16698g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.f16683a;
        cVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (cVar.f16694c != null) {
            c.a(menu, b.f16684c);
        }
        if (cVar.f16695d != null) {
            c.a(menu, b.f16685d);
        }
        if (cVar.f16696e != null) {
            c.a(menu, b.f16686e);
        }
        if (cVar.f16697f != null) {
            c.a(menu, b.f16687f);
        }
        if (cVar.f16698g == null) {
            return true;
        }
        c.a(menu, b.f16688g);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        e1 e1Var = this.f16683a.f16692a;
        if (e1Var != null) {
            e1Var.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        e eVar = this.f16683a.f16693b;
        if (rect != null) {
            rect.set((int) eVar.f21131a, (int) eVar.f21132b, (int) eVar.f21133c, (int) eVar.f21134d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.f16683a;
        cVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        c.b(menu, b.f16684c, cVar.f16694c);
        c.b(menu, b.f16685d, cVar.f16695d);
        c.b(menu, b.f16686e, cVar.f16696e);
        c.b(menu, b.f16687f, cVar.f16697f);
        c.b(menu, b.f16688g, cVar.f16698g);
        return true;
    }
}

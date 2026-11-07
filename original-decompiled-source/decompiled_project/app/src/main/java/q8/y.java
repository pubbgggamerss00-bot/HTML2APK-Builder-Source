package q8;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class y implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f22496a;

    public y(x xVar) {
        this.f22496a = xVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        kotlin.jvm.internal.r.e(mode, "mode");
        kotlin.jvm.internal.r.e(item, "item");
        boolean zM = this.f22496a.m(item.getItemId());
        if (item.getItemId() != 16908319) {
            mode.finish();
        }
        return zM;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode mode, Menu menu) {
        kotlin.jvm.internal.r.e(mode, "mode");
        kotlin.jvm.internal.r.e(menu, "menu");
        x xVar = this.f22496a;
        menu.add(0, R.id.selectAll, 0, xVar.getContext().getString(R.string.selectAll));
        menu.add(0, R.id.copy, 1, xVar.getContext().getString(R.string.copy));
        menu.add(0, R.id.cut, 2, xVar.getContext().getString(R.string.cut));
        menu.add(0, R.id.paste, 3, xVar.getContext().getString(R.string.paste));
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode mode) {
        kotlin.jvm.internal.r.e(mode, "mode");
        this.f22496a.W = null;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        kotlin.jvm.internal.r.e(mode, "mode");
        kotlin.jvm.internal.r.e(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(R.id.copy);
        x xVar = this.f22496a;
        menuItemFindItem.setEnabled(xVar.getSelectionStart() != xVar.getSelectionEnd());
        menu.findItem(R.id.cut).setEnabled(xVar.getSelectionStart() != xVar.getSelectionEnd());
        return true;
    }
}

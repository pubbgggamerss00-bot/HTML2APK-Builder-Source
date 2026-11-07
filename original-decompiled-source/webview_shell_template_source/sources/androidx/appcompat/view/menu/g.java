package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {
    public m s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.appcompat.app.b f192t;

    /* renamed from: u, reason: collision with root package name */
    public d f193u;

    @Override // androidx.appcompat.view.menu.j.a
    public final void b(f fVar, boolean z6) {
        androidx.appcompat.app.b bVar;
        if ((z6 || fVar == this.s) && (bVar = this.f192t) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean c(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        m mVar = this.s;
        d dVar = this.f193u;
        if (dVar.f162x == null) {
            dVar.f162x = dVar.new a();
        }
        mVar.q(dVar.f162x.getItem(i6), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f193u.b(this.s, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        m mVar = this.s;
        if (i6 == 82 || i6 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f192t.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f192t.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                mVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return mVar.performShortcut(i6, keyEvent, 0);
    }
}

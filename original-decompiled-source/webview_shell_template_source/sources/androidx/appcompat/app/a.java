package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f125t;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f125t = bVar;
        this.s = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
        AlertController.b bVar = this.f125t;
        DialogInterface.OnClickListener onClickListener = bVar.h;
        AlertController alertController = this.s;
        onClickListener.onClick(alertController.f93b, i6);
        if (bVar.f121i) {
            return;
        }
        alertController.f93b.dismiss();
    }
}

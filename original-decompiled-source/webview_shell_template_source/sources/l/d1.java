package l;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d1 implements View.OnClickListener {
    public final k.a s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.d f13616t;

    public d1(androidx.appcompat.widget.d dVar) {
        this.f13616t = dVar;
        Context context = dVar.f314a.getContext();
        CharSequence charSequence = dVar.h;
        k.a aVar = new k.a();
        aVar.f13509e = 4096;
        aVar.f13511g = 4096;
        aVar.f13515l = null;
        aVar.f13516m = null;
        aVar.f13517n = false;
        aVar.f13518o = false;
        aVar.f13519p = 16;
        aVar.f13512i = context;
        aVar.f13505a = charSequence;
        this.s = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.d dVar = this.f13616t;
        Window.Callback callback = dVar.f323k;
        if (callback == null || !dVar.f324l) {
            return;
        }
        callback.onMenuItemSelected(0, this.s);
    }
}

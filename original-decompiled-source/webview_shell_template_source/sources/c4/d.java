package c4;

import android.view.View;
import androidx.appcompat.view.menu.i;
import com.htmltoapk.template.ConsentManager;
import w2.l0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2194t;

    public /* synthetic */ d(int i6, Object obj) {
        this.s = i6;
        this.f2194t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.s;
        Object obj = this.f2194t;
        switch (i6) {
            case 0:
                com.google.android.material.button.a aVar = (com.google.android.material.button.a) obj;
                Object obj2 = com.google.android.material.button.a.L;
                aVar.m();
                i iVar = aVar.F.f13720c;
                if (iVar.b()) {
                    return;
                }
                if (iVar.f224f == null) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                iVar.d(0, 0, false, false);
                return;
            case 1:
                ((ConsentManager) obj).showPrivacyOptions();
                return;
            default:
                ((l0) obj).f14921v.o();
                return;
        }
    }
}

package m9;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import m9.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17855b;

    public /* synthetic */ m1(Object obj, int i10) {
        this.f17854a = i10;
        this.f17855b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17854a) {
            case 0:
                s1 s1Var = (s1) this.f17855b;
                s1Var.f17908l = true;
                s1Var.h();
                s1Var.i();
                s1Var.j();
                s1.b bVar = s1Var.f17914s;
                if (bVar != null) {
                    bVar.a(false);
                }
                LinearLayout linearLayout = s1Var.f17917w;
                if (linearLayout != null) {
                    linearLayout.setVisibility(s1Var.f17909m ? 0 : 4);
                }
                ImageButton imageButton = s1Var.f17915t;
                if (imageButton != null) {
                    imageButton.setVisibility(0);
                }
                ImageButton imageButton2 = s1Var.f17916v;
                if (imageButton2 != null) {
                    imageButton2.setVisibility(0);
                }
                eh.a<pg.f0> aVar = s1Var.f17903f;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ((eh.l) this.f17855b).invoke("advanced");
                break;
        }
        return pg.f0.f21461a;
    }
}

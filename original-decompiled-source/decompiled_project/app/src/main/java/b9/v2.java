package b9;

import android.content.Context;
import b9.o1;
import com.basitce.htmltoapk.R;
import s8.e2;
import x8.j6;
import x8.j7;

/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4127c;

    public /* synthetic */ v2(int i10, Object obj, Object obj2) {
        this.f4125a = i10;
        this.f4126b = obj;
        this.f4127c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4125a;
        Object obj = this.f4127c;
        Object obj2 = this.f4126b;
        switch (i10) {
            case 0:
                o1.p.a((eh.a) obj2, (x0.n1) obj);
                break;
            case 1:
                hf.a.a((c.k) obj2, (Context) obj, null, R.string.editor_folder_picker_unavailable);
                break;
            default:
                j6 j6Var = (j6) obj2;
                j6Var.f32790q = true;
                sh.z0 z0Var = j6Var.f32791r;
                Boolean bool = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool);
                ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new j7(j6Var, null), 3);
                p5.x.c(e2.i.f24639c.f24627a, (p5.x) obj);
                break;
        }
        return pg.f0.f21461a;
    }
}

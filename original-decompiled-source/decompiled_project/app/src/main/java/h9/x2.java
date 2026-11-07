package h9;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f12882b;

    public /* synthetic */ x2(Context context, x0.n1 n1Var) {
        this.f12881a = context;
        this.f12882b = n1Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        Float f10 = (Float) obj;
        f10.getClass();
        this.f12882b.setValue(Boolean.FALSE);
        Context context = this.f12881a;
        Toast.makeText(context, context.getString(R.string.settings_cache_cleared, f10), 0).show();
        return pg.f0.f21461a;
    }
}
